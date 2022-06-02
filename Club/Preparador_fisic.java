package Club;

import java.time.LocalDate;

public class Preparador_fisic extends Tecnics {

    private double incentiu_anysEX;

    public Preparador_fisic(double incentiu_anysEX, int anys_experiencia, LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(anys_experiencia, data_naix, num_empleat, num_seguretat_social, sou_base, DNI, nom, cognoms, telefon, email);
        this.incentiu_anysEX = incentiu_anysEX;
    }

    public Preparador_fisic(double incentiu_anysEX, int anys_experiencia) {
        super(anys_experiencia);
        this.incentiu_anysEX = incentiu_anysEX;
    }

    public void calcularSouVariable() {

    }

}
