package multiFor;

public class MultiFor04 {
    public static void main(String[] args) {
        for(int i=2;i<10;i+=3){
            for(int j=1;j<10;j++){
                for(int dan=i;dan<i+3;dan++){
                    if(dan==10) break;
                    System.out.print(String.format("%d*%d=%2d\t", dan, j, dan*j));
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
