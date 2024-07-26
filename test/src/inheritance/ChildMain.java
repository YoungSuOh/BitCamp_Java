package inheritance;

public class ChildMain extends Super{
    private String name;
    private int age;

    public ChildMain(){
        System.out.println("Child Main의 기본 생성자이다.");
    }

    public ChildMain(String name, int age, double weight, double height){
        super(weight, height);
        System.out.println("Child Main 일반 생성자");

        this.name=name;
        this.age=age;
    }
    // overloading  부모 자식                   / override : 쌍둥이
    // 1. 하나의 클래스 안에서                   1. 상속관계
    // 2. 메소드 명이 똑같다                     2. 다 똑같아야 함(한글자도 틀리면 안됨). 단, 접근 제어자는 틀려도 되지만, 반드시 자식 클래스의 메서드 범위가 더 커야 한다.
    // 3. 인수의 갯수 또는 인수형이 틀린 경우

/*    가능
    class Super{
        protected void disp(int a){}
    }
    class Sub extends Super{
        public void disp(int a);
    }

    불가능
   class Super{
        protected void disp(int a){}
    }
    class Sub extends Super{
        private void disp(int a); 범위를 자식이 더 좁게 할 수가 없음
    }*/

    public void disp(){  // 부모가 disp()가 똑같이 있다해도 에러 안걸림
        System.out.println("자식의 disp()");
        System.out.println("이름 = "+name);
        System.out.println("나이 = "+age);

        super.disp(); // 부모의 disp() 함수 호출
    }

    public static void main(String[] args) {
        ChildMain childMain = new ChildMain("홍길동", 26, 50.3, 161.2);
        childMain.disp();
        System.out.println("---------------------------------------------------");

        Super parent = new ChildMain("우롱쭈", 23, 30.3, 171.2);  // ChildMain 객체 안의 Super를 참조
        parent.disp();  // 모든 우선권은 자식에게 있다. 부모 메서드를 부를꺼 같지만 자식 메서드를 부름
    }
}
