package PT_4_5;

import java.io.IOException;
import java.sql.SQLException;

public class Futbol_app {
    public static void main (String args[]) throws SQLException, IOException{
        Futbol f = new Futbol();
        System.out.println(f);
        
        f.gestionarEquip();
    }
}
