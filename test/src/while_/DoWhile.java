package while_;

public class DoWhile {
    public static void main(String[] args) {
        char ch = 'A';
        int cnt=0;
        do{
            System.out.print(ch+" ");
            ch++; cnt++;
            if(cnt%7==0) System.out.println();
        }while(ch<='Z');
    }
}
