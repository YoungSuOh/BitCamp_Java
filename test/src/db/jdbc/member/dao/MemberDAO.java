package db.jdbc.member.dao;

import db.jdbc.member.service.MemberService;
import lombok.Getter;

import java.sql.*;

@Getter
public class MemberDAO {
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String user = "C##java";
    private final String password = "oracle";


    /*private static MemberDAO instance;*/
    private static MemberDAO instance = new MemberDAO();  // 한번만 수행


    public MemberDAO() {
        try{
            Class.forName(driver);
            System.out.println("Connecting to database...");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static MemberDAO getInstance() {  // 싱글톤
        /*if(instance==null){
            System.out.println(MemberService.class){
                instance = new MemberDAO();
            };

        }
        return null;*/
        // 위에서 static으로 한번 생성했기 때문에 동기화가 필요가 없음.
        return instance;
    }

    public Connection getConnection(Connection conn){
        try{
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Connected to database...");
        }catch(SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
    public void closeConnection(Connection conn, ResultSet rs, PreparedStatement pstmt){
        try {
            System.out.println("closing connection...");
            if(rs!=null)rs.close();
            if(pstmt!=null)pstmt.close();
            if(conn!=null) conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public PreparedStatement checkDuplicate(Connection conn, PreparedStatement pstmt, String id, String password){
        try{
            pstmt = conn.prepareStatement("select * from member where id=? and password=?");
            pstmt.setString(1,id);
            pstmt.setString(2,password);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return pstmt;
    }
}
