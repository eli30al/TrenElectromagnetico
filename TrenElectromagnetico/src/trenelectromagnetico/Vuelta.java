
package trenelectromagnetico;

public class Vuelta {
    private String ruta;
    private int pasajeros;
    private float velocidad;
    private float tiempo;
    private String codigo;
    private Hora llegada;
    private Hora salida;

    public Vuelta(String ruta, int pasajeros, float velocidad, float tiempo, String codigo, String llegada, String salida) {
        this.ruta = ruta;
        this.pasajeros = pasajeros;
        this.velocidad = velocidad;
        this.tiempo = tiempo;
        this.codigo = codigo;
        this.llegada = new Hora(llegada);
        this.salida = new Hora(salida);
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public float getTiempo() {
        return tiempo;
    }

    public void setTiempo(float tiempo) {
        this.tiempo = tiempo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Hora getLlegada() {
        return llegada;
    }

    public void setLlegada(String hora) {
        this.llegada = llegada;
    }

    public Hora getSalida() {
        return salida;
    }

    public void setSalida(String hora) {
        this.salida = salida;
    }

    @Override
    public String toString() {
        return "Vuelta{" + "ruta=" + ruta + ", pasajeros=" + pasajeros + ", velocidad=" + velocidad + ", tiempo=" + tiempo + ", codigo=" + codigo + ", llegada=" + llegada + ", salida=" + salida + '}';
    }
    
}
