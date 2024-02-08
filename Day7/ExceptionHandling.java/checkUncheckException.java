public class checkUncheckException {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // This line will throw a NullPointerException
            System.out.println("Length of string: " + length);
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        }
    }
}

/* 
 * Checked exceptions:
        are those that the compiler forces you to handle explicitly. They are usually external to the program and beyond the programmer's control. Examples include file I/O operations, network operations, and database access. These exceptions must be either caught using a try-catch block or declared in the method's signature using the throws keyword.
        
 * Unchecked exceptions :
        are also known as runtime exceptions, and they do not require explicit handling. They are usually the result of programming errors and can be avoided by proper coding practices. Examples include NullPointerException, ArrayIndexOutOfBoundsException, and ArithmeticException. 
 
 */