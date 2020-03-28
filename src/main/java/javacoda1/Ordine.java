package javacoda1;

import java.io.*;

public final class Ordine {
    private String Tavolo;
    private String Ordine;
    public Ordine(String tavolo,String ordine){
        tavolo = inserisci_tavolo();
        ordine = inserisci_ordine();
      
    }
    public String inserisci_ordine(){
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        String leggiString;
        
        System.out.println("Inserisci Ordine");
         try{
             leggiString = tastiera.readLine();
             Ordine = String.valueOf(leggiString);
        }
       catch(Exception e){
           System.out.println("Ordine non valido");
       }
         return Ordine;
    }
     
    public String inserisci_tavolo(){
        InputStreamReader input = new InputStreamReader (System.in);
        BufferedReader tastiera = new BufferedReader (input);
        String leggiString;
        
        System.out.println("Inserisci Tavolo");
         try{
             leggiString = tastiera.readLine();
             Tavolo = String.valueOf(leggiString);
        }
       catch(Exception e){
           System.out.println("Ordine non valido");
       }
         return Tavolo;
       
    }
    
    public void stampa(){
        System.out.println("Tavolo:"+Tavolo);
        System.out.println("Ordine:"+Ordine);
        
    }
  
}
