
package Lab7;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HOANG HUU
 */
public class Lab7Bai3 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Lab7Bai3() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKetQua = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSo1 = new javax.swing.JTextField();
        txtSo2 = new javax.swing.JTextField();
        txtCanBac2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLuyThua = new javax.swing.JTextField();
        txtNhoNhat = new javax.swing.JTextField();
        txtLonNhat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab7 - Bài 3");

        btnKetQua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnKetQua.setText("Tính toán");
        btnKetQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetQuaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Số thứ 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Số thứ 2");

        txtSo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCanBac2.setEditable(false);
        txtCanBac2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("KẾT QUẢ");

        txtLuyThua.setEditable(false);
        txtLuyThua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNhoNhat.setEditable(false);
        txtNhoNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtLonNhat.setEditable(false);
        txtLonNhat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Căn bậc 2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Luỹ thừa");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số nhỏ nhất");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Số lớn nhất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCanBac2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtLuyThua, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNhoNhat)
                                .addComponent(txtSo2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                .addComponent(txtLonNhat, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(txtSo1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)))
                    .addComponent(btnKetQua, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSo2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCanBac2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLuyThua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhoNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLonNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetQuaActionPerformed
        // TODO add your handling code here:
        try {
            String num1 = txtSo1.getText();
            String num2 = txtSo2.getText();
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            
            double canbac2 = Math.sqrt(a);
            txtCanBac2.setText(Double.toString(canbac2));
            
            double luythua = Math.pow(a,b);
            txtLuyThua.setText(Double.toString(luythua));
            
            double sonn = Math.min(a,b);
            txtNhoNhat.setText(Double.toString(sonn));
            
            double soln = Math.max(a,b);
            txtLonNhat.setText(Double.toString(soln));
        } catch (Exception e) {
            if (txtSo1.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập số 1");
            }else{
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
            }
            if (txtSo2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập số 2");
            }else{
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_btnKetQuaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Lab7Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab7Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab7Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab7Bai3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Lab7Bai3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKetQua;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCanBac2;
    private javax.swing.JTextField txtLonNhat;
    private javax.swing.JTextField txtLuyThua;
    private javax.swing.JTextField txtNhoNhat;
    private javax.swing.JTextField txtSo1;
    private javax.swing.JTextField txtSo2;
    // End of variables declaration//GEN-END:variables
    public static boolean checkEmpty(JTextField field, StringBuilder sb, String msg) {
        boolean ok = true;
        if (field.getText().equals("")) {
            sb.append(msg).append("\n");
            field.setBackground(Color.red);
            ok = false;
        } else {
            field.setBackground(Color.white);
        }
        return ok;
    }

    public static boolean checkNum(JTextField field, StringBuilder sb) {
        boolean ok = true;
        if (!checkEmpty(field, sb, "Chưa nhập số")) {
            return false;
        }
        try {
            int num = Integer.parseInt(field.getText());
            if (num == -1) {
                sb.append("Tuổi không hợp lệ (nằm ngoài khoảng 15 - 55)\n");
                field.setBackground(Color.red);
                ok = false;
            }

        } catch (Exception e) {
            sb.append("Giá trị không hợp lệ (Phải là giá trị số)\n");
            field.setBackground(Color.red);
            ok = false;
        }
        if (ok) {
            field.setBackground(Color.white);
        }
        return ok;
    }
}
