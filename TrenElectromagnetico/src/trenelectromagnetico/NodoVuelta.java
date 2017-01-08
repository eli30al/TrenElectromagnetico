
package trenelectromagnetico;

public class NodoVuelta { //lista doble
   
   private Vuelta dato;
   private NodoVuelta sig;
   private NodoVuelta ant;

    public NodoVuelta(NodoVuelta ant, Vuelta dato, NodoVuelta sig) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }
    
    public NodoVuelta(NodoVuelta ant, Vuelta dato) {
        this.dato = dato;
        this.ant = ant;
    }
    
    public NodoVuelta(Vuelta dato, NodoVuelta sig) {
        this.dato = dato;
        this.ant = sig;
    }

    public Vuelta getDato() {
        return dato;
    }

    public void setDato(Vuelta dato) {
        this.dato = dato;
    }

    public NodoVuelta getSig() {
        return sig;
    }

    public void setSig(NodoVuelta sig) {
        this.sig = sig;
    }

    public NodoVuelta getAnt() {
        return ant;
    }

    public void setAnt(NodoVuelta ant) {
        this.ant = ant;
    }
    
}
