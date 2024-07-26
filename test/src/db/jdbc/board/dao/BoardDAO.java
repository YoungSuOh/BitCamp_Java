package db.jdbc.board.dao;

import db.jdbc.board.bean.BoardDTO;
import db.jdbc.board.service.Board;
import db.jdbc.member.dao.MemberDAO;

import java.sql.*;
import java.util.Scanner;

public class BoardDAO {
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String user = "C##java";
    private final String password = "oracle";

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;


    private static BoardDAO instance = new BoardDAO();

    public BoardDAO() {
        try{
            Class.forName(driver);
            System.out.println("loaded driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static BoardDAO getInstance() {  // 싱글톤
        return instance;
    }

    public void getConnection(){
        try {
            conn = DriverManager.getConnection(url,user,password);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void closeConnection(){
        try{
            if(rs != null){rs.close();}
            if(pstmt!=null){pstmt.close();}
            if(conn!=null){conn.close();}
            System.out.println("connection closed");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void writeBoard(BoardDTO boardDTO) {
        this.getConnection();
        try{
            pstmt=conn.prepareStatement("insert into board_java values (board_java_seq.NEXTVAL,?,?,?,?,sysdate)");
            pstmt.setString(1,boardDTO.getId());
            pstmt.setString(2,boardDTO.getName());
            pstmt.setString(3,boardDTO.getSubject());
            pstmt.setString(4,boardDTO.getContent());

            int update = pstmt.executeUpdate();
            if(update>0){
                System.out.println("작성하신 글을 등록하였습니다.");
            }
            else{
                System.out.println("작성하신 글 등록에 실패하였습니다.");
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        closeConnection();
    }

    public void listBoard() {
        System.out.println("---------------------------------------------------------\n" +
                "글번호\t제목\t\t아이디\t날짜\n" +
                "---------------------------------------------------------");
        this.getConnection();
        try{
            pstmt=conn.prepareStatement("select * from board_java ORDER BY LOGTIME DESC");

            rs=pstmt.executeQuery();

            while(rs.next()){
                System.out.println(rs.getInt(1)+"\t"+rs.getString(4)+
                        "\t"+rs.getString(2)+"\t"+rs.getDate(6));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        closeConnection();

    }

    public void viewBoard() {
        System.out.print("글 번호 입력 : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        this.getConnection();
        try{
            pstmt=conn.prepareStatement("select * from board_java where seq=?");
            pstmt.setInt(1,num);

            rs=pstmt.executeQuery();

            while(rs.next()){
                System.out.println("아이디 : "+rs.getString(2));
                System.out.println("이름 : "+rs.getString(3));
                System.out.println("날짜 : "+rs.getDate(6));
                System.out.println("내용 : "+rs.getString(5));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        closeConnection();

    }



}
