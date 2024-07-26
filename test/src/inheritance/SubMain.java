package inheritance;

/*
*
* */

public class SubMain extends Super{
    private String name;
    protected int age;

    public SubMain (){
        System.out.println("SubMain 기본 생성자");
    }
    public SubMain(double weight, double height, String name, int age) {

           this.weight=weight;
               this.height=height;

/*       2. super.weight=weight;
            super.height=height;*/

        //super(weight, height); // 생성자끼리 서로 호출 가능 (자식 생성자가 부모 생성자 호출 가능), 무조건 첫번째 줄


/*        this
        this는 자신의 클래스의 참조값을 갖고 있다. / this()는 overload된 다른 생성자를 호출할 수 있다. / 첫줄에 써야 한다.*/

        /*
        * super는 부모 클래스의 참조값을 갖고 있다
        * super()는 부모 클래스의 생성자를 호출 할 수 있다.
        * 첫줄에 써야한다.
        * */

        this.name = name;
        this.age = age;

        System.out.println("SubMain 일반 생성자");

    }

    public void output(){
        System.out.println("이름 = "+name);
        System.out.println("나이 = "+age);
        System.out.println("몸무게 = "+weight);
        System.out.println("키 = "+height);
    }

    public static void main(String[] args) {
        double weight=78.5, height=178; String name="홍길동"; int age=27;
        SubMain aa = new SubMain(weight,height,name,age);  // 생성자를 2번 호출
        // 자식 클래스를 new하게 되면 자기꺼 뿐만 아니라 부모꺼까지 메모리에 클래스를 생성
        // 이때 부모 클래스는 무조건 기본 생성자를 요청하게 됨. 생성자가 아예 없을 때 자동 호출
        // 생성자가 있으면 자동 호출 x, 해당 생성자에 맞추라고 요청함.
        aa.output();
        System.out.println();


        aa.disp();  // 부모 매서드 사용 가능
        System.out.println("---------------------------------------------------");

        Super bb = new SubMain(67.5,171,"코난",25);  // 자식은 지꺼만 메모리 안잡고 부모꺼도 같이 잡음
        // bb라는 애는 super를 가르킴
        /*bb.output();*/  // error -> bb는 Super를 참조하기 때문에 SubMain 안에 있는 Super 꺼만 호출 가능
        bb.disp();  // 몸무게와 키밖에 안나옴(SubMain 꺼인 이름과 나이는 안나옴 ㄷㄷ)

        SubMain cc = (SubMain) new Super();
        Super dd = new Super();

    }
}
