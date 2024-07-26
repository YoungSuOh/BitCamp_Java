package collection_;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
* Interface Collection<E> -> Collection은 interface이다. => 안에 있는 메서드들은 모두 추상 메서드이다.
* interface 사용 방법
* 1. implements -> 모든 추상 메서드를 override 해줘야 한다.
*
* implements 하려는 interface의 추상 클래스가 너무 많아..
* 2. 대신 override를 해주는 클래스들(All Known Implementing Classes) -> 대표적으로 ArrayList, Stack, Queue, LinkedList
*
* 3. 메서드(interface를 생성시켜주는 메서드를 제공한다)
*
* 4. 익명 inner class -> 단점: 흑기사가 모든 메서드를 override + 잠깐 쓰고 버림
* */
public class CollectionMain {

    @SuppressWarnings("all") // 윽박 지르는거임 -> 겁내기 말고 값을 담아
    public static void main(String[] args) {
        /*  1.  Collections collections = new Collection();  // 추상 클래스와 인터페이스는 new 가 불가능하다.*/


        Collection collection =new ArrayList();
        collection.add("호랑이");
        collection.add("호랑이"); // 중복 허용
        collection.add("사자");
        collection.add(25);
        collection.add(47.5);  // 노란줄 : 결과는 잘 나오지만 불안하다. 왜냐하면 collection 안에 뭐가 들어갈지 무서움
                               // 따라서 제네릭이 필요하다. 아니면 윽박 질러야 함(@SuppressWarnings)

        // collection은 get이 없음 -> iterator를 통해 순회
        // iterator는 interface -> new가 안됨
        Iterator iter = collection.iterator(); // 따라서 메서드를 이용 (3번)
/*        iter.hasNext() - 현재 위치에 항목이 있으면 true / 없으면 false*/
  /*      iter.next() - 현재 위치의 항목을 꺼내서 버퍼에 기억시키고, 다음 항목으로 이동한다. */
        while(iter.hasNext()){
            System.out.println(iter.next()+" ");
        }
    }

}

/* Collection (java.util)
* 객체를 담아주는 저장 창고
* 객체 타입에 상관없이 저장 가능
* 크기 조절 가능 -> 이것 때문에 배열 대신 사용하는 이유
* 기본형으로 담기 불가능 Collection<int> (x) => Wrapper 클래스 형식으로 Collection<Integer>
* */
