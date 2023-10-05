/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.transversal.accesoADatos;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Paquete;
import proyecto.transversal.entidades.Pasaje;

/**
 *
 * @author MiPc
 */
public class main {
    public static void main(String[] arg){
        Connection con = Conexion.getConexion();
        LocalDate fecha = LocalDate.of(2023, Month.MARCH, 23);
        LocalDate fecha1 = LocalDate.of(2023, Month.MAY, 23);
        Ciudad ciudad = new Ciudad(5,"Buenos Aires","Argentina","Capital Federar",true);  
        Pasaje pasaje = new Pasaje("Avion",20000, ciudad ,true);
        Alojamiento alo = new Alojamiento(fecha,fecha1, true, 20000, ciudad ); 
        Paquete  paque = new Paquete(ciudad , ciudad , alo , pasaje);
        Paquete_Data pa = new Paquete_Data(); 
        pa.GuardarPaquete(paque);
        
        
        
    }
}
