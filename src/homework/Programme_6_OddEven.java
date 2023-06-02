package homework;

import java.util.Scanner;

/**
 * write a java programme to input any number and find out if it 's odd or even.
 */

public class Programme_6_OddEven {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number your want to check :");
        int number = scanner.nextInt();
        Programme_6_OddEven oddEven = new Programme_6_OddEven();
        System.out.println(number + " is " + oddEven.isItEvenOrOddNumber(number) + " number");
        //Closing the scanner object
        scanner.close();


    }

    //Checking the odd or even
    public String isItEvenOrOddNumber(int number) {
        if (number % 2 == 0) {
            return "Even";


        } else {
            return "Odd";

        }

    }
}
