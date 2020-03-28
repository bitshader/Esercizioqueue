package javacoda1;

public class Main {

    public static void main(final String[] args) {

        final Coda codaOrdinazioni = new Coda();
        Ordine ord;
        int i = 0;
        while(i<3){
        ord = new Ordine("o","o");
        
        codaOrdinazioni.aggiungi(ord);
        ord.stampa();
        System.out.println("Ordine inserito con successo");
            
        ord=(Ordine)codaOrdinazioni.togli();
        
        ord.stampa();
        
        i++;
        }
    }
}