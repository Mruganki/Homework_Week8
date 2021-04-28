/*
Display right angle triangle of @ using nested for loops
 */

import java.util.Scanner;// util package

public class P8_RightAngleTriangle {// class created

    public static void main(String[] args) {//main method
        int i, j, n;// variable define
        System.out.print("Input number of rows : ");// print statement
        Scanner in = new Scanner(System.in);
        n = in.nextInt();// variable initialised with scanner obj

        for (i = 1; i <= n; i++)// for loop syntax
        {
            for (j = 1; j <= i; j++)// nested loop
                System.out.print("@");

            System.out.println("");// print statement
        }
    }
}
