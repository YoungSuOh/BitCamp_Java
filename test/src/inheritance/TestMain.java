package inheritance;

class AA{
    public int a = 3;
    public void disp(){
        a+=5;
        System.out.println("AA : "+a+" ");
    }
}

class BB extends AA{
    public int a = 8;
    public void disp(){
        this.a+=5;
        System.out.println("BB : "+a+" ");
    }
}

public class TestMain {
    public static void main(String[] args) { // AA가 부모, BB가 자식
        BB aa = new BB();
        aa.disp();

        AA bb = new BB();  // 부모는 자식을 참조할 수 있음 -> 다형성
        bb.disp();  // 자식한테 우선권이 있음
        System.out.println("bb.a : "+bb.a);  // override는 변수에는 없는 개념이다. -> override는 메소드에 해당되는 개념이다.

        // 부모는 자식 클래스를 참조할 수 있는 다형성이다. 하지만 자식은 부모 클래스를 참조할 수 없다. 따라서 casting이 진행되어야 한다.
        /*BB cc = new AA();  error */
       /* BB cc = (BB) new AA();  */
        BB cc = (BB) bb;  // 자식의 부모 클래스 타입인 AA타입을 BB타입으로 casting하여 참조 -> 자식 = (자식) 부모
        cc.disp();
        System.out.println("cc.a: "+cc.a);

        AA dd = new AA();  // 부모만 잡힘.
        dd.disp();
        System.out.println("dd.a: "+dd.a);
        System.out.println();

        /*BB ee = (BB) dd;  // ClassCastException error가 나옴 / 형변환을 할 수 없다. 왜냐하면 dd 객체를 생성할 때 heap에 AA 클래스 객체로만 생성하였기 때문이다. (BB class를 생성하지 않음)
        ee.disp();
        System.out.println("ee.a: "+ee.a); */



    }
}
