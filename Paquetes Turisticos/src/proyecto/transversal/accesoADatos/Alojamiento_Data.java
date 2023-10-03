
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Alojamiento;


public class Alojamiento_Data {
   
    Connection con = null;
    
    public Alojamiento_Data(){
        con = Conexion.getConexion();
    }
    
    public void guardarAlojamiento(Alojamiento alojamiento){
    
        String sql = "INSERT INTO alojamiento(Fecha_Inicio, Fecha_Salida, Tipo_Alojamiento, Servicio, Importe_Diario, Ciudad_Destino, Estado)"
                + "VALUES (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setString(3, alojamiento.getTipoAlojamiento());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudadDest().getIdCiudad());
            ps.setBoolean(7, alojamiento.isEstado());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
    }
    
    
    
    
}
