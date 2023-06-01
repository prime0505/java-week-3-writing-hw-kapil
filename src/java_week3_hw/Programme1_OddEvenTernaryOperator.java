/* 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)

 * */
package java_week3_hw;

import java.util.Scanner;

public class Programme1_OddEvenTernaryOperator
{
    public static void main(String[] args)
    {
     // Scanner declaration for reading input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number= sc.nextInt();
        isItOddOrEvenNumber(number);
        sc.close();

    }
    public  static void isItOddOrEvenNumber( int number)
    {
        // ternary operator is used .
        String evenOrOdd = (number%2==0)? "even":"odd";
        System.out.println(" The " +number+" is " +evenOrOdd+ " number ");
    }
}
