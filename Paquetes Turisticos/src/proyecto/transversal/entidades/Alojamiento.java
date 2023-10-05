
package proyecto.transversal.entidades;

import java.time.LocalDate;


public class Alojamiento {
    
    private int idAlojamiento;
    private LocalDate fechaIn;
    private LocalDate fechaOn;
    private boolean estado;
    private double importeDiario;
    private Ciudad ciudadDest;

      public Alojamiento() {
    }

    public Alojamiento(LocalDate fechaIn, LocalDate fechaOn, boolean estado, double importeDiario, Ciudad ciudadDest) {
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.importeDiario = importeDiario;
        this.ciudadDest = ciudadDest;
    }

    public Alojamiento(int idAlojamiento, LocalDate fechaIn, LocalDate fechaOn, boolean estado, double importeDiario, Ciudad ciudadDest) {
        this.idAlojamiento = idAlojamiento;
        this.fechaIn = fechaIn;
        this.fechaOn = fechaOn;
        this.estado = estado;
        this.importeDiario = importeDiario;
        this.ciudadDest = ciudadDest;
    }

  
    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaOn() {
        return fechaOn;
    }

    public void setFechaOn(LocalDate fechaOn) {
        this.fechaOn = fechaOn;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getImporteDiario() {
        return importeDiario;
    }

    public void setImporteDiario(double importeDiario) {
        this.importeDiario = importeDiario;
    }

    public Ciudad getCiudadDest() {
        return ciudadDest;
    }

    public void setCiudadDest(Ciudad ciudadDest) {
        this.ciudadDest = ciudadDest;
    }
    
      @Override
    public String toString() {
        return "Alojamiento{" + "idAlojamiento=" + idAlojamiento + ", fechaIn=" + fechaIn + ", fechaOn=" + fechaOn + ", estado=" + estado + ", importeDiario=" + importeDiario + ", ciudadDest=" + ciudadDest + '}';
    }

    
}
