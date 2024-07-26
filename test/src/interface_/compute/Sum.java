package interface_.compute;

public class Sum implements Compute{
    @Override
    public int calc(int a, int b) {
        return a+b;
    }
}
