public class ExceptionExample {
    public static void main(String[] args) {
        try {
            try {
                // This block throws an exception
                int result = 1 / 0; // ArithmeticException is thrown
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
                throw new RuntimeException("Exception from catch block"); // Throwing a new exception
            } finally {
                int []arr = new int[5];
                arr[10] = 10;
            }
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
