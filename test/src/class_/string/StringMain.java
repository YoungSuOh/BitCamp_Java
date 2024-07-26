package class_.string;


/*
상수(Constant)

literal



String
1. 문자열
2. literal("") 생성 가능
3. 문자열 편집(수정)을 할 수 없다. / "사과"+"딸기"
                                "사과"
                                "딸기"
4. 비교 시

연산을 하고 싶다.
StringBuffer / StringBuilder
 */
public class StringMain {
    public StringMain(){
        String aa = "apple";  // 이러면 aa에게 "apple"의 주소를 줌
        String bb = "apple";

        if(aa==bb) System.out.println("aa와 bb의 참조값은 같다");
        else System.out.println("aa와 bb의 참조값은 다르다");

        if(aa.equals(bb)) System.out.println("aa와 bb의 문자열은 같다");
        else System.out.println("aa와 bb의 문자열은 다르다");

        String cc = new String("apple");  // new 했을때는 할때마다 메모리에 잡음
        String dd = new String("apple");


        if(cc==dd) System.out.println("cc와 dd의 참조값은 같다");
        else System.out.println("cc와 dd의 참조값은 다르다");

        if(cc.equals(dd)) System.out.println("cc와 dd의 문자열은 같다");
        else System.out.println("cc와 dd의 문자열은 다르다");
        System.out.println();

        /*
        "오늘 날짜는 "
        "오늘 날짜는 2023"
        "오늘 날짜는 202312"
        e ---> "오늘 날짜는 202312229"

        메모리가 꽉차서 더 생성이 안된다.
        -> JVM에 의해서 휴지통(Garbage Collector)으로 보낸다.
        -> JVM에 의해서 휴지통(Garbage Collector)으로 보내는 동안은 컴퓨터는 작동을 멈춘다.
         */

        String e = "오늘 날짜는 202312229";
        System.out.println("문자열 크기 = "+e.length());
        /*
        * 배열.length는 () 없음
        *
        * */

        System.out.println("5번째 위치의 문자 = "+e.charAt(5));

        System.out.println("부분 문자열 추출 = "+e.substring(7));  // 7번부터 끝까지
        System.out.println("부분 문자열 추출 = "+e.substring(7,11));  // 7번부터 11번 '이전까지' -> 7~10 idx 가져옴

        // 대소문자 -> 둘다 존재하면 대소 비교하기 참 힘듬
        System.out.println("대문자 변경 = "+"Hello".toUpperCase());
        System.out.println("소문자 변경 = "+"Hello".toLowerCase());


        // indexOf : 내가 찾고자 하는 글자가 있는지 없는지 찾을때 많이 쓰임
        System.out.println("문자열 검색 = "+e.indexOf("짜"));
        System.out.println("문자열 검색 = "+e.indexOf("날짜"));  // 시작 idx인 '날'의 idx 반환
        System.out.println("문자열 검색 = "+e.indexOf("개바부"));  // 없으면 -1 반환

        System.out.println("문자열 치환 = "+e.replace("날짜","일자"));
    }


    public static void main(String[] args) {
        new StringMain(); // 객체 생성은 돼서 메모리 공간은 차지되지만 호출할 방법이 있어서 사용 못함


    }
}
