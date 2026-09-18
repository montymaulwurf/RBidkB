public class Krieger extends Held {

    private double ausdauer;

    public Krieger(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe, Double pAusdauer){
        super(pName, pStaerke, pLebenspunkte, pWaffe);
        ausdauer = pAusdauer;
    }

    public Krieger(String pName, int pStaerke, int pLebenspunkte, Double pAusdauer){
        super(pName, pStaerke, pLebenspunkte);
        ausdauer = pAusdauer;
    }
    //overwritten Angriffswert function
}