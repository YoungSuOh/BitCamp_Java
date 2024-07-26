package homework;

import java.util.Scanner;

public class SungJukOX {
    static final String Jung = "11111";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("인원 수 입력 :  ");
        int num = scanner.nextInt();
        String [] name = new String[num];
        char [][] ox = new char[num][5];


        for(int i=0;i<num;i++){
            System.out.print("이름 입력 : ");
            name[i]=scanner.next();
            System.out.print("답안지 입력 : ");
            String ans = scanner.next();
            for(int j=0;j<ans.length();j++){
                ox[i][j]= ans.charAt(j);
            }
        }
        System.out.println("        *** 성적표 ***");
        System.out.println("이름      \t1\t2\t3\t4\t5\t\t점수");
        for(int i=0;i<num;i++){
            int cnt=0;
            System.out.printf("%-8s\t", name[i]);
            for(int j=0;j<5;j++){
                if(ox[i][j]==Jung.charAt(j)){
                    System.out.print("O\t");
                    cnt++;
                }
                else{
                    System.out.print("X\t");
                }
            }
            System.out.print("\t"+cnt*20+"\n");
        }

    }
}
/*
[문제] 성적처리 프로그램
- 5문제는 사지선다형 문제이다
- 정답은 "11111"
static final String jung = "11111"; //상수화
- 1문제당 20점씩 한다.

        [실행결과]
인원수 입력 : 2

이름 입력 : 홍길동
답안지 입력 : 12311

이름 입력 : 코난
답안지 입력 : 11311

        *** 성적표 ***
이름      1 2 3 4 5   점수
홍길동   O X X O O   60
코난      O O X O O   80*/
