
package trenelectromagnetico;

import java.util.StringTokenizer;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSeg() {
        return seg;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }		
    public Hora(){}
    
    public Hora(String hora){
        
      StringTokenizer st= new StringTokenizer(hora,":");  
      String palabra=st.nextToken();
            if(palabra!=null&&st.hasMoreTokens()){//COMPARO SI PUEDO SEGUIR AÑADIENDO
                setHora(Integer.parseInt(palabra));
            }else{return;}
            palabra=st.nextToken();
            if(palabra!=null&&st.hasMoreTokens()){
                setMin(Integer.parseInt(palabra));
            }else{return;}
            palabra=st.nextToken();
            if(palabra!=null){ //VALIDAMOS EL TIPO DE PERSONA
                setSeg(Integer.parseInt(palabra));
            }         
    }
    
    public String toString(){
            String c="",d="",e="";
            c= Integer.toString(hora);
            d=Integer.toString(min);
            e=Integer.toString(seg);
            if(hora<10)c= "0"+hora;
            if(min<10)d= "0"+min;
            if(seg<10)e= "0"+seg;
             return c+":"+d+":"+e;
    }
    
    public Boolean isMayor(Hora hora2){
        if(hora>hora2.getHora())
            return true;
        else if(hora==hora2.getHora()){
            if(min>hora2.getMin())
            return true;
            else if (min==hora2.getMin()){
                if(seg>hora2.getSeg())
                return true;
            }
        }
        return false;
    }   
     

}
