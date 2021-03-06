/**
 * Class Kantine.
 * 
 * @author(S) (Adriaan van ELk 332608) && (Tsjeard De Winter 330819)  
 * @version (version 1.2)
 */
public class Kantine 
{
    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineaanbod;
    /**
     * Constructor
     */
    public Kantine() 
    {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }
    /**
     * De getter voor de instantie variabele kassa.
     */
    public Kassa getKassa()
    {
        return kassa;
    }
    /**
     * In deze methode wordt een Persoon en Dienblad
     * gemaakt en aan elkaar
     * gekoppeld. Maak twee Artikelen aan en plaats
     * deze op het dienblad.
     * Tenslotte sluit de Persoon zich aan bij de rij
     * voor de kassa.
     */
    public void loopPakSluitAan() 
    {
        Persoon persoon = new Persoon(33, "tjibbe", "achter", 14, 6, 1994, 'M');
        Dienblad dienblad = new Dienblad();
        Artikel artikel1 = new Artikel("bier", 50);
        Artikel artikel2 = new Artikel("kaas", 100);
        persoon.pakDienblad(dienblad);    
        dienblad.voegToe(artikel1);
        dienblad.voegToe(artikel2);
        kassarij.sluitAchteraan(persoon);
    }
    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() 
    {
        while(kassarij.erIsEenRij()) 
        {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
    }
    /**
     * Deze methode reset de bijgehouden telling van
     * het aantal artikelen
     * en "leegt" de inhoud van de kassa.
     */
    public void resetKassa() 
    {
        kassa.resetKassa();
    }
    
    /**
     * Setter voor KantineAanbod
     */
    public void setKantineAanbod(KantineAanbod kantineaanbod)
    {
        this.kantineaanbod = kantineaanbod;
    }
}