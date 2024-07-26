package db.jdbc.member.service;

import db.jdbc.member.dao.MemberDAO;
import lombok.Getter;

import java.sql.*;
import java.util.Scanner;

@Getter
public class DropMemberService implements MemberService {
    private Scanner scanner = new Scanner(System.in);
    private MemberDAO memberDAO = MemberDAO.getInstance(); // DB 싱글톤
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;


    public DropMemberService() {
        try{
            Class.forName(memberDAO.getDriver());
            System.out.println("driver loaded");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute() {
        System.out.print("삭제할 id를 입력하세요 : ");
        String id = scanner.next();

        System.out.print("비밀번호를 입력하세요 : ");
        String password = scanner.next();

        delete(id,password);
        memberDAO.closeConnection(conn,rs,pstmt);
    }
    public void delete(String id, String password){
        conn = memberDAO.getConnection(conn);
        try{
            pstmt =memberDAO.checkDuplicate(conn,pstmt,id,password);
            rs = pstmt.executeQuery();

            if(!rs.next()){
                System.out.println("존재하지 않는 회원입니다.");
            }
            else{
                try{
                    pstmt = conn.prepareStatement("delete from member where id=? AND password=?");
                    pstmt.setString(1,id);
                    pstmt.setString(2,password);
                    int rowUpdated = pstmt.executeUpdate();
                    if(rowUpdated>0){
                        System.out.println("회원 삭제에 성공합니다.");
                    }
                    else{
                        System.out.println("회원 삭제에 실패합니다.");
                    }
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
