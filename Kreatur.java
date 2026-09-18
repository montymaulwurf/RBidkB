public abstract class Kreatur
{
    protected int angriffswert;
    protected int lebenspunkte;

    public void damage(){
        lebenspunkte -= 1;
    }

    public void damage(int x){
        lebenspunkte -= x;
    }
}