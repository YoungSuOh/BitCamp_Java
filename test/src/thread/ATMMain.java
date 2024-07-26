package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ATM implements Runnable{
    private long depositeMoney = 100000; // 잔액
    private long balance;  // 찾고자 하는 금액


    @Override
    public synchronized void run() {  // synchronized -> 한번에 하나의 쓰레드가 걸리게 락 걸림
        System.out.println("안녕하세요 " + Thread.currentThread().getName()+"고객님");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("찾고자 하는 금액 입력: ");
        try {
            balance = Long.parseLong(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        try {
            withDraw();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void withDraw() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        if(balance%10000!=0){
            System.out.println("만원 단위로 입력하세요");
        }
        else if(balance>depositeMoney){
            System.out.println("잔액이 부족합니다.");
        }
        else{
            depositeMoney -=balance;
            System.out.println("1. 잔액은 "+depositeMoney+"원 입니다");
        }
    }
}

public class ATMMain {

    public static void main(String[] args) {
        // 쓰레드 생성
        /*Thread mom = new Thread(this)*/ // static 영역에서는 this가 없을 뿐더러 ATMMain은 thread가 아니다.

        ATM atm = new ATM();

        Thread mom = new Thread(atm, "엄마");
        Thread son = new Thread(atm, "아들");  // 같은 공유자원에 접근하려고 한다.

        mom.start();  // 쓰레드 시작 -> 쓰레드 실행(run() 메서드 찾아간다.)
        son.start();  // 동시에 run 메서드 실행 가능하다.

        /*
        * 안녕하세요 Thread[아들,5,main]고객님 // 순서 실행할때마다 다름
          안녕하세요 Thread[엄마,5,main]고객님
        * */


        /*
        * 안녕하세요 엄마고객님
        * 안녕하세요 아들고객님
        *
        * */

    }
}

