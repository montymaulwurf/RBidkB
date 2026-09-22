/**
 * Wuerfel 
 * 
* @author GK EF (Abi 2028)
 * @version 08.09.2026
 
 */

public class Wuerfel
{

    // Attribute der Klasse Wuerfel
    private int augenzahl;
    private int seitenzahl;

    /**
     * Konstruktor fuer Objekte der Klasse TWuerfel
     * @param die Seitenzahl des Wuerfels
     */
    public Wuerfel(int pSeitenzahl)
    {
        if(pSeitenzahl < 1)
        {
            throw new IllegalArgumentException(
                "Wie sollte Würfel bitte weniger als 0 Seiten haben bruv"
            );
        }
        seitenzahl = pSeitenzahl;
        werfen();
    }
    
    /**
     * Konstruktor fuer einen sechs-seitigen Wuerfel
     */
    public Wuerfel()
    {
        this(6);
    }

    // Anfang Methoden
    /**
     * Der Wuerfel wird einmal geworfen und seine 
     * Augenzahl damit geaendert
     */
    public int werfen() {
        // ermittle eine Zufallszahl zwischen 1 und seitenzahl 
        // und setze diese in das Attribut augenzahl
        //
        // Die Methode random aus der Klasse Math        
        // erzeugt eine Zufallszahl
        // zwischen 0 und 1 (rationale Zahl)
        augenzahl =  (int) ((Math.random()*seitenzahl)+1);
        return augenzahl;
    }
    
    public int gibAugenzahl()
    {
        return augenzahl;
    }
    
    public int gibSeitenzahl()
    {
        return seitenzahl;
    }

}
