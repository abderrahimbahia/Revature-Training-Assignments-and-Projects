//Program Name: ReversingArrayOfStrings
//Programmer  : Abderrahim Bahia
//Last Update : 08/08/2022
/*
* Write a program to create an array of strings and then print out the array and strings backwards.
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Create an instance of Scanner
        Scanner scanner = new Scanner(System.in);

        try
        {
            //Prompt array size to the user
            System.out.println("Please enter your array size: ");

            //Create two array of strings
            String [] stringArray = new String[scanner.nextInt()];
            String [] stringArrayReversed = new String[stringArray.length];

            //Prompt user for strings
            for(int i = 0; i < stringArray.length; i++)
            {
                System.out.println("Please enter a string");
                stringArray[i] = scanner.next();
            }

            //Reversing  array of strings
            int j = 0;
            for(int i = stringArray.length  - 1; i >= 0; i--)
            {
                //reverse strings
                String string = stringArray[i];
                String stringReversed = "";

                for(int k = string.length() - 1; k >= 0;  k--)
                    stringReversed += string.charAt(k);

                stringArrayReversed[j] = stringReversed;
                j++;
            }

            //display arrays
            System.out.println("Reversing Array of Strings: ");

            System.out.println("Before: ");
            for (String str:stringArray) {
                System.out.print("");
                System.out.print(str + " ");
            }

            System.out.println("\nAfter: ");
            for (String str:stringArrayReversed) {
                System.out.print("");
                System.out.print(str + " ");
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("You did not enter a valid integer");
            System.out.println("Try Again\n");
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Try Again\n");
        }
        catch(Exception e)
        {
            System.out.println("Error:" + e.getMessage());
            System.out.println("Try Again\n");
        }
    }
}
