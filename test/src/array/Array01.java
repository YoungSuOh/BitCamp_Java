package array;

import static java.util.Arrays.sort;

public class Array01 {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];

        System.out.println("arr의 참조 주소(실제 메모리 주소 x)" + arr);

        int[] arr1;
        arr1 = new int[]{25, 36, 42, 17, 95};
        for (int a : arr1) {
            System.out.println(a);
        }
        System.out.println();


        System.out.println("거꾸로 출력");
        for(int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);
        }
        System.out.println();

        System.out.println("홀수만 출력");
        for(int a:arr1){
            if(a%2!=0){
                System.out.println(a+" ");
            }
        }
        System.out.println();

        sort(arr1);
        System.out.println("정렬된 결과");
        for(int a:arr1) System.out.println(a);
    }
}

/*배열은 가비지 값 없이 처음에 다 0으로 초기화 되어 있음*/
