package class_.method;

import java.util.Scanner;

public class Method02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt(); int b=scanner.nextInt();
        System.out.println(Method02.sum(a,b));

        scanner.close();
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
