package trenelectromagnetico;

import javax.swing.JOptionPane;

public class Registro {
    private Fecha fecha;
    private String responsable;
    private int vueltas;
    private ListaVuelta listavuelta;
    private float vueltarapida;
    private float vueltalenta;
    private float peso;

    public Registro(String fecha, String responsable, float peso) {
        this.fecha = new Fecha(fecha);
        this.responsable = responsable;
        this.peso = peso;
    }

    public Registro(String fecha, String responsable, float peso, ListaVuelta listavuelta) {
        this.fecha = new Fecha(fecha);
        this.responsable = responsable;
        this.listavuelta = listavuelta;
        this.peso = peso;
        setVueltas(listavuelta.calcularVueltas());
    }

    public Registro() {
    }

    public Fecha getFecha() {

        return fecha;
    }

    public void setFecha(Fecha fecha) {
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
        setVueltas(listavuelta.calcularVueltas());
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

    public void setPeso(String numper) {
	int num = 0;
        do{
        try {
		num = Integer.parseInt(numper);
		peso=(float)num*7/3;
	} catch (NumberFormatException nfe){
                numper=JOptionPane.showInputDialog("Ingrese la cantidad de pasajeros en numeros.");
	}
        }while(num==0);
    }

    @Override
    public String toString() {
        return "Registro{" + "fecha=" + fecha + ", responsable=" + responsable + ", vueltas=" + vueltas + ", listavuelta=" + listavuelta + ", vueltarapida=" + vueltarapida + ", vueltalenta=" + vueltalenta + ", peso=" + peso + '}';
    }
 
}