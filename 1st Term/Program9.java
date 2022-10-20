/*
Create a class with the following methods:
a. boolean prime(int n), which returns true if n is prime otherwise returns false.
b. void call() to input 10 integers using scanner and find the sum of those integers which are
prime numbers using the above method.
*/

import java.util.Scanner;

class Program9
{
    static boolean prime(int n)
    {
        int i, c = 0;
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
                c++;
        }
        if(c == 2)
            return true;
        else
            return false;
    }
    static void call()
    {
        Scanner inp = new Scanner(System.in);
        int n, i, s=0;
        System.out.println("Enter 10 numbers: ");
        for(i = 1; i <= 10; i++)
        {
            n = inp.nextInt();
            if(prime(n) == true)
                s += n;
        }
        System.out.println("Sum of Prime Numbers: " + s);
    }
}