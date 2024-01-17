
package Lab6;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class RandomNum extends javax.swing.JFrame {

    public RandomNum() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTram = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtChuc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDonVi = new javax.swing.JTextField();
        btnStart1 = new javax.swing.JButton();
        btnStart2 = new javax.swing.JButton();
        btnStart3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("XỔ SỐ KIẾN THIẾT");

        jLabel2.setText("TRĂM");

        txtTram.setEditable(false);
        txtTram.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTram.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTram.setText("0");

        jLabel3.setText("CHỤC");

        txtChuc.setEditable(false);
        txtChuc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtChuc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtChuc.setText("0");

        jLabel4.setText("ĐƠN VỊ");

        txtDonVi.setEditable(false);
        txtDonVi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDonVi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDonVi.setText("0");

        btnStart1.setText("Start");
        btnStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart1ActionPerformed(evt);
            }
        });

        btnStart2.setText("Start");
        btnStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart2ActionPerformed(evt);
            }
        });

        btnStart3.setText("Start");
        btnStart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStart3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTram)
                                    .addComponent(btnStart1, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnStart2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                    .addComponent(txtChuc))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(txtDonVi)
                            .addComponent(btnStart3, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtChuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStart1)
                    .addComponent(btnStart2)
                    .addComponent(btnStart3))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart1ActionPerformed
        ranNum(txtTram);
        btnStart1.setEnabled(false);
    }//GEN-LAST:event_btnStart1ActionPerformed

    private void btnStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart2ActionPerformed
        ranNum(txtChuc);
        btnStart2.setEnabled(false);
    }//GEN-LAST:event_btnStart2ActionPerformed

    private void btnStart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStart3ActionPerformed
        ranNum(txtDonVi);
        btnStart3.setEnabled(false);
    }//GEN-LAST:event_btnStart3ActionPerformed

    public void ranNum(JTextField field) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        int so = (int) Math.round(Math.random() * 9);
                        field.setText(String.valueOf(so));
                        Thread.sleep(1);
                    } catch (InterruptedException ex) {
                    }
                }
            }

        }.start();
    }

  

    
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
            java.util.logging.Logger.getLogger(RandomNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RandomNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RandomNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RandomNum.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RandomNum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart1;
    private javax.swing.JButton btnStart2;
    private javax.swing.JButton btnStart3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtChuc;
    private javax.swing.JTextField txtDonVi;
    private javax.swing.JTextField txtTram;
    // End of variables declaration//GEN-END:variables
}
