
package trenelectromagnetico;

public class ListaRegistro {
        NodoRegistro inicio;
        NodoRegistro fin;
    
    public ListaRegistro(){
        inicio=fin=null;
    }
    
    public void agregar(Registro dato){
        NodoRegistro aux = new NodoRegistro(dato,null);
        if(fin!=null){
            aux.setAnt(fin);
            fin.setSig(aux);
        }
        else{
            inicio=aux;
        }
        fin=aux;
    }
    public void imprimir(){
        imprimir(inicio);
    }
    public void imprimir(NodoRegistro aux){
        if(aux!=null){
            System.out.println(aux.getDato());
            imprimir(aux.getSig());
        }
    }
}
