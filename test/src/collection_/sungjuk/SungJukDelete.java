package collection_.sungjuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class SungJukDelete implements SungJuk{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void execute(ArrayList<SungJukDto> arrayList) {
        System.out.print("삭제할 이름 입력 : ");
        String name = scanner.next();

        boolean exist = false;
        int cnt=0;


        Iterator<SungJukDto> iterator = arrayList.iterator();  // iterator를 쓰지 않을 경우에 remove를 하면 index가 전체적으로 다 줄어든다 => 배열 범위 초과 위험 발생.
        while (iterator.hasNext()) {
            SungJukDto s = iterator.next();
            if (Objects.equals(s.getName(), name)) {
                iterator.remove();
                exist = true;
                cnt++;
            }
        }

/*        for(SungJukDto sungJukDto : arrayList){  // ConcurrentModificationExcepiton 발생 -> 제거가 된 index에서 어떻게 해야될지 모름
            if(sungJukDto.getName().equals(name)){
                arrayList.remove(sungJukDto); cnt++;
            }
        }*/
        if(exist){
            System.out.println(cnt+"건의 항목을 삭제하였습니다.");
        }
        else{
            System.out.println("회원의 정보가 없습니다");
        }
    }
}
