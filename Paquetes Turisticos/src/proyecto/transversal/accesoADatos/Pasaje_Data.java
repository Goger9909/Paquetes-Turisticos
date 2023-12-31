package proyecto.transversal.accesoADatos;

import java.sql.Connection;
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

    private Connection con = null;
    private Ciudad_Data cd = new Ciudad_Data();

    //<<<<<<<<<<Guardar Pasaje>>>>>>>>>>
    public void guardarPasaje(Pasaje pasaje) {

        con = Conexion.getConexion();

        String sql = "INSERT INTO pasaje(Tipo_Transporte, Importe, Nombre_Ciudad_Origen, Estado)"
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, pasaje.getTipo_Tansporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getNombre_ciudad_origen().getIdCiudad());
            ps.setBoolean(4, pasaje.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setIdPasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El pasaje se guardo con exito, id: " + pasaje.getIdPasaje());
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje" + ex.getMessage());
        }
    }

    //<<<<<<<<<<Modificar Pasaje>>>>>>>>>>
    public void modificarPasaje(Pasaje pasaje) {

        con = Conexion.getConexion();
        PreparedStatement ps = null;

        String sql = "UPDATE pasaje SET Tipo_Transporte= ? , Importe= ? , Nombre_Ciudad_Origen = ?"
                + " WHERE idPasaje = ? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pasaje.getTipo_Tansporte());
            ps.setDouble(2, pasaje.getImporte());
            ps.setInt(3, pasaje.getNombre_ciudad_origen().getIdCiudad());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "El pasaje no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje" + ex.getMessage());
        }
    }

    //<<<<<<<<<<Buscar Pasaje por Importe>>>>>>>>>>
    public List<Pasaje> buscarPasajePorImporte(double Importe, double Importe2) {
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE Importe>=? AND Importe<=? AND Estado = true";
        con = Conexion.getConexion();
        Pasaje pasaje = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, Importe);
            ps.setDouble(2, Importe2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("Tipo_Transporte"));
                pasaje.setImporte(rs.getDouble("Importe"));
               Ciudad nombre_ciudad_origen = cd.buscarCiudadPorID(rs.getInt("Nombre_Ciudad_Origen"));
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setEstado(true);
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje: " + ex.getMessage());
        }
        return pasajes;
    }

    public List<Pasaje> buscarPasajePorImporteYCiudad(double Importe, double Importe2, int ciudad) {
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        String sql = "SELECT * FROM pasaje WHERE Importe>=? AND Importe<=? AND Estado = true AND Nombre_Ciudad_Origen = ?";
        con = Conexion.getConexion();
        Pasaje pasaje = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, Importe);
            ps.setDouble(2, Importe2);
            ps.setInt(3, ciudad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("Tipo_Transporte"));
                pasaje.setImporte(rs.getDouble("Importe"));
                Ciudad nombre_ciudad_origen = cd.buscarCiudadPorID(ciudad);
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setEstado(true);
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje: " + ex.getMessage());
        }
        return pasajes;
    }

    //<<<<<<<<<<Buscar Pasaje por Id>>>>>>>>>>
    public Pasaje buscarPasajePorId(int idPasaje) {

        con = Conexion.getConexion();
        Pasaje pasaje = null;
        PreparedStatement ps = null;

        String sql = "SELECT Tipo_Transporte, Importe, Nombre_Ciudad_Origen FROM pasaje WHERE idPasaje = ? AND Estado = true";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idPasaje);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setIdPasaje(idPasaje);
                pasaje.setTipo_Tansporte(rs.getString("Tipo_Transporte"));
                pasaje.setImporte(rs.getDouble("Importe"));
                Ciudad nombre_ciudad_origen = cd.buscarCiudadPorID(rs.getInt("Nombre_Ciudad_Origen"));
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setEstado(true);
            } else {
//                JOptionPane.showMessageDialog(null, "No existe un pasaje con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje" + ex.getMessage());
        }
        return pasaje;
    }

    //<<<<<<<<<<Buscar Pasaje por Ciudad>>>>>>>>>>
    public List<Pasaje> buscarPasajePorCiudad(int ciudad) {
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        con = Conexion.getConexion();
        Pasaje pasaje = null;

        String sql = "SELECT idPasaje, Tipo_Transporte, Importe FROM pasaje WHERE Nombre_Ciudad_Origen = ? AND Estado = true";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("Tipo_Transporte"));
                pasaje.setImporte(rs.getDouble("Importe"));
                Ciudad nombre_ciudad_origen = cd.buscarCiudadPorID(ciudad);
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setEstado(true);
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje: " + ex.getMessage());
        }
        return pasajes;
    }

    public List<Pasaje> buscarTodoPasajePorCiudad(int ciudad) {
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        Pasaje pasaje = null;

        String sql = "SELECT * FROM pasaje WHERE Nombre_Ciudad_Origen = ?";
        try {
            con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ciudad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("Tipo_Transporte"));
                pasaje.setImporte(rs.getDouble("Importe"));
                Ciudad nombre_ciudad_origen = cd.buscarCiudadPorID(ciudad);
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setEstado(rs.getBoolean("Estado"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje: " + ex.getMessage());
        }
        return pasajes;
    }

    //<<<<<<<<<<Modificar Pasaje>>>>>>>>>>
    public void desabilitarPasaje(int id) {
        con = Conexion.getConexion();

        String sql = "UPDATE pasaje SET Estado = false WHERE idPasaje = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int eliminar = ps.executeUpdate();
            if (eliminar == 1) {
                JOptionPane.showMessageDialog(null, "EL Pasaje fue deshabilitado");
            } else {
                JOptionPane.showMessageDialog(null, "EL Pasaje no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex.getMessage());
        }
    }

    //<<<<<<<<<<Habilitar Pasaje>>>>>>>>>>
    public void habilitarPasaje(int id) {
        con = Conexion.getConexion();

        String sql = "UPDATE pasaje SET Estado = true WHERE idPasaje = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int habilitar = ps.executeUpdate();
            if (habilitar == 1) {
                JOptionPane.showMessageDialog(null, "EL Pasaje fue habilitado");
            } else {
                JOptionPane.showMessageDialog(null, "EL Pasaje no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasaje" + ex.getMessage());
        }
    }
    public List<Pasaje> buscarPasaje() {
        ArrayList<Pasaje> pasajes = new ArrayList<>();
        con = Conexion.getConexion();
        String sql = "SELECT * FROM pasaje ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("Tipo_Transporte"));
                pasaje.setImporte(rs.getDouble("Importe"));
                Ciudad nombre_ciudad_origen = cd.buscarCiudadPorID(rs.getInt("Nombre_Ciudad_Origen"));
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setEstado(rs.getBoolean("Estado"));
                pasajes.add(pasaje);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasaje" + ex.getMessage());
        }
        return pasajes;
    }

    public Pasaje obtenerPasajes(String Tipo, int id_ciudad_origen) {
        Pasaje pasaje = null;
        con = Conexion.getConexion();
        try {
            String sql = "SELECT * FROM pasaje WHERE Tipo_Transporte = ? AND Nombre_Ciudad_Origen = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, Tipo);
            ps.setInt(2,id_ciudad_origen);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                pasaje = new Pasaje();
                pasaje.setIdPasaje(rs.getInt("idPasaje"));
                pasaje.setTipo_Tansporte(rs.getString("Tipo_Transporte"));
                pasaje.setImporte(rs.getDouble("Importe"));
                Ciudad nombre_ciudad_origen = cd.buscarCiudadPorID(id_ciudad_origen);
                pasaje.setNombre_ciudad_origen(nombre_ciudad_origen);
                pasaje.setEstado(rs.getBoolean("Importe"));
            } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la base de datos pasaje" + ex.getMessage());
        }
        return pasaje;
      
    }
}
