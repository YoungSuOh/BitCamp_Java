package basic;



public class HelloTest {
    public static void main(String[] args) {
        System.out.println("안녕하세요");
        System.out.println();

        System.out.println('A'+32);
        System.out.println((char)('A'+32));  // 강제형변환
        System.out.println();

        System.out.println(2+3);
        System.out.println('2'+'3'-48*2);
        System.out.println();

        /*  Wrapper Class
        String
        Integer
        Double
         */

        /*System.out.println(parseInt("2)"+"3"); 이렇게 되면 parseInt의 소유주는 HelloTest 클래스가 된다. */
        System.out.println(Integer.parseInt("2")+Integer.parseInt("3"));
        System.out.println();

        System.out.println("12.5"+"36.8");
        System.out.println(Double.parseDouble("12.5")+Double.parseDouble("36.8"));


        /*
        변수명
        : 영문자, 숫자(0~9), _, $를 섞어서 사용 가능
        : 첫 글자는 소문자로 기술한다.
        : 단어가 바뀌면 첫 글자를 대문자로 사용
         */

        /*
        [형식]
        자료형 변수명

        자료형의 종류
        1. 기본형
        논리형 - boolean
        문자형 - char
        정수형 - byte, short, int, double
        실수형 - float, double
        2. 객체형
        String
        Integer
        Double
         */
    }
}
