import java.util.Scanner;
import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors.add(i);
        }

        System.out.println("Factors: " + factors);
    }
}
