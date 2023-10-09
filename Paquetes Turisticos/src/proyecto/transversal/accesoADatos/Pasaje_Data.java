
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
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Pasaje;

public class Pasaje_Data {
    
    Connection con = null;
    private  Ciudad_Data cd = new Ciudad_Data(); 
    
    public void GuardarPasaje(Pasaje pasaje){
        
        con = Conexion.getConexion();
        
        String sql= "INSERT INTO pasaje(Tipo_Transporte, Importe, Nombre_Ciudad_Origen, Estado)"
                + "VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, pasaje.getTipo_Tansporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getNombre_ciudad_origen().getIdCiudad());
            ps.setBoolean(4, pasaje.isStado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                pasaje.setIdPasaje(rs.getInt(1)); // es la primer columna la del id
                JOptionPane.showMessageDialog(null, "El pasaje se guardo con exito, id: "+pasaje.getIdPasaje());
           }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje" + ex.getMessage());
        }
    }
    public Pasaje BuscarPasajePorInporte(double Importe, double Importe2){
        
        con = Conexion.getConexion();
        Pasaje pasaje=null;
        
        String sql = "SELECT idPasaje, Tipo_Transporte, Importe, Nombre_Ciudad_Origen, Estado FROM pasaje WHERE Importe>=? and Importe<=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, Importe);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("transporte"));
                pasaje.setImporte(Importe);
                Ciudad nombre_ciudad_origen= cd.buscarCiudadPorID(rs.getInt("idCiudad"));
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setStado(rs.getBoolean("estado"));
            } else{
                JOptionPane.showMessageDialog(null, "No existe un pasaje Entre esos valores");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje");
        }
            return pasaje;     
    }
    public Pasaje BuscarPasajePorId(int idPasaje){
        
        con = Conexion.getConexion();
        Pasaje pasaje=null;
        
        String sql = "SELECT Tipo_Transporte, Importe, Nombre_Ciudad_Origen, Estado FROM pasaje WHERE idPasaje=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPasaje);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                pasaje = new Pasaje();
                pasaje.setIdPasaje(idPasaje);
                pasaje.setTipo_Tansporte(rs.getString("transporte"));
                pasaje.setImporte(rs.getDouble("Importe"));
                Ciudad nombre_ciudad_origen= cd.buscarCiudadPorID(rs.getInt("idCiudad"));
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setStado(rs.getBoolean("estado"));
            } else{
                JOptionPane.showMessageDialog(null, "No existe un pasaje con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje");
        }
            return pasaje;     
    }
    public void ModificarPasaje(Pasaje pasaje){
        
        con = Conexion.getConexion();
        PreparedStatement ps = null;
        
        String sql = "UPDATE pasaje SET Tipo_Transporte= ? , Importe= ? , Nombre_Ciudad_Origen = ?"
                        +" WHERE idPasaje = ? ";
            
         try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipo_Tansporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3,pasaje.getNombre_ciudad_origen().getIdCiudad());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            }else{
                JOptionPane.showMessageDialog(null, "El pasaje no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje"+ ex.getMessage());
        }   
    }
    public void DesabilitarPasaje(int id){
        con = Conexion.getConexion();
        
        String sql = "UPDATE pasaje SET estado = true WHERE idPasaje = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int eliminar = ps.executeUpdate();
            if(eliminar == 1){
                JOptionPane.showMessageDialog(null,"EL Pasaje fue deshabilitado");
            }else{
                JOptionPane.showMessageDialog(null,"EL Pasaje no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex.getMessage());
        }
    }
    public void HabilitarPasaje(int id){
        con = Conexion.getConexion();
        
        String sql = "UPDATE pasaje SET estado = false WHERE idPasaje = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int habilitar = ps.executeUpdate();
            if(habilitar == 1){
                JOptionPane.showMessageDialog(null,"EL Pasaje fue habilitado");
            }else{
                JOptionPane.showMessageDialog(null,"EL Pasaje no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex.getMessage());
        }
    }
    public List<Pasaje> ObtenerPasajeHabilitados(int idPasaje, double Importe){
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE estado = 1 AND idPasaje not in ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);    
            ps.setInt(1, idPasaje);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("transporte"));
                pasaje.setImporte(Importe);
                Ciudad nombre_ciudad_origen= cd.buscarCiudadPorID(rs.getInt("idCiudad"));
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setStado(rs.getBoolean("estado"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos pasaje" + ex.getMessage());
        }
        return pasajes;
        }
    public List<Pasaje> ObtenerPasajesDesabilitados(int idPasaje, double Importe){
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE estado = 0 AND idPasaje not in ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);    
            ps.setInt(1, idPasaje);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("transporte"));
                pasaje.setImporte(Importe);
                Ciudad nombre_ciudad_origen= cd.buscarCiudadPorID(rs.getInt("idCiudad"));
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setStado(rs.getBoolean("estado"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos pasaje" + ex.getMessage());
        }
    return pasajes;
    }
}