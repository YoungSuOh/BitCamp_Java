package conditional.if_;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("데이터 입력 : ");
        int a= scanner.nextInt();

        if(a>=50) System.out.println(a+"는 50보다크거나 같다");
        System.out.println(a+ "는 50보다 작다");
        System.out.println();
    }
}
