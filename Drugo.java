import java.util.*;
import java.io.*;

// -----------------------------
// Nadrazred - DRUGO
// -----------------------------

public abstract class Drugo extends Izdelek { // Definiramo abstraktni razred "Drugo", ki podeduje iz abstraktnega razreda "Izdelek"

    public Drugo() {  // Privzeti konstruktor brez parametrov
        super(); // Pokliče konstruktor nadrazreda "Izdelek", ki prav tako ne sprejme nobenih parametrov
    }

    public Drugo(String ime, double cena, String barva, int kolicina, String datumPrejema) {
        super(ime, cena, barva, kolicina, datumPrejema); // Konstruktor s parametri, ki vse vrednosti pošlje konstruktorju razreda "Izdelek"
    }

    @Override
    public void preberiIzKonzole(java.util.Scanner sc) { // Nadomestimo metodo iz razreda "Izdelek" za vnos podatkov iz konzole
        super.preberiIzKonzole(sc); // Pokličemo isto metodo iz nadrazreda
    }

    @Override
    public void izpisiPodatke() { // Nadomestimo metodo za izpis podatkov
        super.izpisiPodatke(); // Uporabimo obstoječo implementacijo iz nadrazreda
    }

    @Override
    public String vrniKotNiz() { // Nadomestimo metodo za zapis objekta v obliki niza (za shranjevanje v datoteko)
        return super.vrniKotNiz(); // Uporabimo osnovno logiko iz razreda "Izdelek" – brez dodajanja oznake "Drugo"
    }
}