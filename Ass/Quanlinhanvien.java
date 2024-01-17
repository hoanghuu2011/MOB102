package Ass;

import Ass.nhanvien.NhanVien;
import Ass.Clock.ClockThread;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static org.apache.xalan.xsltc.compiler.util.Type.Object;

/**
 *
 * @author HOANG HUU
 */
public class Quanlinhanvien extends javax.swing.JFrame {

    DefaultTableModel tblModel;
    List<NhanVien> list = new ArrayList<>();
    private int index = -1;
    private static final String P_EMAIL = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";

    /**
     *
     */
    public Quanlinhanvien() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public void initTable() {
        tblModel = (DefaultTableModel) tblNhanvien.getModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã", "Họ và tên", "Tuổi", "Email", "Lương"});

    }

    public void fillTable() {
        tblModel.setRowCount(0);
        for (NhanVien nv : list) {
            tblModel.addRow(new Object[]{nv.getMa(), nv.getHoTen(), nv.getTuoi(), nv.getEmail(), nv.getLuong()});
        }
    }

    public void clearfrom() {
        txtTen.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        txtMa.setText("");
        txtTuoi.setText("");
        index = -1;

    }

    public NhanVien readForm() {
        return new NhanVien(txtMa.getText(), txtTen.getText(), Integer.valueOf(txtTuoi.getText()), txtEmail.getText(), Double.parseDouble(txtLuong.getText()));
    }

    public void themnv() {
        if (validateForm()) {
            if (index == -1) {
                list.add(readForm());
                fillTable();
                JOptionPane.showMessageDialog(this, "Đã thêm");
            } else {
                capNhat(readForm());
                fillTable();
                JOptionPane.showMessageDialog(this, "Đã cập nhật");
            }
        }
    }

    public String laythongtinBanGhi() {
        return "Record: " + (index + 1) + " of " + list.size();
    }

    public NhanVien timTheoMa(String ID) {
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ID)) {
                return nv;
            }
        }
        return null;
    }

    public void capNhat(NhanVien newnv) {
        NhanVien nv1 = timTheoMa(newnv.getMa());
        if (nv1 != null) {
            nv1.setHoTen(newnv.getHoTen());
            nv1.setTuoi(newnv.getTuoi());
            nv1.setEmail(newnv.getEmail());
            nv1.setLuong(newnv.getLuong());
        }
    }

    public boolean validateForm() {
        if (txtMa.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập mã nhân viên");
            return false;
        }
        if (txtTen.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập họ tên");
            return false;
        }
        if (txtTuoi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tuổi");
            return false;
        } else if (Integer.parseInt(txtTuoi.getText()) <= 16 || Integer.parseInt(txtTuoi.getText()) >= 55) {
            txtTuoi.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(btnSave, "Tuổi không hợp lệ!", "Tuổi", JOptionPane.ERROR_MESSAGE);
            txtTuoi.setBackground(null);
            return false;
        }
        /*else {
            Integer.parseInt(txtTuoi.getText());
        }
        try {
            Integer.parseInt(txtTuoi.getText());
           
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(btnSave, "Số Tuổi nhập không hợp lệ!\nNhập lại!", "Tuổi",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }*/
        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập email");
            return false;
        }
        Matcher matcher = Pattern.compile(P_EMAIL).matcher(txtEmail.getText());
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Email sai định dạng");
            return false;
        }

        if (txtLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập lương");
            return false;
        } else if (Double.parseDouble(txtLuong.getText()) <= 5000000) {
            txtLuong.setBackground(Color.YELLOW);
            JOptionPane.showMessageDialog(btnSave, "Lương không hợp lệ", "Lương", JOptionPane.ERROR_MESSAGE);
            txtLuong.setBackground(null);
            return false;
        } else {
            Double.parseDouble(txtLuong.getText());
            txtLuong.setBackground(null);
        }

        return true;
    }

    public void readFile() {
        try {
            list = (List<NhanVien>) XFile.readObject("listnv.dat");
            fillTable();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void saveFile() {
        int response = JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu không ?", "Thông báo", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
               
               
               
                XFile.writeObject("listnv.dat", list);
               // JOptionPane.showConfirmDialog(this, "Bạn có muốn lưu ko?");
                
            } catch (Exception ex) {

                ex.printStackTrace();
            }
        
        }
        } 
    

    public void fillNhanvienlenform(int index) {
        txtMa.setText(list.get(index).getMa());
        txtTen.setText(list.get(index).getHoTen());
        txtEmail.setText(list.get(index).getEmail());
        txtTuoi.setText(String.valueOf(list.get(index).getTuoi()));
        txtLuong.setText(String.valueOf(list.get(index).getLuong()));
    }

    public void fillNhanVienLenForm(NhanVien nv) {
        txtMa.setText(nv.getMa());
        txtTen.setText(nv.getHoTen());
        txtEmail.setText(nv.getEmail());
        txtTuoi.setText(String.valueOf(nv.getTuoi()));
        txtLuong.setText(String.valueOf(nv.getLuong()));
    }

    public void XoaNV() {
        list.remove(index);
        fillTable();
        clearfrom();
        JOptionPane.showMessageDialog(this, "Đã xóa");
    }

    public void FirstNV() {
        index = 0;
        tblNhanvien.setRowSelectionInterval(index, index);
        fillNhanvienlenform(index);
        lblBangghi.setText(laythongtinBanGhi());
    }

    public void LastNV() {
        index = list.size() - 1;
        tblNhanvien.setRowSelectionInterval(index, index);
        fillNhanvienlenform(index);
        lblBangghi.setText(laythongtinBanGhi());

    }

    public void PreNV() {
        if (index == 0) {
            LastNV();
        } else {
            index--;
        }

        tblNhanvien.setRowSelectionInterval(index, index);
        fillNhanvienlenform(index);
        lblBangghi.setText(laythongtinBanGhi());
    }

    public void NextNV() {
        if (index == list.size() - 1) {
            FirstNV();
        } else {
            index++;
        }

        tblNhanvien.setRowSelectionInterval(index, index);
        fillNhanvienlenform(index);
        lblBangghi.setText(laythongtinBanGhi());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        btnfirst = new javax.swing.JButton();
        btnpre = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        lblBangghi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnFind = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanvien = new javax.swing.JTable();
        btnClock = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhân Viên");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setText("Mã Nhân Viên");

        jLabel3.setText("Họ Và Tên");

        jLabel4.setText("Tuổi");

        jLabel5.setText("Email");

        jLabel6.setText("Lương");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnpre.setText("<<");
        btnpre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreActionPerformed(evt);
            }
        });

        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        lblBangghi.setForeground(new java.awt.Color(255, 0, 0));
        lblBangghi.setText("Record 1 of 10");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnNew)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(13, 13, 13)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addContainerGap())
        );

        tblNhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanvienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanvien);

        btnClock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClock.setForeground(new java.awt.Color(255, 0, 0));
        btnClock.setText("00:00:AM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnpre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnnext)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnlast))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                        .addComponent(txtEmail)
                                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBangghi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClock, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnClock))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnfirst)
                            .addComponent(btnpre)
                            .addComponent(btnnext)
                            .addComponent(btnlast)
                            .addComponent(lblBangghi)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*list.add(new NhanVien("NV01", "HUU", 19, "huu2003@fpt.edu.vn", 9999));
        list.add(new NhanVien ("NV02","Thắng",20,"thang@fpt.edu.vn",20000));
        list.add(new NhanVien ("NV03","Huy",20,"huy@fpt.edu.vn",20000));
        list.add(new NhanVien ("NV04","Hong",22,"tan@fpt.edu.vn",15000));
         list.add(new NhanVien ("NV05","Linh",21,"huu@fpt.edu.vn",24000));
        list.add(new NhanVien ("NV06","Linh Huong",18,"dong@fpt.edu.vn",10000));
         */
        lblBangghi.setText(laythongtinBanGhi());
        ClockThread th = new ClockThread(btnClock);
        th.start();
        btnClock.setEnabled(false);
        initTable();
        //fillTable();

    }//GEN-LAST:event_formWindowOpened

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        clearfrom();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        themnv();


    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanvienMouseClicked
        index = tblNhanvien.getSelectedRow();
        fillNhanvienlenform(index);
        lblBangghi.setText(laythongtinBanGhi());

    }//GEN-LAST:event_tblNhanvienMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        XoaNV();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       
        saveFile();
        System.exit(0);


    }//GEN-LAST:event_btnExitActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        if (timTheoMa(txtMa.getText()) == null) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy nhân viên");
        } else {
            fillNhanVienLenForm(timTheoMa(txtMa.getText()));
    }//GEN-LAST:event_btnFindActionPerformed
    }
    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        FirstNV();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnpreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreActionPerformed
        PreNV();
    }//GEN-LAST:event_btnpreActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        LastNV();
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        NextNV();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        readFile();
    }//GEN-LAST:event_btnOpenActionPerformed

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
            java.util.logging.Logger.getLogger(Quanlinhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Quanlinhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Quanlinhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Quanlinhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Quanlinhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClock;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBangghi;
    private javax.swing.JTable tblNhanvien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables

}
