package homework;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        int defMon = 1000;
        Scanner scanner = new Scanner(System.in);

        while (defMon > 0) {
            System.out.print("가위(1), 바위(2), 보자기(3) 입력 : ");
            int me;
            try {
                me = System.in.read()-48;
            } catch (IOException e) {
                System.out.println("다시 입력해용");
                System.in.read(); // 엔터키를 처리
                continue;
            }

            System.out.print("배팅 금액 : ");
            int bet;
            while(true){
                try{
                    bet = scanner.nextInt();
                    if(bet > defMon){
                        System.out.println("통장 잔액이 부족합니다");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e){
                    System.out.println("다시 입력해라잉");
                    scanner.nextLine(); // 잘못된 입력을 버퍼에서 제거
                }
            }

            System.out.println("결과를 보시려면 Enter를 치세요");
            scanner.nextLine(); // 앞서 남아있는 엔터키를 처리하기 위해 한 번 더 호출
            scanner.nextLine();

            int rand = random.nextInt(3) + 1; // 1~3
            switch (rand) {
                case 1:
                    if (me == 1) {
                        System.out.println("컴퓨터: 가위, 나는 가위");
                        System.out.println("비겼다 까비");
                    } else if (me == 2) {
                        System.out.println("컴퓨터: 가위, 나는 바위");
                        defMon += bet;
                        System.out.println("이겼다! 니 " + bet + "꿀-꺽 나는 이제 " + defMon + " 있다잉");
                    } else {
                        System.out.println("컴퓨터: 가위, 나는 보자기");
                        defMon -= bet;
                        System.out.println("ㅠㅠ..졌다\n현재 금액은 " + defMon + "원");
                    }
                    break;
                case 2:
                    if (me == 1) {
                        System.out.println("컴퓨터: 바위, 나는 가위");
                        defMon -= bet;
                        System.out.println("ㅠㅠ..졌다\n현재 금액은 " + defMon + "원");
                    } else if (me == 2) {
                        System.out.println("컴퓨터: 바위, 나는 바위");
                        System.out.println("비겼다 까비");
                    } else {
                        System.out.println("컴퓨터: 바위, 나는 보자기");
                        defMon += bet;
                        System.out.println("이겼다! 니 " + bet + "원 꿀-꺽 나는 이제 " + defMon + "원 있다잉");
                    }
                    break;
                case 3:
                    if (me == 1) {
                        System.out.println("컴퓨터: 보자기, 나는 가위");
                        defMon += bet;
                        System.out.println("이겼다! 니 " + bet + "원 꿀-꺽 나는 이제 " + defMon + " 있다잉");
                    } else if (me == 2) {
                        System.out.println("컴퓨터: 보자기, 나는 바위");
                        defMon -= bet;
                        System.out.println("ㅠㅠ..졌다\n현재 금액은 " + defMon + "원");
                    } else {
                        System.out.println("컴퓨터: 보자기, 나는 보자기");
                        System.out.println("비겼다 까비");
                    }
                    break;
            }

            if (defMon <= 0) {
                System.out.println("통장에 돈이 없다. 한강가자.");
                break;
            }
        }

        scanner.close();
    }
}
