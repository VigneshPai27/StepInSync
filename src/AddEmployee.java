/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sandippai
 */
public class AddEmployee extends javax.swing.JFrame {

    /**
     * Creates new form AddEmployee
     */
    public AddEmployee() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        AddEmployeePanel1 = new javax.swing.JPanel();
        NameTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTxtArea = new javax.swing.JTextArea();
        PhoneNoTxtField = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        PhoneNoTxtField1 = new javax.swing.JTextField();
        AddEmployeePanel2 = new javax.swing.JPanel();
        NameTxtField1 = new javax.swing.JTextField();
        PhoneNoTxtField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        PhoneNoTxtField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        StepInSyncLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(227, 235, 248));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        AddEmployeePanel1.setOpaque(false);
        AddEmployeePanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameTxtField.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        NameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtFieldActionPerformed(evt);
            }
        });
        AddEmployeePanel1.add(NameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 250, 30));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        AddressTxtArea.setColumns(20);
        AddressTxtArea.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        AddressTxtArea.setLineWrap(true);
        AddressTxtArea.setRows(5);
        AddressTxtArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(AddressTxtArea);

        AddEmployeePanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 240, 90));

        PhoneNoTxtField.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        PhoneNoTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoTxtFieldActionPerformed(evt);
            }
        });
        AddEmployeePanel1.add(PhoneNoTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 250, 30));
        AddEmployeePanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 250, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Full Name :");
        AddEmployeePanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 250, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Date of birth:");
        AddEmployeePanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 250, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Address:");
        AddEmployeePanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 250, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Email id:");
        AddEmployeePanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 250, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("Phone number:");
        AddEmployeePanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 250, -1));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.setBorder(null);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AddEmployeePanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, 120, 40));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.setBorder(null);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        AddEmployeePanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 600, 120, 40));

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add Employee");
        AddEmployeePanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 51, 183, 44));

        PhoneNoTxtField1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        PhoneNoTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoTxtField1ActionPerformed(evt);
            }
        });
        AddEmployeePanel1.add(PhoneNoTxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 250, 30));

        jTabbedPane1.addTab("tab1", AddEmployeePanel1);

        AddEmployeePanel2.setOpaque(false);
        AddEmployeePanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameTxtField1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        NameTxtField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtField1ActionPerformed(evt);
            }
        });
        AddEmployeePanel2.add(NameTxtField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 250, 30));

        PhoneNoTxtField2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        PhoneNoTxtField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoTxtField2ActionPerformed(evt);
            }
        });
        AddEmployeePanel2.add(PhoneNoTxtField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 250, 30));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Anual Salary (In₹):");
        AddEmployeePanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 250, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Designation:");
        AddEmployeePanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 250, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Highest Education:");
        AddEmployeePanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 250, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        AddEmployeePanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 250, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel12.setText("Adhaar number:");
        AddEmployeePanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 250, -1));

        jButton3.setBackground(new java.awt.Color(51, 255, 0));
        jButton3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton3.setText("SUBMIT");
        jButton3.setBorder(null);
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        AddEmployeePanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 180, 40));

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton4.setText("Back");
        jButton4.setBorder(null);
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        AddEmployeePanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 120, 40));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Add Employee");
        AddEmployeePanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 51, 183, 44));

        PhoneNoTxtField3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        PhoneNoTxtField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoTxtField3ActionPerformed(evt);
            }
        });
        AddEmployeePanel2.add(PhoneNoTxtField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 250, 30));

        jComboBox1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR", "Clerk", "Cashier", "Manager", "Accountant", " " }));
        jComboBox1.setSelectedItem(null);
        jComboBox1.setFocusable(false);
        AddEmployeePanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 250, 30));

        jTabbedPane1.addTab("tab1", AddEmployeePanel2);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 1, 450, 750));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue shoe copy2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 800, 530));

        StepInSyncLabel.setBackground(new java.awt.Color(255, 255, 255));
        StepInSyncLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        StepInSyncLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StepInSyncLabel.setText("StepInSync");
        StepInSyncLabel.setOpaque(true);
        jPanel1.add(StepInSyncLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtFieldActionPerformed

    private void PhoneNoTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNoTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNoTxtFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NameTxtField.setText("");
        PhoneNoTxtField.setText("");
        PhoneNoTxtField1.setText("");
        AddressTxtArea.setText("");
        jDateChooser1.setCalendar(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedComponent(AddEmployeePanel2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PhoneNoTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNoTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNoTxtField1ActionPerformed

    private void PhoneNoTxtField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNoTxtField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNoTxtField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedComponent(AddEmployeePanel1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void PhoneNoTxtField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNoTxtField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNoTxtField3ActionPerformed

    private void NameTxtField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddEmployeePanel1;
    private javax.swing.JPanel AddEmployeePanel2;
    private javax.swing.JTextArea AddressTxtArea;
    private javax.swing.JTextField NameTxtField;
    private javax.swing.JTextField NameTxtField1;
    private javax.swing.JTextField PhoneNoTxtField;
    private javax.swing.JTextField PhoneNoTxtField1;
    private javax.swing.JTextField PhoneNoTxtField2;
    private javax.swing.JTextField PhoneNoTxtField3;
    private javax.swing.JLabel StepInSyncLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}