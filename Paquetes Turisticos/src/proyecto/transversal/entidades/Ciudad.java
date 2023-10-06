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
public class Ciudad {
    private int idCiudad;
    private String pais;
    private String nombreCiudad;
    private String provincia;
    private boolean estado;

    public Ciudad() {
    }

    public Ciudad(int idCiudad, String pais, String nombreCiudad, String provincia, boolean estado) {
        this.idCiudad = idCiudad;
        this.pais = pais;
        this.nombreCiudad = nombreCiudad;
        this.provincia = provincia;
        this.estado = estado;
    }

    public Ciudad(String pais, String nombreCiudad, String provincia, boolean estado) {
        this.pais = pais;
        this.nombreCiudad = nombreCiudad;
        this.provincia = provincia;
        this.estado = estado;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return   nombreCiudad + provincia + ", " + pais;
    }
    
}
