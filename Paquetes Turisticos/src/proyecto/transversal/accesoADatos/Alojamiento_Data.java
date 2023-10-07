
package proyecto.transversal.accesoADatos;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;


public class Alojamiento_Data {
   
    Connection con = null;
    Alojamiento alojamiento = new Alojamiento();
    Ciudad ciudad = new Ciudad();
    
    
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
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
            
                alojamiento.setIdAlojamiento(rs.getInt(1)); //la primer columna de la BD
                JOptionPane.showMessageDialog(null, "El Alojamiento se guardó con éxito");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
    }
    
    public void modificarAlojamiento(Alojamiento alojamiento){
        String sql = " UPDATE alojamiento SET Fecha_Inicio=? , Fecha_Salida=? , Tipo_Alojamiento=? , "
                    + "Servicio=? , Importe_Diario=? , Ciudad_Destino=? , Estado=?"
                    + "WHERE idAlojamiento=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
        
            ps.setDate(1, Date.valueOf(alojamiento.getFechaIn()));
            ps.setDate(2, Date.valueOf(alojamiento.getFechaOn()));
            ps.setString(3, alojamiento.getTipoAlojamiento());
            ps.setString(4, alojamiento.getServicio());
            ps.setDouble(5, alojamiento.getImporteDiario());
            ps.setInt(6, alojamiento.getCiudadDest().getIdCiudad());
            ps.setBoolean(7, alojamiento.isEstado());
            ps.setInt(8, alojamiento.getIdAlojamiento());
            
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Alojamiento modificado");
            }
            ps.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
    }
    
    
    
    // BORRADO LOGICO
    public void desactivarAlojamiento(int id){
        
        String sql = "UPDATE alojamiento SET Estado=0 WHERE idAlojamiento=?";
        
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
            
                JOptionPane.showMessageDialog(null, "Se desactivó el alojamiento");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
    }
    
    
    
    public void activarAlojamiento(int id){
        
        String sql = "UPDATE alojamiento SET Estado=1 WHERE idAlojamiento=?";
        
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
            
                JOptionPane.showMessageDialog(null, "Se desactivó el alojamiento");
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
    }
    // BUSQUEDA POR ID DE ALOJAMIENTO - PUEDE QUE NECESITES BUSQUEDA de alojamiento PERO CON LA ID DE LA CIUDAD PARA EL PAQUETE, ASI QUE LOS DEJO MAS ABAJO  A ESOS METODOS JAJA
    public void buscarAlojamientoPorId(int id){
    
        String sql = "SELECT Fecha_Inicio, Fecha_Salida, Tipo_Alojamiento, Servicio, "
                + "Importe_Diario, Ciudad_Destino, Estado FROM alojamiento WHERE idAlojamiento=?";
                  
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                Ciudad_Data cd= new Ciudad_Data();
                alojamiento.setIdAlojamiento(id);
                alojamiento.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                ciudad = cd.buscarCiudadPorID(rs.getInt("Ciudad_Destino"));
                alojamiento.setCiudadDest(ciudad);
                alojamiento.setEstado(rs.getBoolean("Estado"));
            }
            ps.close();
          
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos"+ ex);
        }
    }
    
    // METODO PARA BUSCAR LOS ALOJAMIENTOS PASANDO UN OBJETO DEL TIPO CIUDAD (busca por el id de la ciudad)    
    public List<Alojamiento> alojamientoPorCiudad(Ciudad ciudad){
        
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        
        String sql = "SELECT idAlojamiento, Fecha_Inicio, Fecha_Salida, Tipo_Alojamiento, Servicio, "
                + "Importe_Diario, Estado FROM alojamiento WHERE Ciudad_Destino=?";
                   
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,ciudad.getIdCiudad());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                alojamiento.setEstado(rs.getBoolean("Estado"));
            alojamientos.add(alojamiento);
            }
            ps.close();
          
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos"+ ex);
        }
        return alojamientos;
    }
    
    // Prueba de metodo de busqueda por nombre ya sea pais, ciudad o provincia y armado del combo box
//    public List<Ciudad> buscarCompleto(String txt){
//        
//        ArrayList<Ciudad> ciudades = new ArrayList<>();
//        
//        String sql = "SELECT * FROM ciudad WHERE Nombre LIKE '?%' OR "
//                + "Provincia LIKE '?%' OR Pais LIKE '?%' ORDER BY `ciudad`.`Nombre`";
//        
//        try{
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, txt);
//            ps.setString(2, txt);
//            ps.setString(3, txt);
//            ResultSet rs = ps.executeQuery();
//        if(rs.next()){
//            ciudad.setIdCiudad(rs.getInt("idCiudad"));
//            ciudad.setNombreCiudad(rs.getString("Nombre"));
//            ciudad.setPais(rs.getString("Pais"));
//            ciudad.setProvincia(rs.getString("Provincia"));
//            ciudad.setEstado(rs.getBoolean("Estado"));
//            ciudades.add(ciudad);
//        }
//        ps.close();
//        
////        for(Ciudad lista : ciudades){
////            jcbPrueba.addItem(lista);
////        }
//        
//        }catch(SQLException ex){
//            JOptionPane.showMessageDialog(null, "Error al realizar la consulta en ComboBox "+ex);
//        }
//        return ciudades;
//    } 

}
