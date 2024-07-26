package collection_.dataStructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        // Set<> set = new Set();  // Set은 interface이기 때문에 new가 안된다
        Set<String> set = new HashSet();  // 따라서 Hashset을 써준다.

        set.add("호랑이");
        set.add("호랑이");  // 중복 허용 x, 순서 x
        set.add("사자");
        set.add("코끼리");
        set.add("기린");

        Iterator<String> it = set.iterator();  // 3번 방법인 interface 메서드를 통해 생성된거다.
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
