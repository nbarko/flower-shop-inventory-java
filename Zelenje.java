import java.util.*;
import java.io.*;

// -----------------------------
// Zelenje
// -----------------------------

// Podrazred razreda RezanaCvetlica
public class Zelenje extends RezanaCvetlica {

    private boolean rezano; // Ali je zelenje rezano (true) ali celo (false)

    // KONSTRUKTORJI

    // Privzeti – uporaben za vnos preko konzole
    public Zelenje() {}

    // Konstruktor iz String[] – uporabimo pri branju iz datoteke
    public Zelenje(String[] p) {
        preberiIzNiza(p);
    }

    // S parametri – uporaben v kodi, če ustvarjamo ročno
    public Zelenje(String ime, double cena, String barva, int kolicina, String datumPrejema, boolean rezano) {
        super(ime, cena, barva, kolicina, datumPrejema);
        this.rezano = rezano;
    }

    // NADOMEŠČENE METODE

    // Zapis v niz – doda tip "Zelenje" in informacijo o rezu
    @Override
    public String vrniKotNiz() {
        return "Zelenje," + ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema + "," + (rezano ? "rezano" : "ne-rezano");
    }

    // Izpis podatkov na zaslon – poleg splošnih lastnosti še "rezano/ne-rezano"
    @Override
    public void izpisiPodatke() {
        System.out.println("[Zelenje]");
        System.out.println("Ime: " + ime);
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Količina: " + kolicina);
        System.out.println("Datum prejema: " + datumPrejema);
        System.out.println("Tip: " + (rezano ? "Rezano" : "V celoti"));
    }

    // Napolni objekt iz razdeljene vrstice – interpretira zadnji element kot boolean
    @Override
    public void preberiIzNiza(String[] p) {
        ime = p[1];
        cena = Double.parseDouble(p[2]);
        barva = p[3];
        kolicina = Integer.parseInt(p[4]);
        datumPrejema = p[5];
        rezano = p[6].equalsIgnoreCase("rezano"); // če piše "rezano", nastavi true
    }
} 
