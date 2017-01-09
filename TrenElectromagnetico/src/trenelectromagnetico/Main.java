
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
        
//        ListaVuelta l1 = new ListaVuelta();
//        
//        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0001","10:30:5","23:3:00"));
//        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0011","20:30:5","4:3:30"));
//        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0023","2:30:5","23:35:3"));
//        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0002","15:30:5","12:3:3"));
//        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0031","20:30:15","9:3:35"));
//        l1.agregar(new Vuelta("UIO-LTC",30,23,2,"0004","18:30:5","23:38:3"));
//        l1.imprimir();
//        l1.ordenarSalida();
//        System.out.println("-------------------------------------------");
//        l1.imprimir();
        
        ListaRegistro r1 = new ListaRegistro();
        
        r1.agregar(new Registro("1-8-2016", "Juan Lopez", 10));
        r1.agregar(new Registro("2-8-2016", "Felipe Sarmiento", 25));
        r1.agregar(new Registro("1-5-2016", "Zaida Alvarez", 8));
        r1.agregar(new Registro("4-8-2016", "Andres Guevara", 7));
        
        r1.imprimir();
        r1.ordenarResponsable();
        System.out.println("-------------------------------------------");
        r1.imprimir();
    }
}
