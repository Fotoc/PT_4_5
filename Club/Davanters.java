package Club;

import java.io.Serializable;
import java.time.LocalDate;

public class Davanters extends Jugadors implements Serializable {

    private int gols_marcats;
    private int balons_recuperats;
    private double incentiu_golsM;
    private double incentiu_balonsR;

    public Davanters(int gols_marcats, int balons_recuperats, double incentiu_golsM, double incentiu_balonsR, int dorsal, boolean titular, LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(dorsal, titular, data_naix, num_empleat, num_seguretat_social, sou_base, DNI, nom, cognoms, telefon, email);
        this.gols_marcats = gols_marcats;
        this.balons_recuperats = balons_recuperats;
        this.incentiu_golsM = incentiu_golsM;
        this.incentiu_balonsR = incentiu_balonsR;
    }

    public Davanters(int gols_marcats, int balons_recuperats, double incentiu_golsM, double incentiu_balonsR, int dorsal, boolean titular) {
        super(dorsal, titular);
        this.gols_marcats = gols_marcats;
        this.balons_recuperats = balons_recuperats;
        this.incentiu_golsM = incentiu_golsM;
        this.incentiu_balonsR = incentiu_balonsR;
    }

    public void calcularSouVariable() {

    }

}
