/*
A cloth showroom has announced the following festival discounts on the purchase of items,
based on the total cost of the items purchased:

Less than 2000 - 5%
2001 and 5000 - 25%
5001 and 10000 - 35%
above 10000 - 50%
*/

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        float tc, d, ap;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the total cost: ");
        tc = inp.nextFloat();

        if(tc <= 2000)
            d= 5 / 100f * tc;
        else if(tc >= 2001 && tc <= 5000)
            d= 25 / 100f * tc;
        else if(tc >= 5001 && tc <= 10000)
            d= 35 / 100f * tc;
        else
            d= 50 / 100f * tc;

        ap = tc - d;
        System.out.println("Amount Payable: " + ap);
    }
}
