/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyecto.transversal.entidades.Usuario;

/**
 *
 * @author ferben007
 */
public class Usuario_Data {

    private Connection con = null;
    private ResultSet resultado = null;
    private PreparedStatement ps = null;
    public Usuario_Data(){
        con = ConexionUsuario.getConexion();
    
    }
    public void guardarUsuario(Usuario usuario){
        String sql = "INSERT INTO login (nombre, apellido, usuario, contrase) VALUES (?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getUsuario());
            ps.setString(4, usuario.getLogin());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Creado");
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
    }
    public void modificarlogin(Usuario usuario){
        String sql = "UPDATE login SET contrase = ? WHERE usuario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getUsuario());
            int exito = ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            }else {
                JOptionPane.showMessageDialog(null, "Usuario no EXISTE");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");        }
    }
    public List<Usuario> listarUsuario(){
        ArrayList<Usuario> login = new  ArrayList<>();
        String sql = "SELECT * FROM login";
        try {
            ps = con.prepareStatement(sql);
            resultado = ps.executeQuery();
            while(resultado.next()){
                Usuario usuario = new Usuario();
                usuario.setNombre(resultado.getString("nombre"));
                usuario.setApellido(resultado.getString("apellido"));
                usuario.setUsuario(resultado.getString("usuario"));
                usuario.setLogin(resultado.getString("contrase"));
                login.add(usuario);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR"); 
            
        }
        return login;
    }
    public Usuario buscarUsuario(String usuario){
        Usuario us = null;
        String sql = "SELECT * FROM login WHERE usuario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                us = new Usuario();
                us.setUsuario(usuario);
                us.setApellido(rs.getString("apellido"));
                us.setNombre(rs.getString("nombre"));
                us.setLogin(rs.getString("contrase"));
            }
            rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return us;
    }
}
