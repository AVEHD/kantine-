Project: Kantine ->Leertaak voor Tutoriaal;
Authors: Adriaan van Elk, Tsjeard DW

This project is part of a college assignment and should not be used. 

Dit project is onderdeel van een HBO opdracht en moet niet gebruikt worden. 

// VRAAG: opgave 4 
          De code fragementen (van de opgave):
          // primitieve typen
          int i=1;
          int j=2;
          i=j;
          j=3; 
          // drukt ”i=2, j=3” af
          System.out.println(“i =”+i+”, j=”+j); 
          
          // objecten 
          //a en b zijn objecten van de klasse Artikel
          a.setPrijs(1);
          b.setPrijs(2);
          a=b;
          b.setPrice(3);
          // drukt “prijs a=3, prijs b=3” af
          System.out.println(“prijs a =”+a.getPrijs()+”, prijs 
          b=”+b.getPrijs());
// Antw:
De primitieve typen werken uitsluitend met de volgorde waarin de code in geschreven is. 
Bij deze opgave werd de i een 2 en de j een 3 omdat de i de waarde krreg van j en j kreeg 
een nieuwe waarde: 3. Daarna werd pas system.out.println gedaan. 

De objecttype werkt dat anders, bepaalde onderdelen van het code hebben voorrang op andere
onderdelen van het code. Want als de code wel op volgorde zou rekenen zou prijs a 2 in 
plaats van 3. 


