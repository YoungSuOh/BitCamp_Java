package homework;

public class Jinsu {
    public static void main(String[] args) {
        int a = 250;
        System.out.println("10진수 "+ a);
        System.out.println("2진수 "+Integer.toBinaryString(a)+" (Binary)");
        System.out.println("8진수 "+Integer.toOctalString(a)+ " (Octal)");
        System.out.println("16진수 "+Integer.toHexString(a)+" (Hex)");
        }
    }
    /*
    [문제] 정수형 데이터를 입력하여 2진수, 8진수, 16진수로 변환한 값을 출력하시오
    
    [조건]
    2진수, 8진수, 16진수로 변환시켜주는 메서드를 이용하시요 Integer
    
    [실행 결과]
    10 진수 = 250 (dec)
    2 진수 = 11101010
    8 진수 = 372
    16 진수 = fa

 */
