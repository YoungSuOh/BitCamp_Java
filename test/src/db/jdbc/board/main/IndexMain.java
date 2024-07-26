package db.jdbc.board.main;

import db.jdbc.board.service.BoardListService;
import db.jdbc.board.service.BoardViewService;
import db.jdbc.board.service.BoardWriteService;

import java.util.Scanner;

public class IndexMain {
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean exit = false;
        int num = 0;
        while (true) {
            if (exit) break;
            System.out.print("******************\n" +
                    "   1. 글쓰기\n" +
                    "   2. 목록\n" +
                    "   3. 작성한 글 내용 보기\n" +
                    "   4. 끝\n" +
                    "******************\n" +
                    "  번호 : ");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    new BoardWriteService().execute();
                    break;
                case 2:
                    new BoardListService().execute();
                    break;
                case 3:
                    new BoardViewService().execute();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("올바른 입력값이 아닙니다. 다시 입력해주세요");
                    break;
            }
        }

    }


    public static void main(String[] args) {
        new IndexMain().menu();
        System.out.println("프로그램을 종료합니다.");
    }
}
