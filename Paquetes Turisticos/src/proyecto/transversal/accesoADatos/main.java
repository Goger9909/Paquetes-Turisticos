/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.time.LocalDate;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;

/**
 *
 * @author MiPc
 */
public class main {
    public static void main(String[] arg){
        Connection a1=Conexion.getConexion();
        Ciudad_Data cd = new Ciudad_Data();
        Ciudad c = new Ciudad(18,"Argentina", "Merlo", "San Luis", true);
//        cd.agregarCiudad(c);
        Alojamiento a = new Alojamiento(LocalDate.now(), LocalDate.now(), "Hotel", "Con desayuno", true, 10000, c);
        Alojamiento_Data ad = new Alojamiento_Data();
        
        ad.guardarAlojamiento(a);
    }
}
