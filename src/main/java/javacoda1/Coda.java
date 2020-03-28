package javacoda1;

import java.util.*;
public class Coda {
    private final Vector elementi;
    public Coda(){
        elementi = new Vector();
    }
    public void aggiungi(final Object obj){
        elementi.addElement(obj);  
    }
    public Object togli(){
        Object obj = null;
        final int size = elementi.size();
        if(size>0){
            obj=elementi.elementAt(0);
            elementi.removeElement(0);
        }
        return obj;
    }
    public boolean vuota(){
        if(elementi.size()>0){
            return false;
        }
        else{
            return true;
        }
    }
    public int size(){
        return elementi.size();
    }
}