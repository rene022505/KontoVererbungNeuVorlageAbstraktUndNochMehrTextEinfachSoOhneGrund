public class Test {

    public static void main(String[] args) {

        Kunde kundeA = new Kunde("Tim Bauer");
        kundeA.setAdresse("Wiesenweg 12, 69168 Wiesloch");
        kundeA.setGeburtsjahr(1987);

        Kunde kundeB = new Kunde("Helga Schmitt");
        kundeB.setAdresse("Blümchenweg 1, 62391 Heidelberg");
        kundeB.setGeburtsjahr(1992);

        // Erzeugen eines Sparkontos
        Sparkonto kontoA;
        // Kontonummer = 1009, Inhaber = KundeA, Kontostand = 560,60
        kontoA = new Sparkonto(1009, kundeA);
        kontoA.einzahlen(560.6);
        // Einzahlen von 200€ und Ausgabe des neuen Kontostands am Bildschirm
        kontoA.einzahlen(200);
        
        System.out.println("Kunde: " + kontoA.getInhaberName());
        System.out.println("Ihre Kontonummer lautet: " + kontoA.getKontonummer());
        System.out.println("Aktueller Kontostand: " + kontoA.getKontostand());
        System.out.println("");

        // Erzeugen eines Girokontos
        Girokonto kontoB;
        // Kontonummer = 1007, Inhaber = KundeB, Kreditlimit = 1000, Kontostand = 1340
        kontoB = new Girokonto(1007, kundeB, 1000);
        kontoB.einzahlen(1340);
        // Auszahlen von 2000€ und Ausgabe des neuen Kontostands am Bildschirm
        kontoB.abheben(2000);
        
        System.out.println("Kunde: " + kontoB.getInhaberName());
        System.out.println("Ihre Kontonummer lautet: " + kontoB.getKontonummer());
        System.out.println("Aktueller Kontostand: " + kontoB.getKontostand());
        System.out.println("");

        // Berechnung und Anzeige der Zinsen für Konto A
        System.out.println("Guthabenzinsen für KontoA: " + kontoA.rechneGuthabenZinsen(360));
        System.out.println("");
        
        // Berechnung und Anzeige der Zinsen für Konto B
        System.out.println("Sollzinsen für KontoB: " + kontoB.rechneKreditZinsen(30));
        System.out.println("");
        
        System.out.println(kontoB.zeigeKontoDetails());
        System.out.println(kontoA.zeigeKontoDetails());
    }
}
