package book;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookFileRead implements Book {

    @Override
    public void run(List<BookDTO> bookDTOS) {
        System.out.println("조건\n" +
                "4. 파일 읽기");
        try (BufferedReader reader = new BufferedReader(new FileReader("book.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                String code = data[0];
                String title = data[1];
                String author = data[2];
                int price = Integer.parseInt(data[3]);
                int qty = Integer.parseInt(data[4]);
                int total = Integer.parseInt(data[5]);
                BookDTO bookDTO = new BookDTO(code, title, author, price, qty, total);
                bookDTOS.add(bookDTO);
            }
            System.out.println("파일 읽기가 완료되었습니다.");
        } catch (IOException e) {
            System.out.println("파일 읽기에 실패했습니다.");
        }
    }
}
