
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.*;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Movimiento;


public class Movimiento_Data {

    Connection con = null;    
    Alojamiento al = new Alojamiento();
    Movimiento mov = new Movimiento();
    
    
    public Movimiento_Data(){
        con = Conexion.getConexion();
    }
    
    public void guardarMovimiento(Movimiento movimiento){
        
        String sql = "INSERT INTO movimiento (FechaIngreso, FechaSalida, idAlojamiento, Estado) "
                + "VALUES (?,?,?,?)";
        
        try{
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        ps.setDate(1, Date.valueOf(movimiento.getFechaIngreso()));
        ps.setDate(2,Date.valueOf(movimiento.getFechaSalida()));
        ps.setInt(3, movimiento.getIdAlojamiento().getIdAlojamiento());
        ps.setBoolean(4, movimiento.isEstado());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
        movimiento.setIdMovimiento(rs.getInt(1));
        JOptionPane.showMessageDialog(null, "Codigo de Movimiento:" + movimiento.getIdMovimiento() );
        }
        ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }        
    }
    // ----- BORRADO LOGICO ----- probar sql
    public void eliminarMovimiento(int id){
        String sql = "UPDATE movimiento SET Estado = 0 WHERE idMovimiento = ?";
        
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        int exito= ps.executeUpdate();
        if(exito == 1) {
            JOptionPane.showMessageDialog(null, "Movimiento eliminado");
        }
        ps.close();
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos");
        }
        
    }
    
    
    public Movimiento buscarMovimiento(int idMov){
    
        String sql = "SELECT FechaIngreso, FechaSalida, idAlojamiento, Estado FROM movimiento WHERE idMovimiento = ?";
    
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idMov);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Alojamiento_Data ald = new Alojamiento_Data();
            mov.setIdMovimiento(idMov);
            mov.setFechaIngreso(rs.getDate("FechaIngreso").toLocalDate());
            mov.setFechaSalida(rs.getDate("Fecha_Salida").toLocalDate());
            al=ald.buscarAlojamientoPorId(rs.getInt("idAlojamiento"));
            mov.setEstado(rs.getBoolean("Estado"));   
        }
        ps.close();
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos");
        }
        return mov;
    } 
    
    // ----- COMPROBAR SQL ------
    public List<Movimiento> buscarMovimientosOcupados(int idAlojamiento, LocalDate fInicio, LocalDate fSalida){
        ArrayList <Movimiento> movimientos = new ArrayList<>();
        
        String sql = "SELECT idMovimiento, Estado FROM movimiento "
                + "WHERE idAlojamiento = ?, FechaIngreso = ? FechaSalida = ?";
        
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idAlojamiento);
        ps.setDate(2, Date.valueOf(fInicio));
        ps.setDate(3,Date.valueOf(fSalida));
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            mov.setIdMovimiento(idAlojamiento);
        }
        
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos");
        }
        
        
        return movimientos;
    }
    
    
    public boolean compararFechas(){
        
        
        boolean activo = false;
        return activo;
    }

    
}
