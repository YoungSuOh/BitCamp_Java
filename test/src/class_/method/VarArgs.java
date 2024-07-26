package class_.method;

public class VarArgs {
    public static void main(String[] args) {
        VarArgs varArgs = new VarArgs();

        System.out.println("25 + 36 = "+varArgs.sum(10,20));
        System.out.println("25 + 36 = "+varArgs.sum(10,20, 30));
        System.out.println("25 + 36 = "+varArgs.sum(10,20, 30, 40));
    }
    public int sum(int a, int b){
        return a+b;
    }
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    public int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
