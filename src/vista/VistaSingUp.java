/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControladorAdministrador;
import controlador.ControladorCliente;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.Conexion;

/**
 *
 * @author ASUS
 */
public class VistaSingUp extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public VistaSingUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblRegistrarAdmin = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        lblCont = new javax.swing.JLabel();
        txtUsua = new javax.swing.JTextField();
        txtCed = new javax.swing.JTextField();
        lblUsu2 = new javax.swing.JLabel();
        btnRegis = new javax.swing.JButton();
        lblUsu3 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(83, 78, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AJJG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusCycleRoot(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        lblRegistrarAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRegistrarAdmin.setForeground(new java.awt.Color(0, 102, 102));
        lblRegistrarAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarAdmin.setText("Registrar Admin");
        jPanel2.add(lblRegistrarAdmin);
        lblRegistrarAdmin.setBounds(6, 26, 250, 45);

        jPasswordField.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(0, 153, 153));
        jPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(jPasswordField);
        jPasswordField.setBounds(6, 274, 239, 37);

        lblCont.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCont.setForeground(new java.awt.Color(0, 102, 102));
        lblCont.setText("Contraseña:");
        jPanel2.add(lblCont);
        lblCont.setBounds(6, 241, 89, 27);

        txtUsua.setForeground(new java.awt.Color(0, 153, 153));
        txtUsua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsua.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtUsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuaActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsua);
        txtUsua.setBounds(6, 196, 240, 33);

        txtCed.setForeground(new java.awt.Color(0, 153, 153));
        txtCed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCed.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedActionPerformed(evt);
            }
        });
        jPanel2.add(txtCed);
        txtCed.setBounds(6, 116, 240, 35);

        lblUsu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsu2.setForeground(new java.awt.Color(0, 102, 102));
        lblUsu2.setText("Usuario:");
        jPanel2.add(lblUsu2);
        lblUsu2.setBounds(6, 157, 61, 33);

        btnRegis.setBackground(new java.awt.Color(0, 102, 102));
        btnRegis.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegis.setForeground(new java.awt.Color(255, 255, 255));
        btnRegis.setText("Registrarse");
        btnRegis.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegis);
        btnRegis.setBounds(6, 351, 114, 37);

        lblUsu3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsu3.setForeground(new java.awt.Color(0, 102, 102));
        lblUsu3.setText("Cédula:");
        jPanel2.add(lblUsu3);
        lblUsu3.setBounds(6, 77, 55, 33);

        btnCancel.setBackground(new java.awt.Color(0, 102, 102));
        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel);
        btnCancel.setBounds(132, 351, 114, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1-1.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(-9, -15, 710, 500);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        // TODO add your handling code here:
        String cedula = txtCed.getText();
        String nuevoUsuario = txtUsua.getText();
        String nuevaContrasena = new String(jPasswordField.getPassword());

        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();

        try {
            // Verificar si el usuario ya existe
            String verificaExistencia = "SELECT * FROM usuarios WHERE usuario = ?";
            PreparedStatement verificaStatement = con.prepareStatement(verificaExistencia);
            verificaStatement.setString(1, cedula);
            ResultSet existeResultSet = verificaStatement.executeQuery();

            if (existeResultSet.next()) {
                JOptionPane.showMessageDialog(this, "El usuario ya existe. Por favor, elige otro nombre de usuario.", "Error de registro", JOptionPane.ERROR_MESSAGE);
            } else {
                // Si el usuario no existe, realizar el registro
                String registroQuery = "INSERT INTO usuarios (Cedula, usuario, contraseña) VALUES (?, ?, ?)";
                PreparedStatement registroStatement = con.prepareStatement(registroQuery);
                registroStatement.setString(1, cedula);
                registroStatement.setString(2, nuevoUsuario);
                registroStatement.setString(3, nuevaContrasena);

                int filasAfectadas = registroStatement.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    VistaMenuAdmin VistaMenuAdmin = new VistaMenuAdmin();
                    VistaMenuAdmin.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo realizar el registro", "Error de registro", JOptionPane.ERROR_MESSAGE);
                }

                registroStatement.close();
            }

            existeResultSet.close();
            verificaStatement.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnRegisActionPerformed

    private void txtUsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuaActionPerformed

    private void txtCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas salir?");

        // Si se acepta el cuadro de diálogo, regresar a la clase "VistaLogin"
        if (confirm == JOptionPane.YES_OPTION) {
            VistaMenuAdmin VistaMenuAdmin = new VistaMenuAdmin();
            VistaMenuAdmin.setVisible(true);
            VistaMenuAdmin.setLocationRelativeTo(null);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCancel;
    public javax.swing.JButton btnRegis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel lblCont;
    private javax.swing.JLabel lblRegistrarAdmin;
    private javax.swing.JLabel lblUsu2;
    private javax.swing.JLabel lblUsu3;
    public javax.swing.JTextField txtCed;
    public javax.swing.JTextField txtUsua;
    // End of variables declaration//GEN-END:variables
}
