import java.util.Scanner;

public class Problem13 {
    static void usdToBdt(Double usd){
        Double bdt = usd * 109.32;
        System.out.println("BDT : "+ bdt);

    }
    static void bdtToUsd(Double bdt){
        Double usd = bdt*0.0091;
        System.out.println("USD : "+usd);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Enter Usd: ");
                Double usd = input.nextDouble();
                usdToBdt(usd);
                break;
        
            case 1:
                System.out.println("Enter Bdt: ");
                Double bdt = input.nextDouble();
                bdtToUsd(bdt);
                break;
            default:
                System.out.println("Invalid Choice.");
        }
        input.close();
    }
}
