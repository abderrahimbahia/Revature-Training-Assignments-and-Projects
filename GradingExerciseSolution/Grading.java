//Program Name: Grading Exercise
//Programmer:   Abderrahim Bahia
//Last Update:  08/03/2022

//Import libraries
import java.util.Scanner;

//Grading class
public class Grading {
    public static void main(String[] args) {

        //Create a scanner
        Scanner scanner = new Scanner(System.in);

        //Declare variables
        float grade;

        try
        {
            //Prompting user for input
            System.out.println("Please enter your grade: ");

            //initializing grade
            grade = scanner.nextFloat();

            //Display results
            System.out.printf("Your grade is: " + GradingCriteria(grade));

        } catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static char GradingCriteria(float grade)
    {
        if(grade >= 90)
        {
            return 'A';
        }
        else if(grade >= 80)
        {
            return 'B';
        }
        else if(grade >= 70)
        {
            return 'C';
        }
        else if(grade >= 60)
        {
            return 'D';
        }else
        {
            return 'F';
        }
    }
}