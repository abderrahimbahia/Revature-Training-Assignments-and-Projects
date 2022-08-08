//Program Name: ReversingArrayOfIntegers
//Programmer:   Abderrahim Baha
//Last Update:  08/08/2022
/*
*   Write a program to create an array of 10 integers and then reverse the array.
*/

package com.company;

public class Main {

    public static void main(String[] args) {

        //Create two arrays of size 10
        int [] arr = new int[10];
        int [] arrReversed = new int[10];

        try
        {
            //Populate the array with random values 0:99
            for(int i = 0; i < arr.length; i++)
            {
                arr[i] = (int)(Math.random() * 100);
            }

            int j = 0;
            //Reversing array
            for(int i = (arr.length - 1); i >= 0; i--)
            {
                arrReversed[j] = arr[i];
                j ++;
            }


            //display arrays
            System.out.println("Reversing Array of Random Integers: ");

            System.out.println("Before: ");
            for (int number: arr) {
                System.out.print("");
                System.out.print(number + " ");
            }

            System.out.println("\nAfter");
            for (int number: arrReversed)
            {
                System.out.print("");
                System.out.print(number + " ");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
