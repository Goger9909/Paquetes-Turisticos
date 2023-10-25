package proyecto.transversal.vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.Paquete_Data;

/**
 *
 * @author YamilaAlejandra
 */
public class Paquete2 extends javax.swing.JPanel {
private DefaultTableModel modelo = new DefaultTableModel(){
    public boolean isCeliEditable(int f, int c){
        return false;
    }
};
    
    public Paquete2() {
        initComponents();
        ArmarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Buscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("PAQUETE2");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 30, 100, 40));

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

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, 580, 320));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Comprar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, -1, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("salir");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, -1, 30));

        jLabel4.setText(" Buscar : ");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 156, 110, 30));

        Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarKeyTyped(evt);
            }
        });
        Fondo.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 180, -1));

        jLabel5.setText("Cantidad de Personas");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 166, 130, 20));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        Fondo.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 40, -1));

        jLabel7.setText("       PRECIO");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyReleased
      Paquete_Data pq = new Paquete_Data();
      BorrarFilas();
    for(proyecto.transversal.entidades.Paquete alo : pq.ObtenerPaquete()){
        if(alo.getDestino().getNombreCiudad().startsWith(Buscar.getText())){
       modelo.addRow(new Object[]{alo.getIdPaquete(),alo.getOrigen().getNombreCiudad(),
       alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(),
       alo.getPasaje().getTipo_Tansporte(),alo.isEstado()});
       }
    }
    }//GEN-LAST:event_BuscarKeyReleased

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
          Fondo.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try{
        int filaSeleccionada  =  jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(filaSeleccionada , 0);//accedemos al valor de la primera fila y la primera columna seleccionada.
        Paquete_Data Pd = new Paquete_Data();  
         Pd.BorrarPaquetePorId(id);
         BorrarFilas();
        for(proyecto.transversal.entidades.Paquete alo : Pd.ObtenerPaquete()){  
          modelo.addRow(new Object[]{alo.getIdPaquete(),alo.getOrigen().getNombreCiudad(),
         alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(),
          alo.getPasaje().getTipo_Tansporte(),alo.isEstado()});
      }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Usted no ha seleccionado un paquete");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Paquete_Data Pd = new Paquete_Data();  
        int filaSeleccionada  =  jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(filaSeleccionada , 0);
            Pd.ModificarEstadoID(false, id);
//        int filaSeleccionada1  =  jTable1.getSelectedRow();
//        boolean id1 = (boolean) jTable1.getValueAt(filaSeleccionada1 , 6);
         BorrarFilas();
        for(proyecto.transversal.entidades.Paquete alo : Pd.ObtenerPaquete()){  
          modelo.addRow(new Object[]{alo.getIdPaquete(),alo.getOrigen().getNombreCiudad(),
         alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(),
          alo.getPasaje().getTipo_Tansporte(),alo.isEstado()});
        }
     
    }//GEN-LAST:event_jLabel1MouseClicked

    private void BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarKeyTyped
        int key = evt.getKeyChar();
        boolean letrasMin = key >= 97 && key <= 122;
        boolean letrasMay = key >= 65 && key <= 90;
        boolean espacio = key == 32;
        if (!(letrasMin || letrasMay || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_BuscarKeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(numeros || punto)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Buscar;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void ArmarCabecera(){
     modelo.addColumn("id");
     modelo.addColumn("Cuidad de Origen");
     modelo.addColumn("Cuidad de Destino");
     modelo.addColumn("Alojamiento");
     modelo.addColumn("Pasaje");
     modelo.addColumn("Estado");
     jTable1.setModel(modelo);
     
        int[] anchos = {60,200, 200, 200, 190,60};

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
}
