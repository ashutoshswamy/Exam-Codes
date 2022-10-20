/*
Write a method to accept a name as parameter and print its initials.
Example,
Parameter-> AJAY PRATAP SINGH
Output-> A.P.S.
*/

import java.util.Scanner;

class Program14
{
    static void main(String n)
    {
        int i;
        n = "" + n.trim();
        n = n.toUpperCase();
        for(i = 0; i < n.length() - 1; i++)
        {
            if (n.charAt(i) == ' ' && n.charAt(i+1) != ' ')
                System.out.print(n.charAt(i+1) + ".");
        }
    }
}

