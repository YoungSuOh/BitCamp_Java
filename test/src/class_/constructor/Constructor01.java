package class_.constructor;


// this: 자기 자신의 클래스의 레퍼런스 정보를 가지고 있음
// 생성자: void를 쓰면 안됨.
public class Constructor01 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public Constructor01(){
        System.out.println("기본 생성자");
        System.out.println("this = "+this);
        System.out.println();
    }
    public Constructor01(int age){
        this(); // 다른 생성자끼리는 overload된 생성자 호출 가능. 하지만!!! 반드시 첫번째 줄에서 호출해야 함
        System.out.println("나이 생성자");
        System.out.println();
        this.age=age;
        /*this();   => 이거 첫번째 줄 아니라 에러 */
    }
    public Constructor01(String name, int age){
        this(age);  // 나이 생성자 호출
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        Constructor01 constructor01 = new Constructor01();
        System.out.println("constructor01 = "+constructor01);
        System.out.println();

        Constructor01 constructor02 = new Constructor01("홍길동",27);
        System.out.println("이름 : "+constructor02.name+" 나이: "+constructor02.age);  // 클래스 내부에서는 private 필드 접근 가능
        System.out.println("이름 : "+constructor02.getName()+" 나이: "+constructor02.getAge()); // getter 함수 호출로도 가능
    }

}
