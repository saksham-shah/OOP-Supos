package SV3;

public class NewtonRaphson {
    private final double square;

    private NewtonRaphson(double square) {
        this.square = square;
    }

    public static double root(double x) {
        if (x < 0) {
            throw new NegativeRootException();
        }
        NewtonRaphson nr = new NewtonRaphson(x);
        return nr.run();
    }

    private double run() {
        double estimate = 1;
        for (int i = 0; i < 20; i++) {
            estimate = iterate(estimate);
        }
        return estimate;
    }

    private double iterate(double x) {
        if (x == 0) {
            throw new DivideByZeroException();
        }
        return x - (x * x - square) / 2 / x;
    }

    private static class DivideByZeroException extends RuntimeException {}
    private static class NegativeRootException extends RuntimeException {}

    public static void main(String[] args) {
        System.out.println(root(4));
        System.out.println(root(5));
        System.out.println(root(0));
        System.out.println(root(-1));
    }
}
