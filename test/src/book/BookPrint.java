package book;

import java.util.ArrayList;
import java.util.List;

public class BookPrint implements Book {

    @Override
    public void run(List<BookDTO> bookDTOS) {
        System.out.println("조건\n" +
                "2. 출력");
        System.out.println("코드\t책제목\t저자\t\t단가\t개수\t합계");
        for(BookDTO bookDTO:bookDTOS){
            System.out.println(bookDTO);

        }
    }
}
