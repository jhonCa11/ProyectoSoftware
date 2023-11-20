/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Conexion;

import java.sql.*;

/**
 *
 * @author ASUS
 */
public class VistaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VistaBienvenida
     */
    public VistaLogin() {
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

        jPanel1 = new javax.swing.JPanel();
        lblCont = new javax.swing.JLabel();
        lblUsu = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        txtUsua = new javax.swing.JTextField();
        lblUsu1 = new javax.swing.JLabel();
        btuInicieSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(83, 78, 72));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AJJG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(null);

        lblCont.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCont.setForeground(new java.awt.Color(0, 0, 0));
        lblCont.setText("Contraseña:");
        jPanel1.add(lblCont);
        lblCont.setBounds(500, 230, 210, 27);

        lblUsu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsu.setForeground(new java.awt.Color(255, 255, 255));
        lblUsu.setText("Usuario: ");
        jPanel1.add(lblUsu);
        lblUsu.setBounds(500, 150, 190, 33);

        jPasswordField.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(0, 153, 153));
        jPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        jPanel1.add(jPasswordField);
        jPasswordField.setBounds(420, 250, 239, 31);

        txtUsua.setForeground(new java.awt.Color(0, 153, 153));
        txtUsua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsua.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102)));
        txtUsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuaActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsua);
        txtUsua.setBounds(420, 180, 239, 33);

        lblUsu1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblUsu1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsu1.setText("Iniciar sesión ");
        jPanel1.add(lblUsu1);
        lblUsu1.setBounds(420, 70, 250, 45);

        btuInicieSesion.setBackground(new java.awt.Color(0, 102, 102));
        btuInicieSesion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btuInicieSesion.setForeground(new java.awt.Color(255, 255, 255));
        btuInicieSesion.setText("Inicie sesión");
        btuInicieSesion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        btuInicieSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btuInicieSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btuInicieSesion);
        btuInicieSesion.setBounds(470, 310, 114, 37);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/1-1.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 30, 680, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btuInicieSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btuInicieSesionActionPerformed
        // TODO add your handling code here:
        String usuario = txtUsua.getText();
        String contrasena = new String(jPasswordField.getPassword());

        Conexion conexion = new Conexion();
        Connection con = conexion.getConnection();

        try {
            String query = "SELECT * FROM usuarios WHERE usuario = ? AND contraseña = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, usuario);
            statement.setString(2, contrasena);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                VistaMenuAdmin VistaMenuAdmin = new VistaMenuAdmin();
                VistaMenuAdmin.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
            }

            resultSet.close();
            statement.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btuInicieSesionActionPerformed

    private void txtUsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VistaLogin v = new VistaLogin();
                v.setVisible(true);
                v.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btuInicieSesion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel lblCont;
    private javax.swing.JLabel lblUsu;
    private javax.swing.JLabel lblUsu1;
    private javax.swing.JTextField txtUsua;
    // End of variables declaration//GEN-END:variables
}
