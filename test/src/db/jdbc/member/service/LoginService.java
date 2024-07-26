package db.jdbc.member.service;

import db.jdbc.member.dao.MemberDAO;

import java.sql.*;
import java.util.Scanner;

public class LoginService implements MemberService {
    private Scanner scanner = new Scanner(System.in);
    private MemberDAO memberDAO = MemberDAO.getInstance(); // DB 싱글톤
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public LoginService() {
        try{
            Class.forName(memberDAO.getDriver());
            System.out.println("driver loaded");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void execute() {
        System.out.print("아이디를 입력하세요 : ");
        String userId = scanner.next();

        System.out.print("비밀번호를 입력하세요 : ");
        String password = scanner.next();

        search(userId,password);
        memberDAO.closeConnection(conn,rs,pstmt);
    }
    public void search(String userId, String password){
        conn = memberDAO.getConnection(conn);
        try{
            pstmt =memberDAO.checkDuplicate(conn,pstmt,userId,password);
            rs = pstmt.executeQuery();

            if(rs.next()){
                System.out.println("로그인에 성공합니다.");
            }
            else{
                System.out.println("존재하지 않는 회원입니다.");
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
