package while_;

public class While01 {
    public static void main(String[] args) {
        int a = 1;

        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        int b = 1;
        while (true) {
            System.out.print(b+ " ");
            b++;
            if(b>10) break;
        }
    }
}
