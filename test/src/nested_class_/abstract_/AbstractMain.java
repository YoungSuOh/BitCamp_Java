package nested_class_.abstract_;

/* interface 생성하는 방법
* 1. implements -> 모든 추상 메서드 override
* 2. 대신 override 해주는 클래스
* 3. 메서드
*
* */

public class AbstractMain extends AbstractTest{
    public static void main(String[] args) {
        // AbstractTest abstractTest = new AbstractTest(); 추상 클래스라 생성 x

        AbstractTest abstractTest = new AbstractTest()  /* [익명 이름] */{
            @Override
            public void setName(String name) {  // 구현부 있음 -> `클래스`이다 => 이름이 없어요! 따라서 `익명 Inner class`라고 한다.
                                                // new는 클래스를 생성하는 것이다!
                                                // AbstractMain.java -> compile하면 AbstarctMain.class , AbstarctMain$1.class (익명 클래스) 2개가 나온다.
                this.name=name;
            } // 흑기사, 1회용
        };

        // InterA interA = new InterA();  // 인터페이스라 new가 안된다. -> 키다리 아저씨 필요
        InterA interA = new InterA() /*[익명 이름]*/ {   // AbstarctMain$2.class 생성됨 (후원자 2번)
            @Override
            public void aa() {

            }

            @Override
            public void bb() {

            }
        };

        // AbstractExam abstractExam = new AbstractExam();  // 추상 클래스라 new 안됨
        AbstractExam abstractExam = new AbstractExam(){// 추상메서드가 없는 추상 클래스 -> 개발자가 원하는 메서드만 override
            @Override
            public void dd(){  // dd만 선택적으로 override 시켰음

            }
        };

    }

    @Override
    public void setName(String name) {

    }
}

/*
class 클{
    필드

    메소드(){
        // 구현부 만듬  -> 메서드의 구현부를 가질 수 있는 것은 `클래스`이다
    }

    class 클2{

    }
}

interface 인{
    메소드(); // 구현부 x
}
*/

/*
new 클래스(){ -> 무조건 익명 inner 클래스
    메소드 구현(){
    }
}*/
