package abstract_class;


public class AbstractMain extends AbstractTest{
    int a = 2;
    public static void main(String[] args) {
/*        AbstractTest abstractTest = new AbstractTest();
        abstractTest.setName("홍길동");*/

        // 추상 메소드로 바꿔놓은 이후
        /*AbstractTest abstractTest = new AbstractTest();*/  // 추상 클래스로 선언한 이후로는 절대 인스턴스를 만들 수 없다!!
        /* 해결 방법
        *
        * 1. 자식 클래스로 만든다. => 부모의 '추상 메소드'를 override를 해줘야 한다. 아니면 error 뜸
        * */
        AbstractTest abstractTest = new AbstractMain();  // 부모가 자식 클래스 참조 가능
        abstractTest.setName("홍길동");
        System.out.println("이름 : "+abstractTest.getName());


        abstractTest.disp();  // 자식 우선

        System.out.println("a의 값 : "+abstractTest.a);  // 자식(부모) 구조의 객체에서 AbstractTest abstractTest를 통해 부모 영역에 포인팅 하기에 변수는 부모 변수 출력



    }

    @Override   // override를 하고 기능 구현을 진행해도 되고 아니면 다시 자식한테 짬때려도 됨 ㅋㅋ , 어노테이션 안붙여도 자동으로 override해줌
    public void setName(String name){
        this.name = name; // 나한테
    }
    public void disp(){
        System.out.println("자식");
    }

    /*public void xyz(){}*/  // 부모에 xyz() 메서드가 final이라 죽어도 물려주기 싫기에 자식에 선언하면 error 발생!
}


/*  추상 클래스로 또 선언하고 또 자식한테 짬 때리는 경우
public abstract class AbstractMain extends AbstractTest{
    public static void main(String[] args) {
*/
/*        AbstractTest abstractTest = new AbstractTest();
        abstractTest.setName("홍길동");*//*


        // 추상 메소드로 바꿔놓은 이후
        */
/*AbstractTest abstractTest = new AbstractTest();*//*
  // 추상 클래스로 선언한 이후로는 절대 인스턴스를 만들 수 없다!!
        */
/* 해결 방법
         *
         * 1. 자식 클래스로 만든다. => 부모의 '추상 메소드'를 override를 해줘야 한다. 아니면 error 뜸
         * *//*


    }

    @Override   // override를 하고 기능 구현을 진행해도 되고 아니면 다시 자식한테 짬때려도 됨 ㅋㅋ
    public abstract void setName(String name);
}
*/
