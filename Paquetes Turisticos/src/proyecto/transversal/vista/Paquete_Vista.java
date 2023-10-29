
package proyecto.transversal.vista;

import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.Alojamiento_Data;
import proyecto.transversal.accesoADatos.Ciudad_Data;
import proyecto.transversal.accesoADatos.Paquete_Data;
import proyecto.transversal.accesoADatos.Pasaje_Data;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Paquete;
import proyecto.transversal.entidades.Pasaje;

/**
 *
 * @author YamilaAlejandra
 */
public class Paquete_Vista extends javax.swing.JPanel {
  private DefaultTableModel modeloA = new DefaultTableModel(){
    public boolean isCellEditable(int filas, int columnas) {
            return false;
        }
  };
  private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int filas, int columnas) {
            return false;
        }
    };
  
    public Paquete_Vista() {
        initComponents();
        cargaPais();
        cargaPais2();
        ArmarCabezera();
        ArmarCabezera2();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCCuidad_deOrigen = new javax.swing.JComboBox<>();
        jCiudad_Destino = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jCTipodPasaje = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        Fondo.setBackground(new java.awt.Color(102, 102, 102));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
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

        Fondo.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificar.setText("Modificar");
        jLModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLModificarMouseClicked(evt);
            }
        });

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

        Fondo.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, 31));

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

        Fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 60, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cuidad de origen");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 130, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Cuidad de destino");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 140, 20));

        jCCuidad_deOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCCuidad_deOrigenActionPerformed(evt);
            }
        });
        Fondo.add(jCCuidad_deOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 250, -1));

        jCiudad_Destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCiudad_DestinoActionPerformed(evt);
            }
        });
        Fondo.add(jCiudad_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 250, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Tipo de pasaje");
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, 20));

        Fondo.add(jCTipodPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 180, -1));

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        Fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 580, 310));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable2);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 570, 110));

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

    private void jLSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseEntered
        jLSalir.setBackground(new Color(103, 71, 48));
        jLSalir.setForeground(Color.white);
    }//GEN-LAST:event_jLSalirMouseEntered

    private void jLSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseExited
        jLSalir.setBackground(new Color(244, 231, 187));
        jLSalir.setForeground(Color.black);
    }//GEN-LAST:event_jLSalirMouseExited

    private void Ciudad_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ciudad_DestinoActionPerformed
        String pais = (String) Ciudad_Destino.getSelectedItem();
        Ciudad_Data cd = new Ciudad_Data();
        jCiudad_Destino.removeAllItems();
        for (Ciudad ciudad : cd.arrayBusquedaPais(pais)) {
            jCiudad_Destino.addItem(ciudad.getNombreCiudad());
        }
    }//GEN-LAST:event_Ciudad_DestinoActionPerformed

    private void Ciudad_OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ciudad_OrigenActionPerformed
        String pais = (String) Ciudad_Origen.getSelectedItem();
        Ciudad_Data cd = new Ciudad_Data();
        jCCuidad_deOrigen.removeAllItems();
        for (Ciudad ciudad : cd.arrayBusquedaPais(pais)) {
            jCCuidad_deOrigen.addItem(ciudad.getNombreCiudad());
        }
    }//GEN-LAST:event_Ciudad_OrigenActionPerformed

    private void jLGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLGuardarMouseClicked

        Ciudad_Data cd = new Ciudad_Data(); 
        Pasaje_Data ps = new Pasaje_Data();
        Paquete_Data Pd = new Paquete_Data();  
        Alojamiento_Data alo = new Alojamiento_Data();
        
        if( jTable2.getSelectedRow() == -1 || jCiudad_Destino.getSelectedItem()== null || jCiudad_Destino.getSelectedItem()== null || 
            jCTipodPasaje.getSelectedItem() == null){
              JOptionPane.showMessageDialog(null, "Seleccione todos los datos");
        } else{
            String ciu = (String) jCCuidad_deOrigen.getSelectedItem();
            Ciudad ciudadOrigen = (Ciudad) cd.busquedaPorCiudad(ciu);

            String ci = (String) jCiudad_Destino.getSelectedItem();
            Ciudad ciudadDestino = (Ciudad) cd.busquedaPorCiudad(ci);

            String pas = (String) jCTipodPasaje.getSelectedItem();
            int id_ciudad_origen = ciudadOrigen.getIdCiudad();
            Pasaje pasaje = ps.obtenerPasajes(pas, id_ciudad_origen);

            int al = jTable2.getSelectedRow();
            int id = (int) jTable2.getValueAt(al, 0);
            Alojamiento alojamiento = alo.buscarAlojamientoPorId(id);
            alo.desactivarAlojamiento(id);
            Paquete pa = new Paquete(ciudadOrigen, ciudadDestino, alojamiento, pasaje, true);
            Pd.GuardarPaquete(pa);
             BorrarFilas1();
             CargarTable();
             BorrarFilas();
        }
        

       
    }//GEN-LAST:event_jLGuardarMouseClicked

    private void jCiudad_DestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCiudad_DestinoActionPerformed
        // TODO add your handling code here:
        try{ 
        Alojamiento_Data al = new Alojamiento_Data();
        Ciudad_Data cd = new Ciudad_Data();
        String ci = (String) jCiudad_Destino.getSelectedItem();
        Ciudad ciudad = (Ciudad) cd.busquedaPorCiudad(ci);
        BorrarFilas();
        for (Alojamiento alo : al.alojamientoPorCiudad(ciudad)) {
            modeloA.addRow(new Object[]{alo.getIdAlojamiento(),alo.getTipoAlojamiento(),alo.getServicio(),
                alo.getImporteDiario()});
        }
        }catch(Exception ex){
        }
    }//GEN-LAST:event_jCiudad_DestinoActionPerformed

    private void jCCuidad_deOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCCuidad_deOrigenActionPerformed
        // TODO add your handling code here:
        try{
        Ciudad_Data cd = new Ciudad_Data(); 
        String ciu = (String) jCCuidad_deOrigen.getSelectedItem();
        Ciudad ciudad = (Ciudad) cd.busquedaPorCiudad(ciu);
        Pasaje_Data pd = new Pasaje_Data();
        Set<String> Pasaje = new HashSet<>();
        jCTipodPasaje.removeAllItems();
        for (Pasaje PD : pd.buscarPasajePorCiudad(ciudad.getIdCiudad())) {
            String nombrepasaje = PD.getTipo_Tansporte();
            if (!Pasaje.contains(nombrepasaje)) {
                jCTipodPasaje.addItem(nombrepasaje);
                Pasaje.add(nombrepasaje);
            }
        }
        }catch(Exception ex){
        }
    }//GEN-LAST:event_jCCuidad_deOrigenActionPerformed

    private void jLModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLModificarMouseClicked
      
       try {
        Paquete_Data Pd = new Paquete_Data();  
        int paquetee =  jTable1.getSelectedRow();
        int idd = (int) jTable1.getValueAt(paquetee , 0);
       
        Ciudad_Data cd = new Ciudad_Data(); 
        Pasaje_Data ps = new Pasaje_Data();
        Alojamiento_Data alo = new Alojamiento_Data();
        
        String ciu = (String) jCCuidad_deOrigen.getSelectedItem();
        Ciudad ciudadOrigen = (Ciudad) cd.busquedaPorCiudad(ciu);

        
        String ci = (String) jCiudad_Destino.getSelectedItem();
        Ciudad ciudadDestino = (Ciudad) cd.busquedaPorCiudad(ci);
        
        String pas = (String) jCTipodPasaje.getSelectedItem();
        int id_ciudad_origen = ciudadOrigen.getIdCiudad();
        
        Pasaje pasaje = ps.obtenerPasajes(pas,id_ciudad_origen);
        
        int al =  jTable2.getSelectedRow();
        int id =  (int) jTable2.getValueAt(al, 0);
        Alojamiento alojamiento = alo.buscarAlojamientoPorId(id);
        alo.desactivarAlojamiento(id);
        
        Paquete paquete = new Paquete(idd ,ciudadOrigen, ciudadDestino, alojamiento, pasaje, true);
        Pd.ModificarPaqueteID(paquete); 
       }catch(Exception ex){
       }
        BorrarFilas1();
        CargarTable();
        BorrarFilas();
    }//GEN-LAST:event_jLModificarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            if (evt.getClickCount() == 2) {
            Ciudad_Data cd = new Ciudad_Data();
            Alojamiento_Data aloj = new Alojamiento_Data();

            int filaSeleccionada = jTable1.getSelectedRow();
            String ciudad = (String) jTable1.getValueAt(filaSeleccionada, 1);
            Ciudad ciudadd = cd.busquedaPorCiudad(ciudad);
            Ciudad_Origen.setSelectedItem(ciudadd.getPais());
            jCCuidad_deOrigen.setSelectedItem(ciudadd.getNombreCiudad());

            String c = (String) jTable1.getValueAt(filaSeleccionada, 2);
            Ciudad ci = cd.busquedaPorCiudad(c);
            Ciudad_Destino.setSelectedItem(ci.getPais());
            jCiudad_Destino.setSelectedItem(ci.getNombreCiudad());

            String alojamiento =  (String) jTable1.getValueAt(filaSeleccionada,3); 
            for (Alojamiento alo : aloj.alojamientoPorCiudadyAlojamiento(ci, alojamiento)) {
            modeloA.addRow(new Object[]{alo.getIdAlojamiento(),alo.getTipoAlojamiento(),alo.getServicio(),
                alo.getImporteDiario()});}
            
            String pasaje =  (String) jTable1.getValueAt(filaSeleccionada, 4);
            jCTipodPasaje.setSelectedItem(pasaje);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudad_Destino;
    private javax.swing.JComboBox<String> Ciudad_Origen;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Guardar;
    private javax.swing.JPanel Modificar;
    private javax.swing.JPanel Salir;
    private javax.swing.JComboBox<String> jCCuidad_deOrigen;
    private javax.swing.JComboBox<String> jCTipodPasaje;
    private javax.swing.JComboBox<String> jCiudad_Destino;
    private javax.swing.JLabel jLGuardar;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    public void cargaPais() {
        Ciudad_Data cd = new Ciudad_Data();
        Set<String> paisAgregadas = new HashSet<>(); // Utilizamos un conjunto para evitar duplicados
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
        for (Ciudad bus : cd.obtenerCiudadHabilitada()) {
            String paices = bus.getPais();
            if (!paisAgregadas.contains(paices)) {
                Ciudad_Destino.addItem(paices);
                paisAgregadas.add(paices); // Agrega el pais al conjunto
            }
        }
    }

    private void ArmarCabezera() {
        modelo.addColumn("id");
        modelo.addColumn("Cuidad de Origen");
        modelo.addColumn("Cuidad de Destino");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Pasaje");
        jTable1.setModel(modelo);
        
        int[] anchos = {50, 200, 200, 200,150};

        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    private void ArmarCabezera2() {
        modeloA.addColumn("id");
        modeloA.addColumn("Alojamiento");
        modeloA.addColumn("Servicio");
        modeloA.addColumn("Importe");
        jTable2.setModel(modeloA);
        
                  int[] anchos = {60, 200, 200, 200};

        for (int i = 0; i < jTable2.getColumnCount(); i++) {
            jTable2.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    private void BorrarFilas() {
        int filas = jTable2.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modeloA.removeRow(f);
        }
    }
      
    private void BorrarFilas1() {
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void CargarTable() {
        Paquete_Data pq = new Paquete_Data();
        for (proyecto.transversal.entidades.Paquete alo : pq.ObtenerPaquete()) {
            modelo.addRow(new Object[]{alo.getIdPaquete(), alo.getOrigen().getNombreCiudad(),
                alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(), alo.getPasaje().getTipo_Tansporte()});
        }
    }
}
