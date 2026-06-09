import java.util.*;
import java.io.*;

// -----------------------------
// Podrazred - REZANA CVETLICA
// -----------------------------

// Deduje iz "Rastlinje", ki deduje iz "Izdelek"
// Vrtnice, Tulipani, Zelenje

public abstract class RezanaCvetlica extends Rastlinje {


    // KONSTRUKTORJI

    // Privzeti - kliče prazen konstruktor nadrazreda
    public RezanaCvetlica() {
        super(); // pokliče Rastlinje(), ki pokliče Izdelek()
    }

    // S parametri - uporabljen v podrazredih (npr. Vrtnice)
    public RezanaCvetlica(String ime, double cena, String barva, int kolicina, String datumPrejema) {
        super(ime, cena, barva, kolicina, datumPrejema); // inicializacija v nadrazredu
        this.barva = barva; // dodatna inicializacija (če bi bilo potrebno)
    }


    // NADOMEŠČENE METODE

    // Dodaten vnos za "barvo" – čeprav je že zajet v Izdelek, lahko podrazredi to razširijo
    @Override
    public void preberiIzKonzole(Scanner sc) {
        super.preberiIzKonzole(sc);  // prebere osnovne lastnosti
        System.out.print("Vnesi barvo: ");
        barva = sc.nextLine();      // vnos barve (lahko podvojen v praksi)
    }

    // Izpis barve posebej – če želimo poudariti barvo ločeno od preostalega izpisa
    @Override
    public void izpisiPodatke() {
        super.izpisiPodatke();
        System.out.println("Barva: " + barva); // ponovno izpis barve (lahko že v super)
    }

    // Pretvorba v niz – uporabi metodo iz "Izdelek"
    @Override
    public String vrniKotNiz() {
        return super.vrniKotNiz();
    }
} 
