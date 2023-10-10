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
  
        Alojamiento_Data ad = new Alojamiento_Data();
        
//        Ciudad ciu = new Ciudad(19,"Argentina","Corrientes","Corrientes",true);    cd.agregarCiudad(ciu);
//        Ciudad ci = new Ciudad(20,"Argentina","San Rafael","Mendoza",true);
////         cd.agregarCiudad(ci);
        Pasaje_Data ps = new Pasaje_Data();
//        Pasaje pd = new Pasaje(18,"tren",20,ciu,true);
////        ps.GuardarPasaje(pd);
//        Alojamiento al = new  Alojamiento(3,LocalDate.now(),LocalDate.now(),"hotel","con desayuno",true,20000,ci);
////        ad.guardarAlojamiento(al);
        Paquete_Data pq = new Paquete_Data();
//        Paquete pa = new Paquete(ciu,ci,al,pd);
//        pq.GuardarPaquete(pa);
//                pq.ObtenerPaquete();
       for(Paquete bus : pq.ObtenerPaquete()){
           System.out.println("---"+bus.getIdPaquete());
           System.out.println(bus.getOrigen().getNombreCiudad());
           System.out.println(bus.getDestino().getNombreCiudad());
           System.out.println(bus.getAlojamiento().getTipoAlojamiento());
           System.out.println(bus.getPasaje().getTipo_Tansporte()); 
       }
//System.out.println(ad.buscarAlojamientoPorId(2));
//        System.out.println(cd.buscarCiudadPorID(15));
//        System.out.println(ps.BuscarPasajePorId(4));
    }
}
