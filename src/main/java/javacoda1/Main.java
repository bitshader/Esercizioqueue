package javacoda1;

public class Main {

    public static void main(final String[] args) {

        final Coda codaOrdinazioni = new Coda();
        Ordine ord;
        int i = 0;
        while(i<1){
        ord = new Ordine("null","null","null");
        
        codaOrdinazioni.aggiungi(ord);
        ord.stampa();
        System.out.println("Ordine inserito con successo");
            
        ord=(Ordine)codaOrdinazioni.togli();
        
        ord.stampa_scontrino();
        
        i++;
        }
    }
}