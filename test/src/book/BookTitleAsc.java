package book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTitleAsc implements Book{

    @Override
    public void run(List<BookDTO> bookDTOS) {
        System.out.println("조건\n" +
                "5. 책 제목으로 오름차순 정렬");
        Collections.sort(bookDTOS);
        System.out.println("책 제목으로 오름차순 정렬이 완료되었습니다.");
    }
}
