package proyecto.transversal.entidades;

import java.time.LocalDate;


public class Movimiento {
    
    private int idMovimiento;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private Alojamiento idAlojamiento;
    private boolean estado;

    public Movimiento() {
    }

    
    public Movimiento(LocalDate fechaIngreso, LocalDate fechaSalida, Alojamiento idAlojamiento, boolean estado) {
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.idAlojamiento = idAlojamiento;
        this.estado = estado;
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Alojamiento getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(Alojamiento idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "idMovimiento=" + idMovimiento + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", idAlojamiento=" + idAlojamiento + ", estado=" + estado + '}';
    }

}
