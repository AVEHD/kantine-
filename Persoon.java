import java.util.ArrayList;
/**
 * Class Persoon.
 * 
 * @author(S) (Adriaan van ELk 332608) && (Tsjeard De Winter 330819)  
 * @version (version 1.2)
 */


public class Persoon
{
    private int burgerservicenummer; //BurgreServiceNummer
    private String voornaam;
    private String achternaam;
    private int geboortedag;
    private int geboortemaand;
    private int geboortejaar;
    private char geslacht;
    private Dienblad hetDienblad;
    
    /**
     * Een nieuw persoon maken.
     */
    public Persoon(int persoonBurgerservicenummer, String persoonVoornaam, String persoonAchternaam, int persoonGeboortedag, int persoonGeboortemaand, int persoonGeboortejaar, char persoonGeslacht)
    {
       setBurgerservicenummer(persoonBurgerservicenummer);
       setVoornaam(persoonVoornaam);
       setAchternaam(persoonAchternaam);
       setGeslacht(persoonGeslacht);
      
       setDatum(persoonGeboortedag, persoonGeboortemaand, persoonGeboortejaar);
       setMaandatumDag(geboortemaand, geboortedag, geboortejaar);
    }
    
    /**
     * De parameterloze constructor.
     */
    public Persoon()
    {
        setBurgerservicenummer(0);
        setVoornaam("Onbekend");
        setAchternaam("Onbekend");
        setDatum(0,0,0);
        setGeslacht(' ');
        
    }

    /**
      * De setter van het burgerservicenummer.
      */
    public void setBurgerservicenummer(int nieuwBurgerservicenummer)
    {
        this.burgerservicenummer = nieuwBurgerservicenummer;
    }
        
    /**
      *De setter van de voornaam.
      */
    public void setVoornaam(String nieuwVoornaam)
    {
       this.voornaam = nieuwVoornaam;
    }
        
    /**
      * De setter van de achternaam.
      */
    public void setAchternaam(String nieuwAchternaam)
    {
        this.achternaam = nieuwAchternaam;
    }
        
    /**
      * De setter van de geboortedatum.
      */
    public void setDatum(int nieuwDag, int nieuwMaand, int nieuwJaar)
    {
        if((nieuwDag >= 1)
        && (nieuwMaand >= 1 && nieuwMaand <= 12)
        && (nieuwJaar >= 1900 && nieuwJaar <= 2100))
        {
            geboortedag = nieuwDag;
            geboortemaand = nieuwMaand;
            geboortejaar = nieuwJaar;
        }
        else
        {
            geboortedag = 0;
            geboortemaand = 0;
            geboortejaar = 0;
            System.out.println("U heeft uw geboortedatum onjuist ingevuld!");
        }
    }
        
    
    /**
      * De setter voor de maand en dag.
      */
    public void setMaandatumDag(int datumMaand, int datumDag, int datumJaar)
    {
        if(datumMaand == 1  && datumDag >31 && datumJaar >= 1
        || datumMaand == 3  && datumDag >31 && datumJaar >= 1
        || datumMaand == 5  && datumDag >31 && datumJaar >= 1
        || datumMaand == 7  && datumDag >31 && datumJaar >= 1
        || datumMaand == 8  && datumDag >31 && datumJaar >= 1
        || datumMaand == 10 && datumDag >31 && datumJaar >= 1
        || datumMaand == 12 && datumDag >31&& datumJaar >= 1
        || datumMaand == 2  && datumDag >29 && datumJaar % 4 == 0 && datumJaar % 100 != 0 && datumJaar % 400 == 0 // Extra code voor de schrikkeljaren.
        || datumMaand == 2 && datumDag >28 && datumJaar >= 1
        || datumMaand == 4  && datumDag >30 && datumJaar >= 1
        || datumMaand == 6  && datumDag >30 && datumJaar >= 1
        || datumMaand == 9  && datumDag >30 && datumJaar >= 1
        || datumMaand == 11 && datumDag >30 && datumJaar >= 1)
        {
            System.out.println("U moet een correcte datum invullen!");
            geboortedag = 0;
            geboortemaand = 0;
            geboortejaar = 0;
        }
        else
        {
             geboortedag = datumDag;
             geboortemaand = datumMaand;
        }
    }
    
    /**
      * De parameters voor geslacht;
      */
    public void setGeslacht(char geslacht)
    {       
        if(geslacht == 'M' || geslacht == 'V')
        {
            this.geslacht = geslacht;
        }
        else
        {
            this.geslacht = ' ' ;
        }
    }                     
      
    /**
      * Getter voor geboortedatum
      * @return Geboortedatum 
      */
    public String getGeboorteDatum() 
    {
       String temp;
       if (geboortedag==0 && geboortemaand==0 && geboortejaar==0) 
       {
           temp="Onbekend";
       } 
       else
       {
           temp=geboortedag+"/"+geboortemaand+"/"+geboortejaar;
        }
       return temp;
    }
    
    /**
      * getter voor geslacht
      */
    public String getGeslacht() 
    {
        String temp;    
        String tempersoonGeslacht =  "" + geslacht;
        if (geslacht == 0) 
        {
            temp = "Onbekend" ;
        } else {
            temp = tempersoonGeslacht; 
        }
        return temp;           
    }
    
    /**
      * De getter van het burgerservicenummer.
      */
    public int getBurgerservicenummer()
    {
       return burgerservicenummer;
    }
    
    /**
      * De getter van de voornaam.
      */
    public String getVoornaam()
    {
        return voornaam;
    }
        
    /**
      * De getter van de achternaam.
      */
    public String getAchternaam()
    {
          return achternaam;
    }
        
    /**
      * De getter van de geboortedag.
      */
    public int getDag()
    {
        return geboortedag;
    }
        
    /**
      * De getter van de geboortemaand.
      */
    public int getMaand()
    {
         return geboortemaand;
    }        
        
    /**
      * De getter van het geboortejaar.
      */
    public int getJaar()
    {
         return geboortejaar;
    } 
     
    /**
     * De gegevens van de klasse Persoon afdrukken.
     */
    public void drukAf()
    {
       System.out.println("--------------------------------------------------------------");
       System.out.println("Hieronder worden de gegevens van de klasse Persoon weergeven: ");
       System.out.println("");
       System.out.println("Burgerservicenummer: " + burgerservicenummer);
       System.out.println("Voornaam: " + voornaam);
       System.out.println("Achternaam: " + achternaam);
       System.out.println("Geboortedag: " + geboortedag);
       System.out.println("Geboortemaand: " + geboortemaand);
       System.out.println("Geboortejaar: " + geboortejaar);
       System.out.println("Geslacht: " + geslacht);
       System.out.println("--------------------------------------------------------------");
    }
    
    /**
    * Methode om dienblad te koppelen aan een persoon
    * @param dienblad
    */
    public void pakDienblad(Dienblad dienblad) 
    {
        hetDienblad =  dienblad;    
    } 
    
    /**
    * geeft het dienblad van de persoon weer.
    */
     public Dienblad getDienblad()
     {
        return hetDienblad;    
     }
}