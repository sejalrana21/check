package p1;

public class arithclass implements arithmetic
{

    @Override
    public double add(Double a, Double b) {
        return a+b;
    }

    @Override
    public double sub(Double a, Double b) {
        return a-b;
    }

    @Override
    public double mul(Double a, Double b) {
        return a*b;
    }

    @Override
    public double div(Double a, Double b) {
        return a/b;
    }

}
