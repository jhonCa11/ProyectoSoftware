package vista;

import controlador.ControladorProveedor;
import javax.swing.JOptionPane;

public class VistaProveedor extends javax.swing.JFrame {

    /**
     * Creates new form VistaCliente
     */
    public VistaProveedor() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedCli = new javax.swing.JTextField();
        txtNomCli = new javax.swing.JTextField();
        txtAplCli = new javax.swing.JTextField();
        txtTelCli = new javax.swing.JTextField();
        txtCorrElecCli = new javax.swing.JTextField();
        txtCiuCli = new javax.swing.JTextField();
        txtDirCli = new javax.swing.JTextField();
        btnAgregarCli = new javax.swing.JButton();
        btnRegisCli = new javax.swing.JButton();
        btnElimiCli = new javax.swing.JButton();
        btnActuCli = new javax.swing.JButton();
        btnListarCli = new javax.swing.JButton();
        btnBuscaCli = new javax.swing.JButton();
        btnSalirCli = new javax.swing.JButton();
        btnConfirmActCli = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCli = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(752, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(238, 255, 238));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PROVEEDOR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(243, 252, 252));
        jPanel2.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Nit:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Teléfono:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setText("Correo Electrónico:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Ciudad:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Empresa:");

        txtAplCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAplCliActionPerformed(evt);
            }
        });

        txtTelCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelCliActionPerformed(evt);
            }
        });

        btnAgregarCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarCli.setForeground(new java.awt.Color(0, 204, 204));
        btnAgregarCli.setText("Agregar Proveedor");
        btnAgregarCli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnAgregarCli.setIconTextGap(2);
        btnAgregarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCliActionPerformed(evt);
            }
        });

        btnRegisCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegisCli.setForeground(new java.awt.Color(0, 204, 204));
        btnRegisCli.setText("Registrar Proveedor");
        btnRegisCli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnRegisCli.setIconTextGap(2);
        btnRegisCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisCliActionPerformed(evt);
            }
        });

        btnElimiCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnElimiCli.setForeground(new java.awt.Color(0, 204, 204));
        btnElimiCli.setText("Eliminar Proveedor");
        btnElimiCli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnElimiCli.setIconTextGap(2);
        btnElimiCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimiCliActionPerformed(evt);
            }
        });

        btnActuCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnActuCli.setForeground(new java.awt.Color(0, 204, 204));
        btnActuCli.setText("Actualizar Proveedor");
        btnActuCli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnActuCli.setIconTextGap(2);
        btnActuCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActuCliActionPerformed(evt);
            }
        });

        btnListarCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnListarCli.setForeground(new java.awt.Color(0, 204, 204));
        btnListarCli.setText("Listar Proveedor");
        btnListarCli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnListarCli.setIconTextGap(2);
        btnListarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarCliActionPerformed(evt);
            }
        });

        btnBuscaCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscaCli.setForeground(new java.awt.Color(0, 204, 204));
        btnBuscaCli.setText("Buscar Proveedor");
        btnBuscaCli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnBuscaCli.setIconTextGap(2);
        btnBuscaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCliActionPerformed(evt);
            }
        });

        btnSalirCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalirCli.setForeground(new java.awt.Color(0, 204, 204));
        btnSalirCli.setText("Salir");
        btnSalirCli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnSalirCli.setIconTextGap(2);
        btnSalirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCliActionPerformed(evt);
            }
        });

        btnConfirmActCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirmActCli.setForeground(new java.awt.Color(0, 204, 204));
        btnConfirmActCli.setText("Confirma Proveedor");
        btnConfirmActCli.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        btnConfirmActCli.setIconTextGap(2);
        btnConfirmActCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAplCli, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCedCli, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDirCli, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCiuCli, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorrElecCli, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnElimiCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegisCli, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActuCli, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalirCli, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirmActCli, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnBuscaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAgregarCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(btnRegisCli, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnElimiCli, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(btnActuCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txtCedCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAplCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmActCli, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCorrElecCli)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCiuCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalirCli, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtDirCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(6, 0, 723, 305);

        tablaCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nit", "Nombre", "Apellido", "Teléfono", "Correo Electrónico", "Ciudad", "Empresa"
            }
        ));
        jScrollPane1.setViewportView(tablaCli);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 310, 723, 175);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 740, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarCliActionPerformed

    private void btnRegisCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisCliActionPerformed

    private void btnElimiCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimiCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElimiCliActionPerformed

    private void btnActuCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActuCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActuCliActionPerformed

    private void btnListarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarCliActionPerformed

    private void btnBuscaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscaCliActionPerformed

    private void btnSalirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCliActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas salir?");

        // Si se acepta el cuadro de diálogo, regresar a la clase "VistaLogin"
        if (confirm == JOptionPane.YES_OPTION) {
            VistaMenuAdmin VistaMenuAdmin = new VistaMenuAdmin();
            VistaMenuAdmin.setVisible(true);
            VistaMenuAdmin.setLocationRelativeTo(null);
            this.dispose(); // Cierra la vista actual
        }
    }//GEN-LAST:event_btnSalirCliActionPerformed

    private void txtAplCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAplCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAplCliActionPerformed

    private void txtTelCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelCliActionPerformed

    private void btnConfirmActCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmActCliActionPerformed

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
            java.util.logging.Logger.getLogger(VistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        VistaProveedor v = new VistaProveedor();
        ControladorProveedor con = new ControladorProveedor(v);
        v.setVisible(true);
        v.setLocationRelativeTo(null);

        /* Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCliente().setVisible(true);
            }
        });
         */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnActuCli;
    public javax.swing.JButton btnAgregarCli;
    public javax.swing.JButton btnBuscaCli;
    public javax.swing.JButton btnConfirmActCli;
    public javax.swing.JButton btnElimiCli;
    public javax.swing.JButton btnListarCli;
    public javax.swing.JButton btnRegisCli;
    public javax.swing.JButton btnSalirCli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaCli;
    public javax.swing.JTextField txtAplCli;
    public javax.swing.JTextField txtCedCli;
    public javax.swing.JTextField txtCiuCli;
    public javax.swing.JTextField txtCorrElecCli;
    public javax.swing.JTextField txtDirCli;
    public javax.swing.JTextField txtNomCli;
    public javax.swing.JTextField txtTelCli;
    // End of variables declaration//GEN-END:variables
}
