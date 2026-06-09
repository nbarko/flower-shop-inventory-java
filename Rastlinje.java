import java.util.*;
import java.io.*;

// -----------------------------
// Nadrazred - RASTLINJE
// -----------------------------

// Dedič razreda Izdelek. Od njega dedujejo: RezanaCvetlica, Loncnica
public abstract class Rastlinje extends Izdelek {


    // KONSTRUKTORJI

    // Privzeti - kliče prazni konstruktor razreda Izdelek
    public Rastlinje() {
        super();  // klic konstruktorja Izdelek()
    }

    // S parametri - podrazredi (npr. Vrtnice) ga lahko uporabijo
    public Rastlinje(String ime, double cena, String barva, int kolicina, String datumPrejema) {
        super(ime, cena, barva, kolicina, datumPrejema);
    }


    // NADOMEŠČENE METODE

    // Vnos podatkov iz konzole - kliče metodo iz Izdelek in nato še dodatno za datum
    @Override
    public void preberiIzKonzole(Scanner sc) {
        super.preberiIzKonzole(sc); // vnos za ime, ceno, barvo, količino, datum
        System.out.print("Vnesi datum prejema: ");
        datumPrejema = sc.nextLine();
    }

    // Izpis podatkov – doda še vrstico za datum
    @Override
    public void izpisiPodatke() {
        super.izpisiPodatke();
        System.out.println("Datum prejema: " + datumPrejema);  // lahko podvojeno
    }

    // Pretvori v niz – kar vrne že nadrazred Izdelek
    @Override
    public String vrniKotNiz() {
        return super.vrniKotNiz();
    }
} 