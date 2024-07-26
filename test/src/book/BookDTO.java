package book;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class BookDTO implements Comparable<BookDTO>, Serializable {
    private String code, title, author;
    private int price, qty, total;

    @Override
    public int compareTo(BookDTO other) {
        return this.title.compareToIgnoreCase(other.title);  // 대소문자 구별 x
    }

    @Override
    public String toString() {
        return (getCode()+"\t"+getTitle()+"\t"+
                getAuthor()+"\t"+getPrice()+"\t"+
                getQty()+"\t"+getTotal());
    }
}
