package generic_;

/* Generic
* 제네릭은 동적으로 타입을 결정하지 않고, 컴파일시
* */

public class GenericMain<T> {  // T -> 아 제네릭 걸려 있구나
    private T a;
    public void setA(T a){  // 아 아직 자료형 결정이 안됐구나
        this.a=a;
    }
    public T getA(){
        return a;
    }

    public static void main(String[] args) {
        GenericMain<String>aa = new GenericMain<>();  // String 타입으로 결정!
        aa.setA("홍길동");
        System.out.println("이름 = "+aa.getA());

        /*aa.setA(25); -> Generic을 String으로 결정했기에 에러가 발생한다.*/


        /*GenericMain<int>bb = new GenericMain<>();  // 기본 자료형으로 Generic이 못받음 -> error*/


        GenericMain<Integer>cc = new GenericMain<>();  // String 타입으로 결정!
        cc.setA(25);
        System.out.println("이름 = "+cc.getA());
    }
}