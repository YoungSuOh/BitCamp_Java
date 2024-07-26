package thread;


/*
* DB에는 싱글톤을 걸어줘야 한다.
*
* */

class Singleton{
    private int num = 3;
    private static Singleton singletonInstance;
    public void calc(){
        num++;
    }
    public void disp(){
        System.out.println("num = " + num);
    }
    public static Singleton getInsatance(){
        if(singletonInstance==null){
            synchronized (Singleton.class){
                singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }
}

public class SingletonMain {
    public static void main(String[] args) {
        /*Singleton aa =new Singleton();  -> 싱글톤 지원 안함
        System.out.println(aa);
        aa.calc();
        aa.disp();
        System.out.println();

        Singleton bb =new Singleton();
        System.out.println(bb);
        bb.calc();
        bb.disp();
        System.out.println();

        Singleton cc =new Singleton();
        System.out.println(cc);
        cc.calc();
        cc.disp();
        System.out.println();

        result :
        thread.Singleton@3b07d329

        num = 4

        thread.Singleton@6d03e736
        num = 4

        thread.Singleton@568db2f2
        num = 4
        */

        // Singleton 적용 후
        Singleton aa = Singleton.getInsatance();
        System.out.println(aa);
        aa.calc();
        aa.disp();
        System.out.println();

        Singleton bb =Singleton.getInsatance();
        System.out.println(bb);
        bb.calc();
        bb.disp();
        System.out.println();

        Singleton cc =Singleton.getInsatance();
        System.out.println(cc);
        cc.calc();
        cc.disp();
        System.out.println();
    }
}
