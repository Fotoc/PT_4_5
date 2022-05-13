package PT_4_5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Club {
    private String nom;
    private String CIF;
    private String adreça;
    private String telefon;
    private String email;
    private String www;
    
    public void consultaDades(){
        Club c1 = new Club();
        System.out.println(c1);
        c1.nom="I.M.P";
        c1.CIF="A5804573I";
        c1.adreça="pentagram city";
        c1.telefon="648752106";
        c1.email="impclub@gmail.com";
        c1.www="clubfutbolimp.com";
        
        System.out.println("nom del club: " + c1.nom + " "+ "CIF: " + c1.CIF  + " " + "adreça: " + c1.adreça +  " "+ "telefon: " + c1.telefon + " " + "email: " + c1.email +  " " + "página web: " + c1.www +  " ");
        
        File archivo = new File("club.dat");
         
        try {
           
            FileOutputStream fos = new FileOutputStream(archivo);       
            ObjectOutputStream escribir = new ObjectOutputStream(fos);

            escribir.writeObject(c1);

            escribir.close();
            fos.close();
             
        } catch (Exception e) {
            System.out.println("Error al escriure l'arxiu "
                    + e.getMessage());   
        }
        
        
    }
    
    public void gestionarPlantilla(){
        
    }
    
    public void visualitzarDadesEco(){
        
    }
   
    
}
