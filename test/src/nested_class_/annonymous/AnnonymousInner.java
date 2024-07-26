package nested_class_.annonymous;

public class AnnonymousInner {
    public static void main(String[] args) {
        final int x = 100;
        new AA(){
            @Override
            public void display() {
                System.out.println("오버라이딩 한 display 메서드");
                System.out.println("x : "+x);
                System.out.println("y : "+getY());
            }
        };
    }
}
