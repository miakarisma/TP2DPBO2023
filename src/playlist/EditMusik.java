/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package playlist;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ACER
 */
public class EditMusik extends javax.swing.JFrame {
    private dbConnection db;
    private int id;
    private String filename = null;
    private byte[] person_image=null;
    private int id_user;
    private int id_Penyanyi;
    /**
     * Creates new form EditMusikCard
     */
    public EditMusik() {
        initComponents();
        db = new dbConnection();
    }
    
    public EditMusik(int id, int id_user, int id_Penyanyi) {
        initComponents();
        db = new dbConnection();
        this.id = id;
        this.id_user = id_user;
        this.id_Penyanyi = id_Penyanyi;
        ResultSet res = db.selectQuery("SELECT id, nama FROM penyanyi WHERE id_user="+id_user);
        try {
            while (res.next()) {
                int id_penyanyi = res.getInt("id");
                String penyanyi = res.getString("nama");
                ComboBoxPenyanyi.addItem (Integer.toString(id_penyanyi) + "-" + penyanyi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void resetform() {
        FieldJudul.setText("");
        FieldDurasi.setText("");
        ComboBoxPenyanyi.setSelectedIndex(0);
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
        LabelEdit = new javax.swing.JLabel();
        LabelJudul = new javax.swing.JLabel();
        FieldJudul = new javax.swing.JTextField();
        LabelPenyanyi = new javax.swing.JLabel();
        LabelDurasi = new javax.swing.JLabel();
        FieldDurasi = new javax.swing.JTextField();
        LabelGambar = new javax.swing.JLabel();
        UploadButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        ComboBoxPenyanyi = new javax.swing.JComboBox<>();
        BackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelEdit.setText("Edit Musik");

        LabelJudul.setText("Judul Lagu");

        FieldJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldJudulActionPerformed(evt);
            }
        });

        LabelPenyanyi.setText("Penyanyi");

        LabelDurasi.setText("Durasi Waktu");

        LabelGambar.setText("Gambar");

        UploadButton.setText("Upload");
        UploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadButtonActionPerformed(evt);
            }
        });

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(LabelEdit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelJudul)
                                    .addComponent(LabelPenyanyi)
                                    .addComponent(LabelDurasi)
                                    .addComponent(LabelGambar))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FieldJudul)
                                    .addComponent(FieldDurasi, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                    .addComponent(UploadButton)
                                    .addComponent(ComboBoxPenyanyi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SaveButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                                .addComponent(BackButton)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LabelEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelJudul)
                    .addComponent(FieldJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPenyanyi)
                    .addComponent(ComboBoxPenyanyi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelDurasi)
                    .addComponent(FieldDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelGambar)
                    .addComponent(UploadButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton)
                    .addComponent(BackButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldJudulActionPerformed

    private void UploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(LabelGambar.getWidth(), LabelGambar.getHeight(), Image.SCALE_SMOOTH));
        LabelGambar.setIcon(imageIcon);
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int readNum; (readNum=fis.read(buf))!=-1;)
            {
                bos.write(buf, 0, readNum);
            }
            person_image=bos.toByteArray();  
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UploadButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
        String judul = FieldJudul.getText();
        String penyanyi = ComboBoxPenyanyi.getSelectedItem().toString(); // 1 - Miki Matsubara
        String[] parts = penyanyi.split("-");
        String id_penyanyi = parts[0]; 
        String nama_penyanyi = parts[1]; 
        String durasi = FieldDurasi.getText();
        int idPenyanyi = Integer.parseInt(id_penyanyi);
        
        if(!judul.isEmpty() && !nama_penyanyi.isEmpty() && !durasi.isEmpty() && person_image != null)
        {

            String sql = "UPDATE musik SET judul=?, id_penyanyi=?, durasi=?, gambar=? WHERE id="+id;
//            db.updateQuery(sql);
            PreparedStatement pst = null;
            try {
                pst = (PreparedStatement) db.conn.prepareStatement(sql);
            } catch (SQLException ex) {
                Logger.getLogger(EditMusik.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                pst.setString(1, judul);
                pst.setInt(2, idPenyanyi);
                pst.setString(3, durasi);
                pst.setBytes(4, person_image);
                pst.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(EditMusik.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            sql = "UPDATE penyanyi SET jumlahLagu=jumlahLagu-1 WHERE id="+id_Penyanyi;
            db.updateQuery(sql);
            
            sql = "UPDATE penyanyi SET jumlahLagu=jumlahLagu+1 WHERE id="+idPenyanyi;
            db.updateQuery(sql);
            // Show Information
            System.out.println("Update Success");
            JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
            
        }
        else
        {
            System.out.println("Update Failed");
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
        }
        dispose();
        Main mf = new Main(id_user, 1);
        mf.setVisible(true);
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        resetform();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        Main mf = new Main(id_user, 1);
        mf.setVisible(true);
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EditCard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EditCard().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox<String> ComboBoxPenyanyi;
    private javax.swing.JTextField FieldDurasi;
    private javax.swing.JTextField FieldJudul;
    private javax.swing.JLabel LabelDurasi;
    private javax.swing.JLabel LabelEdit;
    private javax.swing.JLabel LabelGambar;
    private javax.swing.JLabel LabelJudul;
    private javax.swing.JLabel LabelPenyanyi;
    private javax.swing.JButton SaveButton;
    private javax.swing.JButton UploadButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
