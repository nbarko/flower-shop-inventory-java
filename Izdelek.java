import java.util.*;
import java.io.*;

// -----------------------------
// Glavni nadrazred - IZDELEK
// -----------------------------

public abstract class Izdelek {

    // POLJA (lastnosti)
    protected String ime; // Ime izdelka (npr. "Vrtnice")
    protected double cena; // Cena izdelka
    protected String barva; // Barva (npr. "rdeča")
    protected int kolicina; // Količina na zalogi
    protected String datumPrejema; // Datum, ko je izdelek prispel


    // KONSTRUKTORJI

    // Privzeti (prazen) konstruktor
    public Izdelek() {
        // Omogoča ustvarjanje praznega objekta
    }

    // Konstruktor s parametri - za ustvarjanje objekta z vrednostmi
    public Izdelek(String ime, double cena, String barva, int kolicina, String datumPrejema) {
        this.ime = ime;
        this.cena = cena;
        this.barva = barva;
        this.kolicina = kolicina;
        this.datumPrejema = datumPrejema;
    }


    // METODE

    // Ročni vnos podatkov v konzolo (vnos novega izdelka)
    public void preberiIzKonzole(Scanner sc) {
        System.out.print("Vnesi ime: ");
        ime = sc.nextLine();

        System.out.print("Vnesi ceno: ");
        cena = Double.parseDouble(sc.nextLine());

        System.out.print("Vnesi barvo: ");
        barva = sc.nextLine();

        System.out.print("Vnesi količino: ");
        kolicina = Integer.parseInt(sc.nextLine());

        System.out.print("Vnesi datum prejema: ");
        datumPrejema = sc.nextLine();
    }

    // Izpis podatkov (pregled zaloge)
    public void izpisiPodatke() {
        System.out.println("Ime: " + ime);
        System.out.println("Cena: " + cena);
        System.out.println("Barva: " + barva);
        System.out.println("Količina: " + kolicina);
        System.out.println("Datum prejema: " + datumPrejema);
    }

    // Zapis podatkov (za shranjevanje v datoteko)
    public String vrniKotNiz() {
        return ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema;
    }

    // Abstraktna metoda - vsak podrazred mora sam definirati, kako bo iz niza p[] prebral podatke
    public abstract void preberiIzNiza(String[] p);
}