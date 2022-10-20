/*
Create a method which accepts temperature in Celsius and return its Fahrenheit equivalent.
Create another method which accepts temperature in Fahrenheit and return its Celsius
equivalent. Also create a method to invoke the above methods.
*/

import java.util.Scanner;

class Program7
{
    static double CelToFar(double C)
    {
        double F = 9 * C / 5 + 32;
        return F;
    }
    static double FarToCel(double F)
    {
        double C = (F - 32) * 5 / 9;
        return C;
    }
    static void main()
    {
        Scanner inp = new Scanner(System.in);
        double C,F;
        System.out.println("Enter temperature in Celcius: ");
        C = inp.nextDouble();
        F = CelToFar(C);
        System.out.println("Temperature in Farenheit: " + F);
        System.out.println("Enter temperature in Farenheit: ");
        F = inp.nextDouble();
        C = FarToCel(F);
        System.out.println("Temperature in Celcius: " + C);
    }
}