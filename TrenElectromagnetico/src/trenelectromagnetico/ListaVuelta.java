/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenelectromagnetico;

/**
 *
 * @author Elisabet Alvarez
 */
public class ListaVuelta {
    NodoVuelta inicio;
    NodoVuelta fin;
    
    public ListaVuelta(){
        inicio=fin=null;
    }
    
    public void agregar(Vuelta dato){
        NodoVuelta aux = new NodoVuelta(dato,null);
        
    }
}
