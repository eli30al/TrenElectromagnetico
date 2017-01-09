
package trenelectromagnetico;

public class NodoRegistro {
    private Registro dato;
   private NodoRegistro sig;
   private NodoRegistro ant;

    public NodoRegistro(NodoRegistro ant, Registro dato, NodoRegistro sig) {
        this.dato = dato;
        this.sig = sig;
        this.ant = ant;
    }
    
    public NodoRegistro(NodoRegistro ant, Registro dato) {
        this.dato = dato;
        this.ant = ant;
    }
    
    public NodoRegistro(Registro dato, NodoRegistro sig) {
        this.dato = dato;
        this.ant = sig;
    }

    public Registro getDato() {
        return dato;
    }

    public void setDato(Registro dato) {
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
