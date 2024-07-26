package book;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookService {
    private Scanner scanner;
    private List<BookDTO> bookDTOS;


    public BookService() {
        this.scanner = new Scanner(System.in);
        bookDTOS = new ArrayList<>();
    }

    public void menu(){
        boolean exit = false;
        while(true){
            if(exit) break;
            System.out.print("메뉴\n" +
                    "1. 등록\n" +
                    "2. 출력\n" +
                    "3. 파일 저장\n" +
                    "4. 파일 읽기\n" +
                    "5. 책 제목으로 오름차순\n" +
                    "6. 책 제목 검색\n" +
                    "7. 끝\n" +
                    "\n" +
                    "번호 선택 : ");

            try{
                int opt; opt = scanner.nextInt();
                switch (opt){
                    case 1:
                        new BookInsert().run(bookDTOS); break;
                    case 2:
                        new BookPrint().run(bookDTOS); break;
                    case 3:
                        new BookFileWrite().run(bookDTOS); break;
                    case 4:
                        new BookFileRead().run(bookDTOS); break;
                    case 5:
                        new BookTitleAsc().run(bookDTOS); break;
                    case 6:
                        new BookTitleSearch().run(bookDTOS); break;
                    case 7:
                        System.out.println("프로그램을 종료합니다.");
                        exit=true; break;
                    default:
                        System.out.println("메뉴에 없는 옵션이에요"); break;
                }
            }catch (InputMismatchException e){
                System.out.println("올바른 입력값이 아닙니다. 다시 입력해주세요");
            }
        }
        scanner.close();

    }
}
