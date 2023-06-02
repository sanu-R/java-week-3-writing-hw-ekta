package homework;

import java.util.Scanner;

/**
 * Input any alphabet form " A to F" and print their city name accordingly (use if else) if
 * any other alphabet should be in vallid entry USING SWITCH STATEMENT
 */

public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F :");
        String city = scanner.next().toUpperCase();
        Programme_9_PrintCityNameWithSwitch cityName = new Programme_9_PrintCityNameWithSwitch();
        cityName.printCityName(city);
        //Closing the scanner object
        scanner.close();


    }

    //printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Abu");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Derby");
                break;
            case "D":
                System.out.println("Edinburgh");
                break;
            case "E":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }

    }
}
