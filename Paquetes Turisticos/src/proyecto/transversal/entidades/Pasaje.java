package proyecto.transversal.entidades;

public class Pasaje {
    
    private int idPasaje;
    private String tipo_tansporte;
    private double importe;
    private Ciudad nombre_ciudad_origen;
    private boolean estado;

    public Pasaje() {
    }

    public Pasaje(String Tipo_Tansporte, double Importe, Ciudad nombre_ciudad_origen, boolean Estado) {
        this.tipo_tansporte = Tipo_Tansporte;
        this.importe = Importe;
        this.nombre_ciudad_origen = nombre_ciudad_origen;
        this.estado = Estado;
    }

    public Pasaje(int idPasaje, String Tipo_Tansporte, double Importe, Ciudad nombre_ciudad_origen, boolean Estado) {
        this.idPasaje = idPasaje;
        this.tipo_tansporte = Tipo_Tansporte;
        this.importe = Importe;
        this.nombre_ciudad_origen = nombre_ciudad_origen;
        this.estado = Estado;
    }

    public int getIdPasaje() {
        return idPasaje;
    }
    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getTipo_Tansporte() {
        return tipo_tansporte;
    }
    public void setTipo_Tansporte(String Tipo_Tansporte) {
        this.tipo_tansporte = Tipo_Tansporte;
    }

    public double getImporte() {
        return importe;
    }
    public void setImporte(double Importe) {
        this.importe = Importe;
    }

    public Ciudad getNombre_ciudad_origen() {
        return nombre_ciudad_origen;
    }
    public void setNombre_ciudad_origen(Ciudad nombre_ciudad_origen) {
        this.nombre_ciudad_origen = nombre_ciudad_origen;
    }
    
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean Estado) {
        this.estado = Estado;
    }
    
    @Override
    public String toString() {
        return "Pasaje{" + "id Pasaje:" + idPasaje + ", Tipo de Transporte:" + tipo_tansporte + ", Costo:" + importe + ", Ciudad origen:" + nombre_ciudad_origen + ", stado:" + estado + '}';
    }
}