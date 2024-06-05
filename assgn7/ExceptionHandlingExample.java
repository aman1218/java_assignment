package assgn7;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            
            int a = 10;
            int b = 0;
            System.out.println("Result: " + (a / b)); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e);
        }

        try {
            
            int[] array = new int[5];
            array[10] = 50; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            
            String str = null;
            System.out.println(str.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }

        try {
            
            String number = "abc";
            int result = Integer.parseInt(number);
            System.out.println(result); // This will throw NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }

        try {
            System.out.println("Executing finally block example");
            int c = 10 / 2;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This will always be executed.");
        }

        System.out.println("Program continues normally after exception handling.");
    }
}
