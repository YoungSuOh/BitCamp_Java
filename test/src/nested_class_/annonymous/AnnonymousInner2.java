package nested_class_.annonymous;

public class AnnonymousInner2 {
    public static void main(String[] args) {
        BB bb = new BB(){
            public void bbb(){
                System.out.println("overide bbb");
                ddd();
            }
            public void ddd(){
                System.out.println("ddd");
            }
        };
        bb.aaa();
        bb.bbb();
        bb.ccc();
        // bb.ddd();  // 익명 중첩 클래스 안에서 생성한 메서드 사용 불가능
    }
}
