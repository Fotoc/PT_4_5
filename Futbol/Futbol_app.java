package Futbol;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.SQLException;

public class Futbol_app {

    public static void main(String args[]) throws SQLException, IOException {
        Futbol f = new Futbol();

        File club = new File("club.dat");
        try {

            FileOutputStream fos = new FileOutputStream(club);
            ObjectOutputStream dades = new ObjectOutputStream(fos);

            dades.writeObject(soci);

            dades.close();
            fos.close();

        } catch (Exception e) {
            System.out.println("Error al afegir les dades al arxiu."
                    + e.getMessage());
        }
        f.gestionarEquip();

    }
}
