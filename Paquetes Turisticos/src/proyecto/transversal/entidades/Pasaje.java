/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.transversal.entidades;

/**
 *
 * @author MiPc
 */
public class Pasaje {
    
    private int idPasaje;
    private String Tipo_Tansporte;
    private double Importe;
    Ciudad nombre_ciudad_origen;
    private boolean Estado;

    public Pasaje() {
    }

    public Pasaje(String Tipo_Tansporte, double Importe, Ciudad nombre_ciudad_origen, boolean stado) {
        this.Tipo_Tansporte = Tipo_Tansporte;
        this.Importe = Importe;
        this.nombre_ciudad_origen = nombre_ciudad_origen;
        this.Estado = stado;
    }

    public Pasaje(int idPasaje, String Tipo_Tansporte, double Importe, Ciudad nombre_ciudad_origen, boolean stado) {
        this.idPasaje = idPasaje;
        this.Tipo_Tansporte = Tipo_Tansporte;
        this.Importe = Importe;
        this.nombre_ciudad_origen = nombre_ciudad_origen;
        this.Estado = stado;
    }

    public int getIdPasaje() {
        return idPasaje;
    }
    public void setIdPasaje(int idPasaje) {
        this.idPasaje = idPasaje;
    }

    public String getTipo_Tansporte() {
        return Tipo_Tansporte;
    }
    public void setTipo_Tansporte(String Tipo_Tansporte) {
        this.Tipo_Tansporte = Tipo_Tansporte;
    }

    public double getImporte() {
        return Importe;
    }
    public void setImporte(double Importe) {
        this.Importe = Importe;
    }

    public Ciudad getNombre_ciudad_origen() {
        return nombre_ciudad_origen;
    }
    public void setNombre_ciudad_origen(Ciudad nombre_ciudad_origen) {
        this.nombre_ciudad_origen = nombre_ciudad_origen;
    }

    public boolean isStado() {
        return Estado;
    }
    public void setStado(boolean stado) {
        this.Estado = Estado;
    }
    
    @Override
    public String toString() {
        return "Pasaje{" + "id Pasaje:" + idPasaje + ", Tipo de Transporte:" + Tipo_Tansporte + ", Costo:" + Importe + ", Ciudad origen:" + nombre_ciudad_origen + ", stado:" + Estado + '}';
    }
}
