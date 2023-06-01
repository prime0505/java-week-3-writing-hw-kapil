package java_week3_hw;

import java.util.Scanner;

public class Programme6_OddEven
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number you want to check: " );
        int number= sc.nextInt();
        Programme6_OddEven p6 = new Programme6_OddEven();
        System.out.println(number + " is " + p6. IsItEvenOrOdd(number) + " number");
        sc.close();


    }
    public String IsItEvenOrOdd(int number)
    {
        if(number % 2 ==0)
        {
            return "even";

        }
        else
        {
            return "odd";
        }
    }
}
