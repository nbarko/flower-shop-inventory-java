import java.util.*;
import java.io.*;

// -----------------------------
// Grablje
// -----------------------------

public class Grablje extends Drugo {
    private int dolzina; // Dolžina v cm
    private String material; // "lesene" ali "plastične"

    public Grablje() { // Privzeti konstruktor (brez parametrov)
        super("", 0, "", 0, ""); // Pokliče konstruktor nadrazreda z začetnimi praznimi vrednostmi
    }

    public Grablje(String[] p) { // Konstruktor, ki sprejme podatke kot tabelo nizov (vrstica iz datoteke)
        preberiIzNiza(p); // Napolni podatke iz tabele nizov
    }

    public Grablje(String ime, double cena, String barva, int kolicina, String datumPrejema, int dolzina, String material) {
        super(ime, cena, barva, kolicina, datumPrejema); // Pokliče konstruktor nadrazreda (v tem primeru "Drugo")
        this.dolzina = dolzina; // Nastavi specifični atribut: dolžina
        this.material = material; // Nastavi specifični atribut: material
    }

    @Override
    public String vrniKotNiz() { // Metoda, ki vrne niz za zapis v datoteko
        return "Grablje," + ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema + "," + dolzina + "," + material;
    }

    @Override
    public void izpisiPodatke() { // Metoda za izpis podatkov
        System.out.println("[Grablje]"); // Označi vrsto izdelka (Grablje)
        System.out.println("Ime: " + ime);
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Količina: " + kolicina);
        System.out.println("Datum prejema: " + datumPrejema);
        System.out.println("Dolžina: " + dolzina + " cm"); // Izpis specifičnega atributa dolžina
        System.out.println("Material: " + material); // Izpis specifičnega atributa material
    }

    @Override
    public void preberiIzNiza(String[] p) { // Metoda, ki prebere podatke iz niza (iz datoteke)
        ime = p[1]; // Ime izdelka
        cena = Double.parseDouble(p[2]); // Cena (pretvorba iz String v Double)
        barva = p[3]; // Barva
        kolicina = Integer.parseInt(p[4]); // Količina
        datumPrejema = p[5]; // Datum prejema
        dolzina = Integer.parseInt(p[6]); // Dolžina v cm
        material = p[7]; // Material
    }

    @Override
    public void preberiIzKonzole(Scanner sc) { // Metoda za ročni vnos podatkov v konzolo
        super.preberiIzKonzole(sc);
        System.out.print("Vnesi dolžino (v cm): ");
        dolzina = Integer.parseInt(sc.nextLine());
        System.out.print("Vnesi material (lesene/plastične): ");
        material = sc.nextLine();
    }
}