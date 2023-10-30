package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.time.*;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;

public class Alojamiento_Data {

    Connection con = null;
    

    public Alojamiento_Data() {
        con = Conexion.getConexion();

    }

    public void guardarAlojamiento(Alojamiento alojamiento) {

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
            if (rs.next()) {

                alojamiento.setIdAlojamiento(rs.getInt(1)); //la primer columna de la BD
                JOptionPane.showMessageDialog(null, "El Alojamiento se guardó con éxito");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
    }

    public void modificarAlojamiento(Alojamiento alojamiento) {
        String sql = " UPDATE alojamiento SET Fecha_Inicio=? , Fecha_Salida=? , Tipo_Alojamiento=? , "
                + "Servicio=? , Importe_Diario=? , Ciudad_Destino=? , Estado=?"
                + "WHERE idAlojamiento=?";

        try {
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
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alojamiento modificado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
    }

    // BORRADO LOGICO
    public void desactivarAlojamiento(int id) {
        String sql = "UPDATE alojamiento SET Estado=0 WHERE idAlojamiento=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
    }

    public void activarAlojamiento(int id) {

        String sql = "UPDATE alojamiento SET Estado=1 WHERE idAlojamiento=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {

//                JOptionPane.showMessageDialog(null, "Se desactivó el alojamiento");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
    }

    // BUSQUEDA POR ID DE ALOJAMIENTO - PUEDE QUE NECESITES BUSQUEDA de alojamiento PERO CON LA ID DE LA CIUDAD PARA EL PAQUETE, ASI QUE LOS DEJO MAS ABAJO  A ESOS METODOS JAJA
    public Alojamiento buscarAlojamientoPorId(int id) {
        Alojamiento alojamiento = new Alojamiento();
        
        
        String sql = "SELECT Fecha_Inicio, Fecha_Salida, Tipo_Alojamiento, Servicio, "
                + "Importe_Diario, Ciudad_Destino, Estado FROM alojamiento WHERE idAlojamiento=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Ciudad_Data cd = new Ciudad_Data();
                alojamiento.setIdAlojamiento(id);
                alojamiento.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                Ciudad ciudad = cd.buscarCiudadPorID(rs.getInt("Ciudad_Destino"));
                alojamiento.setCiudadDest(ciudad);
                alojamiento.setEstado(rs.getBoolean("Estado"));
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
        return alojamiento;
    }

    // METODO PARA BUSCAR LOS ALOJAMIENTOS PASANDO UN OBJETO DEL TIPO CIUDAD (busca por el id de la ciudad)    
    public List<Alojamiento> alojamientoPorCiudad(Ciudad ciudad) {

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        
        String sql = "SELECT idAlojamiento, Fecha_Inicio, Fecha_Salida, Tipo_Alojamiento, Servicio, "
                + "Importe_Diario FROM alojamiento WHERE Ciudad_Destino=? AND Estado = true";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudad.getIdCiudad());
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){     
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                alojamientos.add(alojamiento);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
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
//        while(rs.next()){
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
    public List<Alojamiento> buscarAlojamientofecha(LocalDate fechain) {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        Alojamiento alojamiento = new Alojamiento();
        
        String sql = "SELECT idAlojamiento, Tipo_Alojamiento, Servicio, Importe_Diario,Fecha_Salida, "
                + "Ciudad_Destino, Estado FROM alojamiento WHERE Fecha_Inicio = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, java.sql.Date.valueOf(fechain));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){ 
                
                Ciudad_Data cd = new Ciudad_Data();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaIn(fechain);
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                Ciudad ciudad = cd.buscarCiudadPorID(rs.getInt("Ciudad_Destino"));
                alojamiento.setCiudadDest(ciudad);
                alojamiento.setEstado(rs.getBoolean("Estado"));
                alojamientos.add(alojamiento);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
        return alojamientos;
    }

    
    public List<Alojamiento> buscarAlojamientoMes(LocalDate fechain) {
        con = Conexion.getConexion();
        ArrayList<Alojamiento> aloja = new ArrayList<>();
        Alojamiento alojamiento = new Alojamiento();
        
        String sql = " SELECT * FROM alojamiento WHERE Fecha_Inicio >= ? AND Fecha_Inicio < ? ";
                              
        int anio = fechain.getYear();
        int mes = fechain.getMonthValue();
        int dia = fechain.getDayOfMonth();
        int mes2;
        
        // condicionamos el ultimo mes 12 para que lo compare con enero (1)y nos pase al año siguiente (año+1)
        if(mes == 12){
            mes2 = 1;
            anio = anio+1;
        } else{
            mes2 = mes+1;
        }
        LocalDate fecha2 = LocalDate.of(anio, mes2, 1); // condicion para que la segunda fecha a buscar sea el primer dia del mes siguiente
          
//        System.out.println("fecha2 dia: "+ fecha2.getDayOfMonth());
//        System.out.println("fecha2 mes: "+ fecha2.getMonth());
//        System.out.println("fecha2 año: "+ fecha2.getYear());
//        System.out.println("fecha2 total:"+ fecha2);
        
        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechain));
            ps.setDate(2, Date.valueOf(fecha2));
            ResultSet rs = ps.executeQuery();
            
           while(rs.next()){ 
                Ciudad_Data cd = new Ciudad_Data();
                Alojamiento aloj = new Alojamiento();
                aloj.setIdAlojamiento(rs.getInt("idAlojamiento"));
                aloj.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                aloj.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                aloj.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                aloj.setServicio(rs.getString("Servicio"));
                aloj.setImporteDiario(rs.getDouble("Importe_Diario"));
                Ciudad ciudad = cd.buscarCiudadPorID(rs.getInt("Ciudad_Destino"));
                aloj.setCiudadDest(ciudad);
                aloj.setEstado(rs.getBoolean("Estado"));
                aloja.add(aloj); 
            }
            ps.close();
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
        return aloja;
    }
    
     public ArrayList<Alojamiento> alojamientoPorCiudadyAlojamiento(Ciudad ciudad ,String Tipo) {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        String sql = "SELECT idAlojamiento, Fecha_Inicio, Fecha_Salida, Servicio, Importe_Diario"
                + " FROM alojamiento WHERE Ciudad_Destino = '?'  AND Tipo_Alojamiento = '?'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudad.getIdCiudad());
            ps.setString(2, Tipo);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){     
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                System.out.println(alojamientos);
                alojamientos.add(alojamiento);
              
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
      
        return alojamientos;
    }
     
      
    
     public ArrayList<Alojamiento> buscarAlojamientoCompleto() {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        String sql = "SELECT idAlojamiento, Fecha_Inicio, Fecha_Salida, Tipo_Alojamiento, Servicio, Importe_Diario, Ciudad_Destino"
                + " FROM alojamiento";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){     
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                Ciudad_Data ciu = new Ciudad_Data();
                Ciudad ciudad = ciu.buscarCiudadPorID(rs.getInt("Ciudad_Destino"));
                alojamiento.setCiudadDest(ciudad);
                alojamiento.setEstado(rs.getBoolean("Estado"));
                
                alojamientos.add(alojamiento);
              
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
      
        return alojamientos;
    }
     
     public ArrayList<Alojamiento> buscarAlojamientoInactivo() {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        String sql = "SELECT * FROM alojamiento WHERE Estado = false";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){     
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                Ciudad_Data ciu = new Ciudad_Data();
                Ciudad ciudad = ciu.buscarCiudadPorID(rs.getInt("Ciudad_Destino"));
                alojamiento.setCiudadDest(ciudad);
                alojamiento.setEstado(rs.getBoolean("Estado"));
                
                alojamientos.add(alojamiento);
                alojamientos.add(alojamiento);
              
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
      
        return alojamientos;
    }
     
     public ArrayList<Alojamiento> buscarAlojamientoActivo() {
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        String sql = "SELECT * FROM alojamiento WHERE Estado = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){     
                Alojamiento alojamiento = new Alojamiento();
                alojamiento.setIdAlojamiento(rs.getInt("idAlojamiento"));
                alojamiento.setFechaIn(rs.getDate("Fecha_Inicio").toLocalDate());
                alojamiento.setFechaOn(rs.getDate("Fecha_Salida").toLocalDate());
                alojamiento.setTipoAlojamiento(rs.getString("Tipo_Alojamiento"));
                alojamiento.setServicio(rs.getString("Servicio"));
                alojamiento.setImporteDiario(rs.getDouble("Importe_Diario"));
                Ciudad_Data ciu = new Ciudad_Data();
                Ciudad ciudad = ciu.buscarCiudadPorID(rs.getInt("Ciudad_Destino"));
                alojamiento.setCiudadDest(ciudad);
                alojamiento.setEstado(rs.getBoolean("Estado"));
                
                alojamientos.add(alojamiento);
                alojamientos.add(alojamiento);
              
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos" + ex);
        }
      
        return alojamientos;
    }
}