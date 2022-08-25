import java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args){
        int num1 = 86;
        int num2 = 45;
        int minValue = (num1 < num2) ? num1 : num2;
        System.out.println("The smallest number among these two numbers is: " + minValue);
    }
}
