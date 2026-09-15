public class Held extends Kreatur{
    private String name;
    private int staerke;
    private Waffe waffe;

    public Held(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe){
        name = pName;
        staerke = pStaerke;
        lebenspunkte = pLebenspunkte;
        waffe = pWaffe;

    }
    public Held(String pName, int pStaerke, int pLebenspunkte){
        this(pName, pStaerke, pLebenspunkte, null);
    }

    private void angriffswertBerechnen(){
        angriffswert = staerke + waffe.getBonus();
    }

    public String getName(){
        return name;
    }

    public int getLebenspunkte(){
        return lebenspunkte;
    }

    public void setWaffe(Waffe pWaffe){
        waffe = pWaffe;
    }
    public Waffe getWaffe(){
        return waffe;
    }
}