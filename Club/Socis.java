package Club;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Socis extends Persona implements Serializable {

    private int num_soci;
    private int num_localitat;
    private int quota_anual;

    HashMap<String, Socis> soci = new HashMap<>();

    public Socis(int num_soci, int num_localitat, int quota_anual, String DNI, String nom, String cognoms, int telefon, String email) {
        super(DNI, nom, cognoms, telefon, email);
        this.num_soci = num_soci;
        this.num_localitat = num_localitat;
        this.quota_anual = quota_anual;
    }

    public Socis(int num_soci, int num_localitat, int quota_aunal) {
        this.num_soci = num_soci;
        this.num_localitat = num_localitat;
        this.quota_anual = quota_aunal;
    }

    public Map<String, Socis> getSocis() {
        return soci;
    }

    public void setSocis(HashMap<String, Socis> socis) {
        this.soci = socis;
    }

    public Socis() {
    }

    public void gestionarSocis() throws SQLException {
        Scanner teclat = new Scanner(System.in);
        boolean enrere = false;
        do {
            System.out.println("******MENU GESTIONAR SOCIS******");
            System.out.println("1. Alta");
            System.out.println("2. Modificació");
            System.out.println("3. Baixa");
            System.out.println("4. Visualitzar socis per cognoms i noms");
            System.out.println("5. Visualitzar socis per localitat");
            System.out.println("6. Visualitzar socis per quota");
            System.out.println("7. Enrere");
            System.out.println("\nTria una opció: ");

            while (!teclat.hasNextLine()) {
                System.out.println("Valor no valid");
                teclat.next();
                System.out.println("Introdueix un número enter");
            }
            int opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    altaS();
                    break;

                case 2:
                    modificacioS();
                    break;
                case 3:
                    baixaS();
                    break;
                case 4:
                    cognoms();
                    break;
                case 5:
                    localitat();
                    break;
                case 6:
                    quota();
                    break;
                case 7:

                    enrere = true;
                    break;
                default:
                    System.out.println("L'opció no es vàlida");
            }
        } while (!enrere);

    }

    private void altaSoci() {
        soci.put("14547058H", new Socis(121, 1, 100, "14547058H", "Alastor", "Hazbin", 628741023, "alastor@gmail.com"));
        soci.put("12389488D", new Socis(122, 2, 200, "12389488D", "Vaggie", "Garcia", 628874589, "vaggie@gmail.com"));
        soci.put("76189996N", new Socis(123, 3, 300, "76189996N", "Blitzo", "Rodeo", 628502348, "blitz@gmail.com"));
        soci.put("76189996N", new Socis(124, 4, 400, "76189996N", "Charlie", "Morningstar", 628754012, "charlie@gmail.com"));

    }

    public void altaS() {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Alta un soci");

        System.out.println("\nIntrodueixi el DNI:");
        String dni = teclat.nextLine();

        System.out.println("\nIntrodueixi el nom:");
        String nom = teclat.nextLine();

        System.out.println("\nIntrodueixi els cognoms:");
        String cognoms = teclat.nextLine();

        System.out.println("\nIntrodueixi el número de telèfon:");
        int telefon = teclat.nextInt();
        teclat.nextLine();

        System.out.println("\nIntrodueixi el email:");
        String email = teclat.nextLine();

        System.out.println("\nIntrodueixi la quota anual:");
        int quota_anual = teclat.nextInt();

        System.out.println("\nIntrodueix el numero de soci");
        int num_soci = teclat.nextInt();

        System.out.println("\nIntrodueix la seva localitat");
        int num_localitat = teclat.nextInt();

        soci.put(dni,
                new Socis(num_soci, num_localitat, quota_anual, dni, nom, cognoms, telefon, email));

        System.out.println(
                "Felicitats: " + dni + " ja formes part de nosaltres");

    }

    private void modificacioS() {

    }

    private void baixaS() {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Baixa d'un soci");

        System.out.print("DNI del soci que se vol donar de baixa: ");
        String DNI = teclat.nextLine();
        if (soci.containsKey(DNI)) {
            soci.remove(DNI);
            System.out.println("\nEl soci : " + DNI+  " ha sigut eliminat");
        } else {
            System.out.println("El soci amb aquest DNI no ha existit mai");
        }

    }

    private void cognoms() {

    }

    private void localitat() {

    }

    private void quota() {

    }

}
