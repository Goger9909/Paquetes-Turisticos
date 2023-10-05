
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Paquete;

/**
 *
 * @author Yamiilaalejandra
 */
public class Paquete_Data {
      
    private  Connection con = null;
    
      public Paquete_Data() {
          Connection con = Conexion.getConexion();
    }
    
    public void GuardarPaquete(Paquete paquete){
       try {
            String sql = "INSERT INTO `paquete`( `Ciudad_Origen`, `Ciudad_Destino`, `Alojamiento`, `Pasaje`) VALUES ('?','?','?','?')";
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
               ps.setInt(1, paquete.getOrigen().getIdCiudad());
               ps.setInt(2, paquete.getDestino().getIdCiudad());
               ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
               ps.setInt(4, paquete.getPasaje().getIdPasaje());
               ps.executeUpdate();
               ResultSet rs = ps.getGeneratedKeys();
               if (rs.next()) {
                   paquete.setIdPaquete(1);
                   JOptionPane.showMessageDialog(null, "se guardo un paquete");
               }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }  
        
    }
    
    
    
    
    
    
}
