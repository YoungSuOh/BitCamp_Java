package db.jdbc.dao;

import java.sql.*;
import java.util.Scanner;

public class UpdateMain2 {
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "C##JAVA";
    private String password = "oracle";

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;


    public UpdateMain2() {
        try {
            Class.forName(driver); //생성

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getConnection() {
        try {
            con = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateArticle() {
        //데이터
        Scanner scan = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = scan.next();

        //SQL
        getConnection(); //호출

        try {
            pstmt = con.prepareStatement("update dbtest set age=age+1 where name like ?");
            // pstmt = con.prepareStatement("update dbtest set age=age+1 where name like '%?%'"); // 이거 안됨 -> setString 과정에서 조건을 추가해야 함

            //?에 데이터 매핑
            pstmt.setString(1, "%" + name + "%");

            int su = pstmt.executeUpdate(); //실행 - 개수 리턴

            System.out.println(su + "개의 행이 수정되었습니다.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(pstmt != null) pstmt.close();
                if(con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new UpdateMain2().updateArticle();
    }

}