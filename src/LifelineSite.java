public class LifelineSite {

    private double getTaxAmount(double base) {
        double tax = base * Site.TAX_RATE * 0.2;
        return tax;
    }

    private double getBaseAmount(double _units, double _rate) {
        return _units * _rate * 0.5;
    }
}
