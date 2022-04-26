package PT_4_5;

import java.sql.SQLException;
import java.util.Scanner;

public class Socis {
    private int num_soci;
    private int num_localitat;
    private int quota_aunal;
    
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
      
      private void altaS(){
        
}
      
      private void modificacioS(){
        
}
      
      private void baixaS(){
       
}
      
      private void cognoms(){
        
}
      
      private void localitat(){
       
}
      
      private void quota(){
       
}
    
}
