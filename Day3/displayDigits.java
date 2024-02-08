import java.util.Scanner;

public class displayDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the digits of the number
        System.out.println("Digits of the number are:");
        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number /= 10;
        }

        scanner.close();
    }
}

