package db.jdbc.member.service;

import db.jdbc.member.bean.MemberDTO;
import db.jdbc.member.dao.MemberDAO;

import java.sql.*;
import java.util.Scanner;

public class WriteService implements MemberService{
    private Scanner scanner = new Scanner(System.in);
    private MemberDAO memberDAO = MemberDAO.getInstance(); // DB 싱글톤
    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;

    public WriteService() {
        try{
            Class.forName(memberDAO.getDriver());
            System.out.println("driver loaded");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }


    @Override
    public void execute() {
        System.out.print("이름을 입력하시오 : ");
        String memberName = scanner.next();

        System.out.print("아이디를 입력하시오 : ");
        String memberId = scanner.next();

        System.out.print("비밀번호를 입력하시오 : ");
        String memberPassword = scanner.next();


        System.out.print("핸드폰 번호를 입력하시오 (선택): ");
        String memberPhoneNumber = scanner.next();

        MemberDTO memberDTO = new MemberDTO(memberName, memberId, memberPassword, memberPhoneNumber);
        join(memberDTO);
        System.out.println(memberDTO);
        memberDAO.closeConnection(conn,rs,pstmt);
    }
    public void join(MemberDTO memberDTO){
        conn = memberDAO.getConnection(conn);
        try{
            pstmt =memberDAO.checkDuplicate(conn,pstmt,memberDTO.getId(),memberDTO.getPwd());
            rs = pstmt.executeQuery();

            if(rs.next()){
                System.out.println("이미 기존에 있는 회원입니다.");
            }
            else{
                try{
                    pstmt = conn.prepareStatement("insert into member values (?,?,?,?)");
                    pstmt.setString(1,memberDTO.getName());
                    pstmt.setString(2,memberDTO.getId());
                    pstmt.setString(3, memberDTO.getPwd());
                    pstmt.setString(4, memberDTO.getPhone());
                    rs = pstmt.executeQuery();

                    if(rs.next()){
                        System.out.println("회원 가입이 완료되었습니다.");
                    }
                    else{
                        System.out.println("회원가입에 실패하였습니다.");
                    }
                } catch (SQLException e){
                    e.printStackTrace();
                }

            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


}
