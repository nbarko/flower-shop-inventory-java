import java.util.*;
import java.io.*;

// -----------------------------
// Podrazred - LONČNICA
// -----------------------------

// Podeduje od Rastlinje in dodaja informacijo o tipu lončnice (notranja/zunanja)
public abstract class Loncnica extends Rastlinje {

    protected boolean notranja; // Lončnica notranja (true) ali zunanja (false)

    // KONSTRUKTORJI

    // Privzeti – ročni vnos
    public Loncnica() {
        super(); // Kliče privzeti konstruktor nadrazreda Rastlinje
    }

    // Konstruktor s parametri – uporaben v podrazredih (Orhideje, Palme)
    public Loncnica(String ime, double cena, String barva, int kolicina, String datumPrejema, boolean notranja) {
        super(ime, cena, barva, kolicina, datumPrejema); // Inicializira skupne lastnosti
        this.notranja = notranja; // Doda še specifično lastnost lončnice
    }

    // NADOMEŠČENE METODE

    // Vnos iz konzole z dodatnim vprašanjem za "notranja"
    @Override
    public void preberiIzKonzole(Scanner sc) {
        super.preberiIzKonzole(sc);
        System.out.print("Je lončnica notranja? (true/false): ");
        notranja = Boolean.parseBoolean(sc.nextLine());
    }

    // Izpis podatkov – doda "Tip: notranja/zunanja"
    @Override
    public void izpisiPodatke() {
        System.out.println("[Lončnica]");
        super.izpisiPodatke();
        System.out.println("Tip: " + (notranja ? "Notranja" : "Zunanja"));
    }

    // Zapis v tekstovni niz – vključi tip Loncnica in notranja
    @Override
    public String vrniKotNiz() {
        return "Loncnica," + super.vrniKotNiz() + "," + notranja;
    }

    // Napolni objekt iz podatkovne vrstice (iz datoteke)
    @Override
    public void preberiIzNiza(String[] p) {
        ime = p[1];
        cena = Double.parseDouble(p[2]);
        barva = p[3];
        kolicina = Integer.parseInt(p[4]);
        datumPrejema = p[5];
        notranja = Boolean.parseBoolean(p[6]);
    }
}
