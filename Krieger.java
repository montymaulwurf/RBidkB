public class Krieger extends Held {

    private double ausdauer;

    public Krieger(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe, Double pAusdauer){
        super(pName, pStaerke, pLebenspunkte, pWaffe);
        ausdauer = pAusdauer;

        angriffswertBerechnen();
    }

    public Krieger(String pName, int pStaerke, int pLebenspunkte, Double pAusdauer){
        super(pName, pStaerke, pLebenspunkte);
        ausdauer = pAusdauer;

        angriffswertBerechnen();
    }

    protected void angriffswertBerechnen(){
        super.angriffswertBerechnen();
        angriffswert = super.getAngriffswert() * ausdauer;
    } 
}