/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
 */

import java.util.Scanner;

public class P10_Armstrong {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// scanner obj created
        System.out.println("Enter an input  :");

        int number = scan.nextInt();// object initialised with scanner
        int originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)// while loop syntax and logic to find armstrong number
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");// print statement
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}









