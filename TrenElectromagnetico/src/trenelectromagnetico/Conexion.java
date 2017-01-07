package trenelectromagnetico;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Conexion {
    final int PUERTO=5000;

    public void initServer()
    {
        try
        {
            ServerSocket sc = new ServerSocket(PUERTO);
            Socket so = new Socket();
            System.out.println("Esperando una conexión:");
            so = sc.accept();
            System.out.println("Un cliente se ha conectado.");
            System.out.println("IP del cliente: " + so.getInetAddress());
            System.out.println("Puerto del cliente: " + so.getPort());
            //Canales de entrada y salida de datos
            BufferedReader entrada = new BufferedReader(new InputStreamReader(so.getInputStream()));
            DataOutputStream salida = new DataOutputStream(so.getOutputStream());
            
            System.out.println("Confirmando conexion al cliente....");
            salida.writeUTF("Conexión exitosa... Envia un mensaje :D");
            //Recepcion de mensaje
            String mensajeRecibido = entrada.readLine();
            System.out.println(mensajeRecibido);
            salida.writeUTF("Se recibio tu mensaje. Terminando conexion...");
            salida.writeUTF("Gracias por conectarte, adios!");
            System.out.println("Cerrando conexión...");
            sc.close();//Aqui se cierra la conexión con el cliente

        }catch(Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    final String HOST = "192.168.22.223";
    
    public void initClient() 
    {
        try
        {
            Socket sc = new Socket( HOST , PUERTO ); /*conectar a un servidor en host con puerto 5000*/
            //creamos el flujo de datos por el que se enviara un mensaje
            DataOutputStream mensaje = new DataOutputStream(sc.getOutputStream());
            //enviamos el mensaje
<<<<<<< HEAD
            mensaje.writeUTF("hola que tal!!");
//            BufferedReader entrada = new BufferedReader(new InputStreamReader(sc.getInputStream()));
//            System.out.println(entrada);
//            cerramos la conexión
=======
            mensaje.writeUTF("Hola que tal!!");
            //cerramos la conexión
>>>>>>> origin/master
            sc.close();
        }catch(Exception e )
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
