import java.util.Scanner;

public class StudentGrades2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays to store marks, percentage, and grades
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
            }
            // Calculate percentage
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Assign grade based on percentage
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 80) grade[i] = 'B';
            else if (percentage[i] >= 70) grade[i] = 'C';
            else if (percentage[i] >= 60) grade[i] = 'D';
            else grade[i] = 'F';
        }

        // Display student grades
        System.out.println("Student | Percentage | Grade");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " | " + percentage[i] + " | " + grade[i]);
        }

        sc.close(); // Close scanner
    }
}
