package nested_class_.OutToIn;

public class Outer {
    private int x = 100;
    public void display(){
        System.out.println("x : "+x);
        /*System.out.println("y : "+y); compile error */


        Inner inner = new Inner();
        System.out.println("y : "+inner.y);
    }

    class Inner{
        private int y = 200;
    }
}
