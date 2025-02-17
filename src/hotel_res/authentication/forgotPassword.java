/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel_res.authentication;

import hotel_res.adminViews.dashboardAdmin;
import hotel_res.userViews.dashboardUser;
import hotel_resv2.sqlconnection;

/**
 *
 * @author Zo
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class forgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public forgotPassword() {
        initComponents();
        jTextField3.setEditable(false);
        jTextField3.setEnabled(false);
        jButton1.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        forgotPassword1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        count = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg_panel.setBackground(new java.awt.Color(236, 227, 206));
        bg_panel.setPreferredSize(new java.awt.Dimension(700, 460));
        bg_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(58, 77, 57));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Whispering");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pines");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("@whispering_pines_hotel_reservation_system");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel_res.imgs/forest.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        bg_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(58, 77, 57));
        jLabel3.setText("Forgot password");
        bg_panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 63, 295, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        bg_panel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 138, 239, 33));

        jButton1.setBackground(new java.awt.Color(115, 144, 114));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Set new password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg_panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 239, 31));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(58, 77, 57));
        jLabel7.setText("Username:");
        bg_panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 111, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(58, 77, 57));
        jLabel8.setText("Email address or Contact number:");
        bg_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 177, -1, -1));

        forgotPassword1.setForeground(new java.awt.Color(58, 77, 57));
        forgotPassword1.setText("Go back to log in.");
        forgotPassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPassword1MouseClicked(evt);
            }
        });
        bg_panel.add(forgotPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        bg_panel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 239, 33));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(58, 77, 57));
        jLabel9.setText("New password:");
        bg_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jButton2.setBackground(new java.awt.Color(115, 144, 114));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Check email or contact");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        bg_panel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 239, 31));

        count.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countActionPerformed(evt);
            }
        });
        bg_panel.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 204, 239, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = jTextField1.getText();
        String gmailorcon = count.getText();
        String newpassword = jTextField3.getText();

        String query = "SELECT * FROM users WHERE username = ? AND (email_add = ? OR con_num = ?)";
        try (Connection conn = sqlconnection.getConnection(); PreparedStatement pst = conn.prepareStatement(query)) {
            // Set parameters for username, email address, and contact number
            pst.setString(1, username);
            pst.setString(2, gmailorcon);
            pst.setString(3, gmailorcon);

            try (ResultSet resultSet = pst.executeQuery()) {
                if (resultSet.next()) {
                    // If a match is found, update the password
                    String updateQuery = "UPDATE users SET password = ? WHERE username = ?";
                    try (PreparedStatement updatePst = conn.prepareStatement(updateQuery)) {
                        updatePst.setString(1, newpassword);
                        updatePst.setString(2, username);
                        int rowsAffected = updatePst.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Password updated successfully.");

                        } else {
                            JOptionPane.showMessageDialog(null, "Update failed, contact admin.");
                        }
                    }
                } else {
                    // If no match is found, display an error message
                    JOptionPane.showMessageDialog(null, "No user found with the provided details");

                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            // Handle database connection or query execution errors
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField3ActionPerformed
// Helper method to retrieve the failed_attempts count


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String username = jTextField1.getText();

// Query to fetch status based on username
        String getStatusQuery = "SELECT status FROM users WHERE username = ?";
        try (Connection conn = sqlconnection.getConnection(); PreparedStatement pst = conn.prepareStatement(getStatusQuery)) {
            // Set parameter for username
            pst.setString(1, username);

            try (ResultSet statusResultSet = pst.executeQuery()) {
                if (statusResultSet.next()) {
                    String status = statusResultSet.getString("status");
                    System.out.println("Status retrieved from database: " + status); // Debugging statement

                    if (status.equals("Blocked")) {
                        JOptionPane.showMessageDialog(null, "Your account has been blocked. Please contact admin.");
                        jTextField3.setEditable(false);
                        jTextField3.setEnabled(false);
                        jButton1.setEnabled(false);
                        return; // Stop further processing since the account is blocked
                    } else {
                        // If the status is not blocked, proceed with login attempt
                        String gmailorcon = count.getText();
                        String loginQuery = "SELECT * FROM users WHERE username = ? AND (email_add = ? OR con_num = ?)";
                        try (PreparedStatement loginPst = conn.prepareStatement(loginQuery)) {
                            // Set parameters for username and email/contact number
                            loginPst.setString(1, username);
                            loginPst.setString(2, gmailorcon);
                            loginPst.setString(3, gmailorcon);

                            try (ResultSet loginResultSet = loginPst.executeQuery()) {
                                if (loginResultSet.next()) {
                                    // If a match is found, enable the JTextField
                                    jTextField3.setEditable(true);
                                    jTextField3.setEnabled(true);
                                    jButton1.setEnabled(true);
                                } else {
                                    // If no match is found, disable the JTextField
                                    JOptionPane.showMessageDialog(null, "Wrong credentials.");
                                    jTextField3.setEditable(false);
                                    jTextField3.setEnabled(false);
                                    jButton1.setEnabled(false);

                                    // Update failed attempts count
                                    String updateQuery = "UPDATE users SET failed_attempts = failed_attempts + 1 WHERE username = ?";
                                    try (PreparedStatement updatePst = conn.prepareStatement(updateQuery)) {
                                        updatePst.setString(1, username);
                                        int rowsUpdated = updatePst.executeUpdate();
                                        System.out.println(rowsUpdated + " rows updated."); // Debugging statement
                                    }
                                }
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No user found with the given username.");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error occurred: " + ex.getMessage());
            // Handle any potential exceptions
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void forgotPassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPassword1MouseClicked
        // TODO add your handling code here:
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_forgotPassword1MouseClicked

    private void countActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countActionPerformed

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
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg_panel;
    private javax.swing.JTextField count;
    private javax.swing.JLabel forgotPassword1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
