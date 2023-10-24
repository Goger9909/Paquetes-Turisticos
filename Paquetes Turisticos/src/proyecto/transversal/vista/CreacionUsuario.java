/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package proyecto.transversal.vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import proyecto.transversal.accesoADatos.Usuario_Data;
import proyecto.transversal.entidades.Usuario;

/**
 *
 * @author ferben007
 */
public class CreacionUsuario extends javax.swing.JPanel {

    public Login login = new Login();

    /**
     * Creates new form CreacionUsuario
     */
    public CreacionUsuario() {
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

        panelNuevoUsuario = new javax.swing.JPanel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtUsuario = new javax.swing.JTextField();
        jPass = new javax.swing.JPasswordField();
        jPassRepe = new javax.swing.JPasswordField();
        panelGuardad = new javax.swing.JPanel();
        labelGuardar = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelCerrar = new javax.swing.JPanel();
        labelCerrar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        panelNuevoUsuario.setBackground(new java.awt.Color(153, 153, 255));
        panelNuevoUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtNombre.setForeground(java.awt.Color.gray);
        jtNombre.setText("Ingrese su Nombre");
        jtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtNombreMousePressed(evt);
            }
        });
        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNombreKeyTyped(evt);
            }
        });
        panelNuevoUsuario.add(jtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 200, -1));

        jtApellido.setForeground(java.awt.Color.gray);
        jtApellido.setText("Ingrese su Apellido");
        jtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtApellidoMousePressed(evt);
            }
        });
        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtApellidoKeyTyped(evt);
            }
        });
        panelNuevoUsuario.add(jtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 200, -1));

        jtUsuario.setForeground(java.awt.Color.gray);
        jtUsuario.setText("Ingrese su Usuario");
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtUsuarioMousePressed(evt);
            }
        });
        panelNuevoUsuario.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 200, -1));

        jPass.setForeground(java.awt.Color.gray);
        jPass.setText("****");
        jPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPassMousePressed(evt);
            }
        });
        jPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPassKeyTyped(evt);
            }
        });
        panelNuevoUsuario.add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 200, -1));

        jPassRepe.setForeground(java.awt.Color.gray);
        jPassRepe.setText("****");
        jPassRepe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPassRepeMousePressed(evt);
            }
        });
        jPassRepe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPassRepeKeyTyped(evt);
            }
        });
        panelNuevoUsuario.add(jPassRepe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 200, -1));

        panelGuardad.setBackground(new java.awt.Color(153, 153, 255));

        labelGuardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGuardar.setText("GUARDAR");
        labelGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
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

        javax.swing.GroupLayout panelGuardadLayout = new javax.swing.GroupLayout(panelGuardad);
        panelGuardad.setLayout(panelGuardadLayout);
        panelGuardadLayout.setHorizontalGroup(
            panelGuardadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panelGuardadLayout.setVerticalGroup(
            panelGuardadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelNuevoUsuario.add(panelGuardad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 335, 120, 30));
        panelGuardad.getAccessibleContext().setAccessibleName("");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NUEVO USUARIO");
        panelNuevoUsuario.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 330, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        panelNuevoUsuario.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 330, 310));

        panelCerrar.setBackground(new java.awt.Color(153, 153, 255));

        labelCerrar.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        labelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrar.setText("X");
        labelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelCerrarLayout = new javax.swing.GroupLayout(panelCerrar);
        panelCerrar.setLayout(panelCerrarLayout);
        panelCerrarLayout.setHorizontalGroup(
            panelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        panelCerrarLayout.setVerticalGroup(
            panelCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelNuevoUsuario.add(panelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        jPass.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (jPass.getText().length() >= 4) {
                    evt.consume();
                }
            }
        });
    }//GEN-LAST:event_jPassKeyTyped

    private void jPassRepeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPassRepeKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        jPassRepe.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (jPassRepe.getText().length() >= 4) {
                    evt.consume();
                }
            }
        });
    }//GEN-LAST:event_jPassRepeKeyTyped

    private void jtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean letrasMin = key >= 97 && key <= 122;
        boolean letrasMay = key >= 65 && key <= 90;
        boolean espacio = key == 32;
        if (!(letrasMin || letrasMay || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtNombreKeyTyped

    private void jtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean letrasMin = key >= 97 && key <= 122;
        boolean letrasMay = key >= 65 && key <= 90;
        boolean espacio = key == 32;
        if (!(letrasMin || letrasMay || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtApellidoKeyTyped

    private void jtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtNombreMousePressed
        // TODO add your handling code here:
        if (jtNombre.getText().equals("Ingrese su Nombre")) {
            jtNombre.setText("");
            jtNombre.setForeground(Color.black);
        }
        if (jtApellido.getText().isEmpty()) {
            jtApellido.setText("Ingrese su Apellido");
            jtApellido.setForeground(Color.gray);
        }
        if (jtUsuario.getText().isEmpty()) {
            jtUsuario.setText("Ingrese su Usuario");
            jtUsuario.setForeground(Color.gray);
        }
        if (String.valueOf(jPass.getPassword()).isEmpty()) {
            jPass.setText("****");
            jPass.setForeground(Color.gray);
        }
        if (String.valueOf(jPassRepe.getPassword()).isEmpty()) {
            jPassRepe.setText("****");
            jPassRepe.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtNombreMousePressed

    private void jtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtApellidoMousePressed
        // TODO add your handling code here:
        if (jtApellido.getText().equals("Ingrese su Apellido")) {
            jtApellido.setText("");
            jtApellido.setForeground(Color.black);
        }
        if (jtNombre.getText().isEmpty()) {
            jtNombre.setText("Ingrese su Nombre");
            jtNombre.setForeground(Color.gray);
        }
        if (jtUsuario.getText().isEmpty()) {
            jtUsuario.setText("Ingrese su Usuario");
            jtUsuario.setForeground(Color.gray);
        }
        if (String.valueOf(jPass.getPassword()).isEmpty()) {
            jPass.setText("****");
            jPass.setForeground(Color.gray);
        }
        if (String.valueOf(jPassRepe.getPassword()).isEmpty()) {
            jPassRepe.setText("****");
            jPassRepe.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtApellidoMousePressed

    private void jtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMousePressed
        // TODO add your handling code here:
        if (jtUsuario.getText().equals("Ingrese su Usuario")) {
            jtUsuario.setText("");
            jtUsuario.setForeground(Color.black);
        }
        if (jtApellido.getText().isEmpty()) {
            jtApellido.setText("Ingrese su Apellido");
            jtApellido.setForeground(Color.gray);
        }
        if (jtNombre.getText().isEmpty()) {
            jtNombre.setText("Ingrese su Nombre");
            jtNombre.setForeground(Color.gray);
        }
        if (String.valueOf(jPass.getPassword()).isEmpty()) {
            jPass.setText("****");
            jPass.setForeground(Color.gray);
        }
        if (String.valueOf(jPassRepe.getPassword()).isEmpty()) {
            jPassRepe.setText("****");
            jPassRepe.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtUsuarioMousePressed

    private void jPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPassMousePressed
        // TODO add your handling code here:
        if (String.valueOf(jPass.getPassword()).equals("****")) {
            jPass.setText("");
            jPass.setForeground(Color.black);
        }
        if (jtApellido.getText().isEmpty()) {
            jtApellido.setText("Ingrese su Apellido");
            jtApellido.setForeground(Color.gray);
        }
        if (jtUsuario.getText().isEmpty()) {
            jtUsuario.setText("Ingrese su Usuario");
            jtUsuario.setForeground(Color.gray);
        }
        if (jtNombre.getText().isEmpty()) {
            jtNombre.setText("Ingrese su Nombre");
            jtNombre.setForeground(Color.gray);
        }
        if (String.valueOf(jPassRepe.getPassword()).isEmpty()) {
            jPassRepe.setText("****");
            jPassRepe.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPassMousePressed

    private void jPassRepeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPassRepeMousePressed
        // TODO add your handling code here:
        if (String.valueOf(jPassRepe.getPassword()).equals("****")) {
            jPassRepe.setText("");
            jPassRepe.setForeground(Color.black);
        }
        if (jtApellido.getText().isEmpty()) {
            jtApellido.setText("Ingrese su Apellido");
            jtApellido.setForeground(Color.gray);
        }
        if (jtUsuario.getText().isEmpty()) {
            jtUsuario.setText("Ingrese su Usuario");
            jtUsuario.setForeground(Color.gray);
        }
        if (String.valueOf(jPass.getPassword()).isEmpty()) {
            jPass.setText("****");
            jPass.setForeground(Color.gray);
        }
        if (jtNombre.getText().isEmpty()) {
            jtNombre.setText("Ingrese su Nombre");
            jtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPassRepeMousePressed

    private void labelGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseExited
        // TODO add your handling code here:
        panelGuardad.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_labelGuardarMouseExited

    private void labelGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseClicked
        // TODO add your handling code here:
        if (jtNombre.getText().equalsIgnoreCase("Ingrese su Nombre") || jtNombre.getText().isEmpty()
                || jtApellido.getText().equalsIgnoreCase("Ingrese su Apellido") || jtApellido.getText().isEmpty()
                || jtUsuario.getText().equalsIgnoreCase("Ingrese su Usuario") || jtUsuario.getText().isEmpty()
                || jPass.getPassword().equals("****") || jPass.getPassword().equals("")
                || jPassRepe.getPassword().equals("****") || jPassRepe.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar LLENOS!!!");
        } else {
            String nombre = jtNombre.getText();
            nombre = convierteMayuscula(nombre);
            String apellido = jtApellido.getText();
            apellido = convierteMayuscula(apellido);
            String usuario = jtUsuario.getText();
            String clave = String.valueOf(jPass.getPassword());
            String claveRep = String.valueOf(jPassRepe.getPassword());
            if (clave.equalsIgnoreCase(claveRep)) {
                Usuario us = new Usuario(nombre, apellido, usuario, clave);
                Usuario_Data ud = new Usuario_Data();
                ud.guardarUsuario(us);
                panelNuevoUsuario.setVisible(false);
                login.setVisible(true);

            }
        }
    }//GEN-LAST:event_labelGuardarMouseClicked

    private void labelGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelGuardarMouseEntered
        // TODO add your handling code here:
        panelGuardad.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelGuardarMouseEntered

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        // TODO add your handling code here:

        panelNuevoUsuario.setVisible(false);
        login.setVisible(true);

    }//GEN-LAST:event_labelCerrarMouseClicked

    private void labelCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseEntered
        // TODO add your handling code here:
        labelCerrar.setFont(labelCerrar.getFont().deriveFont(Font.BOLD));
        labelCerrar.setFont(new java.awt.Font("Arial", 0, 32));
    }//GEN-LAST:event_labelCerrarMouseEntered

    private void labelCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseExited
        // TODO add your handling code here:
        labelCerrar.setFont(labelCerrar.getFont().deriveFont(Font.PLAIN));
        labelCerrar.setFont(new java.awt.Font("Arial", 0, 28));
    }//GEN-LAST:event_labelCerrarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPass;
    private javax.swing.JPasswordField jPassRepe;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelGuardar;
    private javax.swing.JPanel panelCerrar;
    private javax.swing.JPanel panelGuardad;
    private javax.swing.JPanel panelNuevoUsuario;
    // End of variables declaration//GEN-END:variables
   public String convierteMayuscula(String texto) {
        String[] palabras = texto.split(" ");  // Dividir el texto en palabras usando el espacio como separador
        StringBuilder nombreFormateado = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                String primeraLetra = palabra.substring(0, 1).toUpperCase();
                String restoPalabra = palabra.substring(1).toLowerCase();
                nombreFormateado.append(primeraLetra).append(restoPalabra).append(" ");
            }
        }
        String nombreFinal = nombreFormateado.toString().trim();
        return nombreFinal;
    }
}