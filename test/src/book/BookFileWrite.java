package book;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BookFileWrite implements Book{
    @Override
    public void run(List<BookDTO> bookDTOS) {
        System.out.println("조건\n" +
                "3. 파일 저장");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("book.txt"))) {
            for (BookDTO bookDTO : bookDTOS) {
                writer.write(bookDTO.getCode() + "\t" + bookDTO.getTitle() + "\t" + bookDTO.getAuthor() + "\t" + bookDTO.getPrice() + "\t" + bookDTO.getQty() + "\t" + bookDTO.getTotal());
                writer.newLine();
            }
            System.out.println("파일 저장이 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 저장에 실패했습니다.");
        }
    }
}
