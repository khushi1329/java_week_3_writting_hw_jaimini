package week_3_writting_hw;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme_10_DoOperationWithSymbol {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number :");
        int x = scanner.nextInt();
        System.out.println("enter the second number :");
        int y = scanner.nextInt();
        System.out.println("please select the calculation symbol +,-,*,/ : ");
        char symbol = scanner.next().charAt(0);
        DoOperationBySelectingSymbol(x, y, symbol);
        //closing scanner object
        scanner.close();

    }

    //calculating operation based on symbol.
    public static void DoOperationBySelectingSymbol(int x,int y,char Symbol){

        if(Symbol == '+'){
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if(Symbol == '-'){
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if(Symbol == '*') {
            System.out.println(x + " * " + y + " = " + (x * y));
        }else if(Symbol == '/'){
            System.out.println(x + " / " + y + " = " + (x / y));
        }else{
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }

}
