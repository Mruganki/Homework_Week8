/*
Write a program in Java to display the pattern like a diamond.   While loop
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */


import java.util.Scanner;

public class P14_PrintDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// scanner
        System.out.println("Enter N : ");
        int n = sc.nextInt();/// input no of row with scanner obj
        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);//// input symbol to initialised symbol with scanner obj
        int i = 1;
        int j;
        while (i <= n) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
    }
}
