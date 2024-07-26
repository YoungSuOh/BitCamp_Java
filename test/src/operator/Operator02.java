package operator;

import java.util.Scanner;

public class Operator02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하시오: ");
        int score = scanner.nextInt();
        if(score>=80&&score<=100){   // score>=80&score<=100  -> &는 앞이 틀려도 일단 간다.
            System.out.println("합격");
        }
        else{
            System.out.println("불합격");
        }
    }
}

/*[문제] 점수를 입력하여 합격인지 불합격인지 판별하는 프로그램
점수가 80~100 사이면 합격으로 한다.*/
