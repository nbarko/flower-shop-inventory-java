// cd ~/Desktop/FIŠ/1.\ letnik/UvP/2025/Seminarska\ naloga

/** IZDELEK
 *      RASTLINJE
 *          RezanaCvetlica (Vrtnice, Tulipani, Zelenje)
 *          Loncnica (Orhideje, Palme)
 *      DRUGO
 *          NagrobneSvece
 *          Voscilnice
 *          Grablje (dolžina, material: lesene, plastične)
 */

 import java.util.*;
 import java.io.*;
 
 public class CvetlicarnaApp {
     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in); // Za branje iz konzole
         ArrayList<Izdelek> zaloga = new ArrayList<>(); // Seznam vseh izdelkov
 
         // Branje podatkov iz zaloga.txt
         File datoteka = new File("zaloga.txt"); // Ustvari objekt za datoteko "zaloga.txt"
         if (datoteka.exists()) { // Preveri, če datoteka obstaja
             BufferedReader br = new BufferedReader(new FileReader(datoteka)); // Pripravi bralnik
             String vrstica;
             while ((vrstica = br.readLine()) != null) { // Bere vrstice dokler ne pride do konca datoteke
                 String[] p = vrstica.split(","); // Razdeli vrstico po vejicah
                 String tip = p[0]; // Prva vrednost je tip izdelka (npr. Vrtnice)
 
                 // Glede na tip ustvari ustrezen objekt
                 switch (tip) {
                     case "Vrtnice": zaloga.add(new Vrtnice(p)); break;
                     case "Tulipani": zaloga.add(new Tulipani(p)); break;
                     case "Zelenje": zaloga.add(new Zelenje(p)); break;
                     case "Orhideje": zaloga.add(new Orhideje(p)); break;
                     case "Palme": zaloga.add(new Palme(p)); break;
                     case "Voscilnice": zaloga.add(new Voscilnice(p)); break;
                     case "NagrobneSvece": zaloga.add(new NagrobneSvece(p)); break;
                     case "Grablje": zaloga.add(new Grablje(p)); break;
                     default: System.out.println("Neznan tip v datoteki: " + tip);
                 }
             }
             br.close(); // Zapre bralnik
         }
 
         int izbira; // Spremenljivka za meni
         do {
             // Meni za uporabnika
             System.out.println("\n--- CVETLIČARNA ---");
             System.out.println("1. Izpis celotne zaloge");
             System.out.println("2. Dodaj nov izdelek");
             System.out.println("3. Išči po imenu");
             System.out.println("4. Izbriši izdelek po imenu");
             System.out.println("5. Shrani in izhod");
             System.out.print("Izbira: ");
             izbira = Integer.parseInt(sc.nextLine()); // Uporabnik vnese
 
             switch (izbira) {
                 case 1:
                     // Izpiši vse izdelke na zalogi
                     for (Izdelek izdelek : zaloga) {
                         izdelek.izpisiPodatke();
                         System.out.println();
                     }
                     break;
 
                 case 2:
                     // Dodaj nov izdelek ročno
                     System.out.print("Vnesi tip (Vrtnice, Tulipani, Zelenje, Orhideje, Palme, Voscilnice, NagrobneSvece, Grablje): ");
                     String tip = sc.nextLine();
                     Izdelek nov = null;
 
                     // Glede na tip ustvari nov prazen objekt
                     switch (tip) {
                         case "Vrtnice": nov = new Vrtnice(); break;
                         case "Tulipani": nov = new Tulipani(); break;
                         case "Zelenje": nov = new Zelenje(); break;
                         case "Orhideje": nov = new Orhideje(); break;
                         case "Palme": nov = new Palme(); break;
                         case "Voscilnice": nov = new Voscilnice(); break;
                         case "NagrobneSvece": nov = new NagrobneSvece(); break;
                         case "Grablje": nov = new Grablje(); break;
                         default: System.out.println("Neznan tip.");
                     }
 
                     if (nov != null) {
                         nov.preberiIzKonzole(sc); // Preberi podatke iz konzole
                         zaloga.add(nov); // Dodaj v seznam
                     }
                     break;
 
                 case 3:
                     // Iskanje po imenu
                     System.out.print("Vnesi ime za iskanje: ");
                     String iskano = sc.nextLine();
                     for (Izdelek i : zaloga) {
                         if (i.ime.equalsIgnoreCase(iskano)) {
                             i.izpisiPodatke();
                         }
                     }
                     break;
 
                 case 4:
                     // Brisanje po imenu
                     System.out.print("Vnesi ime izdelka za brisanje: ");
                     String zaBrisanje = sc.nextLine();
                     Iterator<Izdelek> it = zaloga.iterator();
                     boolean najden = false;
                     while (it.hasNext()) {
                         if (it.next().ime.equalsIgnoreCase(zaBrisanje)) {
                             it.remove();
                             najden = true;
                         }
                     }
                     if (najden) System.out.println("Izdelek izbrisan.");
                     else System.out.println("Izdelek ni bil najden.");
                     break;
 
                 case 5:
                     // Shrani v datoteko
                     BufferedWriter bw = new BufferedWriter(new FileWriter("zaloga.txt"));
                     for (Izdelek i : zaloga) {
                         bw.write(i.vrniKotNiz()); // Zapiši v datoteko kot vrstico
                         bw.newLine();
                     }
                     bw.close();
                     System.out.println("Zaloga shranjena.");
                     break;
 
                 default:
                     System.out.println("Neveljavna izbira.");
             }
         } while (izbira != 5); // Ponovi dokler ni "Izhod"
 
         sc.close(); // Zapri Scanner
     }
 }
 