package nested_class_;

// Outer$Inner -> `$` 표시 -> 안에 중첩됐다는 의미

public class Outer { // 밖에 있는 클래스는 안에 있는 클래스에 접근할 수 없다.
    // 하지만 Inner 클래스 객체를 생성하면 접근 가능하다.
    private String name;


    public void output(){
        System.out.println("이름 = "+/*this.name*/name+" 나이 = "+/*new Inner().getAge()*/new Inner().age);
        /*
        *
        * */
    }

    class Inner{  // 안에 있는 클래스는 상속관계처럼 Outer에 있는 것을 자기것처럼 사용한다. 하지만 포함관계임, 상속 x

        private int age;
        public int getAge() {
            return age;
        }
        String str = name;  // 밖의 변수는 자기꺼처럼 쓸 수 있다.

        public void disp(){
            System.out.println("이름 = "+/*this.str*//*name*/Outer.this.name+" 나이 = "+age);  // outer 소속의 this
        }

    }



    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.name = "홍길동";
        outer.new Inner().age=17;  // 의미가 없는 코드
        outer.output();
        System.out.println();

        Outer.Inner inner = outer.new Inner(); // new Inner() x
        inner.age=25;
        inner.disp();

        Outer.Inner inner2 = outer.new Inner();
        inner2.age=30;
        inner2.disp();
        System.out.println();

        Outer.Inner inner3 = new Outer().new Inner();
 /*       inner3.name = "코난";  // 여기는 static으로 선언된 main영역 -> Outer class 안에서만 접근 가능*/
        inner3.age=35;
        inner3.disp();

    }
}
