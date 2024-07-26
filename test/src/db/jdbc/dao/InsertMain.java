package db.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe"; /* db에 접속하는 url -> jdbc:어떤 디비?:드라이버 이름:어디로?:포트:db이름*/
    private String user = "C##JAVA";
    private String password = "oracle";

    private Connection conn;
    private PreparedStatement pstmt;

    public InsertMain() {
        //Class // 클래스인지 인터페이스인지 몰라서 new가 가능한지 모를때 -> 몽타주
        try {
            /*Class.forName("oracle.jdbc.driver.OracleDriver");*/ // 생성
            Class.forName(driver);
            System.out.println("driver loaded");
        }catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getConnection() {
        try {
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("connection established");
        }catch (SQLException e){
            e.printStackTrace();
        }
        // url 에는 앞에 프로토콜이 들어감
        /*
        *
        * ftp: 파일 전송할 때
        *
        * */
    }

    public void insertArticle(){
        // 데이터
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 입력 : ");
        String name = sc.next();
        System.out.print("나이 입력 : ");
        int age = sc.nextInt();
        System.out.print("키 입력 : ");
        double height = sc.nextDouble();

        // SQL
        this.getConnection();

        try {
            pstmt = conn.prepareStatement("insert into dbtest values(?,?,?,sysdate)");

            // ?에 data를 연결한다 -> data를 매핑한다.
            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.setDouble(3,height);

            int success = pstmt.executeUpdate();  // 실행 - 개수 리턴
            System.out.println(success+"개의 행이 삽입되었습니다.");
        }catch (SQLException e){
            e.printStackTrace();
        } finally {
            try{
                if(pstmt != null){pstmt.close();}
                if(conn != null){conn.close();}

            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new InsertMain().insertArticle();
    }
}