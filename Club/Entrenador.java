package Club;

import java.io.Serializable;
import java.time.LocalDate;

public class Entrenador extends Tecnics implements Serializable {

    private int num_trofeus;
    private double incentiu_trofeus;

    public Entrenador(int num_trofeus, double incentiu_trofeus, int anys_experiencia, LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(anys_experiencia, data_naix, num_empleat, num_seguretat_social, sou_base, DNI, nom, cognoms, telefon, email);
        this.num_trofeus = num_trofeus;
        this.incentiu_trofeus = incentiu_trofeus;
    }

    public Entrenador(int num_trofeus, double incentiu_trofeus, int anys_experiencia) {
        super(anys_experiencia);
        this.num_trofeus = num_trofeus;
        this.incentiu_trofeus = incentiu_trofeus;
    }

    public void calcularSouVariable() {

    }
}