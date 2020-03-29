package javacoda1;

import java.io.*;


public final class Ordine {
    private String Tavolo;
    private String Ordine;
    private String nome_Cameriere;
    private int Numero_sc;
  
    public Ordine(String tavolo,String ordine,String nome,int numero){
        tavolo = inserisci_tavolo();
        ordine = inserisci_ordine();
        nome = inserisci_nome();
        Numero_sc = numero;
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
   
	
    public void stampa_scontrino(){
        
        System.out.println("********************");
        System.out.println("Ordine:\t"+Ordine);
        System.out.println("Tavolo:\t"+Tavolo);
        System.out.println("N* scontrino\t"+Numero_sc);
        System.out.println("Scontrino stampato");
        System.out.println("********************");

    }
  
}
