/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.notas.Interfaces;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.notas.controller.GestorUsuarios;
import com.notas.controller.Register;

/**
 *
 * @author PC
 */
public class RegistrerView extends javax.swing.JFrame {

    /**
     * Creates new form RegistrerView
     */
    public RegistrerView() {
        initComponents();
        escalarIconLabel(fondoPantallaRegistrer, "/fondo11.jpg");
    }
    
    public void escalarIconLabel(JLabel label, String rutaIcono) {
        try {
            ImageIcon foto = new ImageIcon(getClass().getResource(rutaIcono));
            Icon icono = new ImageIcon(foto.getImage().getScaledInstance(label.getWidth(), label.getHeight(), java.awt.Image.SCALE_SMOOTH));
            label.setIcon(icono);
        } catch (NullPointerException e) {
            System.out.println("No se pudo cargar la imagen: " + rutaIcono);
            e.printStackTrace();
        }
    }

    public void submitUserInformation () {
         
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
        panelLog = new javax.swing.JPanel();
        labelNotilabResgistrer = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        botonLogin = new javax.swing.JButton();
        labelLogin = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        labelNoAccount = new javax.swing.JLabel();
        labelRegistrar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelError = new javax.swing.JLabel();
        fondoPantallaRegistrer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 900));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        panelLog.setBackground(new java.awt.Color(255, 255, 255, 40));
        panelLog.setForeground(new java.awt.Color(255, 255, 255));
        panelLog.setToolTipText("");
        panelLog.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLog.setMaximumSize(new java.awt.Dimension(500, 500));

        labelNotilabResgistrer.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        labelNotilabResgistrer.setForeground(new java.awt.Color(51, 51, 51));
        labelNotilabResgistrer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNotilabResgistrer.setText("NotiLab");

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(51, 51, 51));
        labelEmail.setText("Email:");

        fieldEmail.setBackground(new java.awt.Color(255, 220, 255));
        fieldEmail.setBorder(null);
        fieldEmail.setCaretColor(new java.awt.Color(0, 0, 0));
        fieldEmail.setMargin(new java.awt.Insets(0, 2, 0, 2));
        fieldEmail.setSelectionColor(new java.awt.Color(153, 0, 153, 40));

        botonLogin.setBackground(new java.awt.Color(97, 1, 124));
        botonLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botonLogin.setForeground(new java.awt.Color(255, 255, 255));
        botonLogin.setText("Sign Up");
        botonLogin.setBorder(null);
        botonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLoginMouseClicked(evt);
            }
        });

        labelLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelLogin.setForeground(new java.awt.Color(51, 51, 51));
        labelLogin.setText("Sign Up");

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(51, 51, 51));
        labelPassword.setText("Password:");

        fieldPassword.setBackground(new java.awt.Color(255, 219, 255));
        fieldPassword.setBorder(null);
        fieldPassword.setCaretColor(new java.awt.Color(0, 0, 0));
        fieldPassword.setSelectionColor(new java.awt.Color(153, 0, 153, 40));

        labelNoAccount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelNoAccount.setText("¿Ya tienes cuenta?");

        labelRegistrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelRegistrar.setForeground(new java.awt.Color(153, 0, 153));
        labelRegistrar.setText("Ir al login");
        labelRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRegistrarMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(97, 1, 124));
        jSeparator1.setForeground(new java.awt.Color(97, 1, 124));

        labelError.setBackground(new java.awt.Color(0, 0, 0, 0));
        labelError.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        labelError.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout panelLogLayout = new javax.swing.GroupLayout(panelLog);
        panelLog.setLayout(panelLogLayout);
        panelLogLayout.setHorizontalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogLayout.createSequentialGroup()
                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(labelNotilabResgistrer)
                            .addComponent(labelLogin)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelLogLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(labelEmail))
                                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                        .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLogLayout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addComponent(labelPassword))
                                        .addGroup(panelLogLayout.createSequentialGroup()
                                            .addComponent(labelNoAccount)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(labelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelLogLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panelLogLayout.setVerticalGroup(
            panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogLayout.createSequentialGroup()
                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(labelNotilabResgistrer))
                    .addGroup(panelLogLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(labelLogin)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelError, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNoAccount)
                    .addComponent(labelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        fondoPantallaRegistrer.setBackground(new java.awt.Color(51, 51, 51));
        fondoPantallaRegistrer.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondoPantallaRegistrer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(panelLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(fondoPantallaRegistrer, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("ventanaRegistrer");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRegistrarMouseClicked
        // TODO add your handling code here:
        new LoginView().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelRegistrarMouseClicked

    
    private void botonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLoginMouseClicked
        // TODO add your handling code here:

        String email = fieldEmail.getText().trim();
        String password = new String(fieldPassword.getPassword()).trim();

        if (email.isEmpty() || password.isEmpty() || (!Register.verifyValidEmail(email)) || (!Register.verifyValidPassword(password)) || Register.validateUserCreado(email)) {

            if (email.isEmpty() || password.isEmpty()){
                labelError.setText("❌ Rellena todos los campos.");
                
            } else if ((!Register.verifyValidEmail(email)) || (!Register.verifyValidPassword(password))){
                labelError.setText("❌ Correo o contraseña inválidos");
                
            } else if (Register.validateUserCreado(email)) {
                labelError.setText("❌ Este usuario ya está creado");
            }
                
        } else {
            boolean success = Register.registerUser(email, password);
            if (success) {
                labelError.setText("✅ Registrado con éxito");
                GestorUsuarios.crearTxtUser(email);
            } else {
                labelError.setText("❌ Error al registrar el usuario");
            }
        }
        
    }//GEN-LAST:event_botonLoginMouseClicked

    /**
     * @param args the command line arguments
     */
    
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLogin;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JLabel fondoPantallaRegistrer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelNoAccount;
    private javax.swing.JLabel labelNotilabResgistrer;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRegistrar;
    private javax.swing.JPanel panelLog;
    // End of variables declaration//GEN-END:variables
}
