package operator;

public class Operator05 {
    public static void main(String[] args) {
        boolean a = 25>36;
        System.out.println("a = "+a);
        System.out.println("!a = "+!a);
        System.out.println();

        String b = "apple";  // 변수  b는 스택에 방을 만들어 heap 공간의 저장되어 있는 "apple"의 시작 주소값을 가지고 있음.
        String c = "apple";  // 똑같은 문자열이 heap 공간에 이미 있기 때문에 똑같은 주소 공간을 할당
        String d = new String("apple"); // new 연산자를 사용하게 되면 heap 공간에 *String 클래스 타입*으로 저장

        System.out.println("b==c: "+(b==c?"같다":"다르다"));  // 주소를 물어보고 있음  -> 자바는 실제 메모리 주소는 못 출력함.
        System.out.println("b==d: "+(b==d?"같다":"다르다"));  // 주소를 물어보고 있음
        System.out.println();


        System.out.println("b.equals(c) : "+((b.equals(c))?"같다":"다르다")); // 문자열을 비교
        System.out.println("b.equals(c) : "+((b.equals(d))?"같다":"다르다")); // 문자열을 비교
    }
}
