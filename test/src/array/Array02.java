package array;

public class Array02 {
    int a; // 필드, 인스턴스 변수
    static int c; // 필드, 클래스 변수

    public static void main(String[] args) {  // ab cd ef gh ij
        for(int i=0;i< args.length;i++){
            System.out.println("args["+i+"]: "+args[i]);  // ab / cd / ef/ gh/ ij
            System.out.println("문자열의 크기 = "+args.length); // 5
            System.out.println("첫번째 문자 = "+args[i].charAt(0)); // a / c/ e/ g/ i
        }
    }
}
