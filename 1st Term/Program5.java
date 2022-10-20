/*
Create a function which accepts an integer as parameter and return the sum of its digits.
Create another function to input 10 integers and find the sum of the digits of each number.
*/

import java.util.Scanner;

class Program5
{
    static int sum(int n)
    {
        int i, s=0, d;
        for(i = n; i > 0; i = i / 10)
        {
            d = i % 10;
            s = s + d;
        }
        return s;
    }
    static void main()
    {
        Scanner inp = new Scanner(System.in);
        int i, s, n;
        System.out.println("Enter 10 numbers: ");
        for(i = 1; i<=10; i++)
        {
            n = inp.nextInt();
            s = sum(n);
            System.out.println("Sum of the digits of " + n + "is " + s);
        }
    }
}
