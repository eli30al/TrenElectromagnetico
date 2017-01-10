/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenelectromagnetico;

import java.util.StringTokenizer;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public Fecha(){}
    
    public Fecha(String fecha){
        
      StringTokenizer st= new StringTokenizer(fecha,"/-");  
      String palabra=st.nextToken();
            if(palabra!=null&&st.hasMoreTokens()){//COMPARO SI PUEDO SEGUIR AÑADIENDO
                setDia(Integer.parseInt(palabra));
            }else{return;}
            palabra=st.nextToken();
            if(palabra!=null&&st.hasMoreTokens()){
                setMes(Integer.parseInt(palabra));
            }else{return;}
            palabra=st.nextToken();
            if(palabra!=null){ //VALIDAMOS EL TIPO DE PERSONA
                setAnio(Integer.parseInt(palabra));
            }         
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    public String toString(){
            String c="",d="",e="";
            c= Integer.toString(anio);
            d=Integer.toString(mes);
            e=Integer.toString(dia);
            if(anio<10)c= "0"+anio;
            if(mes<10)d= "0"+mes;
            if(dia<10)e= "0"+dia;
             return c+":"+d+":"+e;
    }
    
    public Boolean isMayor(Fecha fecha2){
        if(anio>fecha2.getAnio())
            return true;
        else if(anio==fecha2.getAnio()){
            if(mes>fecha2.getMes())
            return true;
            else if (mes==fecha2.getMes()){
                if(dia>fecha2.getDia())
                return true;
            }
        }
        return false;
    }   
    
}