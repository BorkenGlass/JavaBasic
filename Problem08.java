import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double celsius = sc.nextDouble();
        Double farenheit = ((9.0/5*celsius)+32);
        System.out.println("Farenheit : "+farenheit);
        sc.close();
    }
}
