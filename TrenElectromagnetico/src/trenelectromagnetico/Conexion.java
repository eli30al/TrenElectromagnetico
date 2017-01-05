/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trenelectromagnetico;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Elisabet Alvarez
 */
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
}
