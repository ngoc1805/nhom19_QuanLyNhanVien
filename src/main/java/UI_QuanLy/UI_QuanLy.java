/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI_QuanLy;

import java.awt.Color;
import javax.swing.JPanel;
import util.ImageUtill;

/**
 *
 * @author Admin
 */
public class UI_QuanLy extends javax.swing.JFrame {

    /**
     * Creates new form UI_QuanLy
     */
    private JPanel pChucNang;
    public UI_QuanLy() {
        initComponents();

        setLocationRelativeTo(null);
        setResizable(false);
        ImageUtill imageUtil = new ImageUtill();
        imageUtil.addImage(lblogoQL, "logoQL.png", 90, 90);
        
        lbTrangChu.setBackground(new Color(8, 86, 168));
        lbTrangChu.setForeground(Color.WHITE);
        pChucNang = new TrangChu();
        pnMain.removeAll();
        pnMain.add(pChucNang);
        pnMain.validate(); 
    }
    private void setBlackColor(){
        lbTrangChu.setForeground(Color.BLACK);
        lbQuanLyNhanVien.setForeground(Color.BLACK);
        lbGiaoViec.setForeground(Color.BLACK);
        lbDuyetNghiPhep.setForeground(Color.BLACK);
        lbTinhLuong.setForeground(Color.BLACK);
        lbTaiKhoan.setForeground(Color.BLACK);
    }
    private void setWhiteBackground(){
        lbTrangChu.setBackground(Color.WHITE);
        lbQuanLyNhanVien.setBackground(Color.WHITE);
        lbGiaoViec.setBackground(Color.WHITE);
        lbDuyetNghiPhep.setBackground(Color.WHITE);
        lbTinhLuong.setBackground(Color.WHITE);
        lbTaiKhoan.setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMain = new javax.swing.JPanel();
        lblogoQL = new javax.swing.JLabel();
        lbTrangChu = new javax.swing.JLabel();
        lbQuanLyNhanVien = new javax.swing.JLabel();
        lbGiaoViec = new javax.swing.JLabel();
        lbDuyetNghiPhep = new javax.swing.JLabel();
        lbTinhLuong = new javax.swing.JLabel();
        lbTaiKhoan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        pnMain.setLayout(new java.awt.BorderLayout());

        lblogoQL.setBackground(new java.awt.Color(255, 255, 255));

        lbTrangChu.setBackground(new java.awt.Color(255, 255, 255));
        lbTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTrangChu.setText("  Trang chủ");
        lbTrangChu.setOpaque(true);
        lbTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTrangChuMouseClicked(evt);
            }
        });

        lbQuanLyNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        lbQuanLyNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbQuanLyNhanVien.setText("  Quản lý nhân viên");
        lbQuanLyNhanVien.setOpaque(true);
        lbQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbQuanLyNhanVienMouseClicked(evt);
            }
        });

        lbGiaoViec.setBackground(new java.awt.Color(255, 255, 255));
        lbGiaoViec.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbGiaoViec.setText("  Giao việc");
        lbGiaoViec.setOpaque(true);
        lbGiaoViec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbGiaoViecMouseClicked(evt);
            }
        });

        lbDuyetNghiPhep.setBackground(new java.awt.Color(255, 255, 255));
        lbDuyetNghiPhep.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbDuyetNghiPhep.setText("  Duyệt nghỉ phép");
        lbDuyetNghiPhep.setOpaque(true);
        lbDuyetNghiPhep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDuyetNghiPhepMouseClicked(evt);
            }
        });

        lbTinhLuong.setBackground(new java.awt.Color(255, 255, 255));
        lbTinhLuong.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTinhLuong.setText("  Tính lương");
        lbTinhLuong.setOpaque(true);
        lbTinhLuong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTinhLuongMouseClicked(evt);
            }
        });

        lbTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        lbTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTaiKhoan.setText("  Tài khoản");
        lbTaiKhoan.setOpaque(true);
        lbTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTaiKhoanMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTaiKhoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTinhLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDuyetNghiPhep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbGiaoViec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbQuanLyNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblogoQL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblogoQL, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(lbQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbGiaoViec, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbDuyetNghiPhep, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbTinhLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lbTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTrangChuMouseClicked
        // TODO add your handling code here:
        setBlackColor();
        setWhiteBackground();
        lbTrangChu.setBackground(new Color(8, 86, 168));
        lbTrangChu.setForeground(Color.WHITE);
        
        pChucNang = new TrangChu();
        pnMain.removeAll();
        pnMain.add(pChucNang);
        pnMain.validate();   
    }//GEN-LAST:event_lbTrangChuMouseClicked

    private void lbQuanLyNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbQuanLyNhanVienMouseClicked
        // TODO add your handling code here:
        setBlackColor();
        setWhiteBackground();
        lbQuanLyNhanVien.setBackground(new Color(8, 86, 168));
        lbQuanLyNhanVien.setForeground(Color.WHITE);
        
        pChucNang = new QuanLyNhanVien();
        pnMain.removeAll();
        pnMain.add(pChucNang);
        pnMain.validate();
    }//GEN-LAST:event_lbQuanLyNhanVienMouseClicked

    private void lbGiaoViecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbGiaoViecMouseClicked
        // TODO add your handling code here:
        setBlackColor();
        setWhiteBackground();
        lbGiaoViec.setBackground(new Color(8, 86, 168));
        lbGiaoViec.setForeground(Color.WHITE);
        
        pChucNang = new GiaoViec();
        pnMain.removeAll();
        pnMain.add(pChucNang);
        pnMain.validate();
    }//GEN-LAST:event_lbGiaoViecMouseClicked

    private void lbDuyetNghiPhepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDuyetNghiPhepMouseClicked
        // TODO add your handling code here:
        setBlackColor();
        setWhiteBackground();
        lbDuyetNghiPhep.setBackground(new Color(8, 86, 168));
        lbDuyetNghiPhep.setForeground(Color.WHITE);
        
        pChucNang = new DuyetNghiPhep();
        pnMain.removeAll();
        pnMain.add(pChucNang);
        pnMain.validate();
    }//GEN-LAST:event_lbDuyetNghiPhepMouseClicked

    private void lbTinhLuongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTinhLuongMouseClicked
        // TODO add your handling code here:
        setBlackColor();
        setWhiteBackground();
        lbTinhLuong.setBackground(new Color(8, 86, 168));
        lbTinhLuong.setForeground(Color.WHITE);
        
        pChucNang = new TinhLuong();
        pnMain.removeAll();
        pnMain.add(pChucNang);
        pnMain.validate();
    }//GEN-LAST:event_lbTinhLuongMouseClicked

    private void lbTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTaiKhoanMouseClicked
        // TODO add your handling code here:
        setBlackColor();
        setWhiteBackground();
        lbTaiKhoan.setBackground(new Color(8, 86, 168));
        lbTaiKhoan.setForeground(Color.WHITE);
        
        pChucNang = new TaiKhoan(this);
        pnMain.removeAll();
        pnMain.add(pChucNang);
        pnMain.validate();
    }//GEN-LAST:event_lbTaiKhoanMouseClicked

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
            java.util.logging.Logger.getLogger(UI_QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_QuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDuyetNghiPhep;
    private javax.swing.JLabel lbGiaoViec;
    private javax.swing.JLabel lbQuanLyNhanVien;
    private javax.swing.JLabel lbTaiKhoan;
    private javax.swing.JLabel lbTinhLuong;
    private javax.swing.JLabel lbTrangChu;
    private javax.swing.JLabel lblogoQL;
    private javax.swing.JPanel pnMain;
    // End of variables declaration//GEN-END:variables
}
