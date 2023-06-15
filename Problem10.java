import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minute = input.nextInt();
        Double hour = minute/60.0;
        int days =(int)(hour/24);
        int year = (days/365);
        System.out.println("Year: "+year);
        days = days - (year*365);
        System.out.println("Days: "+days);
        input.close();
      }
}
