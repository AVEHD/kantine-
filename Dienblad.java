import java.util.Iterator;
import java.util.Stack;
import java.util.ArrayList;
/**
 * Class Dienblad.
 * 
 * @author(S) (Adriaan van ELk 332608) && (Tsjeard De Winter 330819)  
 * @version (version 1.2)
 */
public class Dienblad 
{
    private Stack<Artikel> artikelen;
    /**
     * Constructor
     */
    public Dienblad() 
    {
        artikelen = new Stack<Artikel>();
    }
    /**
     * Methode om artikel aan dienblad toe te voegen
     * Thema 1.2 I/TI Leertaak 1 Pagina 5 van 27 * @param artikel
     */
    public void voegToe(Artikel artikel) 
    {
        artikelen.add(artikel);
    }
    /**
     * De iterator die artilelen weergeeft
     */
    public Iterator<Artikel> getArtikelen()
    {
        return artikelen.iterator();
    }
}