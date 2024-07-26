package for_;

import java.util.Objects;
import java.util.Scanner;

public class AddGame {
    public static void main(String[] args) {
        final int score = 20;
        Scanner scanner = new Scanner(System.in);
        String doOrNot;

        while(true){
            int res = 0, cnt=0;
            for(int i=0;i<5;i++){
                int rand1 = (int) (Math.random()*10+89);
                int rand2 = (int) (Math.random()*10+89);
                int ans = rand1+rand2;


                for(int j=0;j<2;j++){
                    System.out.print("["+(i+1)+"] "+rand1+" + "+rand2+" = ");
                    int input = scanner.nextInt();
                    if(input==ans){
                        res+=score; cnt++;
                        System.out.println("딩동뎅");
                        System.out.println();
                        break;
                    }
                    else if(j==0){
                        System.out.println("틀렸다");
                    }
                    else{
                        System.out.println("틀렸다 정답은 "+ans);
                    }
                    System.out.println();
                }
            }
            System.out.println("당신은 총 "+cnt+" 문제를 맞추어서 점수 "+res+"점 입니다.");
            System.out.println("또 할래(Y/N) : ");
            doOrNot=scanner.next();
            if(Objects.equals(doOrNot, "N") || Objects.equals(doOrNot, "n")) break;
        }
        System.out.println("프로그램을 종료합니다.");
    }

}


/*
[문제] 덧셈 계산 (for, while, 다중 for)
- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 5문제를 제공한다.
        - 1문제당 점수 20점씩 처리한다.
//        - 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.

[실행결과]
        [1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 59
틀렸다 정답은 xx

[2] 10 + 25 = 35
딩동뎅

[5] 78 + 95 = 89
틀렸다
[5] 78 + 95 = 173
딩동뎅

당신은 총 x 문제를 맞추어서 점수 xx점 입니다.

또 할래(Y/N) : A
또 할래(Y/N) : w
또 할래(Y/N) : n

프로그램을 종료합니다.*/
