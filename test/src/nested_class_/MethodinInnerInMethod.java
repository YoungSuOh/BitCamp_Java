package nested_class_;

public class MethodinInnerInMethod {
    public static void main(String[] args) {
        final int x = 300;  // final로 선언해야 Inner 클래스에서 사용 가능

        class Inner {
            int y = 400;

            public void display(){
                System.out.println("x : "+x);
                System.out.println("y : "+y);
            }
        }
        Inner inner = new Inner();
        inner.display();

    }
}
