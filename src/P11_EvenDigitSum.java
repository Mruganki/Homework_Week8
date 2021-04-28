/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
 EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */


public class P11_EvenDigitSum {
    public static void main(String[] args) {// main method
        int sum = 0;// variable initialised supported method calling
        sum = getEvenDigitSum(66);// method calling n enter input number
        System.out.println("Sum of Evens: " + sum);// printsatment with result sum
    }

    public static int getEvenDigitSum(int number) {// static method with variable int
        // invalid option
        if (number < 0) {
            return -1;
        }
        // variables
        int sum = 0;
        int lastdigit = 0;

        //calculations
        while (number > 0) {
            lastdigit = number % 10;
            //check if number is even
            if (number % 2 == 0) {
                sum += lastdigit; // sum + lastdigit = sum
                number /= 10; // number /10 = number
            } else { // check if number is odd
                number /= 10;
                continue;
            }
        }
        // output
        return sum;
    }
}
