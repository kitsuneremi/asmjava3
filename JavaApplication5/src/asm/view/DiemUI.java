
package asm.view;

import asm.model.SinhVien;
import asm.model.Diem;
import asm.service.impl.DiemServiceImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Binh
 */
public class DiemUI extends javax.swing.JFrame {

    /**
     * Creates new form quanlydiemUI
     */
    String accrole;
    int vitri;
    public DiemUI(String accrole) {
        initComponents();
        loadtable(new DiemServiceImpl().getlistfromDB());
        settext();
        if(accrole.equals("giảng viên")){
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

    public DiemUI() {
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblhoten = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtengrisk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttinhoc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtgdtc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbldiemtb = new javax.swing.JLabel();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblehe = new javax.swing.JTable();
        btnfirst = new javax.swing.JButton();
        btnminus = new javax.swing.JButton();
        btnplus = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnloadtable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("quản lý điểm sinh viên");

        jLabel2.setText("tìm kiếm");

        jLabel3.setText("mã sinh viên");

        btntimkiem.setText("tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        jLabel4.setText("họ tên");

        lblhoten.setText("txt");

        jLabel6.setText("mã sinh viên");

        jLabel7.setText("tiếng anh");

        jLabel8.setText("tin học");

        txttinhoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttinhocActionPerformed(evt);
            }
        });

        jLabel9.setText("gdtc");

        jLabel10.setText("điểm tb");

        lbldiemtb.setText("txt");

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

        tblehe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mã sv", "họ tên", "tiếng anh", "tin học", "gdtc", "điểm tb"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblehe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbleheMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblehe);

        btnfirst.setText("first");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnminus.setText("-1");
        btnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminusActionPerformed(evt);
            }
        });

        btnplus.setText("+1");
        btnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplusActionPerformed(evt);
            }
        });

        btnlast.setText("last");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnloadtable.setText("loadtable");
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
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnfirst)
                        .addGap(18, 18, 18)
                        .addComponent(btnminus)
                        .addGap(18, 18, 18)
                        .addComponent(btnplus)
                        .addGap(18, 18, 18)
                        .addComponent(btnlast)
                        .addGap(18, 18, 18)
                        .addComponent(btnloadtable))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblhoten)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(28, 28, 28)
                                                    .addComponent(jLabel10))
                                                .addComponent(txtengrisk, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtgdtc, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(66, 66, 66))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txttinhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbldiemtb)
                                            .addGap(54, 54, 54)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(btntimkiem)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblhoten))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnnew)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtengrisk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txttinhoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(btndelete)))
                    .addComponent(lbldiemtb))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtgdtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnupdate)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnminus)
                    .addComponent(btnplus)
                    .addComponent(btnlast)
                    .addComponent(btnloadtable))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttinhocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttinhocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttinhocActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtmasv.setText("");
        txtengrisk.setText("");
        txtgdtc.setText("");
        txttinhoc.setText("");
        lbldiemtb.setText("0");
        lblhoten.setText("");
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        ArrayList<Diem> list = new DiemServiceImpl().getlistfromDB();
        int i = 0;
        for (Diem z : list) {
            if(z.getMasv().equals(txtmasv.getText()) == true){
                i++;
            }
        }
        if(i > 0){
            JOptionPane.showMessageDialog(this, "đã tồn tại mã sinh viên này");
            return ;
        }
        
        try {
            Diem diem = getformdata();
            if(diem == null){
                return ;
            }
            DiemServiceImpl service = new DiemServiceImpl();
            service.insert(diem);
            loadtable(new DiemServiceImpl().getlistfromDB());
            setdiemtb();
        } catch (Exception e) {
            e.printStackTrace();
            return ;
        }
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        
        if(txttimkiem.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this, "chua nhap masv");
            return ;
        }else{
            String masv = txttimkiem.getText();
            try {
                DiemServiceImpl service = new DiemServiceImpl();
                Diem diem = service.timkiemtheomasv(masv);
                if(diem != null){
                    txtmasv.setText(diem.getMasv());
                    txtengrisk.setText(String.valueOf(diem.getTienganh()));
                    txtgdtc.setText(String.valueOf(diem.getGdtc()));
                    txttinhoc.setText(String.valueOf(diem.getTinhoc()));
                    lblhoten.setText(diem.getSinhvien().getHoten());
                    loadtable(new DiemServiceImpl().getlistfromDB());
                    setdiemtb();
                }else{
                    JOptionPane.showMessageDialog(this, "ko tim thay sinh vien nay");
                    return ;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "loi");
                ex.printStackTrace();
                return ;
            }
        }
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        ArrayList<Diem> list = new DiemServiceImpl().getlistfromDB();
        int i = 0;
        for (Diem z : list) {
            if(z.getMasv().equals(txtmasv.getText()) == false){
                i++;
            }
        }
        if(i > 0){
            JOptionPane.showMessageDialog(this, "không tìm thấy mã sinh viên này");
            return ;
        }
        
        try {
            Diem diem = getformdata();
            if(diem == null){
                return ;
            }
            DiemServiceImpl service = new DiemServiceImpl();
            service.update(diem,txtmasv.getText());
            loadtable(new DiemServiceImpl().getlistfromDB());
            setdiemtb();
        } catch (Exception e) {
            e.printStackTrace();
            return ;
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        ArrayList<Diem> list = new DiemServiceImpl().getlistfromDB();
        int i = 0;
        for (Diem z : list) {
            if(z.getMasv().equals(txtmasv.getText()) == false){
                i++;
            }
        }
        if(i > 0){
            JOptionPane.showMessageDialog(this, "không tìm thấy mã sinh viên này");
            return ;
        }
        
        
        try {
            DiemServiceImpl service = new DiemServiceImpl();
            service.delete(txtmasv.getText());
            loadtable(new DiemServiceImpl().getlistfromDB());
            setdiemtb();
        } catch (Exception e) {
            e.printStackTrace();
            return ;
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnloadtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloadtableActionPerformed
        loadtable(new DiemServiceImpl().getlistfromDB());
    }//GEN-LAST:event_btnloadtableActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        test("first");
        setdiemtb();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        test("last");
        setdiemtb();
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminusActionPerformed
        test("minus");
        setdiemtb();
    }//GEN-LAST:event_btnminusActionPerformed

    private void btnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplusActionPerformed
        test("plus");
        setdiemtb();
    }//GEN-LAST:event_btnplusActionPerformed

    private void tbleheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbleheMouseClicked
        int row = tblehe.getSelectedRow();
        lblhoten.setText(tblehe.getValueAt(row, 1).toString());
        txtengrisk.setText(tblehe.getValueAt(row, 2).toString());
        txtgdtc.setText(tblehe.getValueAt(row, 4).toString());
        txttinhoc.setText(tblehe.getValueAt(row, 3).toString());
        lbldiemtb.setText(tblehe.getValueAt(row, 5).toString());
        txtmasv.setText(tblehe.getValueAt(row, 0).toString());
    }//GEN-LAST:event_tbleheMouseClicked
    
    
    public Diem getformdata(){
        if(txtmasv.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this,"ko dc de trong masv");
            return null;
        }else if(txtengrisk.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this,"ko dc de trong tieng anh");
            return null;
        }else if(txttinhoc.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this,"ko dc de trong tin hoc");
            return null;
        }else if(txtgdtc.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(this,"ko dc de trong gdtc");
            return null;
        }else{
            int engrisk;
            int gdtc;
            int tinhoc;
            String masv = txtmasv.getText();
            try{
                engrisk = Integer.parseInt(txtengrisk.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "sai dinh dang diem tieng anh");
                return null;
            }
            try{
                gdtc = Integer.parseInt(txtgdtc.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "sai dinh dang diem gdtc");
                return null;
            }
            
            try{
                tinhoc = Integer.parseInt(txttinhoc.getText());
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "sai dinh dang diem tinhoc");
                return null;
            }
            Diem diem = new Diem();
            SinhVien sv = new SinhVien();
            diem.setGdtc(gdtc);
            diem.setMasv(masv);
            diem.setTienganh(engrisk);
            diem.setTinhoc(tinhoc);
            diem.setSinhvien(sv);
            return diem;
        }
        
    }
    
    void loadtable(ArrayList<Diem> list){
        
        DefaultTableModel dtm = (DefaultTableModel)
                tblehe.getModel();
        dtm.setRowCount(0);
        for (Diem x : list) {
            Object[] rowData = {
                x.getMasv(),
                x.getSinhvien().getHoten(),
                x.getTienganh(),
                x.getTinhoc(),
                x.getGdtc(),
                x.diemtb()
            };
            dtm.addRow(rowData);
        }
    }
    
    void settext(){
        ArrayList<Diem> list = new DiemServiceImpl().getlistfromDB();
        for (Diem e : list) {
            txtmasv.setText(e.getMasv());
            lblhoten.setText(e.getSinhvien().getHoten());
            txtengrisk.setText(String.valueOf(e.getTienganh()));
            txtgdtc.setText(String.valueOf(e.getGdtc()));
            txttinhoc.setText(String.valueOf(e.getTinhoc()));
            lbldiemtb.setText(String.valueOf((e.getTienganh() + e.getGdtc() + e.getTinhoc()) / 3));
        }
    }
    
    void test(String toantu){
        ArrayList<Diem> list = new DiemServiceImpl().getlistfromDB();
        if(toantu.equals("first")){
            vitri = 0;
            btnfirst.setEnabled(false);
            btnminus.setEnabled(false);
            
            btnplus.setEnabled(true);
            btnlast.setEnabled(true);
        }
        if(toantu.equals("last")){
            vitri = list.size() - 1;
            btnlast.setEnabled(false);
            btnplus.setEnabled(false);
            
            btnfirst.setEnabled(true);
            btnminus.setEnabled(true);
        }
        if(toantu.equals("plus")){
            vitri++;
            if(vitri == list.size() - 1){
                btnplus.setEnabled(false);
                btnlast.setEnabled(false);
            }
            btnminus.setEnabled(true);
            btnfirst.setEnabled(true);
        }
        if(toantu.equals("minus")){
            vitri--;
            if(vitri == 0){
                btnminus.setEnabled(false);
                btnfirst.setEnabled(false);
            }
            btnplus.setEnabled(true);
            btnlast.setEnabled(true);
        }
        txtmasv.setText(list.get(vitri).getMasv());
        txtengrisk.setText(String.valueOf(list.get(vitri).getTienganh()));
        txtgdtc.setText(String.valueOf(list.get(vitri).getGdtc()));
        txttinhoc.setText(String.valueOf(list.get(vitri).getTinhoc()));
        
        
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
            java.util.logging.Logger.getLogger(DiemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiemUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiemUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnloadtable;
    private javax.swing.JButton btnminus;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnplus;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldiemtb;
    private javax.swing.JLabel lblhoten;
    private javax.swing.JTable tblehe;
    private javax.swing.JTextField txtengrisk;
    private javax.swing.JTextField txtgdtc;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txttimkiem;
    private javax.swing.JTextField txttinhoc;
    // End of variables declaration//GEN-END:variables

    void setdiemtb(){
        try{
            int a = Integer.parseInt(txtengrisk.getText());
            int b = Integer.parseInt(txtgdtc.getText());
            int c = Integer.parseInt(txttinhoc.getText());
            
            double d = (a + b +c) / 3;
            lbldiemtb.setText(String.valueOf(d));
        }catch(Exception ex){
            return ;
        }    
    }
    
}
