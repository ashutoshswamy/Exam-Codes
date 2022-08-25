import java.util.Scanner;

public class SquarePerimeter{
    public static void main(String[] args){
        double area, side, perimeter;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the area of the sqaure: ");
        area = inp.nextDouble();
        side = Math.sqrt(area);
        perimeter = side * 4;
        System.out.println("Side of the square: " + side);
        System.out.println("Perimeter of the square: " + perimeter);
    }
}