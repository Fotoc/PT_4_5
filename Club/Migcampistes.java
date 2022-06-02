package Club;

import java.io.Serializable;
import java.time.LocalDate;

public class Migcampistes extends Jugadors implements Serializable {

    private int asistencia_gols;
    private int balons_recuperats;
    private double incentiu_asistenciaG;
    private double incentiu_balonsR;

    public Migcampistes(int asistencia_gols, int balons_recuperats, double incentiu_asistenciaG, double incentiu_balonsR, int dorsal, boolean titular, LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(dorsal, titular, data_naix, num_empleat, num_seguretat_social, sou_base, DNI, nom, cognoms, telefon, email);
        this.asistencia_gols = asistencia_gols;
        this.balons_recuperats = balons_recuperats;
        this.incentiu_asistenciaG = incentiu_asistenciaG;
        this.incentiu_balonsR = incentiu_balonsR;
    }

    public Migcampistes(int asistencia_gols, int balons_recuperats, double incentiu_asistenciaG, double incentiu_balonsR, int dorsal, boolean titular) {
        super(dorsal, titular);
        this.asistencia_gols = asistencia_gols;
        this.balons_recuperats = balons_recuperats;
        this.incentiu_asistenciaG = incentiu_asistenciaG;
        this.incentiu_balonsR = incentiu_balonsR;
    }

    public void calcularSouVariable() {

    }

}
