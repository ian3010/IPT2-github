public class Calculator {
    public static void main(String[] args) {
        System.out.println("Simple Calculator");

        int a = 8;
        int b = 2;

        int addResult = add(a, b);
        System.out.println("Addition: " + addResult);

        int subtractResult = subtract(a, b);
        System.out.println("Subtraction: " + subtractResult);

        int multiplyResult = multiply(a, b);
        System.out.println("Multiplication: " + multiplyResult);

        int divideResult = divide(a, b);
        System.out.println("Division: " + divideResult);

        int modulusResult = modulus(a, b);
        System.out.println("Modulus: " + modulusResult);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }
}