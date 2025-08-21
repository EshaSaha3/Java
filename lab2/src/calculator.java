package lab2;

public class Calculator {
    // Intentionally different to create a merge conflict
    public int add(int a, int b) { return a + b + 1; } // changed
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) {
        // Different behavior to conflict
        return b == 0 ? 0 : (double) a / b;
    }
}
