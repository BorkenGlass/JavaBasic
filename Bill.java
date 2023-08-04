package Hospital;

class HospitalBillingSystem {
    private double familyDiscount = 0.25;
    private double relativeDiscount = 0.1;

    public double calculateBill(Patient patient, Bed bed) {
        long daysStayed = patient.getDaysStayed();
        double totalCharge = bed.getDailyCharge() * daysStayed;

        if (patient.getEmployeeRelation().equals("Employee")) {
            return 0;  // Employees pay no bill
        } else if (patient.getEmployeeRelation().equals("Family")) {
            totalCharge *= (1 - familyDiscount);
        } else if (patient.getEmployeeRelation().equals("Relative")) {
            totalCharge *= (1 - relativeDiscount);
        }

        return totalCharge;
    }
}