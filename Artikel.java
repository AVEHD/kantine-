
/**
 * Class Artikel.
 * 
 * @author(S) (Adriaan van ELk 332608) && (Tsjeard De Winter 330819)  
 * @version (version 1.2)
 */
public class Artikel
{
    private String naam;
    private double prijs;
 
    /**
     * Een nieuw artikel maken.
     */
    public Artikel(String artikelNaam, double artikelPrijs)
    {
        setNaam(artikelNaam);
        setPrijs(artikelPrijs);
    }
    
    /**
     * De parameterloze constructor.
     */
    public Artikel()
    {
        setNaam("Onbekend");
        setPrijs(0);
    }
 
    /**
     * De artikelnaam achterhalen.
     */
    public String getArtikelNaam()
    {
        return naam; 
    }
 
    /**
     * De artikelnaam wijzigen.
     */
    public void setNaam(String nieuweNaam)
    {
        this.naam = nieuweNaam;   
    }
 
    /**
     * De artikelprijs achterhalen.
     */
    public double getArtikelPrijs()
    {
        return prijs;    
    }    
 
    /**
     * De artikelprijs wijzigen.
     */
    public void setPrijs(double nieuwePrijs)
    {
        this.prijs = nieuwePrijs;    
    }
 
    /**
     * De gegevens van de klasse Artikel afdrukken.
     */
    public void drukAf()
    {
        System.out.println("--------------------------------------------------------------");
        System.out.println("Hieronder worden de gegevens van de klasse Artikel weergeven: ");
        System.out.println("");
        System.out.println("Artikelnaam: " + naam);
        System.out.println("Artikelprijs: " + prijs);
        System.out.println("--------------------------------------------------------------");
    }
}