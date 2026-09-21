public class Held extends Kreatur{
    protected  String name;
    protected  int staerke;
    protected  Waffe waffe;

    protected boolean angriffsErfolg; // true == Held Sieg

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
        angriffsErfolg = kampfregel.kampf(this, monster);
        if(angriffsErfolg == true){
            monster.damage();
        } else {
            this.damage();
        }
    }

    protected void angriffswertBerechnen(){
        angriffswert = staerke + waffe.getBonus();
    } 

    public String getName(){
        return name;
    }

    public int getLebenspunkte(){
        return lebenspunkte;
    }

    public double getHeldAngriffswert() {
        return angriffswert;
    }

    public void setWaffe(Waffe pWaffe){
        waffe = pWaffe;
    }
    public Waffe getWaffe(){
        return waffe;
    }
    public boolean getAngriffsErfolg(){
        return angriffsErfolg;
    }
}