
package proyecto.transversal.vista;

import java.awt.Color;

/**
 *
 * @author YamilaAlejandra
 */
public class Paquete extends javax.swing.JPanel {

    public Paquete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Ciudad_Origen = new javax.swing.JComboBox<>();
        Ciudad_Destino = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Guardar = new javax.swing.JPanel();
        jLGuardar = new javax.swing.JLabel();
        Modificar = new javax.swing.JPanel();
        jLModificar = new javax.swing.JLabel();
        Eliminar = new javax.swing.JPanel();
        jLEliminar = new javax.swing.JLabel();
        Salir = new javax.swing.JPanel();
        jLSalir = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLBuscar = new javax.swing.JLabel();

        Fondo.setBackground(new java.awt.Color(102, 102, 102));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Fondo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 110, 162, 26));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Paquete");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 20, 108, 33));

        Fondo.add(Ciudad_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 110, 170, -1));

        Fondo.add(Ciudad_Destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 110, 170, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        Fondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 270, 260));

        jLGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLGuardar.setText("Guardar");
        jLGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout GuardarLayout = new javax.swing.GroupLayout(Guardar);
        Guardar.setLayout(GuardarLayout);
        GuardarLayout.setHorizontalGroup(
            GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        GuardarLayout.setVerticalGroup(
            GuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Fondo.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 611, -1, -1));

        jLModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLModificar.setText("Modificar");
        jLModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ModificarLayout = new javax.swing.GroupLayout(Modificar);
        Modificar.setLayout(ModificarLayout);
        ModificarLayout.setHorizontalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        ModificarLayout.setVerticalGroup(
            ModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        Fondo.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 610, -1, 31));

        jLEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLEliminar.setText("Eliminar");
        jLEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout EliminarLayout = new javax.swing.GroupLayout(Eliminar);
        Eliminar.setLayout(EliminarLayout);
        EliminarLayout.setHorizontalGroup(
            EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        EliminarLayout.setVerticalGroup(
            EliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        Fondo.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 610, -1, -1));

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
            .addComponent(jLSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        SalirLayout.setVerticalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        Fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 610, 60, -1));
        Fondo.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));
        Fondo.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Llegada");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseClicked
        // TODO add your handling code here:
        Fondo.setVisible(false);
    }//GEN-LAST:event_jLSalirMouseClicked

    private void jLBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseEntered
        // TODO add your handling code here:
        jLBuscar.setBackground(new Color(103, 71, 48));
        jLBuscar.setForeground(Color.white);
    }//GEN-LAST:event_jLBuscarMouseEntered

    private void jLBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBuscarMouseExited
        // TODO add your handling code here:
        jLBuscar.setBackground(new Color(244, 231, 187));
        jLBuscar.setForeground(Color.black);
    }//GEN-LAST:event_jLBuscarMouseExited

    private void jLSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseEntered
        // TODO add your handling code here:
        jLSalir.setBackground(new Color(103, 71, 48));
        jLSalir.setForeground(Color.white);
    }//GEN-LAST:event_jLSalirMouseEntered

    private void jLSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLSalirMouseExited
        // TODO add your handling code here:
        jLSalir.setBackground(new Color(244, 231, 187));
        jLSalir.setForeground(Color.black);
    }//GEN-LAST:event_jLSalirMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudad_Destino;
    private javax.swing.JComboBox<String> Ciudad_Origen;
    private javax.swing.JPanel Eliminar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Guardar;
    private javax.swing.JPanel Modificar;
    private javax.swing.JPanel Salir;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLBuscar;
    private javax.swing.JLabel jLEliminar;
    private javax.swing.JLabel jLGuardar;
    private javax.swing.JLabel jLModificar;
    private javax.swing.JLabel jLSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
