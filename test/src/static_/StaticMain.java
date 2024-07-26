package static_;


/*
* 접근 제어자
* 1. private: 클래스 내부에서만 접근가능
* 2. public: 모든 파일에서 접근 가능
* 3. protected:
* 4. default: 패키지 안에 다 같이 쓰자
* */

/*
* static : JVM에 의해서 실행되자마자 생성
*/
class StaticTest{  // default
    int a;  // 필드, 초기화 됨, 0으로 / new로 생성해야 함 => 인스턴스 변수라고 얘기함 / default 접근 제어자
    static int b; // 필드, 초기화 됨, 0으로 / 그냥 사용이 가능. => 클래스 변수.
    private int c;

    static {
        System.out.println("static 초기화 영역"); // main 불리자마자 가장 먼저 이것부터 실행
        b=7;
    }

    public int getC() {
        return c;
    }

    public void calc()
    {
        a++; b++;
    }

    public void disp(){
        System.out.println("a = "+this.a+"\t b = "+StaticTest.b);
    }
    /*
    * static 메소드에는 static 변수만 사용 가능
    *
    * */

    public static void output(){
        System.out.println("static method ...");
        // System.out.println("a == "+this.a+"b == "+StaticTest.b); // static에는 this가 없다. error
    }
    /* 생성자
    * 생성자명은 반드시 클래스명과 동일
    * 강제 호출 x, 클래스를 메모리에 생성 시(new 할 때) 자동 호출
    * * 중요 * : returnType(결과형이 없다)
    * */
    public StaticTest(){
        System.out.println("default 생성자");
    }
}
public class StaticMain {
    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        System.out.println("a = "+ staticTest.a);
        System.out.println("b = "+StaticTest.b);
        System.out.println("c = "+staticTest.getC());

        StaticTest aa = new StaticTest();
        aa.calc();
        aa.disp();
        System.out.println();

        StaticTest bb = new StaticTest();
        bb.calc();
        bb.disp();
        System.out.println();

        StaticTest cc = new StaticTest();
        cc.calc();
        cc.disp();
        System.out.println();

        StaticTest.output(); // 클래스명.메소드
        aa.output();  // 객체명.메소드

    }
}
