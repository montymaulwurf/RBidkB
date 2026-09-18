public class Spiel{
    public static void main(String[] args) {

        Waffe eisenSchwert = new Waffe("Eisen", 2);
        Held Gustave = new Held("Gustave", 10, 10, eisenSchwert);
        Monster Francois = new Monster(20, 15);
        Kampfregel NahKampf = new Kampfregel(6, 10);

        Gustave.angreifen(Francois, NahKampf);
        System.out.println(Gustave.getAngriffsErfolg());
        System.out.println(NahKampf.getMonsterAngriff());
        System.out.println(NahKampf.getHeldAngriff());


    }
}