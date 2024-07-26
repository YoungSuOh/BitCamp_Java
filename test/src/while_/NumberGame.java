package while_;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int cnt=0; Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100)+1;
        System.out.println("1 ~ 100 사이의 숫자가 발생했습니다. "+" ("+num+")");
        while(true){
            cnt++;
            int a= scanner.nextInt();
            if(a==num){
                System.out.println("딩동뎅..."+cnt+"번 만에 맞추셨습니다.");
                System.out.println("게임을 다시 진행하겠습니까??");
                String b = scanner.next();
                if(Objects.equals(b, "네")){
                    cnt=0;
                    num = random.nextInt(100)+1;
                    System.out.println("1 ~ 100 사이의 숫자가 발생했습니다. "+" ("+num+")");
                }
                else if(Objects.equals(b, "아니오")){
                    scanner.close(); break;
                }
            }
            else if(a<num){
                System.out.println(a+"보다 큰 숫자입니다.");
            }
            else{
                System.out.println(a+"보다 작은 숫자입니다.");
            }
        }
        System.out.println("게임을 종료합니다 :)");
    }
}
