import java.util.*;

public class Turnier 
{
    private Monster[] monster;
    private Held[] held;
    private Wuerfel wuerfel6 = new Wuerfel(6);
    private Wuerfel wuerfel10 = new Wuerfel(10);
    
    private Kreatur[][] matchups;
    private int anzahlKreaturen;
    
    
    public Turnier(int pAnzahlRunden)
    {   
        anzahlKreaturen = (int) Math.pow(2, pAnzahlRunden);
        
        monster = new Monster[anzahlKreaturen / 2];
        held = new Held[anzahlKreaturen / 2];
        
        for(int i = 0; i < 8; i++){
            monster[i] = new Monster(wuerfel6.werfen() + wuerfel10.werfen(), wuerfel6.werfen() + wuerfel10.werfen());
            held[i] = new Held(
                String.valueOf((char) (i+97)),
                wuerfel6.werfen() + wuerfel10.werfen(),
                wuerfel6.werfen() + wuerfel10.werfen()
            );
        }
    }
    
    public void createBracket(){
        Kreatur[] bracket = new Kreatur[anzahlKreaturen];
        System.arraycopy(held, 0, bracket, 0, held.length);
        System.arraycopy(monster, 0, bracket, held.length, monster.length);
        matchups = new Kreatur[anzahlKreaturen / 2][2];
        
    }
    
    public Held getRandomHeld(){
        return held[(int) (Math.random() * anzahlKreaturen / 2)];
    }
    
    public Monster getRandomMonster(){
        return monster[(int) (Math.random() * anzahlKreaturen / 2)];
    }
    
    private void sortiereHeldenStaerke(){
        held = Sortierer.sort(held, held -> held.getHeldStaerke());
    }
    
    private void sortiereHeldenLeben(){
        held = Sortierer.sort(held, held -> held.getLebenspunkte());
    }
    
    public void printHelden(){
        for(int i = 0 ; i < 8 ; i++){
            System.out.println("Name :" + held[i].getName());
            System.out.println("Stärke :" + held[i].getHeldStaerke());
            System.out.println("Lebenspunkte :" + held[i].getLebenspunkte());
            System.out.println("Angriffswert :" + held[i].getAngriffswert());
            System.out.println();
        }
    }
    
    public Held getHeldMitXHp(int x){
        
        for(int i = 0; i < 8; i++){
            if(i == x){
                return held[i];
            }
        }
        return null;
    }
}