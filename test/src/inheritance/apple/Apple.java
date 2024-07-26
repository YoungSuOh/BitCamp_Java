package inheritance.apple;

import inheritance.zoo.Zoo;

public class Apple {
    public static void main(String[] args) {
        System.out.println("빨강 사과");

        Zoo zoo = new Zoo();
        zoo.tiger();
        zoo.giraffe();
        zoo.getElephant();
        zoo.getLion();

    }
}
