package PT_4_5;

public class Defenses extends Jugadors{
    private int atacs_aturats;
    private int balons_rebuts;
    private double incentiu_atacsA;
    private double incentiu_balnsR;
    
    public void dades(){
        Defenses d = new Defenses();
        d.atacs_aturats=13;
        d.balons_rebuts=11;
        d.dorsal=6;
        d.incentiu_atacsA=360.10;
        d.incentiu_balnsR=310.99;
        d.titular=false;
        
        Defenses d1 = new Defenses();
        d1.atacs_aturats=18;
        d1.balons_rebuts=15;
        d1.dorsal=4;
        d1.incentiu_atacsA=360.10;
        d1.incentiu_balnsR=310.99;
        d1.titular=true;
    }
    
     public void calcularSouVariable(){
        
    }
    
}
