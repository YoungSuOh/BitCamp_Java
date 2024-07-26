package class_.string;

import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        String str = "학원,집,,게임방";

        StringTokenizer stringTokenizer = new StringTokenizer(str,",");  // 문자열은 ","를 delimiter로 설정하여 분리
        System.out.println("토큰 개수 = "+stringTokenizer.countTokens());

        while(stringTokenizer.hasMoreTokens()){  // 만약 항목이 있으면 true, 없으면 false
            System.out.println(stringTokenizer.nextToken()); // 항목을 꺼낸다, 다음으로 이동
        }

        System.out.println("----------------------------");

        String [] arr = str.split(","); // split은 비어있는 값("") 도 가져옴

        for(String s : arr){
            System.out.println(s);
        }
    }
}
