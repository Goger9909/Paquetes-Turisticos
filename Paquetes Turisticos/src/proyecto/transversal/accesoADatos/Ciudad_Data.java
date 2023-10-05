/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Ciudad;

/**
 *
 * @author MiPc
 */
public class Ciudad_Data {
    private Connection con = null;
    public Ciudad_Data(){
        con = Conexion.getConexion();
    }
    //<<<<<<<<<<Agregar Ciudad>>>>>>>>>>
    public void agregarCiudad(Ciudad ciudad){
        String sql = "INSERT INTO ciudad(Nombre, Pais, Estado, Provincia) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ciudad.getNombreCiudad());
            ps.setString(2, ciudad.getPais());
            ps.setBoolean(3, ciudad.isEstado());
            ps.setString(4, ciudad.getProvincia());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                ciudad.setIdCiudad(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ciudad añadido con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad"+ ex.getMessage());
        }
    }
    //<<<<<<<<<<Modificar Ciudad>>>>>>>>>>
    public void modificarCiudad(Ciudad ciudad){
        String sql = "UPDATE ciudad SET Nombre = ?, Pais = ?, Provincia = ? WHERE idCiudad = ? AND Estado = true";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ciudad.getNombreCiudad());
            ps.setString(2, ciudad.getPais());
            ps.setString(3, ciudad.getProvincia());
            ps.setInt(4, ciudad.getIdCiudad());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            }else {
                JOptionPane.showMessageDialog(null, "Ciudad no existe");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad"+ ex.getMessage());       
        }
    }
    //<<<<<<<<<<Eliminar Ciudad>>>>>>>>>>
    public void eliminarCiudad (int idCiudad){
        String sql = "UPDATE ciudad SET Estado = false WHERE idCiudad = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            int eliminar = ps.executeUpdate();
            if(eliminar == 1){
                JOptionPane.showMessageDialog(null, "Ciudad eliminada");
            }else{
                JOptionPane.showMessageDialog(null, "Ciudad no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad"+ ex.getMessage());
        }
    }
    //<<<<<<<<<<rehabilitar Ciudad>>>>>>>>>>
    public void rehabilitarCiudad (int idCiudad){
         String sql = "UPDATE ciudad SET Estado = true WHERE idCiudad = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            int eliminar = ps.executeUpdate();
            if(eliminar == 1){
                JOptionPane.showMessageDialog(null, "Ciudad rehabilitada");
            }else{
                JOptionPane.showMessageDialog(null, "Ciudad no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad"+ ex.getMessage());
        }
    }
    //<<<<<<<<<<Buscar Ciudad por nombre>>>>>>>>>>
    public Ciudad busquedaPorCiudad(String ciudad){
        Ciudad nombreCiudad = null;
        String sql = "SELECT idCiudad, Pais, Provincia FROM ciudad WHERE Nombre LIKE ? AND Estado = true";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+ciudad+"%");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                nombreCiudad = new Ciudad();
                nombreCiudad.setNombreCiudad(ciudad);
                nombreCiudad.setIdCiudad(rs.getInt("idCiudad"));
                nombreCiudad.setPais(rs.getString("Pais"));
                nombreCiudad.setProvincia(rs.getString("Provincia"));
                nombreCiudad.setEstado(true);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad"+ ex.getMessage());
        }
        return nombreCiudad;
    }
    //<<<<<<<<<<Buscar Ciudad por Pais>>>>>>>>>>
     public Ciudad busquedaPorPais(String pais){
        Ciudad nombreCiudad = null;
        String sql = "SELECT idCiudad, Nombre, Provincia FROM ciudad WHERE Pais LIKE ? AND Estado = true";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%"+pais+"%");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                nombreCiudad = new Ciudad();
                nombreCiudad.setNombreCiudad(pais);
                nombreCiudad.setIdCiudad(rs.getInt("idCiudad"));
                nombreCiudad.setPais(rs.getString("Nombre"));
                nombreCiudad.setProvincia(rs.getString("Provincia"));
                nombreCiudad.setEstado(true);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad"+ ex.getMessage());
        }
        return nombreCiudad;
    }
    //<<<<<<<<<<Buscar Ciudad por ID>>>>>>>>>>
       public Ciudad buscarCiudadPorID(int idCiudad){
        Ciudad nombreCiudad = null;
        String sql = "SELECT  Nombre, Provincia, Pais FROM ciudad WHERE idCiudad = ? AND Estado = true";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCiudad);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                nombreCiudad = new Ciudad();
                nombreCiudad.setIdCiudad(idCiudad);
                nombreCiudad.setNombreCiudad(rs.getString("Nombre"));
                nombreCiudad.setPais(rs.getString("Pais"));
                nombreCiudad.setProvincia(rs.getString("Provincia"));
                nombreCiudad.setEstado(true);
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ciudad"+ ex.getMessage());
        }
        return nombreCiudad;
    }
    public List<Ciudad> obtenerCiudad(){
    ArrayList<Ciudad> nombreCiudad= new ArrayList<>();
    String sql = "SELECT * FROM ciudad WHERE Estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
                 while(resultado.next()){
                      Ciudad ciud = new  Ciudad();
                      ciud.setIdCiudad(resultado.getInt("idCiudad"));
                      ciud.setNombreCiudad(resultado.getString("Nombre"));
                      ciud.setPais(resultado.getString("Pais"));
                      ciud.setProvincia(resultado.getString("Provincia"));
                      nombreCiudad.add(ciud);
                 }
                 ps.close();
            } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la base de datos" + ex.getMessage());
        }
        return nombreCiudad;
 }     
     
}
