/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto.transversal.vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import proyecto.transversal.accesoADatos.Ciudad_Data;
import proyecto.transversal.entidades.Ciudad;

/**
 *
 * @author ferben007
 */
public class VistaCiudad extends javax.swing.JPanel {

    private Ciudad_Data cd = new Ciudad_Data();
//    public DefaultListModel limpiarList(){
//    DefaultListModel modelo = new DefaultListModel();
//    listCiudades.setModel(modelo);
//    return modelo;
//    }

    /**
     * Creates new form VistaCiudad
     */
    public VistaCiudad() {

        initComponents();
        cargarCiudades();
        desabilitaButton();
        desabilitarTexField();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCiudades = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtexProvincia = new javax.swing.JTextField();
        jtexCiudad = new javax.swing.JTextField();
        jtexPais = new javax.swing.JTextField();
        panelEliminar = new javax.swing.JPanel();
        labelEliminar = new javax.swing.JLabel();
        panelGuardar = new javax.swing.JPanel();
        labelGuardar = new javax.swing.JLabel();
        panelModificar = new javax.swing.JPanel();
        labelModificar = new javax.swing.JLabel();
        panelNuevo = new javax.swing.JPanel();
        labelNuevo = new javax.swing.JLabel();
        panelBusProvincia = new javax.swing.JPanel();
        labelBusProvincia = new javax.swing.JLabel();
        panelBusPais = new javax.swing.JPanel();
        labelBusPais = new javax.swing.JLabel();
        jtexBusProvincia = new javax.swing.JTextField();
        jtexBusPais = new javax.swing.JTextField();
        panelXPais = new javax.swing.JPanel();
        labelXPais = new javax.swing.JLabel();
        panelXProvincia = new javax.swing.JPanel();
        labelXProvincia = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listCiudades.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jScrollPane1.setViewportView(listCiudades);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 240, 240));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CIUDAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 43, 517, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Nombre de Pais");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 115, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Nombre de Ciudad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setText("Nombre de Provincia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jtexProvincia.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jtexProvincia.setForeground(java.awt.Color.gray);
        jtexProvincia.setText("Ingrese una Provincia");
        jtexProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtexProvinciaMousePressed(evt);
            }
        });
        jtexProvincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtexProvinciaKeyTyped(evt);
            }
        });
        jPanel1.add(jtexProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 250, -1));

        jtexCiudad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jtexCiudad.setForeground(java.awt.Color.gray);
        jtexCiudad.setText("Ingrese una Ciudad");
        jtexCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtexCiudadMousePressed(evt);
            }
        });
        jtexCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtexCiudadActionPerformed(evt);
            }
        });
        jtexCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtexCiudadKeyTyped(evt);
            }
        });
        jPanel1.add(jtexCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 250, -1));

        jtexPais.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jtexPais.setForeground(java.awt.Color.gray);
        jtexPais.setText("Ingrese un Pais");
        jtexPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtexPaisMousePressed(evt);
            }
        });
        jtexPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtexPaisKeyTyped(evt);
            }
        });
        jPanel1.add(jtexPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 250, -1));

        panelEliminar.setBackground(new java.awt.Color(244, 231, 187));

        labelEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEliminar.setText("ELIMINAR");
        labelEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelEliminarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEliminarLayout = new javax.swing.GroupLayout(panelEliminar);
        panelEliminar.setLayout(panelEliminarLayout);
        panelEliminarLayout.setHorizontalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panelEliminarLayout.setVerticalGroup(
            panelEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 110, 30));

        panelGuardar.setBackground(new java.awt.Color(244, 231, 187));

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

        javax.swing.GroupLayout panelGuardarLayout = new javax.swing.GroupLayout(panelGuardar);
        panelGuardar.setLayout(panelGuardarLayout);
        panelGuardarLayout.setHorizontalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panelGuardarLayout.setVerticalGroup(
            panelGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 110, 30));

        panelModificar.setBackground(new java.awt.Color(244, 231, 187));

        labelModificar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelModificar.setText("MODIFICAR");
        labelModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelModificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelModificarLayout = new javax.swing.GroupLayout(panelModificar);
        panelModificar.setLayout(panelModificarLayout);
        panelModificarLayout.setHorizontalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        panelModificarLayout.setVerticalGroup(
            panelModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 110, 30));

        panelNuevo.setBackground(new java.awt.Color(244, 231, 187));

        labelNuevo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNuevo.setText("NUEVO");
        labelNuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelNuevoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelNuevoLayout = new javax.swing.GroupLayout(panelNuevo);
        panelNuevo.setLayout(panelNuevoLayout);
        panelNuevoLayout.setHorizontalGroup(
            panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelNuevoLayout.setVerticalGroup(
            panelNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 30));

        panelBusProvincia.setBackground(new java.awt.Color(244, 231, 187));

        labelBusProvincia.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelBusProvincia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBusProvincia.setText("Busqueda por Provincia");
        labelBusProvincia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelBusProvincia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBusProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBusProvinciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBusProvinciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBusProvinciaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBusProvinciaLayout = new javax.swing.GroupLayout(panelBusProvincia);
        panelBusProvincia.setLayout(panelBusProvinciaLayout);
        panelBusProvinciaLayout.setHorizontalGroup(
            panelBusProvinciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBusProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBusProvinciaLayout.setVerticalGroup(
            panelBusProvinciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBusProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelBusProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 185, 30));

        panelBusPais.setBackground(new java.awt.Color(244, 231, 187));

        labelBusPais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelBusPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBusPais.setText("Busqueda por Pais");
        labelBusPais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelBusPais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelBusPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBusPaisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBusPaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBusPaisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBusPaisLayout = new javax.swing.GroupLayout(panelBusPais);
        panelBusPais.setLayout(panelBusPaisLayout);
        panelBusPaisLayout.setHorizontalGroup(
            panelBusPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBusPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelBusPaisLayout.setVerticalGroup(
            panelBusPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelBusPais, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelBusPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 185, 30));

        jtexBusProvincia.setText("jTextField1");
        jPanel1.add(jtexBusProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 185, 30));

        jtexBusPais.setText("jTextField1");
        jPanel1.add(jtexBusPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 185, 30));

        labelXPais.setFont(new java.awt.Font("Segoe Script", 0, 22)); // NOI18N
        labelXPais.setForeground(new java.awt.Color(255, 51, 51));
        labelXPais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelXPais.setText("X");
        labelXPais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelXPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelXPaisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelXPaisLayout = new javax.swing.GroupLayout(panelXPais);
        panelXPais.setLayout(panelXPaisLayout);
        panelXPaisLayout.setHorizontalGroup(
            panelXPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelXPais, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panelXPaisLayout.setVerticalGroup(
            panelXPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelXPais, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelXPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 30, 30));

        labelXProvincia.setFont(new java.awt.Font("Segoe Script", 0, 22)); // NOI18N
        labelXProvincia.setForeground(new java.awt.Color(255, 51, 51));
        labelXProvincia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelXProvincia.setText("X");
        labelXProvincia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelXProvincia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelXProvinciaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelXProvinciaLayout = new javax.swing.GroupLayout(panelXProvincia);
        panelXProvincia.setLayout(panelXProvinciaLayout);
        panelXProvinciaLayout.setHorizontalGroup(
            panelXProvinciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelXProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        panelXProvinciaLayout.setVerticalGroup(
            panelXProvinciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelXProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelXProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, 30, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 580, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtexCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtexCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtexCiudadActionPerformed

    private void jtexPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtexPaisKeyTyped
        int key = evt.getKeyChar();
        boolean letrasMin = key >= 97 && key <= 122;
        boolean letrasMay = key >= 65 && key <= 90;
        boolean espacio = key == 32;
        if (!(letrasMin || letrasMay || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtexPaisKeyTyped

    private void jtexProvinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtexProvinciaKeyTyped
        int key = evt.getKeyChar();
        boolean letrasMin = key >= 97 && key <= 122;
        boolean letrasMay = key >= 65 && key <= 90;
        boolean espacio = key == 32;
        if (!(letrasMin || letrasMay || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtexProvinciaKeyTyped

    private void jtexCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtexCiudadKeyTyped
        int key = evt.getKeyChar();
        boolean letrasMin = key >= 97 && key <= 122;
        boolean letrasMay = key >= 65 && key <= 90;
        boolean espacio = key == 32;
        if (!(letrasMin || letrasMay || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtexCiudadKeyTyped

    private void labelNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNuevoMouseEntered
        // TODO add your handling code here:
        panelNuevo.setBackground(new Color(103, 71, 48));
        labelNuevo.setForeground(Color.white);
    }//GEN-LAST:event_labelNuevoMouseEntered

    private void labelNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNuevoMouseExited
        // TODO add your handling code here:
        panelNuevo.setBackground(new Color(244, 231, 187));
        labelNuevo.setForeground(Color.black);
    }//GEN-LAST:event_labelNuevoMouseExited

    private void jtexPaisMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtexPaisMousePressed
        // TODO add your handling code here:
       limpiarPais();
    }//GEN-LAST:event_jtexPaisMousePressed

    private void jtexProvinciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtexProvinciaMousePressed
        // TODO add your handling code here:
       limpiarProvincia();
    }//GEN-LAST:event_jtexProvinciaMousePressed

    private void jtexCiudadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtexCiudadMousePressed
        // TODO add your handling code here:
      limpiarCiudad();
    }//GEN-LAST:event_jtexCiudadMousePressed

    private void labelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseEntered
        // TODO add your handling code here:
        panelGuardar.setBackground(new Color(103, 71, 48));
        labelGuardar.setForeground(Color.white);
    }//GEN-LAST:event_labelGuardarMouseEntered

    private void labelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseExited
        // TODO add your handling code here:
        panelGuardar.setBackground(new Color(244, 231, 187));
        labelGuardar.setForeground(Color.black);
    }//GEN-LAST:event_labelGuardarMouseExited

    private void labelEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEliminarMouseEntered
        // TODO add your handling code here:
        panelEliminar.setBackground(new Color(103, 71, 48));
        labelEliminar.setForeground(Color.white);
    }//GEN-LAST:event_labelEliminarMouseEntered

    private void labelEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEliminarMouseExited
        // TODO add your handling code here:
        panelEliminar.setBackground(new Color(244, 231, 187));
        labelEliminar.setForeground(Color.black);
    }//GEN-LAST:event_labelEliminarMouseExited

    private void labelModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModificarMouseEntered
        // TODO add your handling code here:
        panelModificar.setBackground(new Color(103, 71, 48));
        labelModificar.setForeground(Color.white);
    }//GEN-LAST:event_labelModificarMouseEntered

    private void labelModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelModificarMouseExited
        // TODO add your handling code here:
        panelModificar.setBackground(new Color(244, 231, 187));
        labelModificar.setForeground(Color.black);
    }//GEN-LAST:event_labelModificarMouseExited

    private void labelNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNuevoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_labelNuevoMouseClicked

    private void labelBusPaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBusPaisMouseExited
        // TODO add your handling code here:
        panelBusPais.setBackground(new Color(244, 231, 187));
        labelBusPais.setForeground(Color.black);
    }//GEN-LAST:event_labelBusPaisMouseExited

    private void labelBusPaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBusPaisMouseEntered
        // TODO add your handling code here:
        panelBusPais.setBackground(new Color(103, 71, 48));
        labelBusPais.setForeground(Color.white);
    }//GEN-LAST:event_labelBusPaisMouseEntered

    private void labelBusProvinciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBusProvinciaMouseEntered
        // TODO add your handling code here:
        panelBusProvincia.setBackground(new Color(103, 71, 48));
        labelBusProvincia.setForeground(Color.white);
    }//GEN-LAST:event_labelBusProvinciaMouseEntered

    private void labelBusProvinciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBusProvinciaMouseExited
        // TODO add your handling code here:
        panelBusProvincia.setBackground(new Color(244, 231, 187));
        labelBusProvincia.setForeground(Color.black);
    }//GEN-LAST:event_labelBusProvinciaMouseExited

    private void labelXPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelXPaisMouseClicked
        // TODO add your handling code here:
        jtexBusPais.setVisible(false);
        panelXPais.setVisible(false);
        labelXPais.setVisible(false);
    }//GEN-LAST:event_labelXPaisMouseClicked

    private void labelXProvinciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelXProvinciaMouseClicked
        // TODO add your handling code here:
        jtexBusProvincia.setVisible(false);
        panelXProvincia.setVisible(false);
        labelXProvincia.setVisible(false);

    }//GEN-LAST:event_labelXProvinciaMouseClicked

    private void labelBusPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBusPaisMouseClicked
        // TODO add your handling code here:
        jtexBusPais.setVisible(true);
        panelXPais.setVisible(true);
        labelXPais.setVisible(true);
        jtexBusProvincia.setVisible(false);
        panelXProvincia.setVisible(false);
        labelXProvincia.setVisible(false);

    }//GEN-LAST:event_labelBusPaisMouseClicked

    private void labelBusProvinciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBusProvinciaMouseClicked
        // TODO add your handling code here:
        jtexBusProvincia.setVisible(true);
        panelXProvincia.setVisible(true);
        labelXProvincia.setVisible(true);
        jtexBusPais.setVisible(false);
        panelXPais.setVisible(false);
        labelXPais.setVisible(false);
    }//GEN-LAST:event_labelBusProvinciaMouseClicked

    private void labelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseClicked
        // TODO add your handling code here:
        if (jtexPais.getText().equalsIgnoreCase("Ingrese un Pais") || jtexProvincia.getText().equalsIgnoreCase("Ingrese una Provincia") || jtexCiudad.getText().equalsIgnoreCase("Ingrese una Ciudad")
                || jtexPais.getText().isEmpty() || jtexProvincia.getText().isEmpty() || jtexCiudad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los Campos deben estar LLenos!!!");
        } else {
            String pais = jtexPais.getText();
            String provincia = jtexProvincia.getText();
            String ciudad = jtexCiudad.getText();
            boolean repetido = false;
            for(Ciudad bus: cd.obtenerCiudad()){
                if(ciudad.equalsIgnoreCase(bus.getNombreCiudad())){
                    repetido = true;
                    JOptionPane.showMessageDialog(null, "La Ciudad ya EXISTE!!!");
                }
            }
            System.out.println(repetido);
            if(repetido == false){
                Ciudad carga = new Ciudad(pais, ciudad, provincia, true);
                cd.agregarCiudad(carga);
                limpiarPais();
                limpiarProvincia();
                limpiarCiudad();
                
            }
        }
    }//GEN-LAST:event_labelGuardarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtexBusPais;
    private javax.swing.JTextField jtexBusProvincia;
    private javax.swing.JTextField jtexCiudad;
    private javax.swing.JTextField jtexPais;
    private javax.swing.JTextField jtexProvincia;
    private javax.swing.JLabel labelBusPais;
    private javax.swing.JLabel labelBusProvincia;
    private javax.swing.JLabel labelEliminar;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JLabel labelModificar;
    private javax.swing.JLabel labelNuevo;
    private javax.swing.JLabel labelXPais;
    private javax.swing.JLabel labelXProvincia;
    private javax.swing.JList<String> listCiudades;
    private javax.swing.JPanel panelBusPais;
    private javax.swing.JPanel panelBusProvincia;
    private javax.swing.JPanel panelEliminar;
    private javax.swing.JPanel panelGuardar;
    private javax.swing.JPanel panelModificar;
    private javax.swing.JPanel panelNuevo;
    private javax.swing.JPanel panelXPais;
    private javax.swing.JPanel panelXProvincia;
    // End of variables declaration//GEN-END:variables
 public DefaultListModel cargarCiudades() {
        DefaultListModel modelo = new DefaultListModel();
        listCiudades.setModel(modelo);
        for (Ciudad carg : cd.obtenerCiudadHabilitada()) {
            modelo.addElement(carg.getNombreCiudad());
        }
        return modelo;
    }

    public void desabilitaButton() {
        panelEliminar.setVisible(false);
        labelEliminar.setVisible(false);
        panelModificar.setVisible(false);
        labelModificar.setVisible(false);
        panelXPais.setVisible(false);
        labelXPais.setVisible(false);
        panelXProvincia.setVisible(false);
        labelXProvincia.setVisible(false);
    }

    public void desabilitarTexField() {
        jtexBusPais.setVisible(false);
        jtexBusProvincia.setVisible(false);
    }
    public void limpiarPais(){
         if (jtexPais.getText().equals("Ingrese un Pais")) {
            jtexPais.setText("");
            jtexPais.setForeground(Color.black);
        }
        if (String.valueOf(jtexProvincia.getText()).isEmpty()) {
            jtexProvincia.setText("Ingrese una Provincia");
            jtexProvincia.setForeground(Color.gray);
        }
        if (String.valueOf(jtexCiudad.getText()).isEmpty()) {
            jtexCiudad.setText("Ingrese una Ciudad");
            jtexCiudad.setForeground(Color.gray);
        }
    }
    public void limpiarProvincia(){
         if (jtexProvincia.getText().equals("Ingrese una Provincia")) {
            jtexProvincia.setText("");
            jtexProvincia.setForeground(Color.black);
        }
        if (String.valueOf(jtexPais.getText()).isEmpty()) {
            jtexPais.setText("Ingrese un Pais");
            jtexPais.setForeground(Color.gray);
        }
        if (String.valueOf(jtexCiudad.getText()).isEmpty()) {
            jtexCiudad.setText("Ingrese una Ciudad");
            jtexCiudad.setForeground(Color.gray);
        }
    }
    public void limpiarCiudad(){
          if (jtexCiudad.getText().equals("Ingrese una Ciudad")) {
            jtexCiudad.setText("");
            jtexCiudad.setForeground(Color.black);
        }
        if (String.valueOf(jtexProvincia.getText()).isEmpty()) {
            jtexProvincia.setText("Ingrese una Provincia");
            jtexProvincia.setForeground(Color.gray);
        }
        if (String.valueOf(jtexPais.getText()).isEmpty()) {
            jtexPais.setText("Ingrese un Pais");
            jtexPais.setForeground(Color.gray);
        }
    }
}
