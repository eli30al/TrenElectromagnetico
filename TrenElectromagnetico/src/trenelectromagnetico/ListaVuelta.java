
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
            fin.setSig(aux);
        }
        else{
            inicio=aux;
        }
        fin=aux;
    }

    public void imprimir(NodoVuelta aux){
        if(aux!=null){
            System.out.println(aux.getDato());
            imprimir(aux.getSig());
        }
    }
    public void imprimir(){
        imprimir(inicio);
    }
    public void ordenarCodigo(){
    NodoVuelta aux=inicio;
    Vuelta temp;
    while(aux!=fin)
    {
        NodoVuelta aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getCodigo().compareTo(aux1.getDato().getCodigo())>0)
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

    public void ordenarPasajeros(){
    NodoVuelta aux=inicio;
    Vuelta temp;
    while(aux!=fin)
    {
        NodoVuelta aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getPasajeros()>(aux1.getDato().getPasajeros()))
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
    
    public void ordenarVelocidad(){
    NodoVuelta aux=inicio;
    Vuelta temp;
    while(aux!=fin)
    {
        NodoVuelta aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getVelocidad()>(aux1.getDato().getVelocidad()))
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
    
    public void ordenarTiempo(){
    NodoVuelta aux=inicio;
    Vuelta temp;
    while(aux!=fin)
    {
        NodoVuelta aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getTiempo()>(aux1.getDato().getTiempo()))
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
    
//    public void ordenarLlegada(){
//    NodoVuelta aux=inicio;
//    Vuelta temp;
//    while(aux!=fin)
//    {
//        NodoVuelta aux1= aux.getSig();
//        while(aux1!=null)
//        {
//            if(aux.getDato().getLlegada().toString().compareTo(aux1.getDato().getLlegada())>0)
//            {
//                temp=aux.getDato();
//                aux.setDato(aux1.getDato());
//                aux1.setDato(temp);
//            }
//            aux1=aux1.getSig();
//        }
//        aux=aux.getSig();
//    }
//    } 
    
    
}
