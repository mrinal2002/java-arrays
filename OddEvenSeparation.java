import java.util.Scanner;

public class OddEvenSeparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Error: Enter a positive number.");
            return;
        }

        int[] even = new int[num / 2 + 1], odd = new int[num / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) even[evenIndex++] = i;
            else odd[oddIndex++] = i;
        }

        System.out.println("Even Numbers: " + java.util.Arrays.toString(java.util.Arrays.copyOf(even, evenIndex)));
        System.out.println("Odd Numbers: " + java.util.Arrays.toString(java.util.Arrays.copyOf(odd, oddIndex)));
    }
}
