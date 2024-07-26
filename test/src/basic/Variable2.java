package basic;

public class Variable2 {
    int a=10; // 전역
    static int b; // default 0
    static double d;  // default 0.0
    static String c;  // 모든 클래스 타입의 default 값은 NULL

   /* c="hello"; // error -> 모든 명령문들은 함수 안으로 들어가야 한다.*/

    public static void main(String[] args) {
        int a=100; // 지역변수
        System.out.println(a);
        System.out.println("필드 a = "+new Variable2().a);
        System.out.println("static 변수 b = "+b);  // 그냥 갔다 써도 됨
        System.out.println("static 변수 b = "+Variable2.b);  // 그냥 갔다 써도 됨
        System.out.println(d);
        System.out.println(c);
        c="hello"; // 리터럴 생성 => String Class만 new 없이 리터럴 생성이 가능하다.
        System.out.println(c);
    }
}
