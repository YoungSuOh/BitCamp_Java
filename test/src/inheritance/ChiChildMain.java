package inheritance;

public class ChiChildMain  extends  ChildMain{
    String name = "gfef"; int age =16;
    public ChiChildMain() {
    }

    public void disp(){  // 부모가 disp()가 똑같이 있다해도 에러 안걸림
        System.out.println("ChiChildMain의 disp()");
        System.out.println("이름 = "+name);
        System.out.println("나이 = "+age);

        super.disp(); // 부모의 disp() 함수 호출
    }
    public static void main(String[] args) {
        Super sup = new ChiChildMain();
        sup.disp();
    }
}
