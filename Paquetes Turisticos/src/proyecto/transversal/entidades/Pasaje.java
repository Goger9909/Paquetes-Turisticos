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
    private boolean stado;

    public Pasaje() {
    }

    public Pasaje(String Tipo_Tansporte, double Importe, Ciudad nombre_ciudad_origen, boolean stado) {
        this.Tipo_Tansporte = Tipo_Tansporte;
        this.Importe = Importe;
        this.nombre_ciudad_origen = nombre_ciudad_origen;
        this.stado = stado;
    }

    public Pasaje(int idPasaje, String Tipo_Tansporte, double Importe, Ciudad nombre_ciudad_origen, boolean stado) {
        this.idPasaje = idPasaje;
        this.Tipo_Tansporte = Tipo_Tansporte;
        this.Importe = Importe;
        this.nombre_ciudad_origen = nombre_ciudad_origen;
        this.stado = stado;
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
        return stado;
    }
    public void setStado(boolean stado) {
        this.stado = stado;
    }

    
    
}
