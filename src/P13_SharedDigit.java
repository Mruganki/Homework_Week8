/*
Shared Digit
t  within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;  otherwise, the meWrite a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is nothod should return false.
EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers NOTE: The method hasSharedDigit should be defined as public static

 */


public class P13_SharedDigit {

    public static void main(String[] args) {// mian method

        boolean num = hasSharedDigit(9, 99);// calling static method with parameters
        System.out.println(num);
    }

    public static boolean hasSharedDigit(int number1, int number2) {// static method created
        // variables
        int lastdigit1 = 0;
        int lastdigit2 = 0;
        int value = number2;//original

        //Range
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {//Each number should be within the range of 10 (inclusive) - 99 (inclusive).
            //If one of the numbers is nothod should return false.
            while (number1 > 0) {
                lastdigit1 = number1 % 10;
                System.out.println("Number 1 last Digit: " + lastdigit1);

                do {
                    lastdigit2 = number2 % 10;
                    System.out.println("Number 2 last digit: " + lastdigit2);
                    if (lastdigit1 == lastdigit2) {
                        return true;//The method should return true if there is a digit that appears in both numbers
                    } else {
                        number2 /= 10;
                    }

                } while (number2 > 0);
                number2 = value;
                number1 /= 10;
            }

        }
        return false;
    }


}
