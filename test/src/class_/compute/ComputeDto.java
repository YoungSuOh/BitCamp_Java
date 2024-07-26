package class_.compute;

public class ComputeDto {
    private int x, y, sum, sub, mul;
    private double div;

    public void setX(int x) {
        /*System.out.println("this = " + this);*/
        this.x = x;
    }

    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    public int getMul() {
        return mul;
    }

    public void setMul(int mul) {
        this.mul = mul;
    }

    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }
}
