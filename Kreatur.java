public abstract class Kreatur
{
    protected double angriffswert;
    protected int lebenspunkte;

    public void damage(){
        lebenspunkte -= 1;
    }

    public void damage(int x){
        lebenspunkte -= x;
    }
    
    public int getLebenspunkte(){
        return lebenspunkte;
    }
    
    public double getAngriffswert() {
        return angriffswert;
    }
    
}