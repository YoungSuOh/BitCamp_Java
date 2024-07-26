package array;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("배열의 크기 입력: ");
        int size = scanner.nextInt();
        int [] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("arr["+i+"] 입력 : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println();
        int sum=0;
        for(int a:arr){
            sum+=a;
            System.out.print(a+" ");
        }
        System.out.println("배열의 합은 "+sum);
    }
}
