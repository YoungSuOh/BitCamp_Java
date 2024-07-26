package class_.compute;

import java.util.Scanner;

public class ComputeMain {
    public static void main(String[] args) {
        /*ComputeDto aa = new ComputeDto();
        System.out.println("aa = "+aa);
        aa.setX(320);
        aa.setY(258);

        ComputeDto [] arr = new ComputeDto[3];
        System.out.println(arr.length);*/


        Scanner scanner = new Scanner(System.in);
        System.out.print("횟수 입력 : ");
        int num = scanner.nextInt();
        ComputeDto [] arr = new ComputeDto[num];
        System.out.println();
        for(int i=0;i<num;i++){
            ComputeDto computeDto = new ComputeDto();
            System.out.print("x 입력 : ");
            computeDto.setX(scanner.nextInt());

            System.out.print("y 입력 : ");
            computeDto.setY(scanner.nextInt());
            arr[i]=computeDto;
            System.out.println();
        }
        System.out.println("X\tY\tSUM\tSUB\tMUL\tDIV\t");
        for(int i=0;i<num; i++){
            int x, y; x = arr[i].getX(); y=arr[i].getY();
            try{
                System.out.println(x+"\t"+y+"\t"+(x+y)+"\t"+(x-y)+"\t"+(x*y)
                        +"\t"+(double)(x/y));
            }
            catch (ArithmeticException e){
                System.out.println("0으로 못나눠용");
            }
        }
    }
}


/*
[문제] 합, 차, 곱, 몫 구하시오

[실행결과]
횟수 입력 : 3

x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X      Y      SUM      SUB      MUL      DIV
320      258
        256      125
        452      365*/
