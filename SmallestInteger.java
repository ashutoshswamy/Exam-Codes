import java.util.Scanner;

public class SmallestInteger {
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = inp.nextInt();
        System.out.print("Enter the second number: ");
        num2 = inp.nextInt();
        System.out.print("Enter the third number: ");
        num3 = inp.nextInt();
        int smallest = Math.min(num1, num2);
        smallest = Math.min(num2, num3);
        System.out.println("The smallest number among these three numbers is: " + smallest);
    }
}
