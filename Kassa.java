 import java.util.Iterator;
/**
 * Class Kassa.
 * 
 * @author(S) (Adriaan van ELk 332608) && (Tsjeard De Winter 330819)  
 * @version (version 1.2)
 */

public class Kassa 
{
    private int totaalAantalArtikelen;
    private double totaalHoeveelheidGeld;
    /**
    * Constructor
    */
    public Kassa(KassaRij kassarij) 
    {
        kassarij = new KassaRij();
    } 
    /**
    * vraag het aantal artikelen en de totaalprijs op.
    * De implementatie wordt later vervangen
    * door een echte betaling door de persoon.
    * @param persoon die moet afrekenen
    */
    public void rekenAf(Persoon persoon) 
    {
        totaalAantalArtikelen += aantalArtikelenDienblad(persoon);
        totaalHoeveelheidGeld += totaalprijsDienblad(persoon);
    }
    /**
    * Geeft het aantal artikelen dat de kassa
    * heeft gepasseerd,
    * vanaf het moment dat de methode resetWaarden
    * is aangeroepen.
    * @return aantal artikelen
    */
    public int aantalArtikelen() 
    {
        return totaalAantalArtikelen;
    }   
    /**
    * Geeft het totaalbedrag van alle artikelen die
    * de kassa zijn gepasseerd, vanaf het moment dat de methode
    *resetKassa
    * is aangeroepen.
    * @return hoeveelheid geld in de kassa
    */
    public double hoeveelheidGeldInKassa() 
    {
        return totaalHoeveelheidGeld;
    }
    /**
    * reset de waarden van het aantal gepasseerde artikelen en
    * de totale hoeveelheid geld in de kassa.
    */
    public void resetKassa() 
    {
       totaalAantalArtikelen = 0;
       totaalHoeveelheidGeld = 0;
    }
    /**
     * geeft het aanal artikelen van het dienbad weer.
     */
    public int aantalArtikelenDienblad(Persoon persoon)
    {
        Iterator artikelen = persoon.getDienblad().getArtikelen();
        int aantal = 0;
        while(artikelen.hasNext())
        {
            aantal++;
            artikelen.next();
        }
        return aantal;
    }
    /**
     * geeft de totaalprijs van het dienblad weer.
     */
    public double totaalprijsDienblad(Persoon persoon)
    {
        Iterator<Artikel> artikelen = persoon.getDienblad().getArtikelen();
        double prijs = 0;
        for( ; artikelen.hasNext();)
        {
            prijs += artikelen.next().getArtikelPrijs();
        }
        return prijs;
    }
}
