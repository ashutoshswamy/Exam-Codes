import java.util.Scanner;

public class SeparateSum {
    public static void main(String[] args){
        int num, sum2 = 0, sum3 = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        
        for(int i = 1; i <= 10; i++){
            num = inp.nextInt();
            if(num >= 10 && num <= 99){
                sum2 += num;
            }
            if(num >= 100 && num <= 999){
                sum3 += num;
            }
        }

        System.out.println("Sum of 2 digit numbers: " + sum2);
        System.out.println("Sum of 3 digit numbers: " + sum3);
    }
}
