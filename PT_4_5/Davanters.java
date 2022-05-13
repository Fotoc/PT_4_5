package PT_4_5;

public class Davanters extends Jugadors{
    private int gols_marcats;
    private int balons_recuperats;
    private double incentiu_golsM;
    private double incentiu_balonsR;
    
    
    public void dades(){
        Davanters d = new Davanters();
        d.balons_recuperats=20;
        d.dorsal=5;
        d.gols_marcats=18;
        d.incentiu_balonsR=325.20;
        d.incentiu_golsM=420.20;
        d.titular=true;
        
        Davanters d1 = new Davanters();
        d1.balons_recuperats=15;
        d1.dorsal=2;
        d1.gols_marcats=14;
        d1.incentiu_balonsR=325.20;
        d1.incentiu_golsM=420.20;
        d1.titular=false;
    }
    
    public void calcularSouVariable(){
        
    }
    
}
