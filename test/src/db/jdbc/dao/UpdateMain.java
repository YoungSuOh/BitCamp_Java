package db.jdbc.dao;

import java.sql.*;
import java.util.Scanner;

public class UpdateMain {
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "C##JAVA";
    private String password = "oracle";

    private Connection conn;
    private PreparedStatement pstmt;
    private ResultSet rs;



    public UpdateMain() throws ClassNotFoundException {
        Class.forName(driver);
        System.out.println("driver loaded");
    }

    public void getConnection() throws SQLException {
        conn = DriverManager.getConnection(url,username,password);
    }

    public void updateArticle() throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.next();


        try{
            this.getConnection();

            pstmt = conn.prepareStatement("select NAME from dbtest where NAME = ?");
            pstmt.setString(1,name);
            rs=pstmt.executeQuery();
            if (!rs.next()) {
                System.out.println("해당 이름을 가진 사용자가 없습니다.");
                return;
            }

            pstmt = conn.prepareStatement("update dbtest set name = ?,age = ?, height = ?, logtime = sysdate where NAME = ?");
            System.out.print("이름 입력 : ");
            String name1 = sc.next();
            System.out.print("나이 입력 : ");
            int age = sc.nextInt();
            System.out.print("키 입력 : ");
            double height = sc.nextDouble();

            pstmt.setString(1,name1);
            pstmt.setInt(2,age);
            pstmt.setDouble(3,height);
            pstmt.setString(4,name);

            int rowUpated = pstmt.executeUpdate();
            System.out.println(rowUpated+"행이 수정되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                if(rs!=null) rs.close();
                if(pstmt!=null) pstmt.close();
                if(conn!=null) conn.close();
            }catch (SQLException e) {
                 e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new UpdateMain().updateArticle();

    }
}
