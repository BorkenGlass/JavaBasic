import java.util.Scanner;
import java.lang.Math;
public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int p = 0;
        final int q = 0;
        System.out.println("Enter the Radius: ");
        Double radius = sc.nextDouble();
        System.out.println("Enter the Point x,y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        Double distance = Math.sqrt((x-p)*(x-p)+(y-q)*(y-q));
        if(distance<=radius){
            System.out.println("Point is inside the circle.");
        }
        else{
            System.out.println("Point is outside the circle.");
        }
        sc.close();
    }
}
