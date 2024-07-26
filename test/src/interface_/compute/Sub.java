package interface_.compute;

public class Sub implements Compute{
    @Override
    public int calc(int a, int b) {
        return a-b;
    }
}
