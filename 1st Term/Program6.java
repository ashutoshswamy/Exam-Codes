/*
Create a function which accepts an integer as parameter and return the largest digit. Create
another function to input 10 integers and find the sum of the largest digit of each number.
*/

import java.util.Scanner;

class Program6 {
    static int largest(int n) {
        int i, max = 0, d;
        for (i = n; i > 0; i = i / 10) {
            d = i % 10;
            if (d > max)
                max = d;
        }
        return max;
    }

    static void main() {
        Scanner inp = new Scanner(System.in);
        int i, s = 0, n, max;
        System.out.println("Enter 10 numbers: ");
        for (i = 1; i <= 10; i++) {
            n = inp.nextInt();
            max = largest(n);
            s += max;
        }
        System.out.println("Sum = " + s);
    }
}