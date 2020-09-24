package homework_dz9;

public class FractionNumber {
    private int nominator;
    private int denominator;

    public FractionNumber(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public FractionNumber plus(FractionNumber num) {
        int nom = this.nominator * num.getDenominator() + num.getNominator() * this.getDenominator();
        int deNom = this.denominator * num.getDenominator();
        return new FractionNumber(nom, deNom);
    }

    public FractionNumber minus(FractionNumber num) {
        int nom = this.nominator * num.getDenominator() - num.getNominator() * this.getDenominator();
        int deNom = this.denominator * num.getDenominator();
        return new FractionNumber(nom, deNom);
    }

    public FractionNumber multiply(FractionNumber num) {
        int nom = this.nominator * num.getDenominator();
        int deNom = this.denominator * num.getDenominator();
        return new FractionNumber(nom, deNom);
    }

    public FractionNumber devide (FractionNumber num) {
        int nom = this.nominator * num.getDenominator();
        int deNom = this.denominator * num.getNominator();
        return new FractionNumber(nom, deNom);
    }

    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return nominator + "/" + denominator;
    }
}
