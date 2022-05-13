package PT_4_5;

public class Migcampistes extends Jugadors{
    private int asistencia_gols;
    private int balons_recuperats;
    private double incentiu_asistenciaG;
    private double incentiu_balonsR;
    
    public void dades(){
        Migcampistes m = new Migcampistes();
        m.asistencia_gols=12;
        m.balons_recuperats=10;
        m.dorsal=3;
        m.incentiu_asistenciaG=213.23;
        m.incentiu_balonsR=240.22;
        m.titular=false;
        
        Migcampistes m1 = new Migcampistes();
        m1.asistencia_gols=15;
        m1.balons_recuperats=8;
        m1.dorsal=7;
        m1.incentiu_asistenciaG=213.23;
        m1.incentiu_balonsR=240.22;
        m1.titular=false;
        
        Migcampistes m2 = new Migcampistes();
        m2.asistencia_gols=18;
        m2.balons_recuperats=22;
        m2.dorsal=8;
        m2.incentiu_asistenciaG=213.23;
        m2.incentiu_balonsR=240.22;
        m2.titular=true;
    }
    
     public void calcularSouVariable(){
        
    }
    
}
