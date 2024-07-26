package abstract_class;

/* 추상 클래스 - sub class(자식 클래스) 제어

자식한테 억압을 해주는 거임

?? 뭔소리지

부모는 내 밑에 자식이 얼마나 있는지 모름 -> 따라서 제어가 안됨
따라서 abstract를 써줌으로써 자식한테 반드시 override를 해줘야 한다는 제어(억압)를 할 수 있다. -> 통일성을 높일 수 있다! ex) 나라마다 개 짖는 소리

 * 1. 메소드에 body { } 가 없는 메소드를 '추상 메소드'라고 한다. -> 추상 메소드에는 abstract 라는 키워드를 써야 함.
 * 2. 추상 메소드가 있는 클래스는 반드시!!! 추상클래스여야 한다.
 * 3. 추상 메소드가 없는 추상 클래스를 '의미상의 추상클래스' 라고 한다.
 * 4. 추상 클래스는 자신의 클래스로 메모리 생성을 할 수 없다!!
 * => 생성 하려면 1) sub class를 이용( 반드시 sub class가 추상 메서드를 override 해야 한다.) 2) 메서드를 이용
 * 5. 추상 메서드는 반드시 sub class에서 override를 꼭 해줘야 한다.
 * => override를 안하면 sub class마저도 abstract가 되어야 한다!
 * */

/*public class AbstractTest {  // Pojo 형식 (Plain Old Java Object) : 가장 기본적인 형식
    private String name;

    public AbstractTest() {
    }


    public AbstractTest(String name) {
        super();
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}*/

/*public abstract class AbstractTest {  // 추상메소드 없는 추상 클래스 -> 의미상의 추상 클래스
    private String name;

    public AbstractTest() {
    }


    public AbstractTest(String name) {
        super();
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}*/


public abstract class AbstractTest extends Object{  // 추상 메소드가 있기 때문에 추상 클래스로 선언을 해줘야 함.
    protected String name;
    int a = 1;

    public AbstractTest() {
        System.out.println("default 생성자");
    }


    public AbstractTest(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

    public void disp(){
        System.out.println("부모");
    }

    public abstract void setName(String name); //  body가 없고 세미콜론(;)으로 마무리됨 -> 추상 메소드 => abstract 키워드를 넣음을 통해 추상 메소드를 완성

    public final void xyz(){}  // 자식들한테 죽어도 상속하기 싫음 -> final 키워드!
}
