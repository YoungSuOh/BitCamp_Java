package class_.exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam {
    private String name = null;
    private String dap = null;
    private char[] ox = null;
    private int score = 0;
    private final String JUNG = "11111";
    private Scanner scanner;
    private Exam[] exams;

    public Exam() {
        scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public char[] getOx() {
        return ox;
    }

    public int getScore() {
        return score;
    }

    public void run() {
        System.out.print("인원수 입력 : "); int num;
        while(true){
            try{
                num = scanner.nextInt(); break;
            } catch (InputMismatchException e){
                System.out.println("올바른 입력이 아닙니다.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();

        exams = new Exam[num];

        for (int i = 0; i < num; i++) {
            exams[i] = new Exam();
            exams[i].inputInfo();
        }

        printResults(); scanner.close();
    }

    private void inputInfo() {
        System.out.print("이름 입력 : ");
        name = scanner.nextLine();
        System.out.print("답 입력 : ");
        dap = scanner.nextLine();
        ox = new char[JUNG.length()];
        compare();
    }

    private void compare() {
        for (int i = 0; i < JUNG.length(); i++) {
            if (dap.charAt(i) == JUNG.charAt(i)) {
                ox[i] = 'O';
                score += 20;
            } else {
                ox[i] = 'X';
            }
        }
    }

    private void printResults() {
        System.out.println("\n이름       1 2 3 4 5   점수");
        for (Exam exam : exams) {
            System.out.printf("%-8s ", exam.getName());
            for (char c : exam.getOx()) {
                System.out.print(c + " ");
            }
            System.out.printf("  %d\n", exam.getScore());
        }
    }


}


/*
클래스명 : Exam
* 필드
private String name = null;
private String dap = null;
private char[] ox = null;
private int score = 0;
private final String JUNG = "11111"; //상수화

* 메소드
생성자 - Scanner 써서 이름, 답을 입력 받는다.
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

[실행결과]
인원수 입력 : 3

이름 입력 : 홍길동
답 입력 : 12311

이름 입력 : 김태리
답 입력 : 12341

이름 입력 : 유연석
답 입력 : 12111

이름      1 2 3 4 5   점수
홍길동     O X X O O   60
김태리     O X X X O   40
유연석     O X O O O   80*/
