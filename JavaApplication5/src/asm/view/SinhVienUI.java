
package asm.view;

import asm.service.impl.SinhVienServiceImpl;
import asm.model.SinhVien;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Binh
 */
public class SinhVienUI extends javax.swing.JFrame {
    String filename;
    String accrole;
    public SinhVienUI(String accrole) {
        initComponents();
        this.accrole = accrole;
        if(accrole.equals("cán bộ đào tạo")){
            btnsave.setEnabled(true);
            btndelete.setEnabled(true);
            btnupdate.setEnabled(true);
        }else if(accrole.equals("test")){
            btnsave.setEnabled(true);
            btndelete.setEnabled(true);
            btnupdate.setEnabled(true);
        }else{
            btnsave.setEnabled(false);
            btndelete.setEnabled(false);
            btnupdate.setEnabled(false);
        }
    }

    private SinhVienUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsinhvien = new javax.swing.JTable();
        txtdiachi = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        lblstatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelx = new javax.swing.JLabel();
        btnloadtable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("mã sinh viên");

        jLabel3.setText("họ tên");

        jLabel4.setText("email");

        jLabel5.setText("sdt");

        buttonGroup1.add(rdonam);
        rdonam.setSelected(true);
        rdonam.setText("Nam");

        buttonGroup1.add(rdonu);
        rdonu.setText("Nữ");

        jLabel6.setText("giới tính");

        jLabel7.setText("địa chỉ");

        tblsinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mã sinh viên", "họ tên", "email", "sdt", "giới tính", "địa chỉ", "hình"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsinhvienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tblsinhvienMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tblsinhvien);

        btnnew.setText("new");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnsave.setText("save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        lblstatus.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panelx.setBackground(new java.awt.Color(255, 255, 153));
        panelx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelxMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelx, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(panelx, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnloadtable.setText("load table");
        btnloadtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloadtableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdonam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdonu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                .addComponent(txtemail)
                                .addComponent(txtsdt))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btndelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnupdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnnew)
                                        .addGap(27, 27, 27)
                                        .addComponent(btnsave)))
                                .addGap(27, 27, 27)
                                .addComponent(btnloadtable)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdonam)
                            .addComponent(rdonu))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnew)
                            .addComponent(btnsave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate)
                            .addComponent(btndelete)
                            .addComponent(btnloadtable))
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        ArrayList<SinhVien> list = new SinhVienServiceImpl().getlistfromDB();
        int i = 0;
        for (SinhVien sinhVien : list) {
            if(sinhVien.getMasv().equals(txtmasv.getText()) == true){
                JOptionPane.showMessageDialog(this, "mã sinh viên đã tồn tại");
                return ;
            }
        }
        SinhVien sv = cleancode();
        if(sv == null){
            return ;
        }
        try{    
            SinhVienServiceImpl service = new SinhVienServiceImpl();
            service.insert(sv);
            loadtable();
            lblstatus.setText("đã lưu dữ liệu");
        } catch (Exception e) {
            lblstatus.setText("lưu thất bại, đã xảy ra lỗi");
            e.printStackTrace();
            return ;
        }
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtdiachi.setText("");
        txtemail.setText("");
        txthoten.setText("");
        txtmasv.setText("");
        txtsdt.setText("");
        rdonam.setSelected(true);
        lblstatus.setText("đã xóa trắng");
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
            SinhVien sv = cleancode();
            if(sv == null){
                return ;
            }
            try {

                SinhVienServiceImpl service = new SinhVienServiceImpl();
                service.update(sv);
                loadtable();
                lblstatus.setText("đã cập nhật dữ liệu");
            } catch (SQLException e) {
                lblstatus.setText("cập nhật thất bại, đã xảy ra lỗi");
                e.printStackTrace();
            }
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        String masv = txtmasv.getText();
        if(masv.trim().length()== 0){
            JOptionPane.showMessageDialog(this, "chưa nhập mã sinh viên cần xóa");
            return ;
        }
        SinhVienServiceImpl service = new SinhVienServiceImpl();
        try {
            service.delete(masv);
            loadtable();
            lblstatus.setText("xóa thành công");
        } catch (SQLException ex) {
            lblstatus.setText("xóa thất bại");
            JOptionPane.showMessageDialog(this, "xóa thất bại");
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tblsinhvienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsinhvienMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tblsinhvienMouseEntered

    private void panelxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelxMouseClicked
        getImg();
    }//GEN-LAST:event_panelxMouseClicked

    private void tblsinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsinhvienMouseClicked
        int row = tblsinhvien.getSelectedRow();
        txthoten.setText(tblsinhvien.getValueAt(row, 1).toString());
        txtdiachi.setText(tblsinhvien.getValueAt(row, 5).toString());
        txtemail.setText(tblsinhvien.getValueAt(row, 2).toString());
        txtmasv.setText(tblsinhvien.getValueAt(row, 0).toString());
        txtsdt.setText(tblsinhvien.getValueAt(row, 3).toString());
        if(tblsinhvien.getValueAt(row, 4).toString().equals("nam")){
            rdonam.setSelected(true);
        }else{
            rdonu.setSelected(true);
        }
        filename = tblsinhvien.getValueAt(row, 6).toString();
        loadanh(tblsinhvien.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tblsinhvienMouseClicked

    private void btnloadtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadtableActionPerformed
        try {
            loadtable();
        } catch (SQLException ex) {
            return ;
        }
    }//GEN-LAST:event_btnloadtableActionPerformed
    
    public SinhVien cleancode(){
        if(txtmasv.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "không được để trống mã sinh viên");
            return null;
        }else if(txthoten.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "không được để trống họ tên");
            return null;
        }else if(txtemail.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "không được để trống email");
            return null;
        }else if(txtsdt.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "không được để trống sdt");
            return null;
        }else if(txtdiachi.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "không được để trống địa chỉ");
            return null;
        }else{
            String masv = txtmasv.getText();
            String hoten = txthoten.getText();
            String email = txtemail.getText();
            String sdt = txtsdt.getText();
            String diachi = txtdiachi.getText();
            String hinh = filename;
            int gt = rdonam.isSelected() == true ? 0 : 1;
            
            SinhVien sv = new SinhVien();
            sv.setMasv(masv);
            sv.setHoten(hoten);
            sv.setEmail(email);
            sv.setSdt(sdt);
            sv.setDiachi(diachi);
            sv.setGioitinh(gt);
            sv.setHinh(hinh);
            return sv;
        }
    }
    
    private void loadanh(String path){
        String realpath = "E:\\fpt\\img\\" + path;
        ImageIcon img = new ImageIcon(realpath);
        int width = panelx.getWidth();
        int height = panelx.getHeight();
        
        
        Image image = img.getImage();
        Image imgx = image.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);  
        img = new ImageIcon(imgx);
        panelx.setIcon(img);
    }

    private void getImg(){
        JFileChooser jfc = new JFileChooser("E:\\fpt\\img");
        jfc.showOpenDialog(null);
        File file = jfc.getSelectedFile();
        if(file == null){
            return ;
        }
        try {
            filename = file.getName();
            Image img = ImageIO.read(file);
            int width = panelx.getWidth();
            int height = panelx.getHeight();
            panelx.setIcon(new ImageIcon(img.getScaledInstance(width, height, 0)));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "error");
            return ;
        }
    }
    
    public void loadtable() throws SQLException{
        ArrayList<SinhVien> list = new SinhVienServiceImpl().getlistfromDB();
        DefaultTableModel dtm = (DefaultTableModel)
                tblsinhvien.getModel();
            dtm.setRowCount(0);
        for (SinhVien sinhVien : list) {
            Object[] rowData = {
                sinhVien.getMasv(),
                sinhVien.getHoten(),
                sinhVien.getEmail(),
                sinhVien.getSdt(),
                sinhVien.getGioitinh() == 0 ? "nam" : "nữ",
                sinhVien.getDiachi(),
                sinhVien.getHinh()
            };
            dtm.addRow(rowData);
        }
    }
    

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVienUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnloadtable;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JLabel panelx;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JTable tblsinhvien;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables

}


