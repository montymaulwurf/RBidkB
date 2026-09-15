public class Held extends Kreatur{
    protected  String name;
    protected  int staerke;
    protected  Waffe waffe;

    public Held(String pName, int pStaerke, int pLebenspunkte, Waffe pWaffe){
        name = pName;
        staerke = pStaerke;
        lebenspunkte = pLebenspunkte;
        waffe = pWaffe;
        angriffswertBerechnen();  
    }

    public Held(String pName, int pStaerke, int pLebenspunkte){
        this(pName, pStaerke, pLebenspunkte, null);
    }

    public void angreifen(Monster monster, Kampfregel kampfregel){
        //kampfregel + angreifen match (idee?)
    }

    protected  void angriffswertBerechnen(){
        angriffswert = staerke + waffe.getBonus();
    } 

    public String getName(){
        return name;
    }

    public int getLebenspunkte(){
        return lebenspunkte;
    }

    public int getHeldAngriffswert() {
        return angriffswert;
    }

    public void setWaffe(Waffe pWaffe){
        waffe = pWaffe;
    }
    public Waffe getWaffe(){
        return waffe;
    }
}