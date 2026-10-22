package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreReportMainFormatted {
    public static void main(String[] args) {

        // ==========================================
        // 1. VARIABLE DECLARATIONS
        // ==========================================
        int student_score[] = new int[5];       // Array of student scores
        String student_name[] = new String[5];  // Array of student names
        char student_grad[] = new char[5];      // Array of student letter grades
        Object student_summary[][] = new Object[5][3]; // Unified 2D summary array (Name, Score, Grade)

        int student_avg = 0;
        int index_min = 0;
        int index_max = 0;
        int no_passed = 0;

        Scanner sc = new Scanner(System.in);

        // ==========================================
        // 2. DATA INPUT & VALIDATION LOOP
        // ==========================================
        for (int i = 0; i < student_name.length; i++) {
            System.out.println("\nEnter the values for Student #" + i);
            System.out.println("Enter the name of student #" + i + ":");
            String name_input = sc.next();
            student_name[i] = name_input; // Adding user name to the array

            boolean invalid_score = true;
            while (invalid_score) // Check for invalid score input
            {
                System.out.println("Enter the score of student #" + i + ":");
                if (sc.hasNextInt()) {
                    int score_input = sc.nextInt();
                    if (score_input >= 0 && score_input <= 100) {
                        student_score[i] = score_input;
                        invalid_score = false;
                    } else {
                        System.out.println("Enter a valid score between 0 & 100");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a whole number");
                    sc.next(); // Clear invalid token from scanner
                }
            }
        }

        System.out.println("\nStudent names array is " + Arrays.toString(student_name));
        System.out.println("Student score array is " + Arrays.toString(student_score));

        // ==========================================
        // 3. GRADE CONVERSION LOGIC
        // ==========================================
        for (int i = 0; i < student_score.length; i++) {
            if (student_score[i] >= 70) {
                student_grad[i] = 'A';
            } else if (student_score[i] < 70 && student_score[i] >= 60) {
                student_grad[i] = 'B';
            } else if (student_score[i] < 60 && student_score[i] >= 50) {
                student_grad[i] = 'C';
            } else if (student_score[i] < 50 && student_score[i] >= 45) {
                student_grad[i] = 'D';
            } else if (student_score[i] < 45 && student_score[i] >= 0) {
                student_grad[i] = 'F';
            }
        }
        System.out.println("Grades array: " + Arrays.toString(student_grad));

        // ==========================================
        // 4. POPULATE THE UNIFIED 5x3 SUMMARY ARRAY
        // ==========================================
        for (int i = 0; i < student_summary.length; i++) {
            student_summary[i][0] = student_name[i];  // Column 0: Name
            student_summary[i][1] = student_score[i]; // Column 1: Score
            student_summary[i][2] = student_grad[i];  // Column 2: Grade
        }

        // Clean, formatted tabular printout for the summary array
        System.out.println("\n====================================");
        System.out.println("       STUDENT SUMMARY REPORT       ");
        System.out.println("====================================");
        System.out.printf("%-15s %-10s %-5s%n", "Name", "Score", "Grade");
        System.out.println("------------------------------------");
        for (int i = 0; i < student_summary.length; i++) {
            System.out.printf("%-15s %-10s %-5s%n",
                    student_summary[i][0],
                    student_summary[i][1],
                    student_summary[i][2]
            );
        }
        System.out.println("====================================");

        // ==========================================
        // 5. STATISTICS CALCULATIONS (MAX, MIN, AVG)
        // ==========================================

        // Search for highest score index
        for (int i = 0; i < student_score.length; i++) {
            if (student_score[i] > student_score[index_max]) {
                index_max = i;
            }
        }

        // Search for lowest score index
        for (int i = 0; i < student_score.length; i++) {
            if (student_score[i] < student_score[index_min]) {
                index_min = i;
            }
        }

        // Calculate average score
        for (int i = 0; i < student_score.length; i++) {
            student_avg = student_avg + student_score[i];
        }
        student_avg = student_avg / student_score.length;

        // Print statistics results
        System.out.println("\nThe student with the highest score is: " + Arrays.toString((Object[]) student_summary[index_max]));
        System.out.println("The student with the lowest score is: " + Arrays.toString((Object[]) student_summary[index_min]));
        System.out.println("The average student score is: " + student_avg);

        // ==========================================
        // 6. PASSING TALLY CALCULATION (Score >= 45)
        // ==========================================
        for (int i = 0; i < student_summary.length; i++) {
            // Cast the Object score back to an int so we can compare it numerically
            int score = (int) student_summary[i][1];

            if (score >= 45) {
                no_passed++;
            }
        }

        System.out.println("The total number of students who passed is: " + no_passed);

        // ==========================================
        // 7. CASE-INSENSITIVE SEARCH FEATURE
        // ==========================================
        boolean found = false;
        System.out.println("\nGive me a name to search:");
        String search_element = sc.next();

        for (int i = 0; i < student_summary.length; i++) // Iterate through the rows of the array
        {
            String current_name = (String) student_summary[i][0]; // Store the current name of each iteration
            if (current_name.equalsIgnoreCase(search_element)) {
                System.out.println("This is their score: " + student_summary[i][1]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }

        sc.close();
    }
}



