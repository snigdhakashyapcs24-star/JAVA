import java.util.Scanner;

class Student {
    // Member variables
    String usn;
    String name;
    int[] credits;
    int[] marks;

    // Method to accept student details
    public void acceptDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();

        // Initialize arrays based on the number of subjects
        credits = new int[numSubjects];
        marks = new int[numSubjects];

        // Input credits and marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        sc.nextLine(); // Consume leftover newline if any
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
    }

    // Method to calculate SGPA
    public double calculateSGPA() {
        double totalCredits = 0;
        double weightedSum = 0;

        for (int i = 0; i < credits.length; i++) {
            int gradePoint;

            if (marks[i] >= 90) {
                gradePoint = 10;
            } else if (marks[i] >= 80) {
                gradePoint = 9;
            } else if (marks[i] >= 70) {
                gradePoint = 8;
            } else if (marks[i] >= 60) {
                gradePoint = 7;
            } else if (marks[i] >= 50) {
                gradePoint = 6;
            } else if (marks[i] >= 40) {
                gradePoint = 5;
            } else {
                gradePoint = 0;
            }

            weightedSum += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        if (totalCredits == 0) return 0; // Avoid division by zero
        return weightedSum / totalCredits;
    }
}

public class StudentSGPACalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Student object
        Student student = new Student();

        // Accept, display, and calculate SGPA
        student.acceptDetails(sc);
        student.displayDetails();

        double sgpa = student.calculateSGPA();
        System.out.printf("SGPA of the student: %.2f\n", sgpa);

        sc.close(); // Close scanner to avoid resource leak
    }
}
