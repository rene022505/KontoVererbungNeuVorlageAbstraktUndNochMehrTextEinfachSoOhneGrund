public abstract class Konto {

    protected int kontoNummer;
    protected double kontoStand;
    protected Kunde inhaber;

    /*
     * Konstruktoren
     */
    public Konto(int nummer, Kunde inhaber) {
        this.kontoNummer = nummer;
        this.inhaber = inhaber;
    }

    /*
     * Methoden
     */
    public abstract String zeigeKontoDetails();
    
    public void einzahlen(double betrag) {
        this.kontoStand = this.kontoStand + betrag;
    }

    public abstract void abheben(double betrag);

    public double kontoStandAbfragen() {
        return this.kontoStand;
    }

    public void setInhaber(Kunde inhaber) {
        this.inhaber = inhaber;
    }

    public int getKontonummer() {
        return this.kontoNummer;
    }

    public double getKontostand() {
        return this.kontoStand;
    }

    public Kunde getInhaber() {
        return this.inhaber;
    }

    // Methode, welche nur den Name des Kontoinhabers zurück liefert
    public String getInhaberName() {

        return this.inhaber.getName();
    }       
    
    
}
