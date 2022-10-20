/*
Write a program to input a sentence and count the number of vowels in it.
*/

import java.util.Scanner;

class Program12
{
    static void main()
    {
        Scanner inp = new Scanner(System.in);
        String s;
        int i, c=0;
        System.out.println("Enter a sentence: ");
        s = inp.nextLine();
        s = s.toUpperCase();
        for(i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if (x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
            c++;
        }
        System.out.println("No. of vowels: " + c);
    }
}