package Club;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Plantilla_club extends Persona {

    private LocalDate data_naix;
    private int num_empleat;
    private int num_seguretat_social;
    private double sou_base;

    HashMap<String, Plantilla_club> players = new HashMap<>();

    public Plantilla_club(LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(DNI, nom, cognoms, telefon, email);
        this.data_naix = data_naix;
        this.num_empleat = num_empleat;
        this.num_seguretat_social = num_seguretat_social;
        this.sou_base = sou_base;
    }

    public Plantilla_club() {
    }

    public LocalDate getData_naix() {
        return data_naix;
    }

    public int getNum_empleat() {
        return num_empleat;
    }

    public int getNum_seguretat_social() {
        return num_seguretat_social;
    }

    public double getSou_base() {
        return sou_base;
    }

    public void gestionarPlantilla() throws SQLException {
        Scanner teclat = new Scanner(System.in);
        boolean enrere = false;
        do {
            System.out.println("******MENU GESTIONAR SOCIS******");
            System.out.println("1. Alta");
            System.out.println("2. Modificació");
            System.out.println("3. Baixa");
            System.out.println("4. Visualitzar membres per rol");
            System.out.println("5. Visualitzar membres per sou incentivat");
            System.out.println("6. Enrere");
            System.out.println("\nTria una opció: ");

            while (!teclat.hasNextLine()) {
                System.out.println("Valor no valid");
                teclat.next();
                System.out.println("Introdueix un número enter");
            }
            int opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    altaP();
                    break;

                case 2:
                    modificacioP();
                    break;
                case 3:
                    baixaP();
                    break;
                case 4:
                    rol();
                    break;
                case 5:
                    sou();
                    break;
                case 6:

                    enrere = true;
                    break;
                default:
                    System.out.println("L'opció no es vàlida");
            }
        } while (!enrere);

    }

    private void altaP() {
        //Porter
        players.put("50636879X", new Porters(01, 5, 10.0, 1, false, LocalDate.parse("1985-1-04"), 110, 1, 20.0, "50636879X", "Angel", "Dust", 628754103, "angel@gmail.com"));
        //Davanters
        players.put("66562279A", new Davanters(12, 10, 20.01, 10.16, 02, true, LocalDate.parse("1994-20-10"), 111, 2, 20.00, "66562279A", "Striker", "Gonzalez", 628745103, "striker@gmail.com"));
        players.put("23856515H", new Davanters(14, 12, 20.50, 12.50, 03, true, LocalDate.parse("1982-21-07"), 112, 3, 25.00, "23856515H", "Millie", "Milldred", 628754102, "mills@gmail.com"));
        players.put("38356181R", new Davanters(13, 12, 20.15, 12.11, 04, false, LocalDate.parse("1983-12-06"), 113, 4, 22.00, "38356181R", "Bill", "Cipher", 628741535, "bill@gmail.com"));
        //Defenses
        players.put("44164668E", new Defenses(20, 10, 20.60, 19.02, 05, true, LocalDate.parse("1987-05-12"), 114, 5, 19.00, "44164668E", "Husk", "Rodríguez", 628987451, "husk@gmail.com"));
        players.put("08794422G", new Defenses(19, 12, 20.60, 19.02, 06, false, LocalDate.parse("1984-01-03"), 115, 6, 19.00, "08794422G", "Niffty", "Fernández", 628978453, "niffty@gmail.com"));
        players.put("94688596B", new Defenses(17, 13, 20.60, 19.02, 07, false, LocalDate.parse("1995-20-11"), 116, 7, 19.00, "628754125", "Velvet", "Martínez", 628754125, "velvet@gmail.com"));
        //Migcampistes
        players.put("79989082G", new Migcampistes(6, 11, 16.20, 14.30, 8, false, LocalDate.parse("1991-14-05"), 117, 8, 17.00, "79989082G", "Loona", "Sánchez", 628754158, "loona@gmail.com"));
        players.put("86389802P", new Migcampistes(8, 12, 16.20, 14.30, 9, true, LocalDate.parse("1986-17-04"), 118, 9, 17.00, "86389802P", "Moxxie", "López", 628754845, "moxxie@gmail.com"));
        players.put("93364684W", new Migcampistes(7, 13, 16.20, 14.30, 10, false, LocalDate.parse("1996-25-03"), 119, 10, 17.00, "93364684W", "Verosika", "Mayday", 628754874, "verosika@gmail.com"));

    }

    private void modificacioP() {

    }

    private void baixaP() {

    }

    private void rol() {

    }

    private void sou() {

    }

}
