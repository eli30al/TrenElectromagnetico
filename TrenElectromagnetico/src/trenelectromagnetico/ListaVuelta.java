/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenelectromagnetico;

public class ListaVuelta {
    NodoVuelta inicio;
    NodoVuelta fin;
    
    public ListaVuelta(){
        inicio=fin=null;
    }
    
    public void agregar(Vuelta dato){
        NodoVuelta aux = new NodoVuelta(dato,null);
        if(fin!=null){
            aux.setAnt(fin);
        }
        else{
            inicio=aux;
        }
        fin=aux;
    }
    public void ordenarCodigo(){
    NodoVuelta aux=inicio;
    Vuelta temp;
    while(aux!=fin.getAnt())
    {
        NodoVuelta aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getCodigo()> aux1.getDato().getCodigo())
            {
                temp=aux.getDato();
                aux.setDato(aux1.getDato());
                aux1.setDato(temp);
            }
            aux1=aux1.getSig();
        }
        aux=aux.getSig();
    }
    } 
}
