public class ResidentialSite {

    public double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE;
        return tax;
    }

    public double getBaseAmount(double _units, double _rate) {
        return _units * _rate;
    }
}
