package Club;

import java.io.Serializable;
import java.time.LocalDate;

public class Porters extends Jugadors implements Serializable {

    private int gols_aturats;
    private int gols_rebuts;
    private double incentiu_golsA;

    public Porters(int gols_aturats, int gols_rebuts, double incentiu_golsA, int dorsal, boolean titular, LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(dorsal, titular, data_naix, num_empleat, num_seguretat_social, sou_base, DNI, nom, cognoms, telefon, email);
        this.gols_aturats = gols_aturats;
        this.gols_rebuts = gols_rebuts;
        this.incentiu_golsA = incentiu_golsA;
    }

    public Porters(int gols_aturats, int gols_rebuts, double incentiu_golsA, int dorsal, boolean titular) {
        super(dorsal, titular);
        this.gols_aturats = gols_aturats;
        this.gols_rebuts = gols_rebuts;
        this.incentiu_golsA = incentiu_golsA;
    }

    public void calcularSouVariable() {

    }

}
