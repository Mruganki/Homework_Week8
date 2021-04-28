/*
Write a Java program that takes the user to provide a single character from the   alphabet. Print Vowel of Consonant, depending on the user input. If the user input   Is not a letter (between a and z or A and Z), or is a string of length > 1, print an  error message.
For eg:  .
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant
 */
import java.util.*;// calling util package

public class P3_UpperCaseLowercase {// class created


    public static void main(String[] args) {// main method
        Scanner in = new Scanner(System.in);// scanner initialised

        System.out.print("Input an alphabet: ");// printstatement for input
        String input = in.next().toLowerCase();//variable initialised with obj

        P3_UpperCaseLowercase obj= new P3_UpperCaseLowercase();// objected created in method to call instance method
        obj.vowelAndConso(input);// calling instance method

    }
        public void vowelAndConso (String input){// instance method

            boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;// logic for uppercase
            boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;// logic for lowercase
            boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                    || input.equals("o") || input.equals("u");// logic for vowels

            if (input.length() > 1) {// if- else if syntax for single character n error msg display
                System.out.println("Error. Not a single character.");
            } else if (!(uppercase || lowercase)) {
                System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
            } else if (vowels) {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");// remaining consonant
            }
        }

    }

