package basic;


/* 상수 (절대 변하지 않는 값)
- 숫자 상수: 25
- 문자 상수: 'A' 'c'
=> 둘 다 계산하는 능력을 가지고 있음
문자열 -> address 다
5+3=8
'5'+3=56
"5"+3 = ="53"
 */
public class Variable {
    public static void main(String[] args) {
        boolean a =25<26;  // 항상 오른쪽이 왼쪽에 대입된다.
        System.out.println(25<26);
        System.out.println(a);

        char b = 'B';
        System.out.println(b);
        char c = 65+2;
        System.out.println(c); // A

        // byte d = 300; - error

        int e = 65;
        System.out.println(e);
        int f = 'A';
        System.out.println(f);
    }
}
