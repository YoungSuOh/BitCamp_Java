package abstract_class;


import java.util.Scanner;

abstract class ShapeTest{
    protected double area;
    protected Scanner scanner = new Scanner(System.in);

    public ShapeTest(){
        System.out.println("ShapeTest default 생성자 호출");
    }
    public abstract void calcArea();
    public abstract void dispArea();

}
//
class TriangleTest extends ShapeTest{
    protected int base, height;

    public TriangleTest() {
        System.out.println("TriangleTest의 default 생성자 호출");
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
