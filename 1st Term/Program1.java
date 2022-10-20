/*
Write a program to accept three sides of a triangle as parameter and check whether it can
form a triangle or not. If it forms a triangle, check whether it is an acute angled, obtuse angled
or right-angled triangle.
*/

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 3 sides: ");
        a = inp.nextInt();
        b = inp.nextInt();
        c = inp.nextInt();

        if(a < b + c && b < a + c && c < a + b) {
            if (a * a < b * b + c * c && b * b < a * a + c * c && c * c < a * a + b * b)
                System.out.println("Acute angled triangle");
            else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b)
                System.out.println("Obtuse angled triangle");
            else
                System.out.println("Right angled triangle");
        } else{
            System.out.println("Cannot form a triangle");
        }
    }
}
