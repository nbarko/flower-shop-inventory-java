import java.util.*;
import java.io.*;

// -----------------------------
// Nagrobne Sveče
// -----------------------------

public class NagrobneSvece extends Drugo { // Razred "NagrobneSvece" podeduje vse iz abstraktnega razreda "Drugo"

    private int casGorenja; // Dodatni atribut: čas gorenja sveče (v urah)

    public NagrobneSvece() { // Privzeti konstruktor (brez parametrov)
        super("", 0, "", 0, ""); // Kliče konstruktor nadrazreda "Drugo" z začetnimi praznimi vrednostmi
    }

    public NagrobneSvece(String[] p) { // Konstruktor, ki sprejme podatke iz niza (vrstica iz datoteke)
        preberiIzNiza(p); // Pokliče metodo, ki iz niza polni podatke o sveči
    }

    public NagrobneSvece(String ime, double cena, String barva, int kolicina, String datumPrejema, int casGorenja) {
        super(ime, cena, barva, kolicina, datumPrejema); // Kliče konstruktor nadrazreda 'Drugo'
        this.casGorenja = casGorenja; // Nastavi specifični atribut za ta razred
    }

    @Override
    public String vrniKotNiz() { // Metoda, ki izdelek pretvori v zapisljiv niz (za zapis v datoteko)
        return "NagrobneSvece," + ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema + "," + casGorenja;
    }

    @Override
    public void izpisiPodatke() { // Metoda za izpis podatkov na zaslon
        System.out.println("[Nagrobne sveče]"); // Označimo vrsto izdelka
        System.out.println("Ime: " + ime); // Izpis posameznih podatkov
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Količina: " + kolicina);
        System.out.println("Datum prejema: " + datumPrejema);
        System.out.println("Čas gorenja: " + casGorenja + " ur"); // Specifičen atribut za sveče
    }

    @Override
    public void preberiIzNiza(String[] p) { // Metoda, ki iz niza (vrstice iz datoteke) napolni podatke objekta
        ime = p[1]; // Ime izdelka
        cena = Double.parseDouble(p[2]); // Cena (pretvorba iz niza v double)
        barva = p[3]; // Barva izdelka
        kolicina = Integer.parseInt(p[4]); // Količina (pretvorba iz niza v int)
        datumPrejema = p[5]; // Datum prejema
        casGorenja = Integer.parseInt(p[6]); // Čas gorenja (int)
    }
}