class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            if (denominator == 0) {
                throw new DivisionByZeroException("Division by zero is not allowed.");
            }
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (DivisionByZeroException e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
