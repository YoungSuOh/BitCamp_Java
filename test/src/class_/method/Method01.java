package class_.method;

public class Method01 {
    public static void main(String[] args) {
        // static이라 이미 메모리에 올라가 있는 시음식 / 객체 생성 안해도 됨
        Method01.display();

        Method01 method01 = new Method01();
        method01.output();
    }

    public static void display(){
        System.out.println("static method");
    }
    public void output(){
        System.out.println("non-static method");
    }
}
