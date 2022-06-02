package Club;

import java.io.Serializable;
import java.time.LocalDate;

public class Jugadors extends Plantilla_club implements Serializable {

    private int dorsal;
    private boolean titular;

    public Jugadors(int dorsal, boolean titular, LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(data_naix, num_empleat, num_seguretat_social, sou_base, DNI, nom, cognoms, telefon, email);
        this.dorsal = dorsal;
        this.titular = titular;
    }

    public Jugadors(int dorsal, boolean titular) {
        this.dorsal = dorsal;
        this.titular = titular;
    }

    public void generar_dorsal() {

    }

}
