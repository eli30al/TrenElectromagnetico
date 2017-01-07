
package trenelectromagnetico;

public class Registro {
    private String fecha;
    private String responsable;
    private int vueltas;
    private ListaVuelta listavuelta;
    private float vueltarapida;
    private float vueltalenta;
    private float peso;

    public Registro(String fecha, String responsable, float peso) {
        this.fecha = fecha;
        this.responsable = responsable;
        this.peso = peso;
    }
 
}
