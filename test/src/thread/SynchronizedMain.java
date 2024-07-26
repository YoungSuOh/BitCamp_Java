package thread;

class Synchornized extends Thread{
    private static int count;
    @Override
    public void run(){
        // 하나만 통과시키게 만듬
       synchronized (Synchornized.class){ // 이렇게 해야 찍고 나갈때까지 다른애들이 들어오지 못함.
            for(int i=1;i<=5;i++){
                count++;
                System.out.println(Thread.currentThread()+" : "+count);
            }
        }
/*        synchronized (this){ // aa, bb, cc 다 this 값이 다른 서로 다른 클래스이기 때문에 각자도생임
            for(int i=1;i<=5;i++){
                count++;
                System.out.println(Thread.currentThread()+" : "+count);
            }
        }*/
/*        for(int i=1;i<=5;i++){
            count++;
            System.out.println(Thread.currentThread()+" : "+count);
        }*/

    }

}

public class SynchronizedMain {
    public static void main(String[] args) {
        Synchornized aa = new Synchornized(); // 쓰레드 생성
        Synchornized bb = new Synchornized(); // 쓰레드 생성
        Synchornized cc = new Synchornized(); // 쓰레드 생성

        aa.setName("aa");
        bb.setName("bb");
        cc.setName("cc");

        // 우선 순위 부여 1~ 10까지

      /*  // aa.setPriority(1);
        aa.setPriority(Thread.MIN_PRIORITY); // = aa.setPriority(1);
        bb.setPriority(10); //  bb.setPriority(Thread.MAX_PRIORITY);
        cc.setPriority(5);*/

        // 스레드 시작 -> 스레드 실행( run() 메서드 찾아감 )
        aa.start();
        bb.start();
        cc.start();

        /*
        * thread는 시간차로 이동
        * */

    }
}
