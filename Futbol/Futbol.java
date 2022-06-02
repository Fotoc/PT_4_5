package Futbol;

import Club.Club;
import Club.Plantilla_club;
import Club.Socis;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Futbol {

    public void gestionarEquip() throws SQLException, IOException {
        boolean sortir = false;
        Scanner teclat = new Scanner(System.in);

        do {
            System.out.println("******MENU EQUIP FUTBOL******");
            System.out.println("1.Consulta dades club");
            System.out.println("2.Gestionar socis");
            System.out.println("3.Gestionar la plantilla");
            System.out.println("4. Visualitzar dades economiques");
            System.out.println("5.Sortir");
            System.out.println("\nTria una de les opcions");

            int opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    consultaDades();
                    break;
                case 2:
                    gestionarSocis();
                    break;
                case 3:
                    gestionarPlantilla();
                    break;
                case 4:
                    visualitzarDadesEco();
                    break;
                case 5:
                    sortir = true;
                    break;
                default:
                    System.out.println("L'Opció no és vàlida");
            }

            System.out.println(("opció: ") + opcio);

        } while (!sortir);
    }

    private void consultaDades() {
        Club c1 = new Club();

        c1.consultaDades();
    }

    private void gestionarSocis() throws SQLException {
        Socis s1 = new Socis();
        s1.gestionarSocis();
    }

    private void gestionarPlantilla() throws SQLException {
        Plantilla_club P1 = new Plantilla_club();

        P1.gestionarPlantilla();
    }

    private void visualitzarDadesEco() {
        Club c1 = new Club();

        c1.visualitzarDadesEco();
    }
}
