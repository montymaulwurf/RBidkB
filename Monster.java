

public class Monster extends Kreatur
{
    public Monster(double pAngriffswert, int pLebenspunkte){
        angriffswert = pAngriffswert;
        lebenspunkte = pLebenspunkte;
        
    }
    
    public double getMonsterAngriffswert() {
        return angriffswert;
    }
    
    public int getMonsterLebenspunkte() {
        return lebenspunkte;
    }
}