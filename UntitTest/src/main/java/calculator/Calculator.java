package calculator;


public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }
    public double calculateDiscount(double a, double b) {
        if (a < 0 || b < 0 || b > 100) {
            throw new ArithmeticException("Error");
        }
        double discountAmount = a * b / 100;
        return a - discountAmount;
    }
}