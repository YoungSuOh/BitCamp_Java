package book;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookInsert implements Book{
    private Scanner scanner;
    private String code, title, author;
    private int price, qty, total;

    public BookInsert() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run(List<BookDTO> bookDTOS) {
        System.out.println("조건\n" +
                "1. 입력");
        try{
            code = scanner.next();
            title = scanner.next();
            author=scanner.next();
            price = scanner.nextInt();
            qty = scanner.nextInt();
            total = qty * price;
            BookDTO bookDTO = new BookDTO(code, title, author, price, qty, total);
            bookDTOS.add(bookDTO);
        }catch (InputMismatchException e){
            System.out.println("올바르지 않은 입력입니다. 입력 메뉴를 종료합니다.");
        }
    }
}
