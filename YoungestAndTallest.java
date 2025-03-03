import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of friends' names
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3]; // Array to store ages
        double[] heights = new double[3]; // Array to store heights

        // Taking input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0; // Index of youngest friend
        int tallestIndex = 0; // Index of tallest friend

        // Finding the youngest and tallest friend
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Displaying the results
        System.out.println("Youngest: " + friends[youngestIndex]);
        System.out.println("Tallest: " + friends[tallestIndex]);

        sc.close(); // Closing the scanner
    }
}
