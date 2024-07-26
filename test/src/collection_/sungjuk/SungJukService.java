package collection_.sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukService {
    private ArrayList<SungJukDto> arrayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void menu(){
        while(true){
            boolean done = false;

            System.out.println("1~6중에 선택하세요");
            System.out.println("   1. 입력\n" +
                    "   2. 출력\n" +
                    "   3. 수정\n" +
                    "   4. 삭제\n" +
                    "   5. 정렬\n" +
                    "   6. 끝");
            int num = scanner.nextInt();
            switch (num){
                case 1:
                    new SungJukInsert().execute(arrayList); break;
                case 2:
                    new SungJukPrint().execute(arrayList); break;
                case 3:
                    new SungJukUpdate().execute(arrayList); break;
                case 4:
                    new SungJukDelete().execute(arrayList); break;
                case 5:
                    new SungJukSort().execute(arrayList); break;
                case 6:
                    done=true; break;
                default:
                    break;
            }
            if(done){
                System.out.println("프로그램을 종료합니다"); break;
            }
        }

    }
}
