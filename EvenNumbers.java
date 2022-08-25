import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = inp.nextInt();
        System.out.print("Enter the second number: ");
        num2 = inp.nextInt();
        System.out.print("Enter the third number: ");
        num3 = inp.nextInt();
        System.out.print("Enter the fourth number: ");
        num4 = inp.nextInt();
        System.out.print("Enter the fifth number: ");
        num5 = inp.nextInt();
        System.out.print("Enter the sixth number: ");
        num6 = inp.nextInt();
        System.out.print("Enter the seventh number: ");
        num7 = inp.nextInt();
        System.out.print("Enter the eight number: ");
        num8 = inp.nextInt();
        System.out.print("Enter the ninth number: ");
        num9 = inp.nextInt();
        System.out.print("Enter the tenth number: ");
        num10 = inp.nextInt();

        if(num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0 && num4 % 2 == 0 && num5 % 2 == 0 && num6 % 2 == 0 && num7 % 2 == 0 && num8 % 2 == 0 && num9 % 2 == 0 && num10 % 2 == 0){
            System.out.println("All are even numbers");
        } else{
            System.out.println("All the numbers are not even");
        }
    }
}
