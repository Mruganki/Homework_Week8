
/*Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;
import java.util.Arrays;

public class P2_MinAndMaxInputChallenge {

        public static void getMinMaxNumbers() {//create method
            Scanner obj = new Scanner(System.in);//create object for scanner
            int i = 0;//all are variables
            int userInput;
            int maxNumber = 0;
            int minNumber = 0;

            while (true) {//condition
                System.out.println("Enter Number:");
                if (obj.hasNextInt()) {
                    userInput = obj.nextInt();
                    if (i == 0) {//this part is totally copy and paste.i dont understand anything
                        minNumber = userInput;
                        maxNumber = userInput;
                    } else {
                        if (userInput < minNumber) {
                            minNumber = userInput;
                        }
                        if (userInput > maxNumber) {
                            maxNumber = userInput;
                        }
                    }
                    i++;
                } else {
                    System.out.println("Invalid Number.");//message for invalid number
                    obj.next();
                    break;//we used break bcoz we want to stop when user enter the invalid number
                }
            }
            System.out.println("Minimum Number is:" + minNumber);//print the minimum number
            System.out.println("Maximum Number is:" + maxNumber);//print the maxnumber
        }

        public static void main(String[] args) {//Calling static method
            getMinMaxNumbers();

        }

    }