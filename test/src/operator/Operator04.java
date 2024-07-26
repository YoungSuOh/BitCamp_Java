package operator;

public class Operator04 {
    public static void main(String[] args) {
        int num1=0, num2=0;
        boolean result;
        result = ((num1+=10)<0&&(num2+=10)>0);  // num1+=10은 수행이 되고, num2+=10은 이미 앞에서 false인데 && 연산자이므로 실행 x
        System.out.println("result = "+result);

        System.out.println("num1 = "+num1+" num2 = "+num2);
        System.out.println();

        result = ((num1+=10)>0||(num2+=10)>0);  // num1+=10은 수행이 되고, num2+=10은 이미 앞에서 true인데 || 연산자이므로 실행 x
        System.out.println("result = "+result);  // 앞에서 결과가 뻔하면 뒤를 수행하지 않음.

        System.out.println("num1 = "+num1+" num2 = "+num2);
        System.out.println();
    }
}
