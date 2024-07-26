package for_;

import java.util.Scanner;

public class For05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("x와 y의 제곱승을 구하시오");
            System.out.print("x: ");
            int x = scanner.nextInt();
            if(x==0){
                System.out.println("프로그램을 종료합니다."); break;
            }
            System.out.print("y: ");
            int y = scanner.nextInt();
            if(y<0){
                while(true){
                    System.out.print("y: ");
                    y=scanner.nextInt();
                    if(y>=0) break;
                }
            }
            System.out.println(x+"의 "+y+"승 "+(int)(Math.pow(x,y)));
            System.out.println();
        }
    }
}
