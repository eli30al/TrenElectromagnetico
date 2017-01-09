
package trenelectromagnetico;

import java.util.Scanner;


public class Main {
    
    public static String leerString(String mensaje){
        Scanner ingreso=new Scanner(System.in);
        System.out.println(""+mensaje);
        String dato=ingreso.nextLine();
        return dato;             
    }

    public static void main(String[] args) {
    
//        Hora aux = new Hora(leerString("Ingrese una hora : " ));
//        System.out.println(aux);
//        System.out.println(aux.getHora()+"h "+aux.getMin()+"min "+aux.getSeg()+"s");
        
        ListaVuelta l1 = new ListaVuelta();
        
        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0001","20:30:5","23:3:3"));
        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0011","20:30:5","23:3:3"));
        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0023","20:30:5","23:3:3"));
        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0002","20:30:5","23:3:3"));
        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0031","20:30:5","23:3:3"));
        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0004","20:30:5","23:3:3"));
        l1.imprimir();
        l1.ordenarCodigo();
        System.out.println("-------------------------------------------");
        l1.imprimir();
        
    }
}
