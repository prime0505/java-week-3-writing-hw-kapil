/*
 *Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

package java_week3_hw;

import java.util.Scanner;

public class Programme2__LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int year = sc.nextInt();
        Programme2__LeapYear l1= new Programme2__LeapYear();
        l1.IsItleapYear(year);
        sc.close();
    }
    public void IsItleapYear(int year)
    {
        if (year % 4 == 0 && year % 100 !=0 || year% 400 == 0)
        {

            System.out.println("The year " + year + " is leap year ");
            return;
        }
        System.out.println("The year " + year + " is not a leap year ");

    }

}

