public class Sparkonto extends Konto {

    private double guthabenZinsSatz;

    public Sparkonto(int nummer, Kunde inhaber) {
        super(nummer, inhaber);
        this.guthabenZinsSatz = 0.015;
    }

    public double rechneGuthabenZinsen(int tage) {
        return (kontoStand * guthabenZinsSatz) * (tage / 360.0);

    }

    @Override
    public void abheben(double betrag) {
        if (kontoStand >= betrag) {
            this.kontoStand = this.kontoStand - betrag;
        }
    }

    @Override
    public String zeigeKontoDetails() {
        return "Sparkonto";
    }

}
