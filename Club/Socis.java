package Club;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class Socis extends Persona {

    private int num_soci;
    private int num_localitat;
    private int quota_aunal;

    HashMap<String, String> soci = new HashMap<String, String>();

    public Socis(int num_soci, int num_localitat, int quota_aunal, String DNI, String nom, String cognoms, int telefon, String email) {
        super(DNI, nom, cognoms, telefon, email);
        this.num_soci = num_soci;
        this.num_localitat = num_localitat;
        this.quota_aunal = quota_aunal;
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

    private void altaS() {
        soci.put("14547058H", new Socis(121, 1, 100, "14547058H", "Alastor", "Hazbin", "628741023", "alastor@gmail.com"));
        soci.put("12389488D", new Socis(122, 2, 200, "12389488D", "Vaggie", "Garcia", "628874589", "vaggie@gmail.com"));
        soci.put("76189996N", new Socis(123, 3, 300, "76189996N", "Blitzo", "Rodeo", "628502348", "blitz@gmail.com"));
        soci.put("76189996N", new Socis(124, 4, 400, "76189996N", "Charlie", "Morningstar", "628754012", "charlie@gmail.com"));

    }

    private void modificacioS() {

    }

    private void baixaS() {

    }

    private void cognoms() {

    }

    private void localitat() {

    }

    private void quota() {

    }

}
