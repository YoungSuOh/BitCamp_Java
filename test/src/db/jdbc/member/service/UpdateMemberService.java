package db.jdbc.member.service;

import db.jdbc.member.dao.MemberDAO;

import java.sql.*;
import java.util.Scanner;

public class UpdateMemberService implements MemberService {
    private Scanner scanner = new Scanner(System.in);
    private MemberDAO memberDAO = MemberDAO.getInstance(); // DB 싱글톤
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public UpdateMemberService() {
        try {
            Class.forName(memberDAO.getDriver());
            System.out.println("driver loaded");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute() {
        System.out.print("수정할 멤버의 id를 입력 : ");
        String id = scanner.next();

        System.out.print("수정할 멤버의 비밀번호를 입력 : ");
        String password = scanner.next();

        update(id,password);
        memberDAO.closeConnection(conn,rs,pstmt);


    }
    public void update(String userId, String password){
        conn = memberDAO.getConnection(conn);
        try{
            pstmt =memberDAO.checkDuplicate(conn,pstmt,userId,password);
            rs = pstmt.executeQuery();
            if(rs.next()){
                pstmt = conn.prepareStatement("update member set name=?, id=?, password=?, phonenumber=? where id=?");
                System.out.print("이름을 입력하세요 : ");
                String name = scanner.next();
                System.out.print("id를 입력하세요 : ");
                String id = scanner.next();
                System.out.print("비밀번호를 입력하세요 : ");
                String pwd = scanner.next();
                System.out.print("전화번호를 입력하세요 : ");
                String phoneNum = scanner.next();
                pstmt.setString(1,name);
                pstmt.setString(2,id);
                pstmt.setString(3,pwd);
                pstmt.setString(4,phoneNum);
                pstmt.setString(5,userId);
                int res = pstmt.executeUpdate();
                if(res > 0){
                    System.out.println("회원 정보가 수정이 되었습니다.");
                }
                else{
                    System.out.println("회원 정보 수정에 실패하였습니다.");
                }
            }
            else{
                System.out.println("회원 정보가 존재하지 않습니다.");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
