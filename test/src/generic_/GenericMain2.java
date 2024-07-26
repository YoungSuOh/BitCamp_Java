package generic_;

public class GenericMain2 <T> {
    private T a;

    public GenericMain2(T a) { // 이에 맞는 생성자를 만듬
        this.a = a;
    }

    public void setA(T a){
        this.a=a;
    }
    public T getA(){
        return a;
    }


    public static void main(String[] args) {
        //GenericMain2<?> aa = new GenericMain2<String>();  // Generic을 걸어놨는데 String 타입으로 설정했는데, 내부적으론 Object화 시킨다.
        //aa.setA("홍길동");  // 에러 발생! -> 반드시 데이터는 setter가 아니라 생성자를 통해서만 넣어야 한다.
        /*java: incompatible types: java.lang.String cannot be converted to capture#1 of ?*/


        GenericMain2<?> aa = new GenericMain2<String>("홍길동");  // 1. 생성자를 통해서 넣음
        /*String name = aa.getA();  // error -> aa.getA()는 Object로 들어오기 때문*/
        String name = (String) aa.getA();  // String으로 형변환 해줘야 함
        Object name1 = aa.getA();  // String으로 형변환 해줘야 함
        System.out.println("String 타입 : "+name);
        System.out.println("Object 타입 : "+name1);

        GenericMain2<?>bb = new GenericMain2<Integer>(25);
        /*int age = (int)bb.getA();*/  // 여기서 왜 와일드 카드(?)를 쓰는지 조금은 알거 같은 느낌?

        int age = (Integer) bb.getA();  // unAutoBoxing
        Integer age1 = (int) bb.getA();  // AutoBoxing

        System.out.println("나이 = "+age);


    }
}


/*
Wrapper 클래스 : 주소값이 들어감  기본 자료형: 데이터가 들어감
AutoBoxing : 자동으로 Box처리를 하겠다 -> 기본형을
unAutoBoxing:

*/
