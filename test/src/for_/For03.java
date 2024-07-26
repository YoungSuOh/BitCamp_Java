package for_;

public class For03 {
    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        System.out.println("\t합\t곱");
        for(int i=1;i<=10;i++){
            sum+=i;
            mul*=i;
            System.out.println(i+"\t"+sum+"\t"+mul);
        }
    }
}
