package homework;

import java.util.Scanner;

/**
 * Write a programme that tells us input value is number or an alphabet
 * or symbol.
 */

public class Programme_12_FindInputValue {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character or number or symbol : ");
        char ch = scanner.next().charAt(0);
        //object creation
        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputISAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();


    }

    //Find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputISAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT");

        } else {
            System.out.println(ch + " is a SYMBOL");
        }


    }


}