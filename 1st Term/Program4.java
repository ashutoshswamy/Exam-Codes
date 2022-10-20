/*
Create a function which accepts an integer as parameter and return true if it is a palindrome
number or not. In the main() method input 10 integers and print the largest palindrome
number if any.
*/

import java.util.Scanner;

class Program4
{
    static boolean isPal(int n)
    {
        int i, r = 0,d;
        for(i = n; i > 0; i = i / 10)
        {
            d = i % 10;
            r = r * 10 + d;
        }
        if(r==n)
            return true;
        else
            return false;
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i, max = 0, n;
        System.out.println("Enter 10 numbers: ");
        for(i = 1; i <= 10; i++)
        {
            n=sc.nextInt();
            if(isPal(n)==true)
            {
                if(max==0)
                    max=n;
                if(n>max)
                    max=n;
            }
        }
        if(max>0)
            System.out.println("Largest Palindrome Number: "+max);
        else
            System.out.println("No palindrome number present");
    }
}
