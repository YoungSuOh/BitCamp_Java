package conditional.if_;

import java.io.IOException;

public class Input {
    public static void main(String[] args) throws IOException {
        System.out.print("문자 입력 : ");
        /*System.in 키보드를 통해서 입력 받겠다.*/
        int a = System.in.read();  // public abstract int read() throws IOException; => read() 메서드는 int 형으로 발생함
        System.out.println("a = "+a);
        /*
        result
        문자 입력 : abc
        a = 97  ==> 문자 하나만 읽기 때문에 선호되지는 않는다.
        화면                 ---> 버퍼             ---> 메모리
        데이터 입력: a+enter키      a    ->        a를 메모리에 a의 값 97를 저장하고 enter키 13을 저장한다.

        Enter 특징:
        1. 맨 앞으로 가라  \r
        2. 다음 줄로 가라  \n
        따라서 enter를 없애기 위해서는 버퍼의 flush를 2번 해줘야 한다.
        */

        // Exception 1. 컴파일할 때 발생 2. Runtime에 발생


        System.out.print("문자 입력 : ");
        a = System.in.read();
        System.out.println("a = "+a);
        System.in.read();
        System.in.read();  // enter 지우기

        System.out.print("문자 입력 : ");
        int b = System.in.read();
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
}
