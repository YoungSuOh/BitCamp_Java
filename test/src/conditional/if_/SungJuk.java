package conditional.if_;

import java.util.Scanner;

public class SungJuk {
    public static void main(String[] args) {
        String L = "영수";
        int kor = 100, eng = 100, math = 100;
        int total = kor + eng + math;
        double avg = (double) (total)/3;
        System.out.println(" *** "+L+" 성적표 ***    ");
        System.out.println("국어\t영어\t수학\t총점\t평균\t\t학점");
        System.out.print(kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+String.format("%.3f",avg)+"\t");

        switch ((int) (avg/10)){
            case 10: case 9:
                System.out.println('A');
                break;
            case 8:
                System.out.println('B');
                break;
            case 7:
                System.out.println('C');
                break;
            case 6:
                System.out.println('D');
                break;
            default:
                System.out.println('F');
                break;
        }
    }
}
/*
[문제] 성적 계산
이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 총점(tot)과 평균(avg), 학점(grade)을 구하시오

[조건]
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
평균의 소수이하 3째자리까지 출력

학점 평균 90 이상 A학점, 80 이상 B, 70 C, 60 D, 그외 f

[실행결과]
 *** L 성적표 ***
국어 영어 수학 총점 평균
85 90 100 xxx xx.xxx
 */