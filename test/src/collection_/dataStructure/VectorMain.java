package collection_.dataStructure;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {  // Collection의 일종, 메모리를 많이 크게 잡음
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        System.out.println("벡터의 크기 : "+vector.size());
        System.out.println("벡터의 용량 : "+vector.capacity());  // 기본 용량, 10 -> 항목이 들어갈 공간이 없으면 10개씩 자동으로 증가

        System.out.println("항목 추가");
        for(int i=1;i<=10;i++){
            vector.add(i+"");  // +""을 왜 했을까용?? -> 제네릭을 String 형으로 선언을 했기 때문
            System.out.print(vector.get(i-1)+" ");
        }
        System.out.println();

        System.out.println("항목 1개 추가");
        vector.addElement(5+""); // 중복 허용
        for(int i=0;i<vector.size();i++){
            System.out.print(vector.get(i)+" ");
        }
        System.out.println();
        System.out.println("벡터의 크기 : "+vector.size());
        System.out.println("벡터의 용량 : "+vector.capacity());  // 항목이 들어갈 공간이 10개가 꽉찼으므로 이후에 add를 진행하면 10씩 공간을 또 늘림

        System.out.println("항목 5를 삭제");
        vector.remove(5);


        System.out.println(vector); // [1, 2, 3, 4, 5, 7, 8, 9, 10, 5] -> index 5를 지움 => 항목 6이 지워짐
        System.out.println();
        System.out.println("벡터의 크기 : "+vector.size());
        System.out.println("벡터의 용량 : "+vector.capacity());


        System.out.println("항목 5를 삭제");
        vector.remove(5+"");


        System.out.println(vector); // [1, 2, 3, 4, 7, 8, 9, 10, 5] -> 중복되어 있으면 앞에 있는 5를 삭제
        System.out.println();
        System.out.println("벡터의 크기 : "+vector.size());
        System.out.println("벡터의 용량 : "+vector.capacity());

        Iterator<String>iter = vector.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next()+" ");
        }
    }
}
