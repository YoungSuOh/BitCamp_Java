package array;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Lotto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("돈 입력 : ");
        int num = scanner.nextInt();
        int num1 = num / 1000;
        int cnt = 0;
        while (num1 > 0) {
            int[] arr = new int[6];
            for (int i = 0; i < 6; i++) {
                boolean dup;
                do {
                    dup = false;
                    int rand = (int) (Math.random() * 45 + 1);
                    for (int j = 0; j < i; j++) {
                        if (arr[j] == rand) {
                            dup = true;
                            break;
                        }
                    }
                    if (!dup) {
                        arr[i] = rand;
                    }
                } while (dup);
            }

            // 오름차순 정렬
            sort(arr);

            // 배열 출력
            for (int a : arr) {
                System.out.print(String.format("%4d", a));
            }
            System.out.println();

            cnt++;
            if (cnt % 5 == 0) System.out.println();
            num1--;
        }
        scanner.close();
    }
}

/*
[문제 로또 프로그램]
1. 크기가 6개인 번호의 숫자는 1~45까지의 정수형 값을 가진 배열
2. 절대 중복된 숫자를 가지면 안된다.
3. 오름 차순 정렬을 해야한다.
4. 1줄당 1000원
5. 출력 시 5자리로 맞춘다.
*/
