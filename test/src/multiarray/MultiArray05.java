package multiarray;

import java.util.Scanner;

public class MultiArray05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] name = new String[3];
        int [][] arr = new int[3][3];
        for(int i=0;i<3;i++){
            System.out.print("학생 이름을 입력히시오:  ");
            name[i]=scanner.next();
            System.out.print("학생의 성적을 입력하세요. (국어, 영어, 수학) 순 ");
            for(int j=0;j<3;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("----------------------------------------------------\n" +
                "이름  국어  영어  수학       총점  평균  학점\n" +
                "----------------------------------------------------");
        for(int i=0;i<3;i++){
            System.out.print(name[i]);
            int total=0;
            for(int j=0;j<3;j++){
                System.out.print(String.format("%6d",arr[i][j]));
                total+=arr[i][j];
            }
            System.out.print(String.format("%9d",total));
            double avg = (double)(total/3);
            System.out.print(String.format("  %.2f",avg));
            switch ((int) (avg/10)){
                case 10: case 9:
                    System.out.println("  A"); break;
                case 8:
                    System.out.println("  B"); break;
                case 7:
                    System.out.println("  C"); break;
                case 6:
                    System.out.println("  D"); break;
                default:
                    System.out.println("  F"); break;
            }
        }
    }
}

/*[문제] 성적 계산

1. 공식
        총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
학점은 평균이 90이상이면 A
          80이상이면 B
          70이상이면 C
          60이상이면 D
그 외는 F

2. 평균은 소수이하 2째자리까지 출력

----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동      90      95      100
프로도      100      89      76
라이언      75      80      48
----------------------------------------------------   */
