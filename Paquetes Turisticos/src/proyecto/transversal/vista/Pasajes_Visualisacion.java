
package proyecto.transversal.vista;

import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.Ciudad_Data;
import proyecto.transversal.accesoADatos.Pasaje_Data;
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Pasaje;

/**
 *
 * @author yamiilaalejandra
 */
public final class Pasajes_Visualisacion extends javax.swing.JInternalFrame {
  private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int filas, int columnas) {
            return false;
        }
    };

    public Pasajes_Visualisacion() {
        initComponents();
        CargarCombo();
        ArmarCabezera();
        this.setLocation(100,100);
        this.setSize(487, 455);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Nombre = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCBCiudad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        PasajesHabilitados = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        PasajesDeshabilitados = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        Deshabilitar = new javax.swing.JButton();
        Habilitar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jToggleButton1.setText("jToggleButton1");

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de Pasajes por Ciudad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 300, 22));

        jCBCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBCiudadItemStateChanged(evt);
            }
        });
        jPanel1.add(jCBCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 240, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione una Ciudad:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, 26));

        PasajesHabilitados.setText("Pasajes Habilitados");
        PasajesHabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasajesHabilitadosActionPerformed(evt);
            }
        });
        jPanel1.add(PasajesHabilitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 163, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText(" Listado de Pasajes");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, 28));

        PasajesDeshabilitados.setText("Pasajes Deshabilitados");
        PasajesDeshabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasajesDeshabilitadosActionPerformed(evt);
            }
        });
        jPanel1.add(PasajesDeshabilitados, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 30));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 450, 210));

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        Deshabilitar.setText("Deshabilitar");
        Deshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeshabilitarActionPerformed(evt);
            }
        });
        jPanel1.add(Deshabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        Habilitar.setText("Habilitar");
        Habilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabilitarActionPerformed(evt);
            }
        });
        jPanel1.add(Habilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasajesDeshabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasajesDeshabilitadosActionPerformed
         PasajesDeshabilitados.setSelected(true); 
         PasajesHabilitados.setSelected(false);
         Deshabilitar.setEnabled(false);
         Habilitar.setEnabled(true);
        
         try{
        Pasaje pasaje = (Pasaje) jCBCiudad.getSelectedItem();
        int idA = pasaje.getIdPasaje();
        double doe= pasaje.getImporte();
        Pasaje_Data insc = new Pasaje_Data();
        BorrarFilas();
            for (Pasaje ins : insc.ObtenerPasajesDesabilitados(idA,doe)) {
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getImporte(), ins.getNombre_ciudad_origen(),ins.getTipo_Tansporte()});
            }
         }catch (NullPointerException ex){
         JOptionPane.showMessageDialog(null, "Seleccione una Ciudad");
         BorrarFilas();
         }    
    }//GEN-LAST:event_PasajesDeshabilitadosActionPerformed

    private void jCBCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBCiudadItemStateChanged
      try{
        Pasaje pasaje = (Pasaje) jCBCiudad.getSelectedItem();
        int idA = pasaje.getIdPasaje();
        double doe= pasaje.getImporte();
        Pasaje_Data insc = new Pasaje_Data();
        boolean activo  = PasajesDeshabilitados.isSelected();
        boolean activo1 = PasajesHabilitados.isSelected();
        if (activo == true) { 
            BorrarFilas();
            for (Pasaje ins : insc.ObtenerPasajesDesabilitados(idA,doe)) {
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getImporte(), ins.getNombre_ciudad_origen(),ins.getTipo_Tansporte()});
            }
        } else if (activo1 == true) {
            BorrarFilas();
            for (Pasaje ins : insc.ObtenerPasajesDesabilitados(idA,doe)) {
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getImporte(), ins.getNombre_ciudad_origen(),ins.getTipo_Tansporte()});
            }
        }
      }catch(NullPointerException ex){ 
          JOptionPane.showMessageDialog(null, "Seleccione una Ciudad");
          BorrarFilas();
        }
    }//GEN-LAST:event_jCBCiudadItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PasajesHabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasajesHabilitadosActionPerformed
       PasajesDeshabilitados.setSelected(false); 
       PasajesHabilitados.setSelected(true);
       Habilitar.setEnabled(false);
       Deshabilitar.setEnabled(true);
       
       try{
        Pasaje pasaje = (Pasaje) jCBCiudad.getSelectedItem();
        int idP = pasaje.getIdPasaje();
        double doe= pasaje.getImporte();
        Pasaje_Data insc = new Pasaje_Data();
         BorrarFilas();
            for (Pasaje ins : insc.ObtenerPasajesDesabilitados(idP,doe)) {
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getImporte(), ins.getNombre_ciudad_origen(),ins.getTipo_Tansporte()});
            }
       }catch (NullPointerException ex){
         JOptionPane.showMessageDialog(null, "Seleccione una Ciudad");
         BorrarFilas();
         } 
    }//GEN-LAST:event_PasajesHabilitadosActionPerformed

    private void HabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabilitarActionPerformed
        try{
            Pasaje pasaje = (Pasaje) jCBCiudad.getSelectedItem();
            Pasaje_Data insc = new Pasaje_Data();
            
            //Para obtener los índices de fila.
            int  filaSeleccionada = jTable.getSelectedRow();
            
            int idM = (int) jTable.getValueAt(filaSeleccionada,0);
            
            int idP = pasaje.getIdPasaje();
            double doe= pasaje.getImporte();
            
            insc.HabilitarPasaje(idP);
            
            BorrarFilas();
            for (Pasaje ins : insc.ObtenerPasajesDesabilitados(idP,doe)) {
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getImporte(), ins.getNombre_ciudad_origen(),ins.getTipo_Tansporte()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Usted no ha seleccionado un Pasaje");
        }
    }//GEN-LAST:event_HabilitarActionPerformed

    private void DeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeshabilitarActionPerformed
        try{
            Pasaje pasaje = (Pasaje) jCBCiudad.getSelectedItem();
            Pasaje_Data insc = new Pasaje_Data();
            
            //Para obtener los índices de fila.
            int  filaSeleccionada = jTable.getSelectedRow();
            
            int idM = (int) jTable.getValueAt(filaSeleccionada,0);
            
            int idP = pasaje.getIdPasaje();
            double doe= pasaje.getImporte();
            
            insc.DesabilitarPasaje(idP);
            
            BorrarFilas();
            for (Pasaje ins : insc.ObtenerPasajeHabilitados(idP,doe)) {
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getImporte(), ins.getNombre_ciudad_origen(),ins.getTipo_Tansporte()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Usted no ha seleccionado un Pasaje");
        }
    }//GEN-LAST:event_DeshabilitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deshabilitar;
    private javax.swing.JButton Habilitar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JRadioButton PasajesDeshabilitados;
    private javax.swing.JRadioButton PasajesHabilitados;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<Ciudad> jCBCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables

    public void CargarCombo(){
        Ciudad_Data cd = new Ciudad_Data();
        jCBCiudad.addItem(jCBCiudad.getItemAt(-1));
        for ( Ciudad ciudad : cd.obtenerCiudad()){
            jCBCiudad.addItem(ciudad);
        }
    }
    
    private void ArmarCabezera(){
       modelo.addColumn("ID");
       modelo.addColumn("Inporte");
       modelo.addColumn("Nombre de ciudad");
       modelo.addColumn("Tipo de Transporte");
       jTable.setModel(modelo);
    }
 
    private void BorrarFilas(){
        int filas = jTable.getRowCount()-1;
        for(int f = filas; f >= 0 ; f--){
        modelo.removeRow(f);
        }
    }
}
