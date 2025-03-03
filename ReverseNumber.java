import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Count the number of digits
        int count = 0, temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count]; // Array to store digits

        // Extract digits and store them in reverse order
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        // Print the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }

        sc.close(); // Close scanner
    }
}
