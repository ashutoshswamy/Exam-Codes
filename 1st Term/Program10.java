/*
Write a program to count the number of non-blank characters in a given sentence.
*/

import java.util.Scanner;

class Program10
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
            if (x != ' ')
            c++;
        }
        System.out.println("No. of non-blank character: " + c);
    }
}