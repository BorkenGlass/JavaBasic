package Hospital;
class Bed {
    private String bedType;
    private String wardType;
    private double dailyCharge;

    public Bed(String bedType, String wardType, double dailyCharge) {
        this.bedType = bedType;
        this.wardType = wardType;
        this.dailyCharge = dailyCharge;
    }

    public double getDailyCharge() {
        return dailyCharge;
    }
}