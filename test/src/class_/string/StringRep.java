package class_.string;

import java.util.Objects;
import java.util.Scanner;

public class StringRep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cnt=0;
        while(true){
            cnt++;
            System.out.print("문자열 입력: ");
            String str=scanner.next();
            str=str.toLowerCase();

            if(Objects.equals(str,"종료")) break;

            System.out.print("현재 문자열 입력 : ");
            String str1 = scanner.next();

            System.out.print("바꿀 문자열 입력 : ");
            String str2=scanner.next();



            if(str.length()<str2.length()){
                System.out.println("입력한 문자열의 크기가 작습니다");
                System.out.println("치환 할 수 없습니다"); continue;
            }
            int exist = str.indexOf(str1);
            if(exist!=-1){
                System.out.println("        "+str.replace(str1,str2));
                System.out.println(cnt+"번 치환");
            }
            else{
                System.out.println("치환할 문자열이 없습니다.");
                System.out.println("치환 할 수 없습니다");
            }
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}


/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
        ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
        ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
        ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
        ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다*/
