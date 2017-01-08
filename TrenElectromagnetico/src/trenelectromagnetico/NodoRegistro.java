
package trenelectromagnetico;

public class NodoRegistro {
    private Vuelta dato;
   private NodoRegistro sig;
   private NodoRegistro ant;

    public NodoRegistro(NodoRegistro ant, Vuelta dato, NodoRegistro sig) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }
    
    public NodoRegistro(NodoRegistro ant, Vuelta dato) {
        this.dato = dato;
        this.ant = ant;
    }
    
    public NodoRegistro(Vuelta dato, NodoRegistro sig) {
        this.dato = dato;
        this.ant = sig;
    }

    public Vuelta getDato() {
        return dato;
    }

    public void setDato(Vuelta dato) {
        this.dato = dato;
    }

    public NodoRegistro getSig() {
        return sig;
    }

    public void setSig(NodoRegistro sig) {
        this.sig = sig;
    }

    public NodoRegistro getAnt() {
        return ant;
    }

    public void setAnt(NodoRegistro ant) {
        this.ant = ant;
    }
   
  
}
