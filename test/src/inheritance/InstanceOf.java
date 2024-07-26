package inheritance;

/*class AA{

}
error 나옴 -> 이미 default 접근 제어자로 TestMain에 만들어져 있음
*/

class AAA{

}
class BBB extends AAA{

}

public class InstanceOf {  // Instance -> 메모리에 생성 , casting이 되는지 안되는지 유무를 판단할 수 있음.
    // 객체에 원하는 클래스 타입이 메모리 할당이 되어 있는지, 형변환이 되는지 아닌지 판단용
    public static void main(String[] args) {
        AAA aaa = new AAA();
        BBB bbb = new BBB();
        AAA aaa1 = new BBB();

        AAA aaa2 = aaa;
        if(aaa2 instanceof AAA){  // aaa는 AAA에 참조할 수 있다.
            System.out.println(true);
        }
        else System.out.println(false);

        AAA aaa3 = bbb;
        if(bbb instanceof AAA) System.out.println(true);
        else System.out.println(false);

        BBB bbb1 = (BBB)aaa1;  // 자식으로 캐스팅한 aaa1을 참조 -> 가능
        if(aaa1 instanceof BBB){
            System.out.println(true);
        }
        else System.out.println(false);

        /*BBB bbb2 = (BBB)aaa; // 얘는 순수하게 A -> 불가능!! => ClassCastException*/
        if(aaa instanceof BBB){
            System.out.println(true);
        }
        else System.out.println(false);


    }
}
