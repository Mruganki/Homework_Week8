/*
1. Read 10 numbers from the console entered by the user and print the sum of those  numbers.
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read  10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the  count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number  #2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge.
 */
import java.util.Scanner;// calling java util package for scanner

public class P1_ReadingUserInputChallenge {// class created

    public static void addNumbers(){// static method
        Scanner obj = new Scanner(System.in);// scanner initialized

        int a=1;// variable initialised
        int total=0;

        while(a<=10){// while loop with condition to take 10 inputonly
        System.out.println("Enter number # " + a + ":");// print statement
        if (obj.hasNextInt()){// hasnextint to check int value with scanner object
            total= total + obj.nextInt();// total of int value
            a++;// add all input in incremental format
        }else {
            System.out.println("Invalid number");// else body if not int number print invalid input
            obj.next();// to clear the console and move to the next input
        }
        }
        System.out.println("Total="+total);// total printout
    }

    public static void main(String[] args) {// main method
       addNumbers();// calling static method into main method
    }
    }







