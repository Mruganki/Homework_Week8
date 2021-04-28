
/*
Write a program in Java to display the pattern like a triangle with a number.   For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 */

/*Write a program in Java to display the pattern like a triangle with a number.   For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910
 */

import java.util.*;// calling java util package

public class P6_TringlewithNumber {// class created

    public static void main(String[] args)// main method
    {
        int i, j, n;// variable created
        System.out.println("Input number of rows : ");//print statement
        Scanner in = new Scanner(System.in);// scanner initialised
        n = in.nextInt();// variable initialised with scanner object n data type

        for (i = 1; i <= n; i++)// for loop logic
        {
            for (j = 1; j <= i; j++)// for loop with variable initialised
                System.out.print(j);// print statment

            System.out.println("");//for empty spaceing
        }
    }
}


