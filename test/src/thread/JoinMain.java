package thread;

/**
 * 24.07.22(월) 스레드 수업
 * @author 홍재헌
 *
 */

/*
* Thread : 프로그램의 하나의 조각 (단위 프로그램)
* main 메서드더 하나의 스레드이다.
*
* */
public class JoinMain {

    public static void main(String[] args) {
        JoinTest joinTest = new JoinTest();
        Thread t = new Thread(joinTest);		//스레드 생성

        System.out.println("스레드 시작");
        t.start();
        try {
            t.join();							//스레드가 끝날때까지 기다리는 메소드
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("스레드 종료");

    }

}
// 메인이 종료되어도 스레드는 종료되지 않는다
// 메인이 끝나도 백그라운드에서 스레드는 돌아간다

class JoinTest implements Runnable{

    @Override
    public void run() {		//Call-Back 메소드(콜백메소드, 운영체제에 의해 불려지는 메소드)
        for (int i = 1; i <= 5; i++) {
            System.out.println("i : " + i + "\t" + Thread.currentThread());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}