package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreReportMain {
    public static void main(String[] args)
    {
        //variables and initializations
        int student_score[] = new int[5];   // array of student scores
        String student_name[] = new String[5];  //array of student names
        char student_grad [] = new char[5];
        Object student_summary[][] = new Object[5][3];
        int student_avg = 0;
        int index_min = 0;
        int index_max = 0;
        int no_passed = 0;

        Scanner sc = new Scanner(System.in);

        //getting Student data
        for(int i = 0;i<=student_name.length-1;i++)
        {

            System.out.println("Enter the values for the "+i+" Student");
            System.out.println("Enter the name of the "+i+" student");
            String name_input = sc.next();
            student_name[i] = name_input;                       //adding user input to the array

            boolean invalid_score = true;
            while(invalid_score)                                // chck for invalid score
            {
                System.out.println("Enter the score of the "+i+" student");
                if(sc.hasNextInt())
                {
                    int score_input = sc.nextInt();
                    if(score_input>=0&&score_input<=100)
                    {
                        student_score[i] = score_input;
                        invalid_score = false;
                    }
                    else
                    {
                        System.out.println("Enter a valid score between 0 & 100");
                    }
                }
                else
                {
                    System.out.println("Invalid input! Please enter a whole number");
                    sc.next();
                }

            }
        }
        //Printing the two arrays
        System.out.println("Student names array is"+ Arrays.toString(student_name));
        System.out.println("Student score array is"+ Arrays.toString(student_score));



//3)        //convert scores to grading system
        for(int i=0; i <student_score.length;i++)
        {
            if(student_score[i]>=70)
            {
                student_grad[i] = 'A';
            }
            else if (student_score[i]<70&&student_score[i]>=60)
            {
                student_grad[i] = 'B';
            }
            else if (student_score[i]<60&&student_score[i]>=50)
            {
                student_grad[i] = 'C';
            }
            else if (student_score[i]<50&&student_score[i]>=45)
            {
                student_grad[i] = 'D';
            }
            else if(student_score[i]<45&&student_score[i]>=0)
            {
                student_grad[i] = 'F';
            }
        }
        System.out.println(Arrays.toString(student_grad));

        //print each student with their grade
        //populating the 3d array for name,score and grad
        for(int i = 0;i<student_summary.length;i++)
        {
            student_summary[i][0] = student_name[i];
            student_summary[i][1] = student_score[i];
            student_summary[i][2] = student_grad[i];

        }
        System.out.println(Arrays.deepToString(student_summary));


        //print the highest score ,lowest score and average without sorting
        //search for highest score
        for(int i = 0 ;i<student_score.length;i++)
        {
            if(student_score[i]>student_score[index_max])
            {
                index_max = i;
            }
        }
        //search for lowest score
        for(int i = 0 ;i<student_score.length;i++)
        {
            if(student_score[i]<student_score[index_min])
            {

                index_min = i;
            }
        }
        //search for average score
        for(int i = 0 ;i<student_score.length;i++)
        {
            student_avg =student_avg+ student_score[i];

        }
        student_avg = student_avg / student_score.length;

        //printing it all out
        System.out.println("The student with the highest score is: "+student_summary[index_max][1]);
        System.out.println("The student with the lowest score is: "+student_summary[index_min][1]);
        System.out.println("The average student score is: "+student_avg);

        //printing number no of students who passed
        for(int i = 0; i < student_summary.length; i++)
        {
            // Cast the Object score back to an int so we can compare it
            int score = (int) student_summary[i][1];

            if(score >= 45)
            {
                no_passed++;
            }
        }

        System.out.println("The total number of students who passed is: " + no_passed);

        //6. Asks for a name to search, and prints that student's score,
        // or "Student not found." The search shouldn't care about case: tunde should find Tunde.
        boolean found = false;
        System.out.println("Give me a name to search");
        String search_element = sc.next();
        for(int i = 0;i<student_summary.length;i++)  //iterate through the rows of ethe array
        {
            String current_name = (String)student_summary[i][0]; //store  the current name of each iteration
            if(current_name.equalsIgnoreCase(search_element))
            {
                System.out.println("This is their score " +student_summary[i][1]);
                found = true;
            }

        }
        if(!found)
        {
            System.out.println("Student not found");
        }

    }



}
