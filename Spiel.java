import java.util.Scanner;

public class Spiel{
    public static void main(String[] args) {

        Scanner heldErstellenEingabe = new Scanner(System.in);
        System.out.println("Heldenname");  //  +Heldentyp ('Krieger' oder 'Zauberer')

        String heldErsteller = heldErstellenEingabe.nextLine(); 
        
        
        Waffe eisenSchwert = new Waffe("Eisen", 2);
        Held held = new Held(heldErsteller, 10, 10, eisenSchwert);
        Monster monster = new Monster(20, 15);
        Kampfregel NahKampf = new Kampfregel(6, 10);

        Krieger krieger = new Krieger("KriegerName", 10, 10, eisenSchwert,1.5);

        while(held.getLebenspunkte() > 0 || monster.getLebenspunkte() > 0){
            
            held.angreifen(monster, NahKampf);
        
            System.out.println("Monster : " + NahKampf.getMonsterAngriff());

            System.out.println(held.getName() + " : " + NahKampf.getHeldAngriff());

            if(held.getAngriffsErfolg() == true){
                System.out.println(held.getName() + "Treffer");
            } else{
                System.out.println("Monster Treffer");
            }
            System.out.println();
        }

        //System.out.println(krieger.getHeldAngriffswert());
    }
}