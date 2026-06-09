import java.util.*;
import java.io.*;

// -----------------------------
// Palme
// -----------------------------

public class Palme extends Loncnica {
    private double visina; // v cm

    // KONSTRUKTORJI

    public Palme() {
        super("", 0, "", 0, "", false); // Palme so zunanje
    }

    public Palme(String[] p) {
        preberiIzNiza(p);
    }

    public Palme(String ime, double cena, String barva, int kolicina, String datumPrejema, double visina) {
        super(ime, cena, barva, kolicina, datumPrejema, false); // Palme so zunanje
        this.visina = visina;
    }

    // METODE

    @Override
    public void preberiIzKonzole(Scanner sc) {
        super.preberiIzKonzole(sc);
        System.out.print("Vnesi višino palme (v cm): ");
        visina = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void preberiIzNiza(String[] p) {
        try {
            // pričakovana struktura:
            // [0]=Palme, [1]=Loncnica, [2]=Areka palma, [3]=18.5, [4]=zelena, [5]=3,
            // [6]=2025-05-20, [7]=false, [8]=150.0
            if (p.length < 9) {
                throw new IllegalArgumentException("Premalo podatkov za palmo: " + Arrays.toString(p));
            }
            ime = p[2];
            cena = Double.parseDouble(p[3]);
            barva = p[4];
            kolicina = Integer.parseInt(p[5]);
            datumPrejema = p[6];
            notranja = Boolean.parseBoolean(p[7]); // lahko bi tudi kar nastavila false
            visina = Double.parseDouble(p[8]);
        } catch (Exception e) {
            System.err.println("Napaka pri branju palme iz niza: " + Arrays.toString(p));
            e.printStackTrace();
        }
    }

    @Override
    public String vrniKotNiz() {
        return "Palme,Loncnica," + ime + "," + cena + "," + barva + "," + kolicina + "," + datumPrejema + "," + notranja + "," + visina;
    }

    @Override
    public void izpisiPodatke() {
        System.out.println("[Palme]");
        super.izpisiPodatke();
        System.out.println("Višina: " + visina + " cm");
    }
}