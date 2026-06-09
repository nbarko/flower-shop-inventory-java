import java.util.*;
import java.io.*;

// -----------------------------
// Orhideje
// -----------------------------

// Deduje iz "Loncnica" (< "Rastlinje" < "Izdelek")
public class Orhideje extends Loncnica {

    private int steviloCvetov; // Dodatna lastnost: število cvetov na lončnici

    // KONSTRUKTORJI

    // Privzeti – ročni vnos
    public Orhideje() {
        super("", 0, "", 0, "", true); // Vedno notranja
    }

    // Za branje iz niza (iz datoteke)
    public Orhideje(String[] p) {
        preberiIzNiza(p); // Napolni vrednosti na osnovi niza
    }

    // S parametri – uporaben za ustvarjanje objekta z vsemi podatki
    public Orhideje(String ime, double cena, String barva, int kolicina, String datumPrejema, int steviloCvetov) {
        super(ime, cena, barva, kolicina, datumPrejema, true); // Vedno notranja
        this.steviloCvetov = steviloCvetov;
    }

    // NADOMEŠČENE METODE

    // Pretvorba v niz za zapis v datoteko
    @Override
    public String vrniKotNiz() {
        return "Orhideje," + ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema + "," + steviloCvetov;
    }

    // Izpis podatkov
    @Override
    public void izpisiPodatke() {
        System.out.println("[Orhideje]");
        System.out.println("Ime: " + ime);
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Količina: " + kolicina);
        System.out.println("Datum prejema: " + datumPrejema);
        System.out.println("Število cvetov: " + steviloCvetov);
    }

    // Branje podatkov iz niza
    @Override
    public void preberiIzNiza(String[] p) {
        ime = p[1];
        cena = Double.parseDouble(p[2]);
        barva = p[3];
        kolicina = Integer.parseInt(p[4]);
        datumPrejema = p[5];
        steviloCvetov = Integer.parseInt(p[6]);
        notranja = true; // Ker so vse orhideje notranje lončnice
    }
}
