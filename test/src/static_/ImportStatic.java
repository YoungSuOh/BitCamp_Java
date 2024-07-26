package static_;

/*import static
: 간단하게 static 상수 또는 메소드를 호출할 때 사용*/

import java.util.Arrays;

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.System.out;
import static java.util.Arrays.sort;


public class ImportStatic {
    public static void main(String[] args) {
        /*System.out.println("난수 = "+Math.random());*/
        for (String s : Arrays.asList("난수 = " + random(), "2의 5승은 = " + pow(2, 5))) {
            out.println(s); // Import Static 소유가 아니다
        }

        int [] arr = {25,78,32,40,55};
        sort(arr);
        for(int a:arr){
            out.print(a+" ");
        }
        out.println();

        String [] arr1 = {"a","b","d","s","e"};
        sort(arr1);
        for(String str:arr1){
            out.print(str+" ");
        }
    }
}
