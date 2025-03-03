import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;

        // Input 5 numbers
        System.out.println("Please enter 5 numbers");
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Check if numbers are positive, negative, or zero
        System.out.println("Check for positive, negative, or zero");
        for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                System.out.println(arr[i] + " is zero");
            } else if (arr[i] < 0) {
                System.out.println(arr[i] + " is negative");
            } else {
                System.out.println(arr[i] + " is positive");
            }
        }

        // Check if positive numbers are odd or even
        System.out.println("For positive numbers, check odd or even");
        for (int i = 0; i < size; i++) {
            if (arr[i] >= 0 && arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is an even number");
            } else if (arr[i] >= 0 && arr[i] % 2 == 1) {
                System.out.println(arr[i] + " is an odd number");
            }
        }

        // Check if the first and last elements are equal
        System.out.println("Check if first and last element are equal");
        if (arr[0] == arr[4]) {
            System.out.println("Yes, they are equal");
        } else {
            System.out.println("No, they are not equal");
        }
    }
}
