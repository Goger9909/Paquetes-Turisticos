/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
public class Login extends javax.swing.JFrame {

    //private Menu menuInstance = new Menu();
    private Usuario us = new Usuario();
    private Usuario_Data ud = new Usuario_Data();
    public String persona;
    private boolean ingreso = false;
    private static Login instanciaLogin;
    public int XMouse, yMouse;//pocicion del mouse
    /**
     * Creates new form Login
     */
    public Login() {
        
        initComponents();
        setLocationRelativeTo(null);
        Menu.getInstancia().setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUsuario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jtUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        labelCambioContra = new javax.swing.JLabel();
        panelIngresar = new javax.swing.JPanel();
        labelIngresar = new javax.swing.JLabel();
        labelCrearCuenta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelCerrar = new javax.swing.JPanel();
        labelCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelUsuario.setPreferredSize(new java.awt.Dimension(370, 420));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(370, 420));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUsuario.setForeground(java.awt.Color.gray);
        jtUsuario.setText("Ingrese su Usuario");
        jtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 200, -1));

        jPassword.setForeground(java.awt.Color.gray);
        jPassword.setText("****");
        jPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordMousePressed(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 200, -1));

        labelCambioContra.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        labelCambioContra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCambioContra.setText("¿Perdiste tu contraseña?");
        labelCambioContra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCambioContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCambioContraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCambioContraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCambioContraMouseExited(evt);
            }
        });
        jPanel1.add(labelCambioContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 230, -1));

        panelIngresar.setBackground(new java.awt.Color(153, 153, 255));

        labelIngresar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelIngresar.setText("INGRESAR");
        labelIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labelIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelIngresarLayout = new javax.swing.GroupLayout(panelIngresar);
        panelIngresar.setLayout(panelIngresarLayout);
        panelIngresarLayout.setHorizontalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        panelIngresarLayout.setVerticalGroup(
            panelIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(panelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 120, 30));

        labelCrearCuenta.setFont(new java.awt.Font("Arial", 2, 16)); // NOI18N
        labelCrearCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrearCuenta.setText("¿No tienes Cuenta? Registrate");
        labelCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCrearCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelCrearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelCrearCuentaMouseExited(evt);
            }
        });
        jPanel1.add(labelCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 330, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BIENVENIDO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 370, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 330, 340));

        panelCerrar.setBackground(new java.awt.Color(153, 153, 255));

        labelCerrar.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        labelCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCerrar.setText("X");
        labelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jPanel1.add(panelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 40, 40));

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtUsuarioMousePressed
        // TODO add your handling code here:

        if (jtUsuario.getText().equals("Ingrese su Usuario")) {
            jtUsuario.setText("");
            jtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(jPassword.getPassword()).isEmpty()) {
            jPassword.setText("****");
            jPassword.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jtUsuarioMousePressed

    private void jPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordMousePressed
        // TODO add your handling code here:
        if (String.valueOf(jPassword.getPassword()).equals("****")) {
            jPassword.setText("");
            jPassword.setForeground(Color.black);
        }
        if (jtUsuario.getText().isEmpty()) {
            jtUsuario.setText("Ingrese su Usuario");
            jtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPasswordMousePressed

    private void labelIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresarMouseClicked
        // TODO add your handling code here:
        
        String nombre = "";
        String apellido = "";
        if (jtUsuario.getText().equalsIgnoreCase("Ingrese su Usuario") || jtUsuario.getText().isEmpty()
                || jPassword.getPassword().equals("****") || jPassword.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese su USUARIO");
        } else {
            String usuario = jtUsuario.getText();
            String clave = String.valueOf(jPassword.getPassword());
            for (Usuario nombreUsuario : ud.listarUsuario()) {
                if (usuario.equalsIgnoreCase(nombreUsuario.getUsuario())) {
                    if (clave.equalsIgnoreCase(nombreUsuario.getLogin())) {
                        ingreso = true;
                        nombre = nombreUsuario.getNombre();
                        apellido = nombreUsuario.getApellido();
                    } else {
                        JOptionPane.showMessageDialog(null, "Clave INCORRECTA!!!");
                    }
                }
            }
        }
        
        if (ingreso == true) {
            this.dispose();
              Menu.getInstancia().setEnabled(true);
              Menu.getInstancia().toFront();
              Menu.getInstancia().activarButton();
              Menu.getInstancia().setNombrePersona(nombre, apellido);
              
//            Menu menu2 = new Menu();
//            
//            menuInstance.setVisible(true);
//            menuInstance.repaint();
//            menuInstance.revalidate();
//            menuInstance.activarButton();
//            menuInstance.setNombrePersona(nombre, apellido);
            
            
        
        }else{
            Menu.getInstancia().anularButton();
        }
    }//GEN-LAST:event_labelIngresarMouseClicked

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        jPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (jPassword.getText().length() >= 4) {
                    evt.consume();
                }
            }
        });
    }//GEN-LAST:event_jPasswordKeyTyped

    private void labelCrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrearCuentaMouseClicked
        // TODO add your handling code here:
        CreacionUsuario pd = new CreacionUsuario();
        pd.removeAll();
        pd.setSize(370, 420);
        pd.setLocation(0, 0);
        panelUsuario.removeAll();
        panelUsuario.add(pd, BorderLayout.CENTER);
        panelUsuario.revalidate();
        panelUsuario.repaint();
    }//GEN-LAST:event_labelCrearCuentaMouseClicked

    private void labelCrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrearCuentaMouseEntered
        // TODO add your handling code here:
        labelCrearCuenta.setFont(labelCrearCuenta.getFont().deriveFont(Font.BOLD));
    }//GEN-LAST:event_labelCrearCuentaMouseEntered

    private void labelCrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCrearCuentaMouseExited
        // TODO add your handling code here:
        labelCrearCuenta.setFont(labelCrearCuenta.getFont().deriveFont(Font.PLAIN));
    }//GEN-LAST:event_labelCrearCuentaMouseExited

    private void labelCambioContraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCambioContraMouseEntered
        // TODO add your handling code here:
        labelCambioContra.setFont(labelCrearCuenta.getFont().deriveFont(Font.BOLD));
    }//GEN-LAST:event_labelCambioContraMouseEntered

    private void labelCambioContraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCambioContraMouseExited
        // TODO add your handling code here:
        labelCambioContra.setFont(labelCrearCuenta.getFont().deriveFont(Font.PLAIN));
    }//GEN-LAST:event_labelCambioContraMouseExited

    private void labelCambioContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCambioContraMouseClicked
        // TODO add your handling code here:
        CambioContrase pd = new CambioContrase();
        pd.removeAll();
        pd.setSize(370, 420);
        pd.setLocation(0, 0);
        panelUsuario.removeAll();
        panelUsuario.add(pd, BorderLayout.CENTER);
        panelUsuario.revalidate();
        panelUsuario.repaint();
    }//GEN-LAST:event_labelCambioContraMouseClicked

    private void labelIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresarMouseEntered
        // TODO add your handling code here:
        panelIngresar.setBackground(new Color(153, 153, 255));
    }//GEN-LAST:event_labelIngresarMouseEntered

    private void labelIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelIngresarMouseExited
        // TODO add your handling code here:
        panelIngresar.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_labelIngresarMouseExited

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

    private void labelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCerrarMouseClicked
        // TODO add your handling code here:
        dispose();
        Menu.getInstancia().toFront();
        Menu.getInstancia().setEnabled(true);
        Menu.getInstancia().revalidate();
        Menu.getInstancia().repaint();
        Menu.getInstancia().iniciarSesion();
    }//GEN-LAST:event_labelCerrarMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
         XMouse = evt.getX();
         yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - XMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jtUsuario;
    private javax.swing.JLabel labelCambioContra;
    private javax.swing.JLabel labelCerrar;
    private javax.swing.JLabel labelCrearCuenta;
    private javax.swing.JLabel labelIngresar;
    private javax.swing.JPanel panelCerrar;
    private javax.swing.JPanel panelIngresar;
    private javax.swing.JPanel panelUsuario;
    // End of variables declaration//GEN-END:variables
 public static Login getInstanciaLogin(){//crea una sola ventana "PATRON DE SINGLETON"
        if(instanciaLogin == null){
            instanciaLogin = new Login();
            getInstanciaLogin().setVisible(true);
        }
        return instanciaLogin;
    }
}
