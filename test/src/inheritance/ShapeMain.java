package inheritance;


import java.util.Scanner;

class ShapeTest{
    protected double area;
    protected Scanner scanner = new Scanner(System.in);

    public ShapeTest(){
        System.out.println("ShapeTest default 생성자 호출");
    }
    public void calcArea(){
        System.out.println("도형을 계산합니다.");
    }
    public void dispArea(){
        System.out.println("도형을 출력합니다.");
    }

}
//
class TriangleTest extends ShapeTest{
    protected int base, height;

    public TriangleTest() {
        System.out.println("SameTest의 default 생성자 호출");
        System.out.print("밑변 : ");
        base = scanner.nextInt();
        System.out.print("높이 : ");
        height = scanner.nextInt();
    }

    @Override  // 어노테이션
    public void calcArea() {
        area = (double) base*height/2;
    }

    @Override
    public void dispArea() {
        System.out.println("삼각형의 넓이 : "+area);
    }

}

class SquareTest extends ShapeTest{
    protected int base, height;

    public SquareTest() {
        System.out.println("SquareTest의 default 생성자 호출");
        System.out.print("밑변 : ");
        base = scanner.nextInt();
        System.out.print("높이 : ");
        height = scanner.nextInt();
    }

    @Override  // 어노테이션
    public void calcArea() {
        area = (double) base*height;
    }

    @Override
    public void dispArea() {
        System.out.println("사각형 넓이 : "+area);
    }

}

class SadariTest extends ShapeTest{
    protected int base, top, height;

    public SadariTest() {
        System.out.println("SadariTest의 default 생성자 호출");
        System.out.print("밑변 : ");
        base = scanner.nextInt();

        System.out.print("윗변 : ");
        top = scanner.nextInt();


        System.out.print("높이 : ");
        height = scanner.nextInt();
    }

    @Override  // 어노테이션
    public void calcArea() {
        area = (double) (base+top)*height/2;
    }

    @Override
    public void dispArea() {
        System.out.println("사다리꼴의 넓이 : "+area);
    }

}

//
public class ShapeMain  {
    public static void main(String[] args) {
/*        TriangleTest triangleTest = new TriangleTest();  // 1:1 관계, 결합도 100%
        triangleTest.calcArea();
        triangleTest.dispArea();  // 부모 꺼 출력 -> 내꺼도 내꺼, 부모꺼도 내꺼 (대신 자식 우선권)

        SquareTest squareTest = new SquareTest();
        squareTest.calcArea();
        squareTest.dispArea();

        SadariTest sadariTest = new SadariTest();
        sadariTest.calcArea();
        sadariTest.dispArea();*/

        // 만능 리모컨
        // 다형성 : 부모, 자식 상속 관계가 존재, override가 되어 있어야 한다.
        ShapeTest shape; // 주소만 받을 준비만 함
        shape = new TriangleTest();  // 생성자는 부모 자식 모두 호출, 메서드 호출해도 자식에서 오버라이드한 메서드 호출
        shape.calcArea();
        shape.dispArea();

        shape= new SquareTest();
        shape.calcArea();
        shape.dispArea();

        shape= new SadariTest();
        shape.calcArea();
        shape.dispArea();
    }
}
