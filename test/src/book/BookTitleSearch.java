package book;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTitleSearch implements Book {
    private Scanner scanner;

    public BookTitleSearch() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run(List<BookDTO> bookDTOS) {
        System.out.println("조건\n" +
                "6. 책 제목 검색");
        System.out.print("검색할 책 제목 입력: ");
        String searchTitle = scanner.nextLine().toLowerCase();  // 대소문자 구별 없애기 위해 전부 소문자로 받음

        List<BookDTO> foundBooks = new ArrayList<>();
        for (BookDTO bookDTO : bookDTOS) {
            if (bookDTO.getTitle().toLowerCase().contains(searchTitle)) {
                foundBooks.add(bookDTO);
            }
        }

        if (foundBooks.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            System.out.println("검색 결과:");
            System.out.println("코드\t책제목\t저자\t\t단가\t개수\t합계");
            for (BookDTO bookDTO : foundBooks) {
                System.out.println(bookDTO);
            }
        }
    }
}
