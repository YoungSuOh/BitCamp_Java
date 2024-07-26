package nested_class_.staticInner;

public class Outer {
    private int x= 100;
    private static int z = 300;
    static class Inner {
        private int y= 200;

        public void display(){
            System.out.println("y : " +y);
            System.out.println("z : "+z);
        }
    }
}
