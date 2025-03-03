import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0) {
                System.out.println(numbers[i] + " is Positive and " + (numbers[i] % 2 == 0 ? "Even" : "Odd"));
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Compare first and last elements
        if (numbers[0] > numbers[4]) System.out.println("First is greater than Last");
        else if (numbers[0] < numbers[4]) System.out.println("First is less than Last");
        else System.out.println("First and Last are equal");
    }
}
