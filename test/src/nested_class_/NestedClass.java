package nested_class_;

/* 중첩 클래스
* has ~ a 관계 (포함 관계)
* 1. 다른 클래스 내부에 정의되는 클래스를 말한다.
* 2. 독립적으로 오브젝트 만들어질 수 있는 스태틱 클래스
* 3. 자신이 정의된 클래스의 오브젝트 안에서만 있는 내부 클래스로 구분된다.
* */
public class NestedClass {
}


/*

class 클{
    static class 클{  // 스태틱 클래스

    }
    class 클{  // inner 클래스 / 멤버 내부 클래스

    }
    메소드(){
        class 클{  // 메소드 안에서만 사용 가능한 로컬 inner 클래스

        }
    }
    {// 클래스 이름이 없는 상태 -> 익명 inner 클래스

    }
}
*/
