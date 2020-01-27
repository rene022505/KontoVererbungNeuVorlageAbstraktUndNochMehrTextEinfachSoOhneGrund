public class Girokonto extends Konto {

    private double kreditZinsSatz;
    private double kreditLimit;

    public Girokonto(int nummer, Kunde inhaber, double limit) {
        super(nummer, inhaber);
        this.kreditZinsSatz = 10;
        this.kreditLimit = limit;
    }

    public double rechneKreditZinsen(int tage) {
        if (kontoStand < 0) {
            double x;
            return x = (kontoStand * kreditZinsSatz) / 100 * (tage / 360.0);
        }
        return 0;
    }

    @Override
    public void abheben(double betrag) {
        if (kontoStand + kreditLimit >= betrag) {
            this.kontoStand = this.kontoStand - betrag;
        }
    }

    @Override
    public String zeigeKontoDetails() {
        return "Girokonto";
    }

}
