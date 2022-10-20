/*
Write a program to input a sentence and count the number of ‘A’ or ‘a’ in it.
*/

import java.util.Scanner;

class Program11
{
    static void main()
    {
        Scanner inp = new Scanner(System.in);
        String s;
        int i, c=0;
        System.out.println("Enter a sentence: ");
        s = inp.nextLine();
        for(i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if (x == 'A' || x == 'a')
            c++;
        }
        System.out.println("No. of A or a: " + c);
    }
}