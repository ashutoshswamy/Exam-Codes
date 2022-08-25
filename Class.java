import java.util.Scanner;

public class Class {
    int num1, num2, sum, diff;

    public void inputdata(){    
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = inp.nextInt();
        System.out.print("Enter the second number: ");
        num2 = inp.nextInt();
    }

    public void calculate(){
        sum = num1 + num2;
        diff = num1 - num2;
    }

    public void display(){
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
    }

    public static void main(String[] args){
        Class obj = new Class();
        obj.inputdata();
        obj.calculate();
        obj.display();
    }
}