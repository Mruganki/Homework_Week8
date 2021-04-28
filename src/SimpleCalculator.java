/*
Sum Calculator
Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with  names firstNumber and secondNumber both of type double.
Write the following methods (instance methods):
● Method named getFirstNumber without any parameters, it needs to return the value of the  firstNumber field.
● Method named getSecondNumber without any parameters, it needs to return the value of  the secondNumber field.
● Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
● *Method named setSecondNumber with one parameter of type double, it needs to set the  value of the secondNumber field.
● Method named getAdditionResult without any parameters, it needs to return the result of  adding the field values of firstNumber and secondNumber.
● Method named getSubtractionResult without any parameters, it needs to return the result of  subtracting the field values of secondNumber from the firstNumber.
● Method named getMultiplicationResult without any parameters, it needs to return the result  of multiplying the field values of firstNumber and secondNumber.
● Method named getDivisionResult without any parameters, it needs to return the result of  dividing the field values of firstNumber by the secondNumber. In case the value of  secondNumber is 0 then return 0.
TEST EXAMPLE
TEST CODE: Write the bellow code into main method
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());
OUTPUT
add= 9.0
subtract= 1.0
multiply= 0.0
divide= 0.0
TIPS:
● add= 9.0 is printed because 5.0 + 4 is 9.0
● subtract= 1.0 is printed because 5.0 - 4 is 1.0
● multiply= 0.0 is printed because 5.25 * 0 is 0.0
● divide= 0.0 is printed because secondNumber is set to 0
NOTE: All methods should be defined as public NOT public static.
NOTE: In total, you have to write 8 methods.
 */
public class SimpleCalculator {
    double firstNumber;
    double secondNumber;

    //Method to get first number
    public double getFirstNumber() {
        return firstNumber;
    }

    //Method to set first number
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    //Method to get second number
    public double getSecondNumber() {
        return secondNumber;
    }

    //Method to set second number
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Method to add two numbers
    public double getAdditionResult(){
        return firstNumber+secondNumber;

    }

    //Method to substract a number from another
    public double  getSubtractionResult(){
        return firstNumber-secondNumber;
    }

    //Method to multiply two numbers
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }

    //Method to devide a number by another number
    public double getDivisionResult(){
        if (secondNumber==0){
            return 0;
        }
        else
            return firstNumber/secondNumber;
    }

    public static void main(String[] args) {// main method
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0); //Set first number
        calculator.setSecondNumber(4);  //set second number
        System.out.println("add= " + calculator.getAdditionResult()); // get addition result
        System.out.println("subtract= " + calculator.getSubtractionResult()); //get substraction result
        calculator.setFirstNumber(5.25); //set first number
        calculator.setSecondNumber(0); //set second number
        System.out.println("multiply= " + calculator.getMultiplicationResult()); //get multiplication result
        System.out.println("divide= " + calculator.getDivisionResult()); //get division result
    }
}
