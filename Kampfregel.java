public class Kampfregel{
    
    private Wuerfel wuerfel6 = new Wuerfel();
    private Wuerfel wuerfel10 = new Wuerfel(10);

    private boolean result; // result == true bedeutet Held Sieg
    private double heldAngriff; 
    private double monsterAngriff;

    public Kampfregel(Held held, Monster monster){
        
        heldAngriff = 0;
        monsterAngriff = 0;

        wuerfel6.werfen();
        wuerfel10.werfen();

        heldAngriff = held.getHeldAngriffswert() * wuerfel10.gibAugenzahl() + wuerfel6.gibAugenzahl();

        wuerfel6.werfen();
        wuerfel10.werfen();

        monsterAngriff = monster.getMonsterAngriffswert() * wuerfel10.gibAugenzahl() + wuerfel6.gibAugenzahl();

        result = heldAngriff > monsterAngriff; //49.17% winchance bei gleichem Angriffswert

    } 
}