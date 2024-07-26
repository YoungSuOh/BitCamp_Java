package multiFor;

public class MultiFor02 {
    public static void main(String[] args) {
        System.out.println("2단 ~ 9단 ");
        for(int dan=2;dan<10;dan++){
            System.out.println(dan+"단:");
            for(int i=1;i<10;i++){
                System.out.println(dan+"\t*\t"+i+"\t"+" =\t"+(dan*i));
            }
            System.out.println();
        }
    }
}


