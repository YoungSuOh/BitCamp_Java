package collection_.dataStructure;

import java.util.LinkedList;

/*
* 검색 속도가 느림 -> 각각 항목들의 주소값으로 추적
* */

public class LinkedListMain  {
    public static void main(String[] args) {
        String[] item = {"소나타", "렉스톤", "재규어"};

        LinkedList<String> linkedList = new LinkedList<>();

        for(String n:item){
            linkedList.offer(n); // 요소 추가
        }


        System.out.println("linkedList의 크기 : "+linkedList.size());
        String data = "";

        while((data=linkedList.poll())!=null){
            System.out.println(data+"삭제!");
            System.out.println("linkedList의 크기 : "+linkedList.size());
        }
    }
}
