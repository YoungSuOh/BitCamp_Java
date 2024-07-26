package for_;

public class For04 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                char a = (char) (Math.random()*27+65);
                System.out.print(a+"\t");
            }
            System.out.println();
        }
    }
}
