package basic;


import java.text.DecimalFormat;


// 모든 클래스는 new 생성해서 써야 한다. 다만 static인 경우에난 그냥 갔다 써도 된다. 소속만 밝히면 됨
public class Compute {

    public static void main(String[] args) {
        short a = 320;
        short b = 258;

        int sum = a+b;
        int sub = a-b;
        int mul = a*b;
        double div = a/(double)(b);
        System.out.println(a+" + "+b+ " = "+sum);
        System.out.println(a+" - "+b+ " = "+sub);
        System.out.println(a+" x "+b+ " = "+new DecimalFormat().format(null));
        System.out.println(a+" / "+b+ " = "+String.format("%.2f",div)); // 소숫점 2자리까지  // format도 static
    }
}
