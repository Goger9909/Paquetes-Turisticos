package proyecto.transversal.vista;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.transversal.accesoADatos.Ciudad_Data;
import proyecto.transversal.accesoADatos.Paquete_Data;
import proyecto.transversal.entidades.Ciudad;

/**
 *
 * @author YamilaAlejandra
 */
public class Paquete2 extends javax.swing.JPanel {
    private DefaultTableModel modelo = new DefaultTableModel(){
     public boolean isCeliEditable(int f, int c){
        return false; };
    };
  
    public Paquete2() {
        initComponents();
        ArmarCabecera();
        cargaPais();
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
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ciudad_OrigenPais = new javax.swing.JComboBox<>();
        jCuidadOrigen = new javax.swing.JComboBox<>();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();

        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("PAQUETE2");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 100, 40));

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

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 580, 250));

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cancenlar");
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

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, -1, 40));

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

        Fondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText(" Cuidad de origen : ");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, 30));

        jLabel5.setText("Cantidad de Personas");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 130, 20));

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        Fondo.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 40, -1));

        jLabel7.setText("       PRECIO");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 90, 30));

        Ciudad_OrigenPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ciudad_OrigenPaisActionPerformed(evt);
            }
        });
        Fondo.add(Ciudad_OrigenPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 200, -1));

        Fondo.add(jCuidadOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 210, -1));
        Fondo.add(jYearChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));
        Fondo.add(jMonthChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
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
//            Pd.ModificarEstadoID(false, id);
//        int filaSeleccionada1  =  jTable1.getSelectedRow();
//        boolean id1 = (boolean) jTable1.getValueAt(filaSeleccionada1 , 6);
         BorrarFilas();
        for(proyecto.transversal.entidades.Paquete alo : Pd.ObtenerPaquete()){  
          modelo.addRow(new Object[]{alo.getIdPaquete(),alo.getOrigen().getNombreCiudad(),
         alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(),
          alo.getPasaje().getTipo_Tansporte(),alo.isEstado()});
        }
     
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(numeros || punto)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void Ciudad_OrigenPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ciudad_OrigenPaisActionPerformed
         String pais =  (String)  Ciudad_OrigenPais.getSelectedItem();
         Ciudad_Data cd = new Ciudad_Data();
           jCuidadOrigen.removeAllItems();
             for ( Ciudad ciudad: cd.arrayBusquedaPais(pais)){
          jCuidadOrigen.addItem(ciudad.getNombreCiudad());
           }
    }//GEN-LAST:event_Ciudad_OrigenPaisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudad_OrigenPais;
    private javax.swing.JPanel Fondo;
    private javax.swing.JComboBox<String> jCuidadOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables

    private void ArmarCabecera(){
     modelo.addColumn("id");
     modelo.addColumn("Cuidad de Origen");
     modelo.addColumn("Cuidad de Destino");
     modelo.addColumn("Alojamiento");
     modelo.addColumn("Pasaje");
     modelo.addColumn("Estado");
     jTable1.setModel(modelo);
  }
    
    private void BorrarFilas(){
        int filas = jTable1.getRowCount()-1;
        for(int f = filas; f >= 0 ; f--){
            modelo.removeRow(f);
        }
    }
    
     public void cargaPais() {
        Ciudad_Data cd = new Ciudad_Data();
        Set<String> paisAgregadas = new HashSet<>(); // Utilizamos un conjunto para evitar duplicados
        Ciudad_OrigenPais.addItem(Ciudad_OrigenPais.getItemAt(-1));
        for (Ciudad bus : cd.obtenerCiudadHabilitada()) {
            String paices = bus.getPais();
            if (!paisAgregadas.contains(paices)) {
                Ciudad_OrigenPais.addItem(paices);
                paisAgregadas.add(paices); // Agrega la provincia al conjunto
            }
        }
    }
   
//    public void cargarTabla(String nombre) {
//    Paquete_Data pq = new Paquete_Data();
//    Set<String> aloja = new HashSet<>();
//    for (Paquete alo : pq.ObtenerPaquetePorCiudad(nombre)) {
//        String nom = alo.getAlojamiento().getTipoAlojamiento();
//        if (!aloja.contains(nom)) { // Verificar si el nombre del alojamiento no está en el conjunto
//            modelo.addRow(new Object[]{alo.getIdPaquete(), alo.getOrigen().getNombreCiudad(),
//                alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(), alo.getPasaje().getTipo_Tansporte()});
//            aloja.add(nom); // Agregar el nombre del alojamiento al conjunto
//        }
//    }
//}
}
