/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.transversal.vista;

/**
 *
 * @author MiPc
 */
public class CreacionPasaje extends javax.swing.JPanel {

    /**
     * Creates new form CreacionPasaje
     */
    public CreacionPasaje() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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
        jComboBox3 = new javax.swing.JComboBox<>();
        labelSalir = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pasajes Creados");

        setPreferredSize(new java.awt.Dimension(600, 700));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pasaje");

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
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pasajes Creados");

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Tipo de Tansporte");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Importe");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Nombre de Ciudad");

        jTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("a");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cliquear 2 veses para modificar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labeBuscarCiudad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(labelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labeDeshabilitar)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeBuscarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeDeshabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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

    private void labeBuscarCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeBuscarCiudadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labeBuscarCiudadMouseClicked

    private void labeBuscarCiudadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeBuscarCiudadMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labeBuscarCiudadMouseEntered

    private void labeBuscarCiudadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeBuscarCiudadMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labeBuscarCiudadMouseExited

    private void labelImporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelImporteMouseClicked

    private void labelImporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelImporteMouseEntered

    private void labelImporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelImporteMouseExited

    private void labeDeshabilitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeDeshabilitarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labeDeshabilitarMouseClicked

    private void labeDeshabilitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeDeshabilitarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labeDeshabilitarMouseEntered

    private void labeDeshabilitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeDeshabilitarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labeDeshabilitarMouseExited

    private void labelHabilitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHabilitarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelHabilitarMouseClicked

    private void labelHabilitarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHabilitarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelHabilitarMouseEntered

    private void labelHabilitarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHabilitarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelHabilitarMouseExited

    private void labelModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModificarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelModificarMouseClicked

    private void labelModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModificarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelModificarMouseEntered

    private void labelModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModificarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelModificarMouseExited

    private void labelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelGuardarMouseClicked

    private void labelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelGuardarMouseEntered

    private void labelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelGuardarMouseExited

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSalirMouseClicked

    private void labelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSalirMouseEntered

    private void labelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSalirMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jCiudad;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JTable jTable1;
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
}
