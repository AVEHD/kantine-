/**
 * Class KantineSimulatie.
 * 
 * @author(S) (Adriaan van ELk 332608) && (Tsjeard De Winter 330819)  
 * @version (version 1.2)
 */
public class KantineSimulatie
{
    private Kantine kantine;
    /**
     * Constructor
     */
    public KantineSimulatie() 
    {
        kantine = new Kantine();
    }
    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) 
    {
        for(int i = 0; i < dagen; i++ ) 
        {
            int aantalPersonen = 2;
            for(int j= 0; j < 10 + aantalPersonen ;j++)
            {
                kantine.loopPakSluitAan();
            }
            kantine.verwerkRijVoorKassa();
            System.out.println("Dag: " + (i + 1));
            System.out.println("Aantal personen: " + (10 + aantalPersonen));
            System.out.println("Aantal producten verkocht: " + kantine.getKassa().aantalArtikelen());
            System.out.println("Hoeveelheid geld in kassa: " + kantine.getKassa().hoeveelheidGeldInKassa());
            kantine.resetKassa();
        }
    }
}