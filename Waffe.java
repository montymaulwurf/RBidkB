
public class Waffe
{   
    private double bonus;
    private String material;
    private double magie;
    
    public Waffe(String pMaterial, double pMagie){
        material = pMaterial;
        magie = pMagie;
        bonusBerechnen();
    }
    
    private double materialWert(String pMaterial) {
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

    public double getBonus(){
        return bonus;
    }
}