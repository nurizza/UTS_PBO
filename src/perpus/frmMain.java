/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Izza
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelPinjam = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtJudul = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtJenis = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAlamat = new javax.swing.JTextField();
        Pinjam = new com.toedter.calendar.JDateChooser();
        LabelKembali = new javax.swing.JLabel();
        Kembali = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1Data = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Form Peminjaman Perpustakaan SMK TELKOM ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 460, 50);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Isi Data Peminjam");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 0, 160, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("No Anggota");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 40, 100, 20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Nama");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 90, 50, 20);

        LabelPinjam.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelPinjam.setText("Tanggal Pinjam");
        jPanel2.add(LabelPinjam);
        LabelPinjam.setBounds(10, 320, 100, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Judul Buku");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 270, 100, 20);

        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        jPanel2.add(txtNo);
        txtNo.setBounds(10, 60, 120, 30);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        jPanel2.add(txtNama);
        txtNama.setBounds(10, 110, 120, 30);
        jPanel2.add(txtJudul);
        txtJudul.setBounds(10, 290, 120, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Jenis Buku");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 220, 120, 20);

        txtJenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJenisActionPerformed(evt);
            }
        });
        jPanel2.add(txtJenis);
        txtJenis.setBounds(10, 240, 120, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Alamat");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 140, 80, 15);
        jPanel2.add(txtAlamat);
        txtAlamat.setBounds(10, 160, 210, 60);
        jPanel2.add(Pinjam);
        Pinjam.setBounds(10, 340, 190, 30);

        LabelKembali.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        LabelKembali.setText("Tanggal Kembali");
        jPanel2.add(LabelKembali);
        LabelKembali.setBounds(10, 370, 100, 20);
        jPanel2.add(Kembali);
        Kembali.setBounds(10, 390, 190, 30);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Status");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(10, 420, 100, 20);

        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });
        jPanel2.add(txtStatus);
        txtStatus.setBounds(10, 440, 120, 30);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(null);

        btnPrint.setBackground(new java.awt.Color(255, 51, 51));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        jPanel3.add(btnPrint);
        btnPrint.setBounds(910, 20, 70, 23);

        btnSave.setBackground(new java.awt.Color(255, 51, 51));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);
        btnSave.setBounds(20, 20, 80, 23);

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(230, 20, 80, 23);

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);
        btnClear.setBounds(440, 20, 80, 23);

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(670, 20, 80, 23);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        tb1Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NoAnggota", "Nama", "Alamat", "JenisBuku", "JudulBuku", "TanggalPinjam", "TanggalKembali", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1Data.getTableHeader().setReorderingAllowed(false);
        tb1Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1Data);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtJenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJenisActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
MessageFormat header = new MessageFormat("Peminjaman Buku Perpustakaan SMK Telkom");
MessageFormat footer = new MessageFormat("Page {0,number,integer}");
try {
     tb1Data.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
} catch (java.awt.print.PrinterException e){
System.err.format("Cannot Print %s%n", e.getMessage());
}
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String pinjam = dateFormat.format(Pinjam.getDate());
        String kembali = dateFormat.format(Kembali.getDate());
        
        if(txtNo.getText().equals("") || txtNama.getText().equals("") || txtAlamat.getText().equals("")  || 
                txtJenis.getText().equals("") || txtJudul.getText().equals("") ||  pinjam.equals("") ||
                kembali.equals("") || txtStatus.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error",
                    JOptionPane.WARNING_MESSAGE);
        }else{
            String SQL = "INSERT INTO tb_anggota VALUES ('"+txtNo.getText()+"', '"+txtNama.getText()+"', '"+txtAlamat.getText()
                    +"','"+txtJenis.getText()+"', '"+txtJudul.getText()+"', '"+pinjam+"', '"+kembali+"', '"+txtStatus.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data Gagal Ditambhkan", "GAGAL", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tb1Data.getSelectedRow();
        if (baris !=-1) {
            String NoAnggota = tb1Data.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_anggota WHERE NoAnggota='"+NoAnggota+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukse", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtNo.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtJudul.setText("");
        txtJenis.setText("");
        Pinjam.setDateFormatString("");
        Kembali.setDateFormatString("");
        txtStatus.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        selectData();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void tb1DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1DataMouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_tb1DataMouseClicked

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Kembali;
    private javax.swing.JLabel LabelKembali;
    private javax.swing.JLabel LabelPinjam;
    private com.toedter.calendar.JDateChooser Pinjam;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb1Data;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
         String kolom[] = {"NoAnggota","Nama","Alamat","JenisBuku","JudulBuku","TanggalPinjam","TanggalKembali","Status"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_anggota";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
        String NoAnggota = rs.getString(1);
        String Nama = rs.getString(2);
        String Alamat = rs.getString(3);
        String Jenis = rs.getString(4);
        String Judul = rs.getString(5);
        String Pinjam = rs.getString(6);
        String Kembali = rs.getString(7);
        String Status = rs.getString(8);
        String data[] = {NoAnggota,Nama,Alamat,Jenis,Judul,Pinjam,Kembali,Status};
        dtm.addRow(data);
        }
    }catch (SQLException ex) {
        java.util.logging.Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
    }
        tb1Data.setModel(dtm);
}
    
    
    public void setTanggal(){
     java.util.Date skrg = new java.util.Date();
     java.text.SimpleDateFormat kal = new
     java.text.SimpleDateFormat("dd/MM/yyyy");
     LabelPinjam.setText(kal.format(skrg));
    }
}
