package collection_.sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void execute(ArrayList<SungJukDto> arrayList) {
        System.out.print("번호 입력 : ");
        int number = scanner.nextInt();

        System.out.print("이름 입력 : ");
        String name = scanner.next();

        System.out.print("국어 입력 : ");
        int kor = scanner.nextInt();


        System.out.print("영어 입력 : ");
        int eng = scanner.nextInt();


        System.out.print("수학 입력 : ");
        int math = scanner.nextInt();

        SungJukDto sungJukDto = new SungJukDto(number,name,kor,eng,math);
        sungJukDto.setTot();
        sungJukDto.setAvg();
        arrayList.add(sungJukDto);
        System.out.println("입력되었습니다");
    }
}
