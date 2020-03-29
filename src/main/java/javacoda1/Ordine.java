package javacoda1;

import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Ordine {
    private String Tavolo;
    private String Ordine;
    private String nome_Cameriere;
    public Ordine(String tavolo,String ordine,String nome){
        tavolo = inserisci_tavolo();
        ordine = inserisci_ordine();
        nome = inserisci_nome();
      
    }
    public String inserisci_ordine(){
        final InputStreamReader input = new InputStreamReader (System.in);
        final BufferedReader tastiera = new BufferedReader (input);
        String leggiString;
        
        System.out.println("Inserisci Ordine");
         try{
             leggiString = tastiera.readLine();
             Ordine = String.valueOf(leggiString);
        }
       catch(final Exception e){
           System.out.println("Ordine non valido");
       }
         return Ordine;
    }
    
    public String inserisci_nome(){
        final InputStreamReader input = new InputStreamReader (System.in);
        final BufferedReader tastiera = new BufferedReader (input);
        String leggiString;

        System.out.println("Inserisci nome del cameriere");
        try{
            leggiString = tastiera.readLine();
            nome_Cameriere = String.valueOf(leggiString);
        }
        catch(final Exception e){
            System.out.println("Nome non valido");

        }
        return nome_Cameriere;

    }
    public String inserisci_tavolo(){
        final InputStreamReader input = new InputStreamReader (System.in);
        final BufferedReader tastiera = new BufferedReader (input);
        String leggiString;
        
        System.out.println("Inserisci Tavolo");
         try{
             leggiString = tastiera.readLine();
             Tavolo = String.valueOf(leggiString);
        }
       catch(final Exception e){
           System.out.println("Ordine non valido");
       }
         return Tavolo;
       
    }
    
    public void stampa(){
        System.out.println("Tavolo:"+Tavolo);
        System.out.println("Ordine:"+Ordine);
        
    }

    
        
        public void OraCorrente(){
            
            final Calendar calendar = new GregorianCalendar();
            
            String orario;
   
         
            final int giorno = calendar.get(Calendar.DAY_OF_MONTH);
            final int mese = calendar.get(Calendar.MONTH);
            final int anno = calendar.get(Calendar.YEAR);
            

            final int ore = calendar.get(Calendar.HOUR);
            final int minuti = calendar.get(Calendar.MINUTE);
            final int secondi = calendar.get(Calendar.SECOND);
            
            if(calendar.get(Calendar.AM_PM) == 0)
            orario = "A.M.";
            else
            orario = "P.M.";

            System.out.println("Orario"+ore+":"+minuti+":"+secondi+" "+orario);
            System.out.println("Data:"+giorno+"/"+mese+"/"+anno);

            }
       
    public void stampa_scontrino(){
        OraCorrente dataOrario = new OraCorrente();
        System.out.println("********************");
        System.out.println("Ordine:\t"+Ordine);
        System.out.println("Tavolo:\t"+Tavolo);
        System.out.println("Scontrino stampato:");
        System.out.println(dataOrario);

    }
  
}
