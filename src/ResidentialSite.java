public class ResidentialSite {


    public double getBillableAmount(double _units, double _rate) {
        double base = getBaseAmount(_units, _rate);
        double tax = getTax(base);
        return base + tax;
    }

    private double getTax(double base) {
        double tax = base * Site.TAX_RATE;
        return tax;
    }

    private double getBaseAmount(double _units, double _rate) {
        return _units * _rate;
    }
}
