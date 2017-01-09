
package trenelectromagnetico;

import javax.swing.table.DefaultTableModel;

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
    public DefaultTableModel modeloTabla(DefaultTableModel model){
        DefaultTableModel modelo= model;
        modelo.setRowCount(0);
        Object [] fila=new Object[7]; 
        NodoRegistro aux= inicio;
        while(aux!=null){
            fila[0]=null;//aux.getDato().getCodigo();
            fila[1]=aux.getDato().getResponsable(); 
            fila[2]=aux.getDato().getVueltas(); 
            fila[3]=aux.getDato().getFecha(); 
            fila[4]=aux.getDato().getVueltarapida(); 
            fila[5]=aux.getDato().getVueltalenta(); 
            fila[6]=aux.getDato().getPeso(); 
            modelo.addRow(fila); 
            aux=aux.getSig();
        }
        return modelo;
    }
    
    public void ordenarFecha(){
    NodoRegistro aux=inicio;
    Registro temp;
    while(aux!=fin)
    {
        NodoRegistro aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getFecha().compareTo(aux1.getDato().getFecha())>0)
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
    
    public void ordenarResponsable(){
    NodoRegistro aux=inicio;
    Registro temp;
    while(aux!=fin)
    {
        NodoRegistro aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getResponsable().compareTo(aux1.getDato().getResponsable())>0)
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
    
    public void ordenarVuelta(){
    NodoRegistro aux=inicio;
    Registro temp;
    while(aux!=fin)
    {
        NodoRegistro aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getVueltas()>(aux1.getDato().getVueltas()))
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
    
    public void ordenarVuerapida(){
    NodoRegistro aux=inicio;
    Registro temp;
    while(aux!=fin)
    {
        NodoRegistro aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getVueltarapida()>(aux1.getDato().getVueltarapida()))
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
    
    public void ordenarVuelenta(){
    NodoRegistro aux=inicio;
    Registro temp;
    while(aux!=fin)
    {
        NodoRegistro aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getVueltalenta()>(aux1.getDato().getVueltalenta()))
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
    
    public void ordenarPeso(){
    NodoRegistro aux=inicio;
    Registro temp;
    while(aux!=fin)
    {
        NodoRegistro aux1= aux.getSig();
        while(aux1!=null)
        {
            if(aux.getDato().getPeso()>(aux1.getDato().getPeso()))
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
