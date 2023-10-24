
package proyecto.transversal.vista;

import java.awt.Color;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.Alojamiento_Data;
import proyecto.transversal.accesoADatos.Ciudad_Data;
import proyecto.transversal.accesoADatos.Paquete_Data;
import proyecto.transversal.accesoADatos.Pasaje_Data;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Pasaje;

/**
 *
 * @author YamilaAlejandra
 */
public class Paquete extends javax.swing.JPanel {
  private DefaultListModel modeloA = new DefaultListModel();
  private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int filas, int columnas) {
            return false;
        }
    };
  
    public Paquete() {
        initComponents();
        cargaPais();
        cargaPais2();
        CargarPasaje();
        ArmarCabezera();
        CargarTable();
       
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
        Salir = new javax.swing.JPanel();
        jLSalir = new javax.swing.JLabel();
        FechaEntrada = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLBuscar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCCuidad_deOrigen = new javax.swing.JComboBox<>();
        jCiudad_Destino = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jCTipodPasaje = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

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
        Fondo.add(Ciudad_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, -1));

        Ciudad_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ciudad_DestinoActionPerformed(evt);
            }
        });
        Fondo.add(Ciudad_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 140, -1));

        jLGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLGuardar.setText("Guardar");
        jLGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLGuardarMouseClicked(evt);
            }
        });

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

        Fondo.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        jLModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificar.setText("Modificar");
        jLModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar);
        Modificar.setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, -1, 31));

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

        Fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 60, -1));
        Fondo.add(FechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Entrada");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 80, 30));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cuidad de origen");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Cuidad de destino");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 20));

        Fondo.add(jCCuidad_deOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 250, -1));

        Fondo.add(jCiudad_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 250, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Tipo de pasaje");
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        jCTipodPasaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTipodPasajeActionPerformed(evt);
            }
        });
        Fondo.add(jCTipodPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 180, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        Fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 580, 260));

        jScrollPane3.setViewportView(jList1);

        Fondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 380, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
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
           jCiudad_Destino.addItem(ciudad.getNombreCiudad());
           }
   
    }//GEN-LAST:event_Ciudad_DestinoActionPerformed

    private void Ciudad_OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ciudad_OrigenActionPerformed
         String pais =  (String) Ciudad_Origen.getSelectedItem();
         Ciudad_Data cd = new Ciudad_Data();
         jCCuidad_deOrigen.removeAllItems();
            for ( Ciudad ciudad: cd.arrayBusquedaPais(pais)){
         jCCuidad_deOrigen.addItem(ciudad.getNombreCiudad());
           }
    }//GEN-LAST:event_Ciudad_OrigenActionPerformed

    private void jLBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseClicked

        java.util.Date fechaentradaUtil = FechaEntrada.getDate();
        Instant instant = fechaentradaUtil.toInstant();
        LocalDate fechaEntrada = instant.atZone(ZoneId.systemDefault()).toLocalDate();
//
//        java.util.Date fechasalidaUtil = FechaSalida.getDate();
//        Instant instantt = fechasalidaUtil.toInstant();
//        LocalDate fechaSalida = instantt.atZone(ZoneId.systemDefault()).toLocalDate();
//        
        Alojamiento_Data al = new Alojamiento_Data();
         jList1.setModel(modeloA);
        for (Alojamiento alo : al.buscarAlojamientofecha(fechaEntrada)) {
         modeloA.addElement(alo.getTipoAlojamiento()+" - "+alo.getServicio()+" - Importe: "+alo.getImporteDiario());
        }
           
    }//GEN-LAST:event_jLBuscarMouseClicked

    private void jCTipodPasajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTipodPasajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCTipodPasajeActionPerformed

    private void jLGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLGuardarMouseClicked
        // TODO add your handling code here:
        Ciudad_Data cd = new Ciudad_Data(); 
        Pasaje_Data ps = new Pasaje_Data();
        String ciu = (String) jCCuidad_deOrigen.getSelectedItem();
        Ciudad ciudad = (Ciudad) cd.busquedaPorCiudad(ciu);
        System.out.println(ciudad);
        String ci = (String) jCiudad_Destino.getSelectedItem();
        Ciudad ciudad1 = (Ciudad) cd.busquedaPorCiudad(ci);
//        System.out.println(ciudad1);
//        String pas = (String) jCTipodPasaje.getSelectedItem();
//        Pasaje pasaje = (Pasaje) ps.obtenerPasajes(pas);
//        System.out.println(pasaje);
//        String pas = (String) jCTipodPasaje.getSelectedItem();
//        Pasaje pasaje = (Pasaje) ps.obtenerPasajes(pas);
//        Alojamiento al = CargarAlojamiento.getSelectedValue(); 
//        System.out.println(al);
//        Paquete pa = new Paquete(ciudad,ciudad1,al,pasaje);
        Paquete_Data Pd = new Paquete_Data();  
//        Pd.GuardarPaquete(pa);
    }//GEN-LAST:event_jLGuardarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudad_Destino;
    private javax.swing.JComboBox<String> Ciudad_Origen;
    private com.toedter.calendar.JDateChooser FechaEntrada;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Guardar;
    private javax.swing.JPanel Modificar;
    private javax.swing.JPanel Salir;
    private javax.swing.JComboBox<String> jCCuidad_deOrigen;
    private javax.swing.JComboBox<String> jCTipodPasaje;
    private javax.swing.JComboBox<String> jCiudad_Destino;
    private javax.swing.JLabel jLBuscar;
    private javax.swing.JLabel jLGuardar;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
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
    Set<String> Pasaje = new HashSet<>();
    jCTipodPasaje.addItem(jCTipodPasaje.getItemAt(-1));
    for(Pasaje PD : pd.buscarPasaje()){
        String nombrepasaje = PD.getTipo_Tansporte();
        if(!Pasaje.contains(nombrepasaje)){
         jCTipodPasaje.addItem(nombrepasaje);
         Pasaje.add(nombrepasaje);
        }
      }
  }

 
 private void ArmarCabezera(){
     modelo.addColumn("id");
     modelo.addColumn("Cuidad de Origen");
     modelo.addColumn("Cuidad de Destino");
     modelo.addColumn("Alojamiento");
     modelo.addColumn("Pasaje");
     jTable1.setModel(modelo);
     
           int[] anchos = {60,200, 200, 200, 190};

        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
 }
 
 private void BorrarFilas(){
        int filas = jTable1.getRowCount()-1;
        for(int f = filas; f >= 0 ; f--){
            modelo.removeRow(f);
        }
}
 
 private void CargarTable(){
    Paquete_Data pq = new Paquete_Data();
    for(proyecto.transversal.entidades.Paquete alo : pq.ObtenerPaquete()){
       modelo.addRow(new Object[]{alo.getIdPaquete(),alo.getOrigen().getNombreCiudad(),
       alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(),alo.getPasaje().getTipo_Tansporte()});
    }
 }
}
