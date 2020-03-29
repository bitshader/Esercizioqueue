package javacoda1;
import java.io.*;

public class Main {

    public static void main(final String[] args) {
        final InputStreamReader input = new InputStreamReader (System.in);
        final BufferedReader tastiera = new BufferedReader (input);
        String leggiString;

        final Coda codaOrdinazioni = new Coda();
        Ordine ord;
        boolean continua = false;
        int numerop =0;
        while(continua != true){
        ord = new Ordine("null","null","null",numerop);
        
        codaOrdinazioni.aggiungi(ord);
        ord.stampa_scontrino();
        System.out.println("Ordine inserito con successo");
            
        ord=(Ordine)codaOrdinazioni.togli();
        numerop++;
        int j=0;
        System.out.println("Inserire un'altra ordinazione\t 0 per continuare");
        try{
            leggiString = tastiera.readLine();
            j = Integer.valueOf(leggiString);
         }
        catch(final Exception e){
          System.out.println("Errore");
        }
        if(j==0){
            continua = false;
        }
        else{
            continua = true;
        }
    }
}
}
