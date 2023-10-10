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
        Connection a1=Conexion.getConexion();
        Ciudad_Data cd = new Ciudad_Data();
        Ciudad ciu = new Ciudad(19,"Argentina","Corrientes","Corrientes",true);
//        cd.agregarCiudad(ciu);
        Ciudad ci = new Ciudad(20,"Argentina","San Rafael","Mendoza",true);
//         cd.agregarCiudad(ci);
       
//           for(Cuidad s : cd.buscarCiudadPorID()){
//               
//           }
           
        Pasaje_Data ps = new Pasaje_Data();
        Pasaje pd = new Pasaje(18,"tren",20,ciu,true);
//        ps.GuardarPasaje(pd);
        Alojamiento_Data ad = new Alojamiento_Data();
        Alojamiento al = new  Alojamiento(3,LocalDate.now(),LocalDate.now(),"hotel","con desayuno",true,20000,ci);
//        ad.guardarAlojamiento(al);
        Paquete_Data pq = new Paquete_Data();
//        Paquete pah = new Paquete(ciu,ci,al,pd);
//        pq.GuardarPaquete(pa);
        
//        for(Paquete pa : pq.ObtenerPaquete() ){
//            System.out.println(pa.getIdPaquete());
//            System.out.println(pa.getOrigen());
//            System.out.println(pa.getDestino());
//            System.out.println(pa.getAlojamiento());
//            System.out.println(pa.getPasaje());
//        }
         
    }
}
