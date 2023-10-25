
package proyecto.transversal.entidades;

/**
 *
 * @author yamilaalejandra
 */
public class Paquete {
    
  private int idPaquete; 
  private Ciudad origen; 
  private Ciudad destino; 
  private Alojamiento alojamiento; 
  private Pasaje pasaje; 
  private boolean estado;

    public Paquete() {
    }

    public Paquete(Ciudad origen, Ciudad destino, Alojamiento alojamiento, Pasaje pasaje, boolean estado) {
        this.origen = origen;
        this.destino = destino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
    }

    public Paquete(int idPaquete, Ciudad origen, Ciudad destino, Alojamiento alojamiento, Pasaje pasaje, boolean estado) {
        this.idPaquete = idPaquete;
        this.origen = origen;
        this.destino = destino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", origen=" + origen + ", destino=" + destino + ", alojamiento=" + alojamiento + ", pasaje=" + pasaje + '}';
    }
  
}
