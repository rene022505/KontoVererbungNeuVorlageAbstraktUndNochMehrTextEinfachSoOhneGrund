public class Kunde {

    private String name;
    private String adresse;
    private int geburtsjahr;

    public Kunde(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public String getName() {
        return this.name;
    }

    public String getAdresse() {
        return this.adresse;
    }
}
