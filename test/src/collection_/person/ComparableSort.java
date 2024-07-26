package collection_.person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/* Comparable
- 기본 정렬기준을 구현하는데 사용
- 주로 Integer와 같은 warpper클래스와 String, Date, File과 같은 것
- 기본적으로 오름차순으로 정렬되도록 구현되어 있다
- public int compareTo(T o)
* */
public class ComparableSort {
    public static void main(String[] args) {
        String [] arr = {"orange", "apple", "banana", "pear", "peach", "applemango"};

        System.out.println("정렬 전 = ");
        for(String data : arr){
            System.out.print(data+" ");
        }
        System.out.println();
        Arrays.sort(arr);

        System.out.println("정렬 후 = ");
        for(String data : arr){
            System.out.print(data+" ");
        }
        System.out.println();


        // 객체 비교
        ArrayList<PersonDto> arrayList = new ArrayList<PersonDto>();

        arrayList.add(/*aa*/new PersonDto("홍길동",25));
        arrayList.add(/*bb*/new PersonDto("프로도",40));
        arrayList.add(/*cc*/new PersonDto("라이언",30));

        // 기준을 누구로 sort할 것인지 -> 1. PersonDto에 Comparable interface implements 시킴
        Collections.sort(arrayList);

        System.out.println("정렬 후 = ");
        for(PersonDto p: arrayList){
            System.out.println(p);
        }

        /*
        * 정렬 일시적으로 설정 하기 Comparator
        * */
        System.out.println("정렬 후 - 이름으로 내림차순 ");
        Comparator <PersonDto> comparator = new Comparator<PersonDto>() { // 흑기사 대동
            @Override
            public int compare(PersonDto p1, PersonDto p2) {
                return p1.getName().compareTo(p2.getName())*-1;  // 내림차순
            }
        };
        Collections.sort(arrayList,comparator);  // comparator로 sort 시켜라
        for(PersonDto p: arrayList){
            System.out.println(p);
        }
    }
}

/* Comparable: 내가 기준을 잡고 수행, 대신 기준 한번 잡으면 못바꿈
*  그래서 나온 것이 Comparator
* */
