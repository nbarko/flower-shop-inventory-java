import java.util.*;
import java.io.*;

// -----------------------------
// Tulipani
// -----------------------------

public class Tulipani extends RezanaCvetlica {

    private String sorta; // Dodatna lastnost – sorta tulipana (npr. Darwin, Triumph ...)


    // KONSTRUKTORJI

    // Privzeti – uporaben pri vnosu preko konzole
    public Tulipani() {}

    // Iz niza – uporaben pri branju iz datoteke (pretvori v String[])
    public Tulipani(String[] p) {
        preberiIzNiza(p); // metoda, ki napolni podatke iz niza
    }

    // S parametri – uporaben za inicializacijo
    public Tulipani(String ime, double cena, String barva, int kolicina, String datumPrejema, String sorta) {
        super(ime, cena, barva, kolicina, datumPrejema);
        this.sorta = sorta;
    }


    // NADOMEŠČENE METODE

    // Zapis v niz za shranjevanje
    @Override
    public String vrniKotNiz() {
        return "Tulipani," + ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema + "," + sorta;
    }

    // Izpis lastnosti
    @Override
    public void izpisiPodatke() {
        System.out.println("[Tulipani]");
        System.out.println("Ime: " + ime);
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Količina: " + kolicina);
        System.out.println("Datum prejema: " + datumPrejema);
        System.out.println("Sorta: " + sorta);
    }

    // Napolni objekt iz razdeljene tekstovne vrstice (v String[])
    @Override
    public void preberiIzNiza(String[] p) {
        ime = p[1];
        cena = Double.parseDouble(p[2]);
        barva = p[3];
        kolicina = Integer.parseInt(p[4]);
        datumPrejema = p[5];
        sorta = p[6];
    }
} 
