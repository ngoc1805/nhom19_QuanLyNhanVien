/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI_NhanVien;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class ChamCong extends javax.swing.JPanel {

    /**
     * Creates new form ChamCong
     */
    public ChamCong() {
        initComponents();
        lbTieude.setBackground(new Color(8, 86, 168));
        lbTieude.setForeground(Color.WHITE);
        lbTieude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTieude.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        
        rbtChamCong.setText("Chấm công ngày"+ getDate() );
         rbtChamCong.addItemListener(evt -> TrangThai());
    }
     private String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(new Date());
    }
     private boolean isLate() {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmm");
        int currentTime = Integer.parseInt(sdf.format(new Date()));
        return currentTime > 745; // Kiểm tra nếu giờ hiện tại sau 7:00 sáng
    }
      private void TrangThai() {
        if (rbtChamCong.isSelected()) {
            if (isLate()) {
                lbTrangThai.setText("Bắt được một đứa đi làm muộn!!!");
                lbTrangThai.setForeground(Color.RED); 
            } else {
                lbTrangThai.setText("Đi làm đúng giờ, không được thưởng gì cả!!!");
                lbTrangThai.setForeground(new Color(8, 86, 168)); 
            }
        } else {
            lbTrangThai.setText(""); // Xóa trạng thái khi bỏ chọn
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnChamCong = new javax.swing.JPanel();
        lbHoTen = new javax.swing.JLabel();
        lbMaNhanVien = new javax.swing.JLabel();
        rbtChamCong = new javax.swing.JRadioButton();
        lbTrangThai = new javax.swing.JLabel();
        buttonDarkBlue1 = new util.ButtonDarkBlue();
        tfMaNhanVien = new javax.swing.JTextField();
        tfHoTen = new javax.swing.JTextField();
        lbTieude = new javax.swing.JLabel();

        pnChamCong.setBackground(new java.awt.Color(255, 255, 255));

        lbHoTen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbHoTen.setText("Họ tên:  ");

        lbMaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbMaNhanVien.setText("Mã nhân viên: ");

        rbtChamCong.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        buttonDarkBlue1.setText("Gửi");
        buttonDarkBlue1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        tfMaNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfMaNhanVien.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfHoTen.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        tfHoTen.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnChamCongLayout = new javax.swing.GroupLayout(pnChamCong);
        pnChamCong.setLayout(pnChamCongLayout);
        pnChamCongLayout.setHorizontalGroup(
            pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChamCongLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtChamCong)
                    .addGroup(pnChamCongLayout.createSequentialGroup()
                        .addGroup(pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHoTen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnChamCongLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(232, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChamCongLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonDarkBlue1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        pnChamCongLayout.setVerticalGroup(
            pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChamCongLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbHoTen)
                    .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnChamCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNhanVien)
                    .addComponent(tfMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(rbtChamCong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(buttonDarkBlue1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );

        lbTieude.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbTieude.setText("Chấm công");
        lbTieude.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lbTieude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lbTieude, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnChamCong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private util.ButtonDarkBlue buttonDarkBlue1;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaNhanVien;
    private javax.swing.JLabel lbTieude;
    private javax.swing.JLabel lbTrangThai;
    private javax.swing.JPanel pnChamCong;
    private javax.swing.JRadioButton rbtChamCong;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfMaNhanVien;
    // End of variables declaration//GEN-END:variables
}
