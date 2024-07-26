package inheritance.safari;

import inheritance.zoo.Zoo;

public class Safari extends Zoo{
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.tiger();
        zoo.giraffe();
        zoo.getElephant();
        zoo.getLion();

        // zoo.parent(); // 부모껄로 생성하면 부모는 밑에 자식이 있는지 모름

        Safari safari = new Safari();
        safari.parent();
    }
}
