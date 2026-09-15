
public class Waffe
{   
    private int bonus;
    private String material;
    private int magie;
    
    public Waffe(String pMaterial, int pMagie){
        material = pMaterial;
        magie = pMagie;
        bonusBerechnen();
    }
    
    private int materialWert(String pMaterial) {
        int x = 5;

        if("Stein".equals(pMaterial)){
            return x;
        }
        else if("Bronze".equals(pMaterial)){
            return x*2;
        }
        else if("Eisen".equals(pMaterial)){
            return x*3;
        }
        else{
            return 0;
        }
    }
    
    private void bonusBerechnen(){
        bonus = materialWert(material) + magie;       
    }

    public int getBonus(){
        return bonus;
    }
}