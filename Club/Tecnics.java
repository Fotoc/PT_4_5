package Club;

import java.io.Serializable;
import java.time.LocalDate;

public class Tecnics extends Plantilla_club implements Serializable {

    public int anys_experiencia;

    public Tecnics(int anys_experiencia, LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(data_naix, num_empleat, num_seguretat_social, sou_base, DNI, nom, cognoms, telefon, email);
        this.anys_experiencia = anys_experiencia;
    }

    public Tecnics(int anys_experiencia) {
        this.anys_experiencia = anys_experiencia;
    }

}