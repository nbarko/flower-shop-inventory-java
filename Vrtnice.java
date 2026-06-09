import java.util.*;
import java.io.*;

// -----------------------------
// Vrtnice
// -----------------------------

public class Vrtnice extends RezanaCvetlica {

    private int dolzinaStebla; // Dodatna lastnost, specifična za vrtnice

    // KONSTRUKTORJI

    // Privzeti – za uporabo pri ročnem vnosu
    public Vrtnice() {}

    // Konstruktor, ki dobi podatke iz vrstice v obliki String[]
    public Vrtnice(String[] p) {
        preberiIzNiza(p); // napolni podatke prek metode
    }

    // S parametri – če bi ročno ustvarjali objekt z vsemi vrednostmi
    public Vrtnice(String ime, double cena, String barva, int kolicina, String datumPrejema, int dolzinaStebla) {
        super(ime, cena, barva, kolicina, datumPrejema);
        this.dolzinaStebla = dolzinaStebla;
    }


    // NADOMEŠČENE METODE

    // Pretvori v zapis za datoteko – dodamo "Vrtnice" na začetek in steblo na konec
    @Override
    public String vrniKotNiz() {
        return "Vrtnice," + ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema + "," + dolzinaStebla;
    }

    // Izpis vseh lastnosti
    @Override
    public void izpisiPodatke() {
        System.out.println("[Vrtnice]");
        System.out.println("Ime: " + ime);
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Količina: " + kolicina);
        System.out.println("Datum prejema: " + datumPrejema);
        System.out.println("Dolžina stebla: " + dolzinaStebla + " cm");
    }

    // Branje podatkov iz niza – uporabimo pri branju iz datoteke
    @Override
    public void preberiIzNiza(String[] p) {
        ime = p[1];
        cena = Double.parseDouble(p[2]);
        barva = p[3];
        kolicina = Integer.parseInt(p[4]);
        datumPrejema = p[5];
        dolzinaStebla = Integer.parseInt(p[6]);
    }
} 