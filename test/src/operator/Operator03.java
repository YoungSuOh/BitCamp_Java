package operator;

public class Operator03 {
    public static void main(String[] args) {
        int a=5;
        a+=2;
        a*=3;
        System.out.println(a);
        a++;
        System.out.println(a);
        int b=a++;
        System.out.println(b);
        System.out.println(++b);
    }
}
