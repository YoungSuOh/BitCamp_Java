package class_.sungjuk;


import java.util.Scanner;

public class SungJukMain {
    public static void main(String[] args) {
        SungJuk sungJuk = new SungJuk();
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        sungJuk.setName(scanner.next());

        int kor, eng, math; int sum=0;
        System.out.print("국어 성적 입력 : ");
        kor = scanner.nextInt(); sum+=kor;
        System.out.print("영어 성적 입력 : ");
        eng = scanner.nextInt(); sum+=eng;
        System.out.print("수학 성적 입력 : ");
        math = scanner.nextInt(); sum+=math;

        // 개별 성적 저장
        Subject subject = new Subject(kor,eng,math);
        sungJuk.setSubject(subject);

        // 성적 총점 계산
        sungJuk.setTotal(sum);

        // 평균 저장
        sungJuk.setAvg((double)(sum/3));

        // 학점 저장
        sungJuk.setGrade(sungJuk.getAvg());

        System.out.println("----------------------------------------------------");
        System.out.println("이름\t\t국어\t영어\t수학\t총점\t평균\t학점\n");
        System.out.println(sungJuk.getName()+"\t"+sungJuk.getSubject().getKor()
        +"\t"+sungJuk.getSubject().getEng()+"\t"+sungJuk.getSubject().getMath()
        +"\t"+sungJuk.getTotal()+"\t"+sungJuk.getAvg()+"\t"+sungJuk.getGrade());


    }
}

/*

[실행결과]
        ----------------------------------------------------
이름 국어 영어 수학 총점 평균 학점
----------------------------------------------------
홍길동 90 96 100*/
