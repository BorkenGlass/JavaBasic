package Hospital;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter patient name: ");
        String name = input.nextLine();
        System.out.println("Enter AdmitDate:YEAR-MM-DD format");
        String adate = input.nextLine();
        System.out.println("Enter Discharge Date:YEAR-MM-DD format");
        String ddate = input.nextLine();
        System.out.println("Enter Relation: ");
        String relation = input.nextLine();
        System.out.println("Enter Bed Type: ");
        String bed = input.nextLine();
        System.out.println("Enter Ward Type: ");
        String ward = input.nextLine();
        System.out.println("Enter Daily Charge: ");
        int charge = input.nextInt();
        Patient patient1 = new Patient(name, LocalDate.parse(adate), LocalDate.parse(ddate), relation);
        Bed bed1 = new Bed(bed, ward, charge);

        HospitalBillingSystem billingSystem = new HospitalBillingSystem();
        double billAmount = billingSystem.calculateBill(patient1, bed1);
        System.out.println(patient1.toString());
        System.out.println("Total Bill "+ billAmount + " Taka Only");
    }
}
