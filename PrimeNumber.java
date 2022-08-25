import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int number;
        boolean flag = false;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = inp.nextInt();

        for(int i = 2; i <= number / 2; ++i){
            if(number % i == 0){
                flag = true;
            }
        }

        if(flag){
            System.out.println("This is not a prime number");
        } else{
            System.out.println("This is a prime number");
        }
    }
}
