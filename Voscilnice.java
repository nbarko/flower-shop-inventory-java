import java.util.*;
import java.io.*;

// -----------------------------
// Voščilnice
// -----------------------------

public class Voscilnice extends Drugo { // Razred Voscilnice podeduje vse iz nadrazreda Drugo

    private String priloznost; // Dodatni atribut: za katero priložnost je voščilnica

    public Voscilnice() { // Privzeti konstruktor (brez parametrov)
        super("", 0, "", 0, ""); // Pokliče konstruktor nadrazreda z začetnimi praznimi vrednostmi
    }

    public Voscilnice(String[] p) { // Konstruktor, ki sprejme podatke kot tabelo nizov (vrstica iz datoteke)
        preberiIzNiza(p); // Napolni podatke iz tabele nizov
    }

    public Voscilnice(String ime, double cena, String barva, int kolicina, String datumPrejema, String priloznost) {
        super(ime, cena, barva, kolicina, datumPrejema); // Pokliče konstruktor nadrazreda
        this.priloznost = priloznost; // Nastavi specifični atribut "priloznost"
    }

    @Override
    public String vrniKotNiz() { // Metoda, ki vrne niz za zapis v datoteko
        return "Voscilnice," + ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema + "," + priloznost;
    }

    @Override
    public void izpisiPodatke() { // Metoda za izpis podatkov o voščilnici
        System.out.println("[Voščilnice]"); // Označi vrsto izdelka
        System.out.println("Ime: " + ime); // Izpis osnovnih podatkov
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Količina: " + kolicina);
        System.out.println("Datum prejema: " + datumPrejema);
        System.out.println("Priložnost: " + priloznost); // Izpis specifičnega podatka
    }

    @Override
    public void preberiIzNiza(String[] p) { // Metoda, ki prebere vrednosti iz niza (npr. iz datoteke)
        ime = p[1]; // Ime izdelka
        cena = Double.parseDouble(p[2]); // Cena (pretvorba iz String v double)
        barva = p[3]; // Barva izdelka
        kolicina = Integer.parseInt(p[4]); // Količina (pretvorba iz String v int)
        datumPrejema = p[5]; // Datum prejema
        priloznost = p[6]; // Priložnost (npr. rojstni dan, poroka)
    }
}