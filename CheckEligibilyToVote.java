import java.util.Scanner;

public class CheckEligibilyToVote {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the number of students in the class
        System.out.println("please enter strength of the class");
        int size = sc.nextInt();
        int[] array = new int[size];

        // Input ages of students
        System.out.println("enter age of students: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                System.out.println("this student " + array[i] + " who's roll no is " + i + " has an invalid age");
            } else if (array[i] >= 18) {
                System.out.println("this student " + array[i] + " who's roll no is " + i + " can vote");
            } else {
                System.out.println("this student " + array[i] + " who's roll no is " + i + " can't vote");
            }
        }
    }
}
