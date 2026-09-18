public class Kampfregel{
    
    private Wuerfel wuerfel1;
    private Wuerfel wuerfel2;

    private double heldAngriff; 
    private double monsterAngriff;

    public Kampfregel (int pWuerfelAugenzahl1, int pWuerfelAugenzahl2){
        wuerfel1 = new Wuerfel(pWuerfelAugenzahl1);
        wuerfel2 = new Wuerfel(pWuerfelAugenzahl2);
    }

    public boolean kampf(Held held, Monster monster){ //this for held
        
        heldAngriff = 0;
        monsterAngriff = 0;

        wuerfel1.werfen();
        wuerfel2.werfen();

        heldAngriff = held.getHeldAngriffswert() * wuerfel1.gibAugenzahl() + wuerfel2.gibAugenzahl();

        wuerfel1.werfen();
        wuerfel2.werfen();

        monsterAngriff = monster.getMonsterAngriffswert() * wuerfel1.gibAugenzahl() + wuerfel2.gibAugenzahl();

        return heldAngriff > monsterAngriff; 

    } 
}