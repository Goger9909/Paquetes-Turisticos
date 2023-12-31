
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Paquete;
import proyecto.transversal.entidades.Pasaje;

/**
 *
 * @author YamilaGarcia
 */
public class Paquete_Data {
    
     private  Connection con = null;
     private  Ciudad_Data Cd = new Ciudad_Data(); 
     private  Alojamiento_Data Ad = new Alojamiento_Data(); 
     private  Pasaje_Data Pd = new Pasaje_Data(); 
       
    public void GuardarPaquete(Paquete paquete){
            con = Conexion.getConexion();
       try {
            String sql = "INSERT INTO paquete(Ciudad_Origen, Ciudad_Destino, alojamiento, pasaje,disponible) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
               ps.setInt(1, paquete.getOrigen().getIdCiudad());
               ps.setInt(2, paquete.getDestino().getIdCiudad());
               ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
               ps.setInt(4, paquete.getPasaje().getIdPasaje());
               ps.setBoolean(5, paquete.isEstado());
               ps.executeUpdate();
               ResultSet rs = ps.getGeneratedKeys();
               if (rs.next()) {
                   paquete.setIdPaquete(1);
                   JOptionPane.showMessageDialog(null, "se guardo un paquete");
               }
              rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }  
    }
    
    public List<Paquete> ObtenerPaquete(){
         con = Conexion.getConexion();
    ArrayList<Paquete> paquetee = new ArrayList<>();
    String sql = "SELECT * FROM paquete ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(resultado.getInt("idPaquete"));
                Ciudad ciudad =  Cd.buscarCiudadPorID(resultado.getInt("Ciudad_Origen"));
                paquete.setOrigen(ciudad);
                Ciudad ciu = Cd.buscarCiudadPorID(resultado.getInt("Ciudad_Destino"));
                paquete.setDestino(ciu);
                Alojamiento al = Ad.buscarAlojamientoPorId(resultado.getInt("alojamiento"));
                paquete.setAlojamiento(al);
                Pasaje pa = Pd.buscarPasajePorId(resultado.getInt("pasaje"));
                paquete.setPasaje(pa);
                paquete.setEstado(resultado.getBoolean("disponible"));
                paquetee.add(paquete);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
        return paquetee; 
 }       

    public void BorrarPaquetePorId(int idPaquete){
           con = Conexion.getConexion();
     String sql = "DELETE FROM paquete WHERE idPaquete = ?";
     try {
         PreparedStatement ps = con.prepareStatement(sql); 
         ps.setInt(1, idPaquete);
         int rs = ps.executeUpdate();
          if(rs == 1){
              JOptionPane.showMessageDialog(null, "Se elimino el Paquete");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro registros");
          }
          ps.close();
     }  catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
 } 
     
    public void ModificarCiudad_OrigenID(int Ciudad,int ciudad){
           con = Conexion.getConexion();
     String sql = "UPDATE paquete SET Ciudad_Origen = ? WHERE Ciudad_Origen = ?";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, Ciudad);
          ps.setInt(2, ciudad);
          int rs = ps.executeUpdate();
          if(rs > 0){
              JOptionPane.showMessageDialog(null, "Se Modifico el paquete");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro resultado");
          }
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
 }
      
    public void ModificarCiudad_DestinoID(int Ciudad,int ciudad){
           con = Conexion.getConexion();
     String sql = "UPDATE paquete SET Ciudad_Destino = ? WHERE Ciudad_Destino = ?";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, Ciudad);
          ps.setInt(2, ciudad);
          int rs = ps.executeUpdate();
          if(rs > 0){
              JOptionPane.showMessageDialog(null, "Se Modifico el paquete");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro resultado");
          }
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
     }
     
    public void ModificarAlojamientoID(int Alojamiento,int alojamiento){
           con = Conexion.getConexion();
     String sql = "UPDATE paquete SET alojamiento= ? WHERE alojamiento = ?";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, Alojamiento);
          ps.setInt(2, alojamiento);
          int rs = ps.executeUpdate();
          if(rs > 0){
              JOptionPane.showMessageDialog(null, "Se Modifico el paquete");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro resultado");
          }
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
       }
       
    public void ModificarPasajeID(int Pasaje,int pasaje){
           con = Conexion.getConexion();
         String sql = "UPDATE paquete SET pasaje = ? WHERE  pasaje = ? ";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, Pasaje);
          ps.setInt(2, pasaje);
          int rs = ps.executeUpdate();
          if(rs > 0){
              JOptionPane.showMessageDialog(null, "Se Modifico el paquete");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro resultado");
          }
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
       }     
    
      public void comprado(int Paquete){
           con = Conexion.getConexion();
         String sql = "UPDATE `paquete` SET `disponible` = true WHERE `paquete`.`idPaquete` = ?";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, Paquete);
          ps.executeUpdate();
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
       }     
      
       public void noComprado(int Paquete){
           con = Conexion.getConexion();
         String sql = "UPDATE `paquete` SET `disponible` = false WHERE `paquete`.`idPaquete` = ?";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          Paquete pa = new Paquete();
          ps.setInt(1, Paquete);
          ps.setBoolean(2, pa.isEstado());
          
          int rs = ps.executeUpdate();
          if(rs > 0){
//              JOptionPane.showMessageDialog(null, "Se Modifico el paquete");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro resultado");
          }
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
       }     
       
   public ArrayList<Paquete> ObtenerPaquetePorCiudad(String Ciudad){
              con = Conexion.getConexion();
    ArrayList<Paquete> paquetee = new ArrayList<>();
    String sql = "SELECT `idPaquete`, `Ciudad_Origen`, `Ciudad_Destino`, `alojamiento`, `pasaje`, `disponible` FROM paquete JOIN ciudad ON "
            + "(paquete.Ciudad_Origen = ciudad.idCiudad) WHERE ciudad.Nombre = ? AND paquete.disponible = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Ciudad);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Paquete paquet = new Paquete();
                paquet.setIdPaquete(resultado.getInt("idPaquete"));
                Ciudad ciudad =  Cd.buscarCiudadPorID(resultado.getInt("Ciudad_Origen"));
                paquet.setOrigen(ciudad);
                Ciudad ciu = Cd.buscarCiudadPorID(resultado.getInt("Ciudad_Destino"));
                paquet.setDestino(ciu);
                Alojamiento al = Ad.buscarAlojamientoPorId(resultado.getInt("alojamiento"));
                paquet.setAlojamiento(al);
                Pasaje pa = Pd.buscarPasajePorId(resultado.getInt("pasaje"));
                paquet.setPasaje(pa);
                paquet.setEstado(resultado.getBoolean("disponible"));
                paquetee.add(paquet);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
        return paquetee;  
       }
   
      public List<Paquete> ObtenerPaquetePorFechaCiudad(int ano,int mes, String nom){
           con = Conexion.getConexion();
           PreparedStatement ps = null;
           ArrayList<Paquete> paquetePorMes = new ArrayList<>();
           String sql = "SELECT * FROM paquete JOIN alojamiento JOIN ciudad ON (paquete.alojamiento = alojamiento.idAlojamiento)AND "
                   + "(paquete.Ciudad_Origen = ciudad.idCiudad) WHERE YEAR(alojamiento.Fecha_Inicio) = ? "
                   + "AND MONTH(alojamiento.Fecha_Inicio) = ? AND ciudad.Nombre = ? AND paquete.disponible = true";
         try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ano);
            ps.setInt(2, mes);
            ps.setString(3, nom);
            ResultSet resultado = ps.executeQuery();
            while (resultado.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(resultado.getInt("idPaquete"));
                Ciudad ciudad =  Cd.buscarCiudadPorID(resultado.getInt("Ciudad_Origen"));
                paquete.setOrigen(ciudad);
                Ciudad ciu = Cd.buscarCiudadPorID(resultado.getInt("Ciudad_Destino"));
                paquete.setDestino(ciu);
                Alojamiento al = Ad.buscarAlojamientoPorId(resultado.getInt("alojamiento"));
                paquete.setAlojamiento(al);
                Pasaje pa = Pd.buscarPasajePorId(resultado.getInt("pasaje"));
                paquete.setPasaje(pa);
                paquete.setEstado(resultado.getBoolean("disponible"));
                paquetePorMes.add(paquete);
                
            }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
            
         }
         return paquetePorMes;
      }
      
           public Paquete buscarPaquetePorID(int id){
           con = Conexion.getConexion();
           Paquete paqueteR = null;
         String sql = "SELECT * FROM paquete WHERE idPaquete = ? AND disponible = true";
     try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet resultado = ps.executeQuery();
            if (resultado.next()) {
                paqueteR = new Paquete();
                paqueteR.setIdPaquete(id);
                Ciudad ciudad =  Cd.buscarCiudadPorID(resultado.getInt("Ciudad_Origen"));
                paqueteR.setOrigen(ciudad);
                Ciudad ciu = Cd.buscarCiudadPorID(resultado.getInt("Ciudad_Destino"));
                paqueteR.setDestino(ciu);
                Alojamiento al = Ad.buscarAlojamientoPorId(resultado.getInt("alojamiento"));
                paqueteR.setAlojamiento(al);
                Pasaje pa = Pd.buscarPasajePorId(resultado.getInt("pasaje"));
                paqueteR.setPasaje(pa);
                paqueteR.setEstado(resultado.getBoolean("disponible"));
                
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
        return paqueteR;
           }
           
         public void ModificarPaqueteID(Paquete paquete){
           con = Conexion.getConexion();
     String sql = "UPDATE `paquete` SET `Ciudad_Origen`='?',`Ciudad_Destino`='?',"
             + "`alojamiento`='?',`pasaje`='?',`disponible`= true WHERE idPaquete ='?'";
      try {
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setInt(1, paquete.getOrigen().getIdCiudad());
          ps.setInt(2, paquete.getDestino().getIdCiudad());
          ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
          ps.setInt(4, paquete.getPasaje().getIdPasaje());
          int rs = ps.executeUpdate();
          if(rs > 0){
              JOptionPane.showMessageDialog(null, "Se Modifico el paquete");
          } else {
              JOptionPane.showMessageDialog(null, "No se encontro resultado");
          }
          ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
 }   
 }
