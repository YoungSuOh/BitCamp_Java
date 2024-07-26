package thread;

/**
 * 24.07.22(월) 스레드 수업
 * @author 홍재헌
 *
 */
public class SnackMain extends Thread{
    private String str;

    public SnackMain(String str) {
        this.str = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(str + "\t" + "i : " + i + "\t" + Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        SnackMain aa = new SnackMain("새우깡");
        SnackMain bb = new SnackMain("포카칩");
        SnackMain cc = new SnackMain("수미칩");

        aa.setName("새우깡");
        bb.setName("포카칩");
        cc.setName("수미칩");

        aa.start();		//스레드 시작 -> 운영체제가 알아서 스레드 실행)

        // 값을 항상 전의 것을 기억하고 있기 때문에 CPU, 메모리 많이 잡아먹음.
        try {
            aa.join();	// 스레드가 끝날때까지 기다리는 메소드
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        bb.start();
        cc.start();

//		aa.run();		//(운영체제가 알아서 run() 호출, 콜백메소드(Call Back)
//		bb.run();
//		cc.run();
    }

}

/* 동기화 처리
* 여러 개의 객체가 동시에 하나의 메소드에 접근하려고 할 때 심각한 부하가 발생된다. -> 이를 방지하기 위해 Lock을 건다.
* => 동기화 처리라고 한다. (synchronized)
*  */
