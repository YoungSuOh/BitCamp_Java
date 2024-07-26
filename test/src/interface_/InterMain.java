package interface_;


/* interface
* 1. is ~ a 관계
* 2. 표준 명세서의 역할
* 3. "상수"와 "추상 메소드"만 존재
*    public static final 생략 가능
*    abstract 생략 가능
* 4. Override할 때 반드시 public을 붙여야 한다.
* 5. 다중 상속이 가능 / 자바의 클래스가 다중상속이 안되는거지 인터페이스는 다중상속이 가능하다.
* 6. 상속과 같이 쓰일 때는 extends implements 순서로 쓴다. (무조건 찐퉁부터)
*
* */
public class InterMain implements /*InterA, InterB*/InterC{  // InterA의 모든 추상 메서드를 override해줘야 함.
    public static void main(String[] args) {

    }


    @Override
    public void aa() {

    }

    @Override
    public void bb() {

    }

    @Override
    public void cc() {

    }

    @Override
    public void dd() {

    }
}

