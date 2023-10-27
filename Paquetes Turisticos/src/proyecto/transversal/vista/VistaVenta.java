package proyecto.transversal.vista;

import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import jdk.internal.org.objectweb.asm.Opcodes;
import proyecto.transversal.accesoADatos.Alojamiento_Data;
import proyecto.transversal.accesoADatos.Ciudad_Data;
import proyecto.transversal.accesoADatos.Paquete_Data;
import proyecto.transversal.entidades.Alojamiento;
import proyecto.transversal.entidades.Ciudad;
import proyecto.transversal.entidades.Paquete;


/**
 *
 * @author YamilaAlejandra
 */
public class VistaVenta extends javax.swing.JPanel {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCeliEditable(int f, int c) {
            return false;
        }
    };
    private double totalParcial, total;
    private int canti = 1;
    SpinnerNumberModel model = new SpinnerNumberModel(1, 1, Integer.MAX_VALUE, 1);
    private int numeroID;

    

    public VistaVenta() {
        initComponents();
        ArmarCabecera();
        cargaPais();
        cantidadPersonas.setModel(model);
        jcTarjeta.setVisible(false);
        cargaTarjeta();
        if(jtTotal.getText().equalsIgnoreCase("0.0")){
            jtTotal.setText("");
            
        }
                }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelComprar = new javax.swing.JPanel();
        labelComprar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ciudad_Origen = new javax.swing.JComboBox<>();
        jCCuidad_deOrigen = new javax.swing.JComboBox<>();
        ano = new com.toedter.calendar.JYearChooser();
        mes = new com.toedter.calendar.JMonthChooser();
        jpBuscar = new javax.swing.JPanel();
        jlBuscar = new javax.swing.JLabel();
        jtPrecioUnitario = new javax.swing.JTextField();
        jtPrecioTotalDias = new javax.swing.JTextField();
        jtTotal = new javax.swing.JTextField();
        labelInfoDias = new javax.swing.JLabel();
        cantidadPersonas = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtTotalParcial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jrEfectivo = new javax.swing.JRadioButton();
        jrTarjeta = new javax.swing.JRadioButton();
        jcTarjeta = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        Fondo.setBackground(new java.awt.Color(102, 255, 102));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("VENTA DE PAQUETES");
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 590, 40));

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
        jTable1.setPreferredSize(new java.awt.Dimension(200, 100));
        jTable1.setRequestFocusEnabled(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 600, 140));

        labelComprar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelComprar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelComprar.setText("COMPRAR");
        labelComprar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelComprarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelComprarLayout = new javax.swing.GroupLayout(panelComprar);
        panelComprar.setLayout(panelComprarLayout);
        panelComprarLayout.setHorizontalGroup(
            panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panelComprarLayout.setVerticalGroup(
            panelComprarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Fondo.add(panelComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 110, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ELIMINAR");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 110, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SALIR");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        Fondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 640, 110, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        jLabel4.setText("Buscar por Fecha");
        Fondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        jLabel5.setText("Cantidad de Personas");
        Fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 180, 30));

        Ciudad_Origen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Ciudad_OrigenItemStateChanged(evt);
            }
        });
        Ciudad_Origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ciudad_OrigenActionPerformed(evt);
            }
        });
        Fondo.add(Ciudad_Origen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 140, -1));

        jCCuidad_deOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCCuidad_deOrigenItemStateChanged(evt);
            }
        });
        Fondo.add(jCCuidad_deOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 250, -1));
        Fondo.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));
        Fondo.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        jpBuscar.setBackground(new java.awt.Color(244, 231, 187));
        jpBuscar.setPreferredSize(new java.awt.Dimension(100, 30));

        jlBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlBuscar.setText("Buscar");
        jlBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlBuscar.setMaximumSize(new java.awt.Dimension(67, 24));
        jlBuscar.setMinimumSize(new java.awt.Dimension(67, 24));
        jlBuscar.setPreferredSize(new java.awt.Dimension(67, 24));
        jlBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpBuscarLayout = new javax.swing.GroupLayout(jpBuscar);
        jpBuscar.setLayout(jpBuscarLayout);
        jpBuscarLayout.setHorizontalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpBuscarLayout.setVerticalGroup(
            jpBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBuscarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(jpBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        jtPrecioUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecioUnitarioActionPerformed(evt);
            }
        });
        Fondo.add(jtPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 100, -1));
        Fondo.add(jtPrecioTotalDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 110, -1));
        Fondo.add(jtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 590, 110, -1));

        labelInfoDias.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        labelInfoDias.setText("Cantidad de días");
        Fondo.add(labelInfoDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 160, 30));

        cantidadPersonas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                cantidadPersonasAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cantidadPersonas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cantidadPersonasStateChanged(evt);
            }
        });
        Fondo.add(cantidadPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 60, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        jLabel8.setText(" Ciudad de Origen");
        Fondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 30));

        jLabel1.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        jLabel1.setText("Precio por día");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 110, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setText("Total ");
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 110, 30));
        Fondo.add(jtTotalParcial, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 110, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel9.setText("Total parcial");
        Fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 120, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jrEfectivo.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        jrEfectivo.setText("Efectivo descuento 20%");
        jrEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEfectivoActionPerformed(evt);
            }
        });

        jrTarjeta.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        jrTarjeta.setText("Tarjeta");
        jrTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTarjetaActionPerformed(evt);
            }
        });

        jcTarjeta.setFont(new java.awt.Font("Arial", 2, 17)); // NOI18N
        jcTarjeta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcTarjetaItemStateChanged(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Metodos de pagos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrEfectivo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(jcTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrEfectivo)
                        .addGap(13, 13, 13)
                        .addComponent(jrTarjeta))
                    .addComponent(jcTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 580, 140));

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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

        //Fondo.setVisible(false);
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
            int filaSeleccionada = jTable1.getSelectedRow();
            int id = (int) jTable1.getValueAt(filaSeleccionada, 0);//accedemos al valor de la primera fila y la primera columna seleccionada.
            Paquete_Data Pd = new Paquete_Data();
            Pd.BorrarPaquetePorId(id);
            BorrarFilas();
            for (proyecto.transversal.entidades.Paquete alo : Pd.ObtenerPaquete()) {
                modelo.addRow(new Object[]{alo.getIdPaquete(), alo.getOrigen().getNombreCiudad(),
                    alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(),
                    alo.getPasaje().getTipo_Tansporte(), alo.isEstado()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Usted no ha seleccionado un paquete");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void labelComprarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelComprarMouseClicked
        Paquete_Data Pd = new Paquete_Data();
        int filaSeleccionada = jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(filaSeleccionada, 0);
        
        Pd.comprado(id);
        //numeroID = id;
        //int filaSeleccionada1 = jTable1.getSelectedRow();
        //boolean id1 = (boolean) jTable1.getValueAt(filaSeleccionada1, 6);
        BorrarFilas();
        
        
       
//          InformacionDeCompra pd = new InformacionDeCompra();
//            Fondo.setVisible(false);
//            pd.setVisible(true);
//     String nom = (String)jTable1.getValueAt(filaSeleccionada, 3);
//        Alojamiento_Data al = new Alojamiento_Data();
//        for(Alojamiento car: al.arrayAlojamientoPorNombre(nom)){
//            
//        }
    }//GEN-LAST:event_labelComprarMouseClicked

    private void Ciudad_OrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ciudad_OrigenActionPerformed

    }//GEN-LAST:event_Ciudad_OrigenActionPerformed

    private void jCCuidad_deOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCCuidad_deOrigenItemStateChanged
        // TODO add your handling code here:
        String nombre = (String) jCCuidad_deOrigen.getSelectedItem();
        BorrarFilas();
        cargarTabla(nombre);

    }//GEN-LAST:event_jCCuidad_deOrigenItemStateChanged

    private void jlBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBuscarMouseClicked
        // TODO add your handling code here:
        int a = ano.getYear();
        int s = mes.getMonth() + 1;
        System.out.println(s);
        Paquete_Data pd = new Paquete_Data();
        String nombre = (String) jCCuidad_deOrigen.getSelectedItem();
        cargarTabla(nombre);
        BorrarFilas();
        for (Paquete alo : pd.ObtenerPaquetePorFechaCiudad(a, s, nombre)) {

            modelo.addRow(new Object[]{alo.getIdPaquete(), alo.getOrigen().getNombreCiudad(),
                alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(), alo.getPasaje().getTipo_Tansporte()});
        }


    }//GEN-LAST:event_jlBuscarMouseClicked

    private void Ciudad_OrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Ciudad_OrigenItemStateChanged
        // TODO add your handling code here:
        String pais = (String) Ciudad_Origen.getSelectedItem();
        Ciudad_Data cd = new Ciudad_Data();
        jCCuidad_deOrigen.removeAllItems();

        for (Ciudad ciudad : cd.arrayBusquedaPais(pais)) {
            jCCuidad_deOrigen.addItem(ciudad.getNombreCiudad());
        }
    }//GEN-LAST:event_Ciudad_OrigenItemStateChanged

    private void jtPrecioUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecioUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecioUnitarioActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        Paquete_Data pd = new Paquete_Data();
        int filaSeleccionada = jTable1.getSelectedRow();
        int id = (int) jTable1.getValueAt(filaSeleccionada, 0);
        
        Paquete consulta = pd.buscarPaquetePorID(id);
        double precioPorDia = consulta.getAlojamiento().getImporteDiario();
        LocalDate entrada = consulta.getAlojamiento().getFechaIn();
        LocalDate salida = consulta.getAlojamiento().getFechaOn();
        double pasaje = consulta.getPasaje().getImporte();
        int cantDia = (int) ChronoUnit.DAYS.between(entrada, salida);
        labelInfoDias.setText("Cantidad de días: " + cantDia);
        double precioTotalDias = precioPorDia * cantDia;
        totalParcial = precioTotalDias + pasaje;
        jtPrecioUnitario.setText(String.valueOf(precioPorDia));
        jtPrecioTotalDias.setText(String.valueOf(precioTotalDias));
        jtTotalParcial.setText(String.valueOf(totalParcial));


    }//GEN-LAST:event_jTable1MouseClicked

    private void jrEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEfectivoActionPerformed
        // TODO add your handling code here:
        jcTarjeta.setVisible(false);
        if (jrEfectivo.isSelected()) {
            jrTarjeta.setSelected(false);
            total = Double.parseDouble(jtTotalParcial.getText()) * 0.8;
            jtTotal.setText(String.valueOf(total));
        }


    }//GEN-LAST:event_jrEfectivoActionPerformed

    private void jrTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTarjetaActionPerformed
        // TODO add your handling code here:
        jcTarjeta.setVisible(true);
        if (jrTarjeta.isSelected()) {
            jrEfectivo.setSelected(false);
            jtTotal.setText(jtTotalParcial.getText());
        }
    }//GEN-LAST:event_jrTarjetaActionPerformed

    private void jcTarjetaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcTarjetaItemStateChanged
        // TODO add your handling code here:
        if(jcTarjeta.getSelectedIndex()==0){
            
            jtTotal.setText(jtTotalParcial.getText());
        }else if(jcTarjeta.getSelectedIndex()==1){
                total = Double.parseDouble(jtTotalParcial.getText()) * 1.15;
                jtTotal.setText(String.valueOf(total));
            }else if(jcTarjeta.getSelectedIndex()==2){
                 total = Double.parseDouble(jtTotalParcial.getText()) * 1.3;
                jtTotal.setText(String.valueOf(total));
            }else if(jcTarjeta.getSelectedIndex()==3){
                 total = Double.parseDouble(jtTotalParcial.getText()) * 1.6;
                jtTotal.setText(String.valueOf(total));
            }
    }//GEN-LAST:event_jcTarjetaItemStateChanged

    private void cantidadPersonasAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cantidadPersonasAncestorMoved
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cantidadPersonasAncestorMoved

    private void cantidadPersonasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cantidadPersonasStateChanged
        // TODO add your handling code here:
         double p = 0;
         canti = (int)cantidadPersonas.getValue();
         p = totalParcial; 
         
        p = p * canti;
        jtTotalParcial.setText(String.valueOf(p));
        p = 0;
    }//GEN-LAST:event_cantidadPersonasStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Ciudad_Origen;
    private javax.swing.JPanel Fondo;
    private com.toedter.calendar.JYearChooser ano;
    private javax.swing.JSpinner cantidadPersonas;
    private javax.swing.JComboBox<String> jCCuidad_deOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcTarjeta;
    private javax.swing.JLabel jlBuscar;
    private javax.swing.JPanel jpBuscar;
    private javax.swing.JRadioButton jrEfectivo;
    private javax.swing.JRadioButton jrTarjeta;
    private javax.swing.JTextField jtPrecioTotalDias;
    private javax.swing.JTextField jtPrecioUnitario;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JTextField jtTotalParcial;
    private javax.swing.JLabel labelComprar;
    private javax.swing.JLabel labelInfoDias;
    private com.toedter.calendar.JMonthChooser mes;
    private javax.swing.JPanel panelComprar;
    // End of variables declaration//GEN-END:variables

    private void ArmarCabecera() {
        modelo.addColumn("id");
        modelo.addColumn("Cuidad de Origen");
        modelo.addColumn("Cuidad de Destino");
        modelo.addColumn("Alojamiento");
        modelo.addColumn("Pasaje");
        modelo.addColumn("Estado");
        jTable1.setModel(modelo);

        int[] anchos = {60, 200, 200, 200, 190, 40};

        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    private void BorrarFilas() {
        int filas = jTable1.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

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

    public void cargarTabla(String nombre) {
        Paquete_Data pq = new Paquete_Data();
        Set<String> aloja = new HashSet<>();
        for (Paquete alo : pq.ObtenerPaquetePorCiudad(nombre)) {
            String nom = alo.getAlojamiento().getTipoAlojamiento();
            if (!aloja.contains(nom)) { // Verificar si el nombre del alojamiento no está en el conjunto
                modelo.addRow(new Object[]{alo.getIdPaquete(), alo.getOrigen().getNombreCiudad(),
                    alo.getDestino().getNombreCiudad(), alo.getAlojamiento().getTipoAlojamiento(), alo.getPasaje().getTipo_Tansporte()});
                aloja.add(nom); // Agregar el nombre del alojamiento al conjunto
            }
        }
    }

    public void cargaTarjeta() {
        jcTarjeta.addItem("1 Cuota sin recargo");
        jcTarjeta.addItem("3 Cuota sin recargo %15");
        jcTarjeta.addItem("6 Cuota sin recargo %30");
        jcTarjeta.addItem("12 Cuota sin recargo %60");
    }

    
   

}
