package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain2 {
    private int x, y;

    public void input() throws IOException {  // 구현부
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("x 입력 : ");
        // x = bufferedReader.readLine();  // stream 형태로 반환하므로 error
        x = Integer.parseInt(bufferedReader.readLine());  // stream 형태로 반환하므로 error

        System.out.println("y 입력 : ");
        x = Integer.parseInt(bufferedReader.readLine());
    }

    public void output() {
        int mul = 1;
        if(y>0){
            for (int i = 1; i <= y; i++) {
                mul *= x;
            }
            System.out.print(x + "의 " + y + "승은 " + mul);
        }else{
            try{
                //throw new Exception("0으로 나눌 수 없어용"); // 강제로 Exception 발생
                throw new MakeException("0으로 나눌 수 없어용"); // 강제로 Exception 발생
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }

    public static void main(String[] args) throws IOException {
        ExceptionMain2 exceptionMain2 = new ExceptionMain2();
        exceptionMain2.input();  // error -> main 메서드 안이기 때문에 호출하는 함수도 예외처리를 던져야 함
        exceptionMain2.output();
    }
}
