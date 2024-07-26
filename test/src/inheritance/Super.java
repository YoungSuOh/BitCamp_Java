package inheritance;


/*
* 상속: 클래스의 재(upgrade)구현
*
* super: 부모클래스 (C에서는 base class)
* sub : 자식 클래스
*
* is ~ a 관계 -> 상속 관계  ex: 아반떼(자식) is a 자동차(부모)
*
*
* 자바는 단일 상속 밖에 못한다. 즉, 부모는 무조건 하나이다. (C언어는 다중상속 가능)
*
* 다중 상속을 해결하기 위한 것 -> interface  / public class Member extends UserDetails implements BaseEntity
*
* 추상 클래스(진짜) / 인터페이스(짝퉁)
*
* 상속을 받았다 -> 부모 꺼를 자기꺼처럼 사용한다. (부모의 private 빼고)
*
* 따라서 private과 생성자는 상속이 안된다. 자식이 부모 생성자를 호출하는 것이 가능할 뿐
*
* 근데 자식은 그러면 private 멤버 변수를 못씀 -> 그렇다면 public으로 바꿔? => 클래스 캡슐화에 위배
* --> protected 를 통해 나와 내 자식들울 사용 가능
*
* [형식]
* class Sub클래스명 extends Super클래스명{ }
*
* */
public class Super {
    protected double weight, height; // 자식들도 사용 가능한 멤버 변수

    public Super(){
        System.out.println("Super 기본 생성자");
    }

    public Super(double weight,double height){
        this.height=height;
        this.weight=weight;
        System.out.println("Super 일반 생성자");
    }

    public void disp(){
        System.out.println("Super의 disp()");
        System.out.println("몸무게 = "+weight);
        System.out.println("키 = "+height);
    }
}
