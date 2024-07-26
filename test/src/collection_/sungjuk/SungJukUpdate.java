package collection_.sungjuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk{
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void execute(ArrayList<SungJukDto> arrayList) {
        System.out.print("찾는 번호를 입력하세요 : ");
        int num = scanner.nextInt();
        boolean exist=false;
        SungJukDto sungJukDto = null;
        for(SungJukDto s:arrayList){
            if(num==s.getNo()){
                exist=true;
                sungJukDto=s; break;
            }
        }
        if(exist){
            System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
            System.out.print("수정 할 이름 입력 : ");
            sungJukDto.setName(scanner.next());

            System.out.print("수정 할 국어 입력 : ");
            sungJukDto.setKor(scanner.nextInt());

            System.out.print("수정 할 영어 입력 : ");
            sungJukDto.setEng(scanner.nextInt());

            System.out.print("수정 할 수학 입력 : ");
            sungJukDto.setMath(scanner.nextInt());
            sungJukDto.setTot();
            sungJukDto.setAvg();

            System.out.println("\n수정하였습니다.\n");
        }
        else{
            System.out.println("잘못된 번호 입니다.");
        }
    }
}
