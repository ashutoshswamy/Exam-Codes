/*
Create a class with the following methods:
a. int sum(int n), which finds the sum of the digits in n and returns it.
b. void call() to input 10 integers using scanner and find the sum of its digits of each integer
value entered by the user using the above method.
*/

import java.util.Scanner;

class Program8
{
    static int sum(int n)
    {
        int i, d, s = 0;
        for(i=n; i > 0; i = i / 10)
        {
            d = i % 10;
            s += d;
        }
        return s;
    }
    static void call()
    {
        Scanner inp = new Scanner(System.in);
        int n, s, i;
        System.out.println("Enter 10 numbers: ");
        for(i = 1; i <= 10; i++)
        {
            n = inp.nextInt();
            s=sum(n);
            System.out.println("Sum of the digits in: " + n + "is " + s);
        }
    }
}