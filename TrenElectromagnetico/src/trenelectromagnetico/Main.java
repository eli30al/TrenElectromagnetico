package trenelectromagnetico;

import java.util.Scanner;

public class Main {

    public static String leerString(String mensaje) {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("" + mensaje);
        String dato = ingreso.nextLine();
        return dato;
    }

    static ListaRegistro r1 = new ListaRegistro();
    static ListaVuelta l1 = new ListaVuelta();

    public static void main(String[] args) {

        VentanaPrincipal vip = new VentanaPrincipal();
        vip.setVisible(true);

        l1.agregar(new Vuelta("UIO-LTC", 30, 23, 2, "0001", "10:30:5", "23:3:00"));
        l1.agregar(new Vuelta("UIO-LTC", 15, 22, 3, "0011", "20:30:5", "4:3:30"));
        l1.agregar(new Vuelta("UIO-LTC", 55, 24, 5, "0023", "2:30:5", "23:35:3"));
        l1.agregar(new Vuelta("UIO-LTC", 10, 44, 7, "0002", "15:30:5", "12:3:3"));
        l1.agregar(new Vuelta("UIO-LTC", 80, 78, 6, "0031", "20:30:15", "9:3:35"));
        l1.agregar(new Vuelta("UIO-LTC", 45, 21, 1, "0004", "18:30:5", "23:38:3"));
        l1.imprimir();
        l1.ordenarSalida();
        System.out.println("-------------------------------------------");
        l1.imprimir();

        r1.agregar(new Registro("1-8-2016", "Juan Lopez", 10, l1));
        r1.agregar(new Registro("2-8-2016", "Felipe Sarmiento", 25, l1));
        r1.agregar(new Registro("1-5-2016", "Zaida Alvarez", 8, l1));
        r1.agregar(new Registro("4-8-2016", "Andres Guevara", 7, l1));
        
//        VentanaResgistros vr = new VentanaResgistros();
//        vr.elementosEnTabla(r1);
//        vr.setVisible(true);

    }

}
