/*
Define a class Telephone having the following description:

Instance Variables / Data Members:
int prv, pre - to store the previous and present meter reading
int call - to store the calls made (i.e. pre – prv)
String name - to store name of the customer
double amt - to store the amount
double total - to store the total amount to be paid

Member Methods:
void input ( ) - to input the previous reading, present reading and name of the
customer
void cal ( ) - to calculate the amount and total amount to be paid
void display ( ) - to display the name of the customer, calls made, amount and total
amount to be paid in the following format:

Up to 100 calls - No charge
Next 100 calls - 90 paisa per call
Next 200 calls - 80 paisa per call
More than 400 calls - 70 paia per call
 */

import java.util.Scanner;

public class Program3 {
        int prv, pre, call;
        String name;
        double amt, total;

        public void input(){
            Scanner inp = new Scanner(System.in);
            System.out.println("Enter the previous meter reading: ");
            prv = inp.nextInt();
            System.out.println("Enter the present meter reading: ");
            pre = inp.nextInt();
            System.out.println("Enter the name: ");
            name = inp.nextLine();
        }

        public void cal(){
            call = pre - prv;
            if(call <= 100)
                amt = 0;
            else if(call > 100 &&  call <= 200)
                amt = 0 * 100+ (call - 100) * 0.90;
            else if(call > 200 && call <= 400)
                amt = 0 * 100 + 100 * 0.90 + (call - 200) * 0.80;
            else
                amt = 0 * 100+ 100 * 0.90 + 200 * 0.80 + (call - 400) * 0.70;
            total = amt + 180;
        }

        public void display(){
            System.out.println("Name\t\tCalls Made\t\tAmount\t\tTotal Amount");
            System.out.println(name + "\t\t" + call + "\t\t" + amt + "\t\t" + total);
        }

    public static void main(String[] args) {
        Program3 ob = new Program3();
        ob.input();
        ob.cal();
        ob.display();
    }
}
