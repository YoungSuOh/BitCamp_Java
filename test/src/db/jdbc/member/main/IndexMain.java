package db.jdbc.member.main;


import db.jdbc.member.service.DropMemberService;
import db.jdbc.member.service.LoginService;
import db.jdbc.member.service.UpdateMemberService;
import db.jdbc.member.service.WriteService;

import java.util.Scanner;

public class IndexMain {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (true) {
            System.out.println();
            System.out.println("*******************");
            System.out.println("  1. 회원가입");
            System.out.println("  2. 로그인");
            System.out.println("  3. 회원정보수정");
            System.out.println("  4. 회원탙퇴");
            System.out.println("  5. 끝");
            System.out.println("*******************");
            System.out.print("번호 입력 : ");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    new WriteService().execute();
                    break;
                case 2:
                    new LoginService().execute();
                    break;
                case 3:
                    new UpdateMemberService().execute(); break;
                case 4:
                     new DropMemberService().execute();
                     break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("메뉴에 없는 입력입니다."); break;
            }
            if(quit) break;
        }
    }

    public static void main(String[] args) {
        new IndexMain().menu();
        System.out.println("프로그림을 종료합니다.");

    }
}
