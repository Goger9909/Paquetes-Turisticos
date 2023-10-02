
package proyecto.transversal.entidades;

/**
 *
 * @author yamilaalejandra
 */
public class Paquete {
    
   private int idPaquete; 
   private String CuidadOrigen; 
   private String CuidadDestino; 
   private Alojamiento alojamiento; 
   private Pasaje pasaje; 

    public Paquete() {
    }

    public Paquete(String CuidadOrigen, String CuidadDestino, Alojamiento alojamiento, Pasaje pasaje) {
        this.CuidadOrigen = CuidadOrigen;
        this.CuidadDestino = CuidadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
    }

    public Paquete(int idPaquete, String CuidadOrigen, String CuidadDestino, Alojamiento alojamiento, Pasaje pasaje) {
        this.idPaquete = idPaquete;
        this.CuidadOrigen = CuidadOrigen;
        this.CuidadDestino = CuidadDestino;
        this.alojamiento = alojamiento;
        this.pasaje = pasaje;
    }

    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public String getCuidadOrigen() {
        return CuidadOrigen;
    }

    public void setCuidadOrigen(String CuidadOrigen) {
        this.CuidadOrigen = CuidadOrigen;
    }

    public String getCuidadDestino() {
        return CuidadDestino;
    }

    public void setCuidadDestino(String CuidadDestino) {
        this.CuidadDestino = CuidadDestino;
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
        return "Paquete{" + "idPaquete=" + idPaquete + ", CuidadOrigen=" + CuidadOrigen + ", CuidadDestino=" + CuidadDestino + ", alojamiento=" + alojamiento + ", pasaje=" + pasaje + '}';
    }

}
