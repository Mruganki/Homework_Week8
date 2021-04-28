

/*
. Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only.
In other words,  prime numbers can't be divided by other numbers than itself or 1.
For example 2, 3, 5, 7, 11, 13,  17.... are the prime numbers.)
 */


import java.util.Scanner;// calling util package for scanner

public class P12_PrimeNumber {// class created

    public static boolean checkprime(int n) {// static method
        /* 2 to n
         * n==7
         */
        for (int i = 2; i < n; i++) {// for loop syntax
            if (n % i == 0) {// condition to check prime number, if it is divided by 2 and 0 remainder
                return false;
            }
        }

        return true;// if condition satisfied result is true as in next sout as not prime
    }

    public static void main(String[] args) {// main method
        System.out.println("Enter a number");// print statement
        Scanner in = new Scanner(System.in);// scanner to created  object

        int n = in.nextInt(); //variable initialised with scanner obj

        if (n >= 2 && checkprime(n)) {// condition to check enterednuber is prime or not
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
