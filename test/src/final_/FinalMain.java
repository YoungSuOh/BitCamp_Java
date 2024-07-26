package final_;

/*
* final (상수화: 값을 변경하지 못하게끔 한다)
* 1. final 변수는 값을 변경할 수 없다. 따라서 초기값이 주어져야 한다.
* 2. final 변수는 대문자로만 기술
* 3. final 메서드는 override할 수 없다. 부모가 절대 안물려주는 메서드
* 4. final 클래스는 자식 클래스를 가질 수 없다 -> 상속이 안된다.
* 5. static final 필드는 static 구역에서 초기값을 주어야 한다.
* */

class Final{
    public final String FRUIT = "사과";  // 상수화
    public static final String FRUIT2 = "딸기"; // 진또 상수화 -> public static final
    public final String FRUIT3;
    public static final String FRUIT4;  // static은 생성자로 초기화 x

/*    public static final int RED=0;
    public static final int BLUE=1;
    public static final int GREEN=2;*/


    static {
        FRUIT4="기린";  // static 구역에서 초기화를 시켜줘야 한다.
    }

    public Final(){
        this.FRUIT3="참외";
        /*this.FRUIT4="기린";  // 초기화 안 일어남*/
    }

}

public class FinalMain {
    public static void main(String[] args) {
        final int AGE = 25; /*AGE = 21; // error -> final이라서*/
        System.out.println("AGE : "+AGE);

        final String NAME; NAME="홍길동"; // 초기값 처음에 안줘도 자바는 한번의 기회를 더줌
        System.out.println("NAME : "+NAME);
        System.out.println("FRUIT : "+ new Final().FRUIT);
        System.out.println("FRUIT : "+ Final.FRUIT2);
        System.out.println("FRUIT : "+ new Final().FRUIT3);

        System.out.println("빨강 : "+COLOR.RED);
        System.out.println("빨강 : "+COLOR.RED.ordinal());
        System.out.println();

        for(COLOR data:COLOR.values()){
            System.out.println(data.ordinal()+" : "+data);
        }
    }
}


/*
* enum (열거형)
1. 자바의 열거형은 자료형(Data Type)을 의미한다
2. 서로 관련 있는 상수들을 모아 놓은 것
3. enum 상수들은 묵시적으로 static final status형으로 선언된다
4. 먼저 자료형을 선언한 다음에 사용한다
5. 대문자로 사용
6. 열거된 순서에 따라 0부터 시작
*
* */

enum COLOR{  // 상수들의 나열
    RED,GREEN,BLUE  // 0 1 2로 인식
}
