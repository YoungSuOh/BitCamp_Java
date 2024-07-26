package collection_.sungjuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {
    private Scanner scanner = new Scanner(System.in);
    public static int temp;
    @Override
    public void execute(ArrayList<SungJukDto> arrayList) {
        System.out.println("********************\n" +
                "1. 총점으로 내림차순\n" +
                "2. 이름으로 오름차순\n" +
                "3. 이전 메뉴");
        System.out.print("번호 : ");
        temp = scanner.nextInt();

        switch (temp) {
            case 1: case 2:
                Collections.sort(arrayList);
                break;
            case 3:
                break;
            default:
                System.out.println("잘못된 입력입니다."); break;
        }
    }


}
