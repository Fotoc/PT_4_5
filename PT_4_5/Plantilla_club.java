package PT_4_5;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

public class Plantilla_club {
    private String nom;
    private String DNI;
    private String cognoms;
    private LocalDate data_naix;
    private int telefon;
    private String email;
    private int num_empleat;
    private int num_seguretat_social;
    private double sou_base;
    
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
      
      private void altaP(){
        
}
      
      private void modificacioP(){
        
}
      
      private void baixaP(){
       
}
      
      private void rol(){
        
}
            
      private void sou(){
       
}
    
}
