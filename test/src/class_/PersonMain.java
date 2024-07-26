package class_;
// 여러 개의 클래스 가능
/*class Person{
    String name;
    int age;
}*/

// compile하면 Person.java / PersonMain.class
// Person.class 생성됨  -> 클래스당 *.class 파일이 생성된다.


// 캡슐화  -> 클래스 안에서만 접근 가능
class Person {
    private String name;
    private int age;

    // 메소드는 "공개" 시킴
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setData(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setData(){
        System.out.println("오버로드");
    }
}


// 자바의 컴파일러는 파일당 하나의 public 클래스를 허용하며
// 클래스 레벨에서는 private 또는 protected 접근 제어자를 사용할 수 없습니다.
// 자바에서는 클래스 레벨에서 사용할 수 있는 접근 제어자는 public과 default(아무것도 명시하지 않는 것) 뿐입니다. 이는 자바 언어의 규칙입니다.
public class PersonMain { // public 클래스는 java파일에 하나, main도 하나여야 한다.
    public static void main(String[] args) { // JVM이 main부터 사용
/*        Person person;
        person = new Person();*/

        Person person = new Person();
        System.out.println("person 객체 주소값 : " + person);


        // 캡슐화 x
        /*person.name = "홍길동";
        person.age = 27;
        System.out.println("이름 : "+person.name+"\n나이 : "+person.age);*/


        // 캡슐화 o
        person.setName("홍길동");
        person.setAge(27);
        System.out.println("이름 : "+person.getName()+"\n나이 : "+person.getAge());
        System.out.println();

        person.setData("오영수",27);;
        System.out.println("이름 : "+person.getName()+"\n나이 : "+person.getAge());

        person.setData();


    }

}
