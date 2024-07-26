package basic;

import java.util.Random;

public class Variable3 {
    public static void main(String[] args) {
        int big = Math.max(25,36);
        System.out.println("큰 값 = "+big);

        // 12.7 78.5 중에서 작은 값을 구하시오
        double small = Math.min(12.7, 78.5);
        System.out.println("작은 값 = "+small);

        double power = Math.pow(2,5);
        System.out.println("2의 5승은? "+power);

        // 난수
        double a = Math.random();
        System.out.println("난수 값: "+a);
        System.out.println();

        int c = (int)(a*100);
        System.out.println("두 자리 수 "+c);


        double b = new Random().nextDouble();
        System.out.println(b);

        int e = (int) (Math.random()*26 + 65);
        char f = (char) (Math.random()*26+65);

    }
}
