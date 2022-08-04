//Program name: ClassObjectExercise
//Programmer:   Abderrahim Bahia
//Last Update:  08/04/2022

import java.util.*;
import java.util.List;
import java.math.BigDecimal;

/**Overview:
 * Classes and Objects
 * - For this exercise, you will pick a real-life object to write some java code about.
 * - Example: superhero, food, etc.
 * - Requirements
 *     - At least 5 member variables
 *     - At least 3 methods
 *     - At least 2 constructors, separate from the 3 methods
 *     - Also write some code to try out some methods and variables you created
 *     - Override either the toString or equals method and write code to test those out
 */

public class Main {
    public static void main(String [] args)
    {

        //Declaring variables
        List<String>    skills = new ArrayList<>();
        List<String>    classes = new ArrayList<>();
        List<String>    courses = new ArrayList<>();

        //add values
        skills.add("Java");
        skills.add(".Net");
        classes.add("Next Gen Java AWS Angular Extended v3.1");
        courses.add("Java");

        //Creating Instructor object and initialising attributes using constructor
        Instructor instructor = new Instructor("RVI08042022", "Rory", "Eiffe", "Instructor", BigDecimal.valueOf(1000000), skills, classes);

        //Creating Trainee object and initialising values using getter and setters
        Trainee    trainee = new Trainee();
        trainee.setId("RVT08042022");
        trainee.setfName("Abderrahim");
        trainee.setlName("Bahia");
        trainee.setPosition("Trainee");
        trainee.setSalary(BigDecimal.valueOf(100));
        trainee.setCourses(courses);

        //display
        System.out.println("\nInstructor:"+ instructor +"\n"+
                            "\nTrainee:" + trainee);
    }
}