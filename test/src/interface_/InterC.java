package interface_;

public interface InterC extends InterA,InterB { // 인터페이스끼리는 다중 상속이 가능하다
    // 추상 메서드가 4개
}

/*
* 클래스 extends 클래스 : 가능
* 인터페이스 extends 인터페이스 : 가능
* 인터페이스 implements 클래스 : 가능
* 클래스 extend 인터페이스 : 불가능   1 2 8
* */


/* ex)
* class A {}
* interface InterA{}
*
* 1. class B extends A {}
* 2. class B implements InterA {}
* 3. interface InterB extends InterA {}
*
* interface InterB implements Inter A {} (x)
* */