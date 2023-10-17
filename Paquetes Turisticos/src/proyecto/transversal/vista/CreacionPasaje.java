package proyecto.transversal.vista;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.Ciudad_Data;
import proyecto.transversal.accesoADatos.Pasaje_Data;
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Pasaje;

public class CreacionPasaje extends javax.swing.JPanel {
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int filas, int columnas) {
            return false;
        }
    };
    
    public CreacionPasaje() {
        initComponents();
        CargarComboCiudadOrigen();
        CargarComboCiudad();
        ArmarCabezera();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        labeBuscarCiudad = new javax.swing.JLabel();
        labelImporte = new javax.swing.JLabel();
        labeDeshabilitar = new javax.swing.JLabel();
        labelHabilitar = new javax.swing.JLabel();
        labelModificar = new javax.swing.JLabel();
        labelGuardar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTransporte = new javax.swing.JComboBox<>();
        jCiudad = new javax.swing.JComboBox<>();
        jImporte = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        labelSalir = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBuscarCiudad = new javax.swing.JComboBox<>();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pasajes Creados");

        setPreferredSize(new java.awt.Dimension(600, 700));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pasaje");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 590, 373));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pasajes Creados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 590, -1));

        labeBuscarCiudad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labeBuscarCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeBuscarCiudad.setText("BUSCAR POR Ciudad");
        labeBuscarCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labeBuscarCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeBuscarCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labeBuscarCiudadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeBuscarCiudadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeBuscarCiudadMouseExited(evt);
            }
        });
        jPanel1.add(labeBuscarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 242, -1, 25));

        labelImporte.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labelImporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImporte.setText("BUSCAR POR IMPORTE");
        labelImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelImporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelImporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelImporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelImporteMouseExited(evt);
            }
        });
        jPanel1.add(labelImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 171, 26));

        labeDeshabilitar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labeDeshabilitar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeDeshabilitar.setText("DESHABILITAR");
        labeDeshabilitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labeDeshabilitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeDeshabilitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labeDeshabilitarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeDeshabilitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeDeshabilitarMouseExited(evt);
            }
        });
        jPanel1.add(labeDeshabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 659, -1, 30));

        labelHabilitar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelHabilitar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHabilitar.setText("HABILITAR");
        labelHabilitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelHabilitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelHabilitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHabilitarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelHabilitarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelHabilitarMouseExited(evt);
            }
        });
        jPanel1.add(labelHabilitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 659, 136, 30));

        labelModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModificar.setText("MODIFICAR");
        labelModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelModificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelModificarMouseExited(evt);
            }
        });
        jPanel1.add(labelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 183, 110, 30));

        labelGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGuardar.setText("GUARDAR");
        labelGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelGuardarMouseExited(evt);
            }
        });
        jPanel1.add(labelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 183, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Tipo de Tansporte");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 133, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Importe");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 143, 133, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Nombre de Ciudad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 103, -1, -1));

        jTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colectivo", "Avion", "Tren", "Barco" }));
        jPanel1.add(jTransporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 65, 270, -1));

        jPanel1.add(jCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 105, 270, -1));
        jPanel1.add(jImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 145, 270, -1));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 242, 65, 27));

        jLabel6.setText("a");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 245, -1, 20));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 242, 65, 27));

        labelSalir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("SALIR");
        labelSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSalirMouseExited(evt);
            }
        });
        jPanel1.add(labelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 659, 100, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cliquear 2 veses para modificar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 666, -1, -1));

        jBuscarCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jBuscarCiudadItemStateChanged(evt);
            }
        });
        jBuscarCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarCiudadActionPerformed(evt);
            }
        });
        jPanel1.add(jBuscarCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 242, 108, 27));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelImporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseClicked
        labelSalir.setBackground(new Color(244, 231, 187));
        labelSalir.setForeground(Color.black);
    }//GEN-LAST:event_labelImporteMouseClicked

    private void labelImporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseEntered
        labelSalir.setBackground(new Color(103, 71, 48));
        labelSalir.setForeground(Color.white);
    }//GEN-LAST:event_labelImporteMouseEntered

    private void labelImporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseExited
        labelSalir.setBackground(new Color(244, 231, 187));
        labelSalir.setForeground(Color.black);
    }//GEN-LAST:event_labelImporteMouseExited

    private void labeDeshabilitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeDeshabilitarMouseClicked
        labeDeshabilitar.setBackground(new Color(244, 231, 187));
        labeDeshabilitar.setForeground(Color.black);
        try{
            Pasaje pasaje = (Pasaje) jBuscarCiudad.getSelectedItem();
            Pasaje_Data insc = new Pasaje_Data();
            
            //Para obtener los índices de fila.
            int  filaSeleccionada = jTable.getSelectedRow();
            int idM = (int) jTable.getValueAt(filaSeleccionada,0);
            int idP = pasaje.getIdPasaje();
            
            insc.DesabilitarPasaje(idP);
            
            BorrarFilas();
            for (Pasaje ins : insc.ObtenerPasajeHabilitados(idM)){
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getImporte(), ins.getNombre_ciudad_origen(),ins.getTipo_Tansporte()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Usted no ha seleccionado un Pasaje");
        }
    }//GEN-LAST:event_labeDeshabilitarMouseClicked

    private void labeDeshabilitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeDeshabilitarMouseEntered
        labeDeshabilitar.setBackground(new Color(103, 71, 48));
        labeDeshabilitar.setForeground(Color.white);
    }//GEN-LAST:event_labeDeshabilitarMouseEntered

    private void labeDeshabilitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeDeshabilitarMouseExited
        labeDeshabilitar.setBackground(new Color(244, 231, 187));
        labeDeshabilitar.setForeground(Color.black);
    }//GEN-LAST:event_labeDeshabilitarMouseExited

    private void labelHabilitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHabilitarMouseClicked
        labelHabilitar.setBackground(new Color(244, 231, 187));
        labelHabilitar.setForeground(Color.black);
        try{
            Pasaje pasaje = (Pasaje) jBuscarCiudad.getSelectedItem();
            Pasaje_Data insc = new Pasaje_Data();
            
            
            //Para obtener los índices de fila.
            int  filaSeleccionada = jTable.getSelectedRow();
            int idM = (int) jTable.getValueAt(filaSeleccionada,0);
            int idP = pasaje.getIdPasaje();
            
            insc.HabilitarPasaje(idP);
            
            BorrarFilas();
            for (Pasaje ins : insc.ObtenerPasajesDesabilitados(idM)){
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getImporte(), ins.getNombre_ciudad_origen(),ins.getTipo_Tansporte()});
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Usted no ha seleccionado un Pasaje");
        }
    }//GEN-LAST:event_labelHabilitarMouseClicked

    private void labelHabilitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHabilitarMouseEntered
        labelHabilitar.setBackground(new Color(103, 71, 48));
        labelHabilitar.setForeground(Color.white);
    }//GEN-LAST:event_labelHabilitarMouseEntered

    private void labelHabilitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHabilitarMouseExited
        labelHabilitar.setBackground(new Color(244, 231, 187));
        labelHabilitar.setForeground(Color.black);
    }//GEN-LAST:event_labelHabilitarMouseExited

    private void labelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModificarMouseClicked
        labelModificar.setBackground(new Color(244, 231, 187));
        labelModificar.setForeground(Color.black);
        Pasaje_Data pd = new Pasaje_Data();
        
        String tp = (String) jTransporte.getSelectedItem();
        Double imp = Double.parseDouble(jImporte.getText());
        Ciudad ciu = (Ciudad) jCiudad.getSelectedItem();
        boolean e = true;
        
        Pasaje pasaje = new Pasaje(tp,imp,ciu,e);
        
        pd.ModificarPasaje(pasaje);
    }//GEN-LAST:event_labelModificarMouseClicked

    private void labelModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModificarMouseEntered
        labelModificar.setBackground(new Color(103, 71, 48));
        labelModificar.setForeground(Color.white);
    }//GEN-LAST:event_labelModificarMouseEntered

    private void labelModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModificarMouseExited
        labelModificar.setBackground(new Color(244, 231, 187));
        labelModificar.setForeground(Color.black);
    }//GEN-LAST:event_labelModificarMouseExited

    private void labelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseClicked
        labelGuardar.setBackground(new Color(244, 231, 187));
        labelGuardar.setForeground(Color.black);
        Pasaje_Data pd = new Pasaje_Data();
        
        String tp = (String) jTransporte.getSelectedItem();
        Double imp = Double.parseDouble(jImporte.getText());
        Ciudad ciu = (Ciudad) jCiudad.getSelectedItem();
        boolean e = true;
        
        Pasaje pasaje = new Pasaje(tp,imp,ciu,e);
        
        pd.GuardarPasaje(pasaje);
    }//GEN-LAST:event_labelGuardarMouseClicked

    private void labelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseEntered
        labelGuardar.setBackground(new Color(103, 71, 48));
        labelGuardar.setForeground(Color.white);
    }//GEN-LAST:event_labelGuardarMouseEntered

    private void labelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseExited
        labelGuardar.setBackground(new Color(244, 231, 187));
        labelGuardar.setForeground(Color.black);
    }//GEN-LAST:event_labelGuardarMouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        labelSalir.setBackground(new Color(244, 231, 187));
        labelSalir.setForeground(Color.black);
    }//GEN-LAST:event_labelSalirMouseClicked

    private void labelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseEntered
        labelSalir.setBackground(new Color(103, 71, 48));
        labelSalir.setForeground(Color.white);
    }//GEN-LAST:event_labelSalirMouseEntered

    private void labelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseExited
        labelSalir.setBackground(new Color(244, 231, 187));
        labelSalir.setForeground(Color.black);
    }//GEN-LAST:event_labelSalirMouseExited

    private void jBuscarCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscarCiudadActionPerformed

    private void labeBuscarCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeBuscarCiudadMouseClicked
        labeBuscarCiudad.setBackground(new Color(244, 231, 187));
        labeBuscarCiudad.setForeground(Color.black);
    }//GEN-LAST:event_labeBuscarCiudadMouseClicked

    private void labeBuscarCiudadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeBuscarCiudadMouseEntered
        labeBuscarCiudad.setBackground(new Color(103, 71, 48));
        labeBuscarCiudad.setForeground(Color.white);
    }//GEN-LAST:event_labeBuscarCiudadMouseEntered

    private void labeBuscarCiudadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeBuscarCiudadMouseExited
        labeBuscarCiudad.setBackground(new Color(244, 231, 187));
        labeBuscarCiudad.setForeground(Color.black);
    }//GEN-LAST:event_labeBuscarCiudadMouseExited

    private void jBuscarCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jBuscarCiudadItemStateChanged
        try{
            Ciudad_Data cd = new Ciudad_Data();
            Ciudad ciudad = new Ciudad();
            String ciudad2 = (String) jBuscarCiudad.getSelectedItem();
            
            ciudad = cd.busquedaPorCiudad(ciudad2);
            
            int ciu = ciudad.getIdCiudad();
            Pasaje_Data insc = new Pasaje_Data();
            BorrarFilas();
            for (Pasaje ins : insc.BuscarPasajePorCiudad(ciu)) {
                modelo.addRow(new Object[]{ins.getIdPasaje(),ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte()});
            }
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Seleccione una Ciudad");
            BorrarFilas();
        }
    }//GEN-LAST:event_jBuscarCiudadItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBuscarCiudad;
    private javax.swing.JComboBox<Ciudad> jCiudad;
    private javax.swing.JTextField jImporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> jTransporte;
    private javax.swing.JLabel labeBuscarCiudad;
    private javax.swing.JLabel labeDeshabilitar;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JLabel labelHabilitar;
    private javax.swing.JLabel labelImporte;
    private javax.swing.JLabel labelModificar;
    private javax.swing.JLabel labelSalir;
    // End of variables declaration//GEN-END:variables
    
    public void CargarComboCiudadOrigen(){
        Ciudad_Data cd = new Ciudad_Data();
        jCiudad.addItem(jCiudad.getItemAt(-1));
        for ( Ciudad ciudad : cd.obtenerCiudad()){
            jCiudad.addItem(ciudad);
        }
    }
    public void CargarComboCiudad(){
        Ciudad_Data cd = new Ciudad_Data();
        jBuscarCiudad.addItem(jBuscarCiudad.getItemAt(-1));
        for ( Ciudad ciudad : cd.obtenerCiudad()){
            jBuscarCiudad.addItem(ciudad.getNombreCiudad());
        }
    }
    private void ArmarCabezera(){
       modelo.addColumn("Ciudad");
       modelo.addColumn("Transporte");
       modelo.addColumn("Importe");
       modelo.addColumn("Estado");
       jTable.setModel(modelo);
    }
    private void BorrarFilas(){
        int filas = jTable.getRowCount()-1;
        for(int f = filas; f >= 0 ; f--){
            modelo.removeRow(f);
        }
    }
}