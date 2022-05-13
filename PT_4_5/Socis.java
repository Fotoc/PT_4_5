package PT_4_5;

import java.sql.SQLException;
import java.util.Scanner;

public class Socis extends Persona{
    private int num_soci;
    private int num_localitat;
    private int quota_aunal;
    
    public void dadesSocis(){
        Socis s1 = new Socis();
        s1.DNI="24861247R";
        s1.nom="Alastor";
        s1.cognoms="Hazbin Garcia";
        s1.telefon=687452012;
        s1.email="alastorh@gmail.com";
        s1.num_localitat=12;
        s1.num_soci=01;
        s1.quota_aunal=200;
        
    }
    
    public void dadesSocis2(){
        Socis s2 = new Socis();
        s2.DNI="01478543Q";
        s2.nom="Charlie";
        s2.cognoms="Morningstar Magne";
        s2.telefon=875410232;
        s2.email="charliemorn@gmail.com";
        s2.num_localitat=9;
        s2.num_soci=02;
        s2.quota_aunal=300;
        
    }
        
    public void dadesSocis3(){
        Socis s3 = new Socis();
        s3.DNI="20584032M";
        s3.nom="Blitzo";
        s3.cognoms="Rodeo Imp";
        s3.telefon=851024523;
        s3.email="blitzimp@gmail.com";
        s3.num_localitat=13;
        s3.num_soci=03;
        s3.quota_aunal=250;
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
