/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.transversal.entidades;

/**
 *
 * @author ferben007
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String login;

    public Usuario(String nombre, String apellido, String usuario, String login) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.login = login;
    }

    public Usuario() {
    }

    public Usuario(String usuario, String login) {
        this.usuario = usuario;
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
}
