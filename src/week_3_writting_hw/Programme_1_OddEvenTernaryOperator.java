package week_3_writting_hw;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration to read input foim console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the number :");
        int number = scanner.nextInt();
        IsItOddOrEvenNumber(number);
        //closing scanner object
        scanner.close();

    }

        //Checking number is even or odd
    public static void IsItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
