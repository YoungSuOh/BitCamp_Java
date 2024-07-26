package array;

import java.util.Objects;
import java.util.Scanner;

public class BaseBall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[3];
        for(int i=0;i<arr.length;i++){
            arr[i]= (int) (Math.random()*9+1);
            for(int j=i-1;j>=0;j--){
                if(arr[j]==arr[i]){ // 중복 제거
                    i--; break;
                }
            }
        }
        System.out.println("정답: ");
        for(int num:arr){
            System.out.print(num);
        }
        System.out.println();
        while(true){
            System.out.print("게임을 실행하시겠습니까(Y/N) : ");
            String s = scanner.next();
            if(Objects.equals(s,"Y")|| Objects.equals(s,"y")){
                break;
            }

        }
        System.out.println("게임을 시작합니다\n");

        while(true){
            System.out.print("숫자입력 : ");

            String str = scanner.next();
            int strike =0, ball=0;
            for(int i=0;i< arr.length;i++){
                int num=arr[i];
                for(int j=0;j<arr.length;j++){
                    if(num==(int)(str.charAt(j))-48){
                        if(i==j) strike++;
                        else ball++;
                    }
                }
            }
            System.out.println("        "+strike+"스트라이크 "+ball+"볼");
            if(strike==3){
                break;
            }
        }
        System.out.println("맞췄노");

        scanner.close();
    }
}
/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
        0스트라이크 0볼

숫자입력 : 567
        0스트라이크 2볼

숫자입력 : 758
        1스트라이크 2볼
...

숫자입력 : 785
        3스트라이크 0볼
*/
