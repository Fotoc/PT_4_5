package Club;

import java.io.Serializable;
import java.time.LocalDate;

public class Defenses extends Jugadors implements Serializable {

    private int atacs_aturats;
    private int balons_rebuts;
    private double incentiu_atacsA;
    private double incentiu_balnsR;

    public Defenses(int atacs_aturats, int balons_rebuts, double incentiu_atacsA, double incentiu_balnsR, int dorsal, boolean titular, LocalDate data_naix, int num_empleat, int num_seguretat_social, double sou_base, String DNI, String nom, String cognoms, int telefon, String email) {
        super(dorsal, titular, data_naix, num_empleat, num_seguretat_social, sou_base, DNI, nom, cognoms, telefon, email);
        this.atacs_aturats = atacs_aturats;
        this.balons_rebuts = balons_rebuts;
        this.incentiu_atacsA = incentiu_atacsA;
        this.incentiu_balnsR = incentiu_balnsR;
    }

    public Defenses(int atacs_aturats, int balons_rebuts, double incentiu_atacsA, double incentiu_balnsR, int dorsal, boolean titular) {
        super(dorsal, titular);
        this.atacs_aturats = atacs_aturats;
        this.balons_rebuts = balons_rebuts;
        this.incentiu_atacsA = incentiu_atacsA;
        this.incentiu_balnsR = incentiu_balnsR;
    }

    public void calcularSouVariable() {

    }

}