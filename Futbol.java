package PT_4_5;

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
                    //consultaDades();
                    break;
                case 2:
                    gestionarSocis();
                    break;
                case 3:
                    //gestionarPlantilla();
                    break;
                case 4:
                    //visualitzarDadesEco();
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
    
      private void gestionarSocis() throws SQLException {
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
            System.out.println("7. Sortir");
            System.out.println("\nTria una opció: ");

            while (!teclat.hasNextLine()) {
                System.out.println("Valor no valid");
                teclat.next();
                System.out.println("Introdueix un número enter");
            }
            int opcio = teclat.nextInt();

            switch (opcio) {
                case 1:
                    
                    break;

                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    enrere = true;
                    break;
                default:
                    System.out.println("L'opció no es vàlida");
            }
        } while (!enrere);

    }
}
