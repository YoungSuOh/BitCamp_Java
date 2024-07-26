package operator;

import java.util.Scanner;

public class Operator01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("현금 입력 : ");
        int mon = scanner.nextInt();
        System.out.println("천원: "+mon/1000+"장");
        mon%=1000;
        System.out.println("백원: "+mon/100+"개");
        mon%=100;
        System.out.println("십원: "+mon/10+"개");
        mon%=10;
        System.out.println("일원: "+mon+"개");
    }
}
/*[문제] 동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오

[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개*/
