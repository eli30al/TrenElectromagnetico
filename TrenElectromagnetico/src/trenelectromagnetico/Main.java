
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
    
        Hora aux = new Hora(leerString("Ingrese una hora : " ));
        System.out.println(aux);
        System.out.println(aux.getHora()+"h "+aux.getMin()+"min "+aux.getSeg()+"s");
    }
}
