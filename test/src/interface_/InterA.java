package interface_;

public interface InterA {
    public static final String NAME = "홍길동";  // 상수 -> 다른 일반 변수는 못옴
    int a = 0;  // ? 들어오는데?? -> public static final가 생략되어 있다
/*    private int b=0; // 못들어옴*/

    public void aa(); // 이것도 추상메서드

    public abstract void bb();  // abstract도 생략이 가능

/*    public abstract void cc(){} // 대신 구현 body부분이 없어야 함 -> error*/


}
