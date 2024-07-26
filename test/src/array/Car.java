package array;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] arr = new boolean[5];
        System.out.print("주차장 관리 프로그램\n" +
                "**************\n   1. 입차\n" +
                "   2. 출차\n" +
                "   3. 리스트\n" +
                "   4. 종료\n" +
                "**************\n");


        while(true){
            System.out.print("메뉴 :  ");
            int num = scanner.nextInt();
                if(num==4) break;
            switch (num){
                case 1:
                    System.out.println("["+num+"]번인 경우");
                    System.out.print("위치 입력 : ");
                    int num1 = scanner.nextInt();
                    try{
                        if(!arr[num1-1]){
                            System.out.println(num1+"위치에 입차 ");
                            arr[num1-1]=true;
                        }
                        else System.out.println("이미 주차되어있습니다");
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("주차 공간이 아닙니다.");
                    }
                    break;
                case 2:
                    System.out.println("["+num+"]번인 경우");
                    System.out.print("위치 입력 : ");
                    int num2 = scanner.nextInt();
                    try{
                        if(arr[num2-1]){
                            System.out.println(num2+"위치에 출차 ");
                            arr[num2-1]=false;
                        }
                        else System.out.println("주차되어 있지않습니다");
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("주차 공간이 아닙니다.");
                    }
                    break;
                case 3:
                    for(int i=0;i<arr.length;i++){
                        System.out.println("        "+(i+1)+"위치 : "+arr[i]);
                    }
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램을 종료합니다.");


        scanner.close();
    }
}


/*
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
메뉴 :

        [1번인 경우]
위치 입력 : 3
        3위치에 입차 / 이미 주차되어있습니다

[2번인 경우]
위치 입력 : 4
        4위치에 출차 / 주차되어 있지않습니다

[3번인 경우]
        1위치 : true
        2위치 : false
        3위치 : true
        4위치 : false
        5위치 : false*/
