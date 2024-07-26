package collection_;

import java.util.ArrayList;

public class CollectionMain2 {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList();  // ArrayList는 클래스임

        arrayList.add("호랑이");
        arrayList.add("호랑이"); // 중복 허용
        arrayList.add("사자");
/*        arrayList.add(25); int 타입 -> 에러
        arrayList.add(47.5);*/

        for(String str:arrayList){
            System.out.print(str+" ");
        }
        System.out.println();
        for(int i=0;i<arrayList.size();i++){
            System.out.print(arrayList.get(i)+" ");
        }
    }
}
