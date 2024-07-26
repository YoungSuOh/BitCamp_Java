package class_.string;

import java.util.Scanner;

public class StringBufferMain {
    private Scanner scanner = new Scanner(System.in);
    private int dan;

    public StringBufferMain(){
        System.out.print("원하는 단을 입력 : ");
        dan = scanner.nextInt();
    }

    public static void main(String[] args) {
        StringBufferMain stringBufferMain = new StringBufferMain();
        stringBufferMain.output();
    }


    /*
    * Buffer -> 2 x 1 = 22 x 2 = 4 ..... 계속 뒤에 추가됨.
    * */
    public void output(){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=1;i<10;i++){
            stringBuffer.append(dan);
            stringBuffer.append(" x ");
            stringBuffer.append(i);
            stringBuffer.append(" = ");
            stringBuffer.append(i*dan);

            System.out.println(stringBuffer);

/*          2 x 1 = 2
            2 x 1 = 22 x 2 = 4
            2 x 1 = 22 x 2 = 42 x 3 = 6
            2 x 1 = 22 x 2 = 42 x 3 = 62 x 4 = 8
            2 x 1 = 22 x 2 = 42 x 3 = 62 x 4 = 82 x 5 = 10
            2 x 1 = 22 x 2 = 42 x 3 = 62 x 4 = 82 x 5 = 102 x 6 = 12
            2 x 1 = 22 x 2 = 42 x 3 = 62 x 4 = 82 x 5 = 102 x 6 = 122 x 7 = 14
            2 x 1 = 22 x 2 = 42 x 3 = 62 x 4 = 82 x 5 = 102 x 6 = 122 x 7 = 142 x 8 = 16
            2 x 1 = 22 x 2 = 42 x 3 = 62 x 4 = 82 x 5 = 102 x 6 = 122 x 7 = 142 x 8 = 162 x 9 = 18*/

            // 기존에 있는 내용을 삭제
            stringBuffer.delete(0,stringBuffer.length());
 /*           원하는 단을 입력 : 2
            2 x 1 = 2
            2 x 2 = 4
            2 x 3 = 6
            2 x 4 = 8
            2 x 5 = 10
            2 x 6 = 12
            2 x 7 = 14
            2 x 8 = 16
            2 x 9 = 18*/
        }
    }


}

/*
* 원하는 단을 입력 : 2       생성자
* 2*1=2                   output()
*
* 2*9=18
* */
