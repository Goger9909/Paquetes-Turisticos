package proyecto.transversal.vista;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
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
        cargarComboCiudadOrigen();
        cargarComboCiudad();
        armarCabezera();
        cargarTabla();
    }

    private boolean activo = false, minimo = false, maximo = false;
    private double min = 0, max = 999999;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
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
        jMinimo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jMaximo = new javax.swing.JTextField();
        labelSalir = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBuscarCiudad = new javax.swing.JComboBox<>();
        labeLimpiar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pasajes Creados");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Pasajes Creados");

        setPreferredSize(new java.awt.Dimension(600, 700));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pasaje");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pasajes Creados");

        labeBuscarCiudad.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        labeBuscarCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeBuscarCiudad.setText("BUSCAR POR Ciudad");
        labeBuscarCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labeBuscarCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        labeDeshabilitar.setText("DESAHABILITAR");
        labeDeshabilitar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labeDeshabilitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeDeshabilitar.setEnabled(false);
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
        labelHabilitar.setEnabled(false);
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
        labelModificar.setEnabled(false);
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

        jTransporte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Colectivo", "Avion", "Tren", "Barco" }));

        jImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jImporteKeyTyped(evt);
            }
        });

        jMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jMinimoKeyTyped(evt);
            }
        });

        jLabel6.setText("a");

        jMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jMaximoKeyTyped(evt);
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

        jBuscarCiudad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jBuscarCiudadItemStateChanged(evt);
            }
        });

        labeLimpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labeLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labeLimpiar.setText("LIMPIAR");
        labeLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labeLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeLimpiar.setEnabled(false);
        labeLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labeLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeLimpiarMouseExited(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Limpiar para dejar de modificar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labeLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(69, 69, 69)
                            .addComponent(jCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(labeDeshabilitar)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labeBuscarCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBuscarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(labelGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBuscarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labeBuscarCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labeDeshabilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labeDeshabilitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeDeshabilitarMouseClicked
        if (activo == false && labeDeshabilitar.isEnabled()) {
            labeDeshabilitar.setBackground(new Color(244, 231, 187));
            labeDeshabilitar.setForeground(Color.black);
            try {
                Pasaje_Data insc = new Pasaje_Data();
                Ciudad_Data cd = new Ciudad_Data();
                //Para obtener los índices de fila.
                int filaSeleccionada = jTable.getSelectedRow();
                int idM = (int) jTable.getValueAt(filaSeleccionada, 0);

                insc.desabilitarPasaje(idM);

                borrarFilas();
                if (jBuscarCiudad.getSelectedItem() == null) {
                    for (Pasaje ins : insc.buscarPasaje()) {
                        modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                    }
                } else {
                    String ciudad2 = (String) jBuscarCiudad.getSelectedItem();

                    Ciudad ciudad = new Ciudad();
                    ciudad = cd.busquedaPorCiudad(ciudad2);
                    int ciu = ciudad.getIdCiudad();

                    for (Pasaje ins : insc.buscarTodoPasajePorCiudad(ciu)) {
                        modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Usted no ha seleccionado un Pasaje " + ex.getMessage());
            }
        }
        labeDeshabilitar.setEnabled(false);
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
        if (activo == true && labelHabilitar.isEnabled()) {
            labeDeshabilitar.setBackground(new Color(244, 231, 187));
            labeDeshabilitar.setForeground(Color.black);
            try {
                Pasaje_Data insc = new Pasaje_Data();
                int filaSeleccionada = jTable.getSelectedRow();
                int idM = (int) jTable.getValueAt(filaSeleccionada, 0);

                insc.habilitarPasaje(idM);

                borrarFilas();
                if (jBuscarCiudad.getSelectedItem() == null) {
                    for (Pasaje ins : insc.buscarPasaje()) {
                        modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                    }
                } else {
                    Ciudad_Data cd = new Ciudad_Data();
                    String ciudad2 = (String) jBuscarCiudad.getSelectedItem();

                    Ciudad ciudad = new Ciudad();
                    ciudad = cd.busquedaPorCiudad(ciudad2);
                    int ciu = ciudad.getIdCiudad();

                    for (Pasaje ins : insc.buscarTodoPasajePorCiudad(ciu)) {
                        modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Usted no ha seleccionado un Pasaje " + ex.getMessage());
            }
        }
        labelHabilitar.setEnabled(false);
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
        if (labelModificar.isEnabled()) {
            labelGuardar.setBackground(new Color(244, 231, 187));
            labelGuardar.setForeground(Color.black);
            Pasaje_Data pd = new Pasaje_Data();
            Ciudad_Data cd = new Ciudad_Data();
            int filaSeleccionada = jTable.getSelectedRow();

            int id = (int) jTable.getValueAt(filaSeleccionada, 0);

            String tp = (String) jTransporte.getSelectedItem();
            Double imp = Double.parseDouble(jImporte.getText());
            String ciu1 = (String) jCiudad.getSelectedItem();
            Ciudad ciu = (Ciudad) cd.busquedaPorCiudad(ciu1);

            boolean e = true;

            Pasaje pasaje = new Pasaje(id, tp, imp, ciu, e);

            pd.modificarPasaje(pasaje);
            limpiarTodo();
            labelModificar.setEnabled(false);
            labelGuardar.setEnabled(true);
            if (jBuscarCiudad.getSelectedItem() == null) {
                Pasaje_Data insc = new Pasaje_Data();
                for (Pasaje ins : insc.buscarPasaje()) {
                    modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                }
            } else {
                borrarFilas();
                String ciudad2 = (String) jBuscarCiudad.getSelectedItem();

                Ciudad ciudad = new Ciudad();
                ciudad = cd.busquedaPorCiudad(ciudad2);
                int ciu2 = ciudad.getIdCiudad();

                Pasaje_Data insc = new Pasaje_Data();

                borrarFilas();
                for (Pasaje ins : insc.buscarTodoPasajePorCiudad(ciu2)) {
                    modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                }
            }
        }
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
        if (labelGuardar.isEnabled()) {
            labelGuardar.setBackground(new Color(244, 231, 187));
            labelGuardar.setForeground(Color.black);
            Pasaje_Data pd = new Pasaje_Data();
            Ciudad_Data cd = new Ciudad_Data();

            String tp = (String) jTransporte.getSelectedItem();
            Double imp = Double.parseDouble(jImporte.getText());
            String ciu1 = (String) jCiudad.getSelectedItem();
            Ciudad ciu = (Ciudad) cd.busquedaPorCiudad(ciu1);
            boolean e = true;

            Pasaje pasaje = new Pasaje(tp, imp, ciu, e);

            pd.guardarPasaje(pasaje);
            limpiarTodo();
            if (jBuscarCiudad.getSelectedItem() == null) {
                Pasaje_Data insc = new Pasaje_Data();
                for (Pasaje ins : insc.buscarPasaje()) {
                    modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                }
            } else {
                borrarFilas();
                String ciudad2 = (String) jBuscarCiudad.getSelectedItem();

                Ciudad ciudad = new Ciudad();
                ciudad = cd.busquedaPorCiudad(ciudad2);
                int ciu2 = ciudad.getIdCiudad();

                Pasaje_Data insc = new Pasaje_Data();

                borrarFilas();
                for (Pasaje ins : insc.buscarTodoPasajePorCiudad(ciu2)) {
                    modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                }
            }
        }
    }//GEN-LAST:event_labelGuardarMouseClicked

    private void labelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseEntered
        labelGuardar.setBackground(new Color(103, 71, 48));
        labelGuardar.setForeground(Color.white);
    }//GEN-LAST:event_labelGuardarMouseEntered

    private void labelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseExited
        labelGuardar.setBackground(new Color(244, 231, 187));
        labelGuardar.setForeground(Color.black);
    }//GEN-LAST:event_labelGuardarMouseExited

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        jPanel1.setVisible(false);
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

    private void jBuscarCiudadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jBuscarCiudadItemStateChanged
        borrarFilas();
        if (jBuscarCiudad.getSelectedItem() == null) {
            Pasaje_Data insc = new Pasaje_Data();
            for (Pasaje ins : insc.buscarPasaje()) {
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
            }
        } else {
            Ciudad_Data cd = new Ciudad_Data();
            String ciudad2 = (String) jBuscarCiudad.getSelectedItem();

            Ciudad ciudad = new Ciudad();
            ciudad = cd.busquedaPorCiudad(ciudad2);
            int ciu = ciudad.getIdCiudad();

            Pasaje_Data insc = new Pasaje_Data();
            for (Pasaje ins : insc.buscarTodoPasajePorCiudad(ciu)) {
                modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
            }
        }
    }//GEN-LAST:event_jBuscarCiudadItemStateChanged

    private void jImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jImporteKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(numeros || punto)) {
            evt.consume();
        }
        jImporte.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (jImporte.getText().length() >= 8) {
                    evt.consume();
                }
            }
        });
    }//GEN-LAST:event_jImporteKeyTyped

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        if (evt.getClickCount() == 2) {
            int filaSeleccionada = jTable.getSelectedRow();
            String t = (String) jTable.getValueAt(filaSeleccionada, 2);
            Ciudad c = (Ciudad) jTable.getValueAt(filaSeleccionada, 1);
            Double i = (Double) jTable.getValueAt(filaSeleccionada, 3);
            labeDeshabilitar.setEnabled(false);
            labelHabilitar.setEnabled(false);
            jTransporte.setSelectedItem(t);
            jCiudad.setSelectedItem(c.getNombreCiudad());
            jImporte.setText(String.valueOf(i));
            labelModificar.setEnabled(true);
            labeLimpiar.setEnabled(true);
            labelGuardar.setEnabled(false);
        }
        if (evt.getClickCount() == 1) {
            int filaSeleccionada = jTable.getSelectedRow();
            Boolean comprobacion = (boolean) jTable.getValueAt(filaSeleccionada, 4);
            if (comprobacion == true) {
                labeDeshabilitar.setEnabled(true);
                labelHabilitar.setEnabled(false);
                activo = false;
            } else {
                labelHabilitar.setEnabled(true);
                labeDeshabilitar.setEnabled(false);
                activo = true;
            }
        }
    }//GEN-LAST:event_jTableMouseClicked

    private void labeLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeLimpiarMouseClicked
        limpiarTodo();
        labelModificar.setEnabled(false);
        labeLimpiar.setEnabled(false);
        labelGuardar.setEnabled(true);
    }//GEN-LAST:event_labeLimpiarMouseClicked

    private void labeLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeLimpiarMouseEntered
        labeLimpiar.setBackground(new Color(103, 71, 48));
        labeLimpiar.setForeground(Color.white);
    }//GEN-LAST:event_labeLimpiarMouseEntered

    private void labeLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeLimpiarMouseExited
        labeLimpiar.setBackground(new Color(244, 231, 187));
        labeLimpiar.setForeground(Color.black);
    }//GEN-LAST:event_labeLimpiarMouseExited

    private void labelImporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseClicked
        try {
            Pasaje_Data pd = new Pasaje_Data();
            Ciudad_Data cd = new Ciudad_Data();
            String texto = jMinimo.getText();
            String texto2 = jMaximo.getText();
            borrarFilas();

            double min = texto.isEmpty() ? 0 : Double.parseDouble(texto);
            double max = texto2.isEmpty() ? 999999 : Double.parseDouble(texto2);

            Integer ciudad = null;
            if (jBuscarCiudad.getSelectedItem() != null) {
                String ciudad2 = (String) jBuscarCiudad.getSelectedItem();
                Ciudad ciudadObj = cd.busquedaPorCiudad(ciudad2);
                ciudad = ciudadObj.getIdCiudad();
                List<Pasaje> pasajes = pd.buscarPasajePorImporteYCiudad(min, max, ciudad);

                for (Pasaje ins : pasajes) {
                    modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                }
            }else {
                List<Pasaje> pasajes = pd.buscarPasajePorImporte(min, max);

                for (Pasaje ins : pasajes) {
                    modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
                }
            }

        } catch (Exception ex) {
            // Aquí deberías decidir qué hacer con la excepción (lanzarla o registrarla)
            ex.printStackTrace();
        }
    }//GEN-LAST:event_labelImporteMouseClicked

    private void labelImporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseEntered
        labelImporte.setBackground(new Color(103, 71, 48));
        labelImporte.setForeground(Color.white);
    }//GEN-LAST:event_labelImporteMouseEntered

    private void labelImporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImporteMouseExited
        labelImporte.setBackground(new Color(244, 231, 187));
        labelImporte.setForeground(Color.black);
    }//GEN-LAST:event_labelImporteMouseExited

    private void jMaximoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMaximoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(numeros || punto)) {
            evt.consume();
        } else {
        }
        jMaximo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (jMaximo.getText().length() >= 7) {
                    evt.consume();
                }
            }
        });
    }//GEN-LAST:event_jMaximoKeyTyped

    private void jMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMinimoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;
        if (!(numeros || punto)) {
            evt.consume();
        } else {
        }
        jMinimo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (jMinimo.getText().length() >= 7) {
                    evt.consume();
                }
            }
        });
    }//GEN-LAST:event_jMinimoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBuscarCiudad;
    private javax.swing.JComboBox<String> jCiudad;
    private javax.swing.JTextField jImporte;
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
    private javax.swing.JTextField jMaximo;
    private javax.swing.JTextField jMinimo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JComboBox<String> jTransporte;
    private javax.swing.JLabel labeBuscarCiudad;
    private javax.swing.JLabel labeDeshabilitar;
    private javax.swing.JLabel labeLimpiar;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JLabel labelHabilitar;
    private javax.swing.JLabel labelImporte;
    private javax.swing.JLabel labelModificar;
    private javax.swing.JLabel labelSalir;
    // End of variables declaration//GEN-END:variables

    public void cargarComboCiudadOrigen() {
        Ciudad_Data cd = new Ciudad_Data();
        jCiudad.addItem(jCiudad.getItemAt(-1));
        for (Ciudad ciudad : cd.obtenerCiudad()) {
            jCiudad.addItem(ciudad.getNombreCiudad());
        }
    }

    public void cargarComboCiudad() {
        Ciudad_Data cd = new Ciudad_Data();
        jBuscarCiudad.addItem(jBuscarCiudad.getItemAt(-1));
        for (Ciudad ciudad : cd.obtenerCiudadHabilitada()) {
            jBuscarCiudad.addItem(ciudad.getNombreCiudad());
        }
    }

    public void cargarTabla() {
        Pasaje_Data insc = new Pasaje_Data();
        for (Pasaje ins : insc.buscarPasaje()) {
            modelo.addRow(new Object[]{ins.getIdPasaje(), ins.getNombre_ciudad_origen(), ins.getTipo_Tansporte(), ins.getImporte(), ins.isEstado()});
        }
    }

    private void armarCabezera() {
        modelo.addColumn("id Pasaje");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Transporte");
        modelo.addColumn("Importe");
        modelo.addColumn("Estado");
        jTable.setModel(modelo);
        jTable.setModel(modelo);

        int[] anchos = {75, 320, 100, 100, 60};

        for (int i = 0; i < jTable.getColumnCount(); i++) {
            jTable.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }

    }

    private void borrarFilas() {
        int filas = jTable.getRowCount() - 1;
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    public void limpiarTodo() {
        jTransporte.setSelectedItem("");
        jCiudad.setSelectedItem(null);
        jImporte.setText("");
    }
}
