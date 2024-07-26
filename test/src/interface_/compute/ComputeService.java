package interface_.compute;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeService{
    private int a, b;
    private String[] str = {"덧셈","뻴셈","곱셈","나눗셈"};
    private Scanner scanner;
    private boolean escape;

    public ComputeService() {
        this.scanner = new Scanner(System.in);;
        this.escape = false;
    }

    public void menu(){
        while(true){
            System.out.println("[메뉴] : ");
            for(int i=0;i<str.length;i++){
                System.out.println((i+1)+". "+str[i]+" 구하기");
            }
            System.out.println("5. 프로그램 종료하기");
            try{
                int x = scanner.nextInt();
                switch (x){
                    case 1:
                        System.out.print(str[0]+"할 정수를 2개를 입력하세요 : ");
                        a=scanner.nextInt(); b=scanner.nextInt();
                        System.out.println("결과는 "+new Sum().calc(a,b));
                        break;
                    case 2:
                        System.out.print(str[1]+"할 정수를 2개를 입력하세요 : ");
                        a=scanner.nextInt(); b=scanner.nextInt();
                        System.out.println("결과는 "+new Sub().calc(a,b));
                        break;
                    case 3:
                        System.out.print(str[2]+"할 정수를 2개를 입력하세요 : ");
                        a=scanner.nextInt(); b=scanner.nextInt();
                        System.out.println("결과는 "+new Mul().calc(a,b));
                        break;
                    case 4:
                        System.out.print(str[3]+"할 정수를 2개를 입력하세요 : ");
                        a=scanner.nextInt(); b=scanner.nextInt();
                        System.out.println("결과는 "+new Div().calc(a,b));
                        break;
                    case 5:
                        System.out.println("프로그램을 종료합니다");
                        escape=true; break;
                }
            }catch (InputMismatchException e){
                System.out.println("올바른 입력이 아닙니다. 다시 입력하세요.");
            }
            if(escape) break;
        }
    }
}
