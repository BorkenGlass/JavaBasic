import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Minute: ");
        Integer minute = input.nextInt();
        System.out.println("Second: ");
        Integer second = input.nextInt();
        System.out.println("Kilometers: ");
        Double km = input.nextDouble();
        Integer ttime = minute*60+second;
        Double hour = ttime/3600.00;
        Double mile =(km/1.6);
        Double speedPerMile = (mile/hour);
        System.out.printf("%.2lf miles per hour.\n",speedPerMile);
        input.close();
    }
}
