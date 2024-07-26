package nested_class_.annonymous;

public class AA {
    public int getY() {
        return y;
    }

    private int y=200;

    public AA() {
        this.display();
    }

    public void display(){
        System.out.println("AA 클래스");
    }
}
