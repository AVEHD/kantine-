/**
 * Class Persoon.
 * 
 * @author (Adriaan van Elk 332608) 
 * @version (version 1)
 */


public class Persoon
{
    // de velden 
    private int    bsn;// burgerservicenummer
    private String voornm; //Voornaam
    private String achternm; //Achternaam
    private int dagGdatum;
    private int maandGdatum;
    private int jaarGdatum; 
    private char   gslacht; // M/V 
    

    /**
     * Constructor for objects of class Persoon
     */
    public Persoon(int persoonBSN, String persoonVoornaam, String persoonAchternaam, int persoonDagGdatum, int persoonMaandGdatum, int persoonJaarGdatum, char persoonGeslacht)
    {
        // varibalen maken
        bsn          = persoonBSN; 
        voornm       = persoonVoornaam; 
        achternm     = persoonAchternaam; 
        dagGdatum    = persoonDagGdatum; 
        maandGdatum  = persoonMaandGdatum;
        jaarGdatum   = persoonJaarGdatum;
        gslacht      = persoonGeslacht; 
        
    }
    
    /**
     * De parameters voor dagGdatum; 
     */
        public void persoonDagGeboortedatum()
    { 
       if (dagGdatum >= 1){dagGdatum = dagGdatum;}
  
    }
    
    /**
     * De parameters voor maandGdatum;
     */
    public void persoonMaandGdatum()
    {
       if(maandGdatum >= 1 && maandGdatum <= 12)
       {
        maandGdatum = maandGdatum; 
       }
    }
    
    /**
     * De parameters voor jaarGdatum;   
     */
    public void persoonJaarGdatum()
    {
         if(jaarGdatum >= 1900 && jaarGdatum <= 2100) {jaarGdatum = jaarGdatum;}
       }
      
    /**
     * De parameters voor gslacht;
     */
    public void persoonGslacht()
    {
           
       if(gslacht = 'M' || 'V')
            {
                persoonGslacht = persoonGslacht;
            } else{gslacht = "0";}
    }
                            
      
    /**
    * Getter voor geboortedatum
    * @return Geboortedatum 
    */
    public String getGeboorteDatum() {
    String temp;
    if (dagGdatum==0 && maandGdatum==0 && jaarGdatum==0) {
    temp="Onbekend";
    } else {
    temp=dagGdatum+"/"+maandGdatum+"/"+jaarGdatum;
    }
    return temp;
    }
    
    /**
     * getter voor geslacht
     */
    public String getGeslacht() {
        String temp; 
        String tempGslacht = gslacht;
        if (gslacht == 0) {
        temp = "Onbekend" ;
        } else {
            temp = tempGslacht;
        }
        return temp;           
    }
}