import java.util.LinkedList;
import java.util.ArrayList;
/**
 * Class KassaRij.
 * 
 * @author(S) (Adriaan van ELk 332608) && (Tsjeard De Winter 330819)  
 * @version (version 1.2)
 */
public class KassaRij 
{
    private LinkedList<Persoon> personen;
    /**
     * Constructor
     */
    public KassaRij() 
    {
        personen = new LinkedList<Persoon>();
    }
    /**
     *Thema 1.2 I/TI Leertaak 1 Pagina 7 van 27 * Persoon sluit achter in de rij aan
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) 
    {
        personen.add(persoon);
    }
    /**
     * Indien er een rij bestaat, de eerste Persoon uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() 
    {
        Persoon eerstePersoon;
        if(personen.size() >= 1)
        {
            eerstePersoon = personen.get(0);
            personen.remove(0);
        }
        else
        {
            eerstePersoon = null;
            System.out.println("null");
        }
        return eerstePersoon;
    }
    /**
     * Methode kijkt of er personen in de rij staan.
     * @return Of er wel of geen rij bestaat
     */
    public boolean erIsEenRij() 
    {
        boolean rij;
        if(personen.size() >= 1)
        {
            rij = true;    
        }
        else
        {
            rij = false;    
        }
        return rij;
    }
}