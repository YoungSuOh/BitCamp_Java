package collection_.sungjuk;

import java.util.ArrayList;

public class SungJukPrint implements SungJuk{
    @Override
    public void execute(ArrayList<SungJukDto> arrayList) {
        System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
        for(SungJukDto s:arrayList){
            System.out.println(s);
        }
        System.out.println();
    }
}
