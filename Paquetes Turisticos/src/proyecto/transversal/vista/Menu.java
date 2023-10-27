package proyecto.transversal.vista;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.HashSet;
import java.util.Set;

public class Menu extends javax.swing.JFrame {
    private static Menu instancia;
    private boolean permitir = true;
    public int XMouse, yMouse;//pocicion del mouse
    
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
        anularButton();
        //permitir = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Estado = new javax.swing.JPanel();
        labelPrecentacion = new javax.swing.JLabel();
        panelSesion = new javax.swing.JPanel();
        labelSesion = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        panelButton = new javax.swing.JPanel();
        panelCiudad = new javax.swing.JPanel();
        labelCiudad = new javax.swing.JLabel();
        panelPasaje = new javax.swing.JPanel();
        labelPasaje = new javax.swing.JLabel();
        panelAlojamiento = new javax.swing.JPanel();
        labelAlojamiento = new javax.swing.JLabel();
        panelPaquete = new javax.swing.JPanel();
        labelPaquete = new javax.swing.JLabel();
        panelVenta = new javax.swing.JPanel();
        labelVenta = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Estado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EstadoMouseDragged(evt);
            }
        });
        Estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EstadoMousePressed(evt);
            }
        });

        labelPrecentacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelPrecentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelSesion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        labelSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSesion.setText("CERRAR SESIÓN");
        labelSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSesionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSesionLayout = new javax.swing.GroupLayout(panelSesion);
        panelSesion.setLayout(panelSesionLayout);
        panelSesionLayout.setHorizontalGroup(
            panelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSesionLayout.setVerticalGroup(
            panelSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        labelSalir.setFont(new java.awt.Font("Arial", 0, 32)); // NOI18N
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setText("X");
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout EstadoLayout = new javax.swing.GroupLayout(Estado);
        Estado.setLayout(EstadoLayout);
        EstadoLayout.setHorizontalGroup(
            EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(labelPrecentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(panelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        EstadoLayout.setVerticalGroup(
            EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EstadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(EstadoLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(EstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPrecentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jPanel1.add(Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 50));

        panelButton.setBackground(new java.awt.Color(153, 255, 255));
        panelButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCiudad.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelCiudad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCiudad.setText("CIUDAD");
        labelCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelCiudad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCiudad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCiudadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCiudadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCiudadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCiudadLayout = new javax.swing.GroupLayout(panelCiudad);
        panelCiudad.setLayout(panelCiudadLayout);
        panelCiudadLayout.setHorizontalGroup(
            panelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        panelCiudadLayout.setVerticalGroup(
            panelCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        panelButton.add(panelCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 517, -1, -1));

        labelPasaje.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelPasaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPasaje.setText("PASAJE");
        labelPasaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPasaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPasaje.setMaximumSize(new java.awt.Dimension(70, 22));
        labelPasaje.setMinimumSize(new java.awt.Dimension(70, 22));
        labelPasaje.setPreferredSize(new java.awt.Dimension(70, 22));
        labelPasaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPasajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPasajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPasajeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPasajeLayout = new javax.swing.GroupLayout(panelPasaje);
        panelPasaje.setLayout(panelPasajeLayout);
        panelPasajeLayout.setHorizontalGroup(
            panelPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPasaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPasajeLayout.setVerticalGroup(
            panelPasajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPasaje, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButton.add(panelPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 459, 218, -1));

        labelAlojamiento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelAlojamiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAlojamiento.setText("ALOJAMIENTO");
        labelAlojamiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelAlojamiento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelAlojamiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelAlojamientoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelAlojamientoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelAlojamientoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelAlojamientoLayout = new javax.swing.GroupLayout(panelAlojamiento);
        panelAlojamiento.setLayout(panelAlojamientoLayout);
        panelAlojamientoLayout.setHorizontalGroup(
            panelAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        panelAlojamientoLayout.setVerticalGroup(
            panelAlojamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAlojamiento, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButton.add(panelAlojamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 401, 218, -1));

        labelPaquete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelPaquete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPaquete.setText("PAQUETE");
        labelPaquete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelPaquete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelPaquete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelPaqueteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelPaqueteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelPaqueteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelPaqueteLayout = new javax.swing.GroupLayout(panelPaquete);
        panelPaquete.setLayout(panelPaqueteLayout);
        panelPaqueteLayout.setHorizontalGroup(
            panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelPaqueteLayout.setVerticalGroup(
            panelPaqueteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelPaquete, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButton.add(panelPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 220, 40));

        labelVenta.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelVenta.setText("                INICIO");
        labelVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelVentaLayout = new javax.swing.GroupLayout(panelVenta);
        panelVenta.setLayout(panelVentaLayout);
        panelVentaLayout.setHorizontalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        panelVentaLayout.setVerticalGroup(
            panelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panelButton.add(panelVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, 40));

        jPanel1.add(panelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 300, 700));

        panelPrincipal.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel1.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 600, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelPaqueteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPaqueteMouseClicked
        // TODO add your handling code here:
        if (permitir) {
        Paquete_Vista pd = new Paquete_Vista();
        pd.removeAll();
        pd.setSize(600, 700);
        pd.setLocation(0, 0);
        panelPrincipal.removeAll();
        panelPrincipal.add(pd, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        }

    }//GEN-LAST:event_labelPaqueteMouseClicked

    private void labelCiudadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCiudadMouseClicked
        // TODO add your handling code here:
        if (permitir) {
        VistaCiudad pd = new VistaCiudad();
        pd.removeAll();
        pd.setSize(600, 700);
        pd.setLocation(0, 0);
        panelPrincipal.removeAll();
        panelPrincipal.add(pd, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        }
    }//GEN-LAST:event_labelCiudadMouseClicked

    private void labelPasajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPasajeMouseClicked
        // TODO add your handling code here:
        if (permitir) {
        CreacionPasaje cp = new CreacionPasaje();
        cp.removeAll();
        cp.setSize(600, 700);
        cp.setLocation(0, 0);
        panelPrincipal.removeAll();
        panelPrincipal.add(cp, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        }
    }//GEN-LAST:event_labelPasajeMouseClicked

    private void labelAlojamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAlojamientoMouseClicked
        // Alojamiento
        if (permitir) {
        PruebaCalendar pd = new PruebaCalendar();
        pd.removeAll();
        pd.setSize(600, 700);
        pd.setLocation(0, 0);
        panelPrincipal.removeAll();
        panelPrincipal.add(pd,BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        }
        
    }//GEN-LAST:event_labelAlojamientoMouseClicked

    private void labelSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSesionMouseClicked
        // TODO add your handling code here:

        Menu.getInstancia().repaint();
        Menu.getInstancia().revalidate();

        if (labelSesion.getText().equalsIgnoreCase("CERRAR SESIÓN")) {
            //permitir = true;
            labelPrecentacion.setText("");
            labelSesion.setText(correcto());
        } else if (labelSesion.getText().equalsIgnoreCase("INICIAR SESIÓN")) {
            //permitir = false;
            labelSesion.setText(incorrecto());

            //                java.awt.EventQueue.invokeLater(new Runnable() {//verifica la clave
                //                    public void run() {
                    new Login().setVisible(true);

                    //                    }
                //                });

        }
    }//GEN-LAST:event_labelSesionMouseClicked

    private void labelSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSesionMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSesionMouseEntered

    private void labelSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSesionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_labelSesionMouseExited

    private void labelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_labelSalirMouseClicked

    private void labelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseEntered
        // TODO add your handling code here:
        labelSalir.setFont(labelSalir.getFont().deriveFont(Font.BOLD));
        labelSalir.setFont(new java.awt.Font("Arial", 0, 36));
    }//GEN-LAST:event_labelSalirMouseEntered

    private void labelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSalirMouseExited
        // TODO add your handling code here:
        labelSalir.setFont(labelSalir.getFont().deriveFont(Font.PLAIN));
        labelSalir.setFont(new java.awt.Font("Arial", 0, 32));
    }//GEN-LAST:event_labelSalirMouseExited

    private void EstadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadoMousePressed
        // TODO add your handling code here:
         XMouse = evt.getX();
         yMouse = evt.getY();
    }//GEN-LAST:event_EstadoMousePressed

    private void EstadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EstadoMouseDragged
        // TODO add your handling code here:
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - yMouse);
    }//GEN-LAST:event_EstadoMouseDragged

    private void labelPaqueteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPaqueteMouseEntered
        // TODO add your handling code here:
        labelPaquete.setFont(labelPaquete.getFont().deriveFont(Font.PLAIN));
        labelPaquete.setFont(new java.awt.Font("Arial", 0, 24));
    }//GEN-LAST:event_labelPaqueteMouseEntered

    private void labelPaqueteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPaqueteMouseExited
        // TODO add your handling code here:
        labelPaquete.setFont(labelPaquete.getFont().deriveFont(Font.PLAIN));
        labelPaquete.setFont(new java.awt.Font("Arial", 0, 18));
    }//GEN-LAST:event_labelPaqueteMouseExited

    private void labelAlojamientoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAlojamientoMouseEntered
        // TODO add your handling code here:
         labelAlojamiento.setFont(labelAlojamiento.getFont().deriveFont(Font.PLAIN));
        labelAlojamiento.setFont(new java.awt.Font("Arial", 0, 24));
    }//GEN-LAST:event_labelAlojamientoMouseEntered

    private void labelAlojamientoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelAlojamientoMouseExited
        // TODO add your handling code here:
        labelAlojamiento.setFont(labelAlojamiento.getFont().deriveFont(Font.PLAIN));
        labelAlojamiento.setFont(new java.awt.Font("Arial", 0, 18));
    }//GEN-LAST:event_labelAlojamientoMouseExited

    private void labelPasajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPasajeMouseEntered
        // TODO add your handling code here:
         labelPasaje.setFont(labelPasaje.getFont().deriveFont(Font.PLAIN));
        labelPasaje.setFont(new java.awt.Font("Arial", 0, 24));
    }//GEN-LAST:event_labelPasajeMouseEntered

    private void labelPasajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelPasajeMouseExited
        // TODO add your handling code here:
        labelPasaje.setFont(labelPasaje.getFont().deriveFont(Font.PLAIN));
        labelPasaje.setFont(new java.awt.Font("Arial", 0, 18));
    }//GEN-LAST:event_labelPasajeMouseExited

    private void labelCiudadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCiudadMouseEntered
        // TODO add your handling code here:
         labelCiudad.setFont(labelCiudad.getFont().deriveFont(Font.PLAIN));
        labelCiudad.setFont(new java.awt.Font("Arial", 0, 24));
    }//GEN-LAST:event_labelCiudadMouseEntered

    private void labelCiudadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCiudadMouseExited
        // TODO add your handling code here:
        labelCiudad.setFont(labelCiudad.getFont().deriveFont(Font.PLAIN));
        labelCiudad.setFont(new java.awt.Font("Arial", 0, 18));
    }//GEN-LAST:event_labelCiudadMouseExited

    private void labelVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelVentaMouseClicked
        // TODO add your handling code here:
         if (permitir) {
        VistaVenta pd = new VistaVenta();
        pd.removeAll();
        pd.setSize(600, 700);
        pd.setLocation(0, 0);
        panelPrincipal.removeAll();
        panelPrincipal.add(pd, BorderLayout.CENTER);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        }
    }//GEN-LAST:event_labelVentaMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {//verifica la clave
            public void run() {
                Menu.getInstancia();
                new Login().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Estado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelAlojamiento;
    private javax.swing.JLabel labelCiudad;
    private javax.swing.JLabel labelPaquete;
    private javax.swing.JLabel labelPasaje;
    private javax.swing.JLabel labelPrecentacion;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JLabel labelSesion;
    private javax.swing.JLabel labelVenta;
    private javax.swing.JPanel panelAlojamiento;
    private javax.swing.JPanel panelButton;
    private javax.swing.JPanel panelCiudad;
    private javax.swing.JPanel panelPaquete;
    private javax.swing.JPanel panelPasaje;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSesion;
    private javax.swing.JPanel panelVenta;
    // End of variables declaration//GEN-END:variables
public void setNombrePersona(String nombre, String apellido) {
        labelPrecentacion.setText("¡Bienvenido, " + apellido + ", " + nombre + "!");
    }

 public void iniciarSesion(){
     labelSesion.setText("INICIAR SESIÓN");
     
 }

    public void anularButton() {
        permitir = false;
        labelPaquete.setEnabled(false);
        labelCiudad.setEnabled(false);
        labelAlojamiento.setEnabled(false);
        labelPasaje.setEnabled(false);
    }

    public void activarButton() {
        permitir = true;
        labelPaquete.setEnabled(true);
        labelCiudad.setEnabled(true);
        labelAlojamiento.setEnabled(true);
        labelPasaje.setEnabled(true);
    }
    /*
        El código que has proporcionado implementa un patrón de diseño conocido como "Singleton". 
        El patrón Singleton se utiliza para garantizar que una clase tenga una sola instancia y 
        proporcionar un punto de acceso global a esa instancia desde cualquier parte de tu programa. 
        En el contexto de tu código, estás aplicando el patrón Singleton para la clase Menu.
        */
    public static Menu getInstancia(){//crea una sola ventana "PATRON DE SINGLETON"
        if(instancia == null){
            instancia = new Menu();
            getInstancia().setVisible(true);
        }
        return instancia;
    }
   
    public static String incorrecto (){
        return "CERRAR SESIÓN";
    }
    public static String correcto (){
        return "INICIAR SESIÓN";
    }


}
