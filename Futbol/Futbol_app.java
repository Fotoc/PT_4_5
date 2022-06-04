package Futbol;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Futbol_app {

    public static void main(String args[]) throws SQLException, IOException {
        Futbol f = new Futbol();
        
//        System.out.println(new File(".").getAbsolutePath());
//        if (new File("IMPClub1.dat").exists()){
//            System.out.println("El fitxer existeix");
//        }

        f.gestionarEquip();
        
    }
}
