package ie.gmit;

public class Calculator {

    private int num1;
    private int num2;

    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 > 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
    }
}
