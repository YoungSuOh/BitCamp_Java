package abstract_class;


import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;

public class NumberMain {
    public static void main(String[] args) {
       /* NumberFormat nf = new NumberFormat();  // new가 안됨 -> 추상 or interface*/

        NumberFormat numberFormat = new DecimalFormat(); // sub class

        DecimalFormat decimalFormat = new DecimalFormat(); // 직접 자식 클래스 타입으로 선언

        System.out.println(numberFormat.format(12345678.456789));  // 3자리마다 쉼표(,)를 찍고 , 소수 이하 3번째 자리까지 제공
        System.out.println(numberFormat.format(12345678));
        System.out.println();

        NumberFormat nf2 = new DecimalFormat("#,###.##원");  // '#'은 유효 숫자가 아닌 것은 표현을 하지 않음.
        System.out.println(nf2.format(12345678.456789));  // 3자리마다 쉼표(,)를 찍고 , 소수 이하 3번째 자리까지 제공
        System.out.println(nf2.format(12345678));
        System.out.println();

        NumberFormat nf3 = new DecimalFormat("#,###.00원");
        System.out.println(nf3.format(12345678.456789));  // 3자리마다 쉼표(,)를 찍고 , 소수 이하 3번째 자리까지 제공
        System.out.println(nf3.format(12345678));
        System.out.println();

        /*NumberFormat nf4 =  NumberFormat.getInstance();  // new 안해도 저장됨, 추상 or 인터페이스인데도 불구하고

        nf4.setMaximumFractionDigits(2);  // 소숫점 2번째 자리 까지
        nf4.setMinimumFractionDigits(2);  // 0을 강제로 표시
        System.out.println(nf4.format(12345678.456789));  // 3자리마다 쉼표(,)를 찍고 , 소수 이하 3번째 자리까지 제공
        System.out.println(nf4.format(12345678));
        System.out.println();*/

        NumberFormat nf4 =  NumberFormat.getCurrencyInstance();

        nf4.setMaximumFractionDigits(2);
        nf4.setMinimumFractionDigits(2);
        System.out.println(nf4.format(12345678.456789));
        System.out.println(nf4.format(12345678));
        System.out.println();


        NumberFormat nf5 =  NumberFormat.getCurrencyInstance(Locale.CHINESE);

        nf5.setMaximumFractionDigits(2);
        nf5.setMinimumFractionDigits(2);
        System.out.println(nf5.format(12345678.456789));
        System.out.println(nf5.format(12345678));
        System.out.println();
    }
}
