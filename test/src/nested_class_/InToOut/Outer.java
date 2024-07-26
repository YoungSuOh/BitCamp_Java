package nested_class_.InToOut;

public class Outer {
    private int x = 100;
    class Inner{
        private int y = 200;

        public void display(){
            System.out.println("x : "+x);
            System.out.println("y : "+y);
        }
    }
}
