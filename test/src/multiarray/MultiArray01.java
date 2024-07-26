package multiarray;

public class MultiArray01 {
    public static void main(String[] args) {
        int [][] arr;
        arr = new int[10][10];

        int a = 1;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                arr[i][j]=a++;
            }
        }
        for(int []arr1:arr){
            for(int num:arr1){
                System.out.print(String.format("%5d",num));
            }
            System.out.println();
        }
    }
}
