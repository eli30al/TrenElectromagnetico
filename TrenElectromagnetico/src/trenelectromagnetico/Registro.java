
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getVueltas() {
        return vueltas;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public ListaVuelta getListavuelta() {
        return listavuelta;
    }

    public void setListavuelta(ListaVuelta listavuelta) {
        this.listavuelta = listavuelta;
    }

    public float getVueltarapida() {
        return vueltarapida;
    }

    public void setVueltarapida(float vueltarapida) {
        this.vueltarapida = vueltarapida;
    }

    public float getVueltalenta() {
        return vueltalenta;
    }

    public void setVueltalenta(float vueltalenta) {
        this.vueltalenta = vueltalenta;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Registro{" + "fecha=" + fecha + ", responsable=" + responsable + ", vueltas=" + vueltas + ", listavuelta=" + listavuelta + ", vueltarapida=" + vueltarapida + ", vueltalenta=" + vueltalenta + ", peso=" + peso + '}';
    }
 
}
