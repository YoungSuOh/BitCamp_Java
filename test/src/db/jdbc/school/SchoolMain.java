package db.jdbc.school;

import java.sql.*;
import java.util.Scanner;

public class/*얘는 예약어*/ SchoolMain {
    private final String driver = "oracle.jdbc.driver.OracleDriver";
    private final String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private final String user = "C##JAVA";
    private final String password = "oracle";

    private Connection connection;
    private PreparedStatement pstmt;
    private ResultSet rs;

    private Scanner sc;

    public SchoolMain() {
        sc = new Scanner(System.in);
        try {
            Class.forName(driver);  // driver 문자열을 클래스 타입으로 변환 -> Class 타입 => Object
            System.out.println("driver loading");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void getConnection(){
        try {
            connection= DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SchoolMain().menu();

    }

    public void menu() {
        boolean exit = false;
        while (true) {
            System.out.print("****************\n" +
                    " 관리\n" +
                    "****************\n" +
                    " 1. 입력\n" +
                    " 2. 검색\n" +
                    " 3. 삭제\n" +
                    " 4. 종료\n" +
                    "****************\n" +
                    " 번호선택 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    insert();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("올바르지 않은 입력값입니다.");
                    break;
            }
            if(exit) break;

        }
    }

    public void insert() {
        boolean exit = false;
        System.out.print("****************\n" +
                " 1. 학생\n" +
                " 2. 교수\n" +
                " 3. 관리자\n" +
                " 4. 이전메뉴\n" +
                "****************\n" +
                " 번호선택 : ");
        int num = sc.nextInt();
        String name = null;
        int code = 0;
        String value = null;
        switch (num) {
            case 1:
                System.out.print("이름 입력 : ");
                name = sc.next();
                System.out.println("학번 입력 : ");
                code = sc.nextInt();
                value = "학생";
                break;

            case 2:
                System.out.print("이름 입력 : ");
                name = sc.next();
                System.out.print("과목 입력 : ");
                code = sc.nextInt();
                value = "교수";
                break;
            case 3:
                System.out.print("이름 입력 : ");
                name = sc.next();
                System.out.print("부서 입력 : ");
                code = sc.nextInt();
                value = "관리자";
                break;
            case 4:
                exit = true; break;
            default:
                System.out.println("메뉴에 없는 입력값입니다.");
                break;
        }
        if(!exit){
            runInsert(name,value,code);
        }
    }
    public void runInsert(String name, String value, int str){
        try {
            this.getConnection();


            pstmt = connection.prepareStatement("insert into school values (?,?,?)");
            pstmt.setString(1,name);
            pstmt.setString(2,value);
            pstmt.setInt(3,str);

            rs = pstmt.executeQuery();

            if(!rs.next()){
                System.out.println("입력에 실패하였습니다.");
            }

            int rowUpdated = pstmt.executeUpdate();
            System.out.println(rowUpdated+"행이 삽입되었습니다.");
        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try{
                if(pstmt != null){pstmt.close();}
                if(connection != null){connection.close();}
                if (rs!=null){rs.close();}
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void search() {
        System.out.println("미구현된 메뉴입니다.");
    }

    public void delete() {
        System.out.print("삭제를 원하는 이름 입력 : ");
        String name = sc.next();
        try{
            this.getConnection();

            pstmt = connection.prepareStatement("delete school where name = ?");
            pstmt.setString(1,name);
            rs = pstmt.executeQuery();
            if(!rs.next()){
                System.out.println("유저 정보가 없습니다.");
            }
            int num = pstmt.executeUpdate();
            System.out.println(num+"행이 삭제되었습니다.");
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{  // connection을 계속 놔두면 무한으로 생성 -> 삭제 해줘야 함
                if(pstmt!=null)pstmt.close();
                if(rs!=null)rs.close();
                if(connection!=null)connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
}

