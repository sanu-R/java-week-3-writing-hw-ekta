package homework;

import java.util.Scanner;

/**
 * Write a java programme to input any year like (ex.2007) and find out if it is leap
 * year or not?
 */

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console.
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeaYear(year);
        scanner.close();

    }

    //Checking is it leap year or not
    public void isItLeaYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        }
        System.out.println("The year " + year + " is leap year ");
        return;
    }
}