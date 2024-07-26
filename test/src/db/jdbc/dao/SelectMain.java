package db.jdbc.dao;

import java.sql.*;

public class SelectMain {
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String user = "C##JAVA";
    private final String password = "oracle";

    private Connection connection;
    private PreparedStatement pstmt;
    private ResultSet rs;  // 결과물이 담김

    public SelectMain() {
        try{
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getConnection() {
        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void selectArticle(){
        getConnection();  // oracle에 먼저 접속
        String sql = "select * from dbtest";
        try{
            pstmt = connection.prepareStatement(sql);  // 가이드 생성
            rs = pstmt.executeQuery();  // 테이블의 결과를 result set에 담아줌

            while(rs.next()){
                System.out.println(rs.getString("name")+"\t"
                +rs.getInt("age")+"\t"
                +rs.getDouble("height")+"\t"
                +rs.getString("logtime"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if(rs != null){rs.close();}
                if(pstmt!=null){pstmt.close();}
                if(connection!=null){connection.close();}
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }


    public static void main(String[] args) {
        new SelectMain().selectArticle();

    }
}
