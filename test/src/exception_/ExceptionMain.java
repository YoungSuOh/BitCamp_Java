package exception_;

import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        // System.out.println("args[0] = "+args[0]);  // 입력을 안했으므로
        // ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

        if(args.length!=0){
            System.out.println("args[0] = "+args[0]);
        }

        // int num1 = Integer.parseInt(args[0]);  // NumberFormatException: For input string: "호랑이"

        try{
            int num1 = Integer.parseInt(args[0]);

            Scanner scanner = new Scanner(System.in);
            System.out.print("숫자 입력 : ");
            int num2 = scanner.nextInt();

            System.out.println(num1+" / "+num2+" = "+(num1/num2));
        }catch (NumberFormatException e){
            System.out.println("숫자 형식으로 넣으세요");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
            e.printStackTrace();
            /*java.lang.ArithmeticException: / by zero   => 빨간 글씨가 나옴
            at exception_.ExceptionMain.main(ExceptionMain.java:23)*/
        } finally {
            System.out.println("에러가 있던 없던 반드시 실행!!!");
        }

    }
}
