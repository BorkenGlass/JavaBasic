import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        final Double pi = 3.1416;
        Scanner input = new Scanner(System.in);
        Double Radius = input.nextDouble();
        Double Perimeter = 2*pi*Radius;
        Double Area = pi*Radius*Radius;

        System.out.println("Perimeter: "+Perimeter);
        System.out.println("Area: "+Area);
        input.close();
    }    
}
