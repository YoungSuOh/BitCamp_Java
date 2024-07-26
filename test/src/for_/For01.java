package for_;

import java.io.IOException;

public class For01 {
    public static void main(String[] args) throws IOException {
        int i;

        for(i=1;i<=10;i++){
            System.out.println("Hello "+i);
        }

        System.out.println("탈출 i = "+i);


        while(true){
            i--;
            if(i==0) break;
            System.out.print(i+" ");
        }
        System.out.println();

        for(i = 'A';i<='Z';i++){
            System.out.print((char)i+" ");
        }
        System.out.println();


        while(true){
            try{
                System.out.print("원하는 단을 입력: ");
                int dan = System.in.read()-48;
                for(i=1;i<=9;i++){
                    System.out.println(dan+" * "+i+" = "+i*dan);
                }
                break;
            }catch (IOException e){
                System.out.println("다시 입력하시오");
                System.in.read();
            }
        }

    }
}


/*

* 반복문




 */