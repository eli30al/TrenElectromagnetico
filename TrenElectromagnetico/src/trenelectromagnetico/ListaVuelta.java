
package trenelectromagnetico;

import javax.swing.table.DefaultTableModel;

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
    public DefaultTableModel modeloTabla(DefaultTableModel model){
        DefaultTableModel modelo= model;
        modelo.setRowCount(0);
        Object [] fila=new Object[7]; 
        NodoVuelta aux= inicio;
        while(aux!=null){
            fila[0]=aux.getDato().getCodigo();
            fila[1]=aux.getDato().getRuta(); 
            fila[2]=aux.getDato().getPasajeros(); 
            fila[3]=aux.getDato().getSalida().toString(); 
            fila[4]=aux.getDato().getLlegada().toString(); 
            fila[5]=aux.getDato().getTiempo(); 
            fila[6]=aux.getDato().getVelocidad(); 
            modelo.addRow(fila); 
            aux=aux.getSig();
        }
        return modelo;
     }
    
    public void ordenarLlegada(){
    NodoVuelta aux=inicio;
    Vuelta temp;
    while(aux!=fin)
    {
        NodoVuelta aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getLlegada().isMayor(aux1.getDato().getLlegada()))
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
 
    public void ordenarSalida(){
    NodoVuelta aux=inicio;
    Vuelta temp;
    while(aux!=fin)
    {
        NodoVuelta aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getSalida().isMayor(aux1.getDato().getSalida()))
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
    public int calcularVueltas(NodoVuelta aux){
        if(aux!=null){
            return 1 + calcularVueltas(aux.getSig());
        }
        return 0;
    }
    public int calcularVueltas(){
        return calcularVueltas(inicio);
    }
}
