package week_3_writting_hw;

import java.util.Scanner;

/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme_2_LeapYear {
    public static void main(String[] args) {

        //scanner declaration for reading input from console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the year");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isITLeapYear(year);
        // closing the scanner object
        scanner.close();

    }

    //checking is it a leap year or not
    public void isITLeapYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("the year " + year + "is a leap year");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");
    }
}
