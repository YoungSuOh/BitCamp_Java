package inheritance;

import java.util.ArrayList;

class Test{
    @Override
    public String toString(){
        return getClass()+"개바부";
    }

}

public class ObjectMain {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println("객체 test = "+test); // inheritance.Test@682a0b20
        System.out.println("객체 test = "+test.toString());
        System.out.println("객체 test = "+test.hashCode()); // @682a0b20 -> 1747585824(10진수)
        System.out.println();


        String str = "apple";
        System.out.println("객체 str = "+str);  // 클@16진수 ==> 문자열
        System.out.println("객체 str = "+str.toString());
        System.out.println("객체 str = "+str.hashCode());

        String aa = new String("apple");
        String bb = new String("apple");
        System.out.println("aa==bb : "+(aa==bb));  // 주소 비교
        System.out.println("aa.equals(bb) : "+ aa.equals(bb));  // 문자열 비교 -> String일때만 문자열 비교(String만 유별남)
        System.out.println();

        Object cc = new Object();
        Object dd = new Object();
        System.out.println("cc==dd : "+(cc==dd));
        System.out.println("aa.equals(bb) : "+ cc.equals(dd));  // 이것도 주소값 물어봄 -> 따라서 false
        System.out.println();

        Object ee = new String("apple");
        Object ff = new String("apple");
        System.out.println("ee==ff : "+(ee==ff));
        System.out.println("ee.equals(ff) : "+ ee.equals(ff));  // 자식 우선(메서드 한정) -> true
        System.out.println();

        ArrayList<String> list = new ArrayList<>();
        list.add("호랑이");
        list.add("사자");
        System.out.println(list); // `클@16진수`가 나와야 하는데 [호랑이] 로 나옴 -> [항목]이 되게 override함

    }
}
/*
class Object{
    public String toString(){} // 클@16진수
    public int hasCode() {} // 10진수
    public boolean equals(Object object) {}
}
class String extends Object{
    public String toString(){} // 문자열로 override
    public int hashCode() {} // 믿지 마삼, 표현할 수 있는 문자열은 무한대이기 때문에 10진수 표현을 다 할 수 없다.
    public boolean equals
}
*/
