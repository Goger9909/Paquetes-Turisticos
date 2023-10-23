
package proyecto.transversal.vista;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;
import proyecto.transversal.accesoADatos.Alojamiento_Data;
import proyecto.transversal.accesoADatos.Ciudad_Data;
import proyecto.transversal.accesoADatos.Pasaje_Data;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Pasaje;

/**
 *
 * @author YamilaAlejandra
 */
public class Paquete extends javax.swing.JPanel {

    public Paquete() {
        initComponents();
        cargaPais();
        cargaPais2();
        CargarPasaje();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ciudad_Origen = new javax.swing.JComboBox<>();
        Ciudad_Destino = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JPanel();
        jLGuardar = new javax.swing.JLabel();
        Modificar = new javax.swing.JPanel();
        jLModificar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JPanel();
        jLEliminar = new javax.swing.JLabel();
        Salir = new javax.swing.JPanel();
        jLSalir = new javax.swing.JLabel();
        FechaEntrada = new com.toedter.calendar.JDateChooser();
        FechaSalida = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLBuscar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCCuidad_deOrigen = new javax.swing.JComboBox<>();
        jCiudad_Destino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCTipodPasaje = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        Fondo.setBackground(new java.awt.Color(102, 102, 102));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Paquete");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 20, 108, 33));

        Ciudad_Origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ciudad_OrigenActionPerformed(evt);
            }
        });
        Fondo.add(Ciudad_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 140, -1));

        Ciudad_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ciudad_DestinoActionPerformed(evt);
            }
        });
        Fondo.add(Ciudad_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, -1));

        jLGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLGuardar.setText("Guardar");
        jLGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout GuardarLayout = new javax.swing.GroupLayout(Guardar);
        Guardar.setLayout(GuardarLayout);
        GuardarLayout.setHorizontalGroup(
            GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        GuardarLayout.setVerticalGroup(
            GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, -1, -1));

        jLModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificar.setText("Modificar");
        jLModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar);
        Modificar.setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarLayout.createSequentialGroup()
                .addComponent(jLModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Fondo.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 650, -1, 31));

        jLEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEliminar.setText("Eliminar");
        jLEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout EliminarLayout = new javax.swing.GroupLayout(Eliminar);
        Eliminar.setLayout(EliminarLayout);
        EliminarLayout.setHorizontalGroup(
            EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EliminarLayout.setVerticalGroup(
            EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 650, -1, -1));

        jLSalir.setBackground(new java.awt.Color(0, 0, 255));
        jLSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLSalir.setText("salir");
        jLSalir.setToolTipText("");
        jLSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SalirLayout = new javax.swing.GroupLayout(Salir);
        Salir.setLayout(SalirLayout);
        SalirLayout.setHorizontalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SalirLayout.setVerticalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 650, 60, -1));
        Fondo.add(FechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));
        Fondo.add(FechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entrada");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 30));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Salida");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 60, 30));

        jLBuscar.setBackground(new java.awt.Color(0, 51, 255));
        jLBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBuscar.setText(" Buscar");
        jLBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cuidad de origen");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Cuidad de destino");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, 20));

        Fondo.add(jCCuidad_deOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 250, -1));

        Fondo.add(jCiudad_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 250, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad de Personas");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 160, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Precio: ");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, -1));
        Fondo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 70, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Tipo de pasaje");
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jCTipodPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipodPasajeActionPerformed(evt);
            }
        });
        Fondo.add(jCTipodPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        Fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 270, 560, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseClicked
           Fondo.setVisible(false);
    }//GEN-LAST:event_jLSalirMouseClicked

    private void jLBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseEntered
         jLBuscar.setBackground(new Color(103, 71, 48));
        jLBuscar.setForeground(Color.white);
    }//GEN-LAST:event_jLBuscarMouseEntered

    private void jLBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseExited
        jLBuscar.setBackground(new Color(244, 231, 187));
        jLBuscar.setForeground(Color.black);
    }//GEN-LAST:event_jLBuscarMouseExited

    private void jLSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseEntered
        jLSalir.setBackground(new Color(103, 71, 48));
        jLSalir.setForeground(Color.white);
    }//GEN-LAST:event_jLSalirMouseEntered

    private void jLSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseExited
        jLSalir.setBackground(new Color(244, 231, 187));
        jLSalir.setForeground(Color.black);
    }//GEN-LAST:event_jLSalirMouseExited

    private void Ciudad_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ciudad_DestinoActionPerformed
         String pais =  (String)  Ciudad_Destino.getSelectedItem();
         Ciudad_Data cd = new Ciudad_Data();
           jCiudad_Destino.removeAllItems();
             for ( Ciudad ciudad: cd.arrayBusquedaPais(pais)){
           jCiudad_Destino.addItem(ciudad.getProvincia()+"-"+ciudad.getNombreCiudad());
           }
   
    }//GEN-LAST:event_Ciudad_DestinoActionPerformed

    private void Ciudad_OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ciudad_OrigenActionPerformed
         String pais =  (String) Ciudad_Origen.getSelectedItem();
         Ciudad_Data cd = new Ciudad_Data();
         jCCuidad_deOrigen.removeAllItems();
            for ( Ciudad ciudad: cd.arrayBusquedaPais(pais)){
         jCCuidad_deOrigen.addItem(ciudad.getProvincia()+"-"+ciudad.getNombreCiudad());
           }
    }//GEN-LAST:event_Ciudad_OrigenActionPerformed

    private void jLBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseClicked
       
        java.util.Date fechaentradaUtil = FechaEntrada.getDate();
        Instant instant = fechaentradaUtil.toInstant();
        LocalDate fechaEntrada = instant.atZone(ZoneId.systemDefault()).toLocalDate();

        java.util.Date fechasalidaUtil = FechaSalida.getDate();
        Instant instantt = fechasalidaUtil.toInstant();
        LocalDate fechaSalida = instantt.atZone(ZoneId.systemDefault()).toLocalDate();

        Alojamiento_Data al = new Alojamiento_Data();
        for (Alojamiento alo : al.buscarAlojamientofecha(fechaEntrada, fechaSalida)) {
            jTextArea1.setText(alo.toString());
        }
    }//GEN-LAST:event_jLBuscarMouseClicked

    private void jCTipodPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipodPasajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTipodPasajeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudad_Destino;
    private javax.swing.JComboBox<String> Ciudad_Origen;
    private javax.swing.JPanel Eliminar;
    private com.toedter.calendar.JDateChooser FechaEntrada;
    private com.toedter.calendar.JDateChooser FechaSalida;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Guardar;
    private javax.swing.JPanel Modificar;
    private javax.swing.JPanel Salir;
    private javax.swing.JComboBox<String> jCCuidad_deOrigen;
    private javax.swing.JComboBox<String> jCTipodPasaje;
    private javax.swing.JComboBox<String> jCiudad_Destino;
    private javax.swing.JLabel jLBuscar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JLabel jLGuardar;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

 public void cargaPais() {
        Ciudad_Data cd = new Ciudad_Data();
        Set<String> paisAgregadas = new HashSet<>(); // Utilizamos un conjunto para evitar duplicados
        Ciudad_Origen.addItem(Ciudad_Origen.getItemAt(-1));
        for (Ciudad bus : cd.obtenerCiudadHabilitada()) {
            String paices = bus.getPais();
            if (!paisAgregadas.contains(paices)) {
               Ciudad_Origen.addItem(paices);
                paisAgregadas.add(paices); // Agrega la provincia al conjunto
            }
        }
    }
 
  public void cargaPais2() {
        Ciudad_Data cd = new Ciudad_Data();
        Set<String> paisAgregadas = new HashSet<>(); // Utilizamos un conjunto para evitar duplicados
        Ciudad_Destino.addItem(Ciudad_Destino.getItemAt(-1));
        for (Ciudad bus : cd.obtenerCiudadHabilitada()) {
            String paices = bus.getPais();
            if (!paisAgregadas.contains(paices)) {
              Ciudad_Destino.addItem(paices);
                paisAgregadas.add(paices); // Agrega el pais al conjunto
            }
        }
    }


public void CargarPasaje(){
    Pasaje_Data pd = new Pasaje_Data();
    for(Pasaje PD : pd.buscarPasaje()){
       jCTipodPasaje.addItem(PD.getTipo_Tansporte());
    }
}


}



