public class Site {
    public static final double TAX_RATE = 1.13;

    public double getBillableAmount(double _units, double _rate) {
        return getBaseAmount(_units, _rate) + getTaxAmount(getBaseAmount(_units, _rate));
    }

    private double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE;
        return tax;
    }

    private double getBaseAmount(double units, double rate) {
        return units * rate;
    }
}
