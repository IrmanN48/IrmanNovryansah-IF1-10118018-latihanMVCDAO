/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.irmannovryansah.latihanmvcjdbc.view;

import edu.irmannovryansah.latihanmvcjdbc.controller.PelangganController;
import edu.irmannovryansah.latihanmvcjdbc.database.KingBarbershopDatabase;
import edu.irmannovryansah.latihanmvcjdbc.entity.Pelanggan;
import edu.irmannovryansah.latihanmvcjdbc.error.PelangganException;
import edu.irmannovryansah.latihanmvcjdbc.event.PelangganListener;
import edu.irmannovryansah.latihanmvcjdbc.model.PelangganModel;
import edu.irmannovryansah.latihanmvcjdbc.model.TabelPelangganModel;
import edu.irmannovryansah.latihanmvcjdbc.service.PelangganDao;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Irman Novryansah
 */
public class PelangganView extends javax.swing.JFrame implements PelangganListener, ListSelectionListener{

    static void loadDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private TabelPelangganModel tabelModel;
    private PelangganModel model;
    private PelangganController controller; 
    
    public PelangganView() {
        tabelModel = new TabelPelangganModel();
       
        model = new PelangganModel();
        model.setListener(this);
        
        controller = new PelangganController();
        controller.setModel(model);
        
        initComponents();
        
        tablePelanggan.getSelectionModel().addListSelectionListener(this);
        
        tablePelanggan.setModel(tabelModel);
        
        
    }

    public JTable getTablePelanggan() {
        return tablePelanggan;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtTelepon() {
        return txtTelepon;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtTelepon = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePelanggan = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("MANAGEMENT DATA PELANGGAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("KINGS BARBERSHOP BANDUNG");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 48, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("JLN.GEGER KALONG NO 48  BANDUNG");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 73, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ID                : ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 133, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("NAMA         :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 159, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("ALAMAT    :");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 193, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("TELEPON  :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 224, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("E-MAIL      :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 255, -1, -1));

        txtId.setEditable(false);
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 130, 147, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 156, 147, -1));
        getContentPane().add(txtAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 190, 147, -1));
        getContentPane().add(txtTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 221, 147, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 252, 147, -1));

        tablePelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePelanggan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 290, -1, 115));

        btnSimpan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 423, -1, -1));

        btnUbah.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 423, -1, -1));

        btnHapus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 423, -1, -1));

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 423, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        controller.resetPelanggan(this);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        controller.insertPelanggan(this);
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        controller.updatePelanggan(this);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        controller.deletePelanggan(this);
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PelangganView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePelanggan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onChange(PelangganModel model) {
        txtId.setText(model.getId() + "");
        txtNama.setText(model.getNama());
        txtAlamat.setText(model.getAlamat());
        txtTelepon.setText(model.getTelepon());
        txtEmail.setText(model.getEmail());
    }

    @Override
    public void onInsert(Pelanggan pelanggan) {
         tabelModel.add(pelanggan);
    }

    @Override
    public void onDelete() {
        int index   = tablePelanggan.getSelectedRow();
        tabelModel.remove(index);
    }

    @Override
    public void onUpdate(Pelanggan pelanggan) {
       int index = tablePelanggan.getSelectedRow();
       tabelModel.set(index, pelanggan);
    }

    @Override
    public void onChange(Pelanggan pelanggan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
  
        try {
        Pelanggan model = tabelModel.get(tablePelanggan.getSelectedRow());
        txtId.setText(model.getId() + "");
        txtNama.setText(model.getNama());
        txtAlamat.setText(model.getAlamat());
        txtTelepon.setText(model.getTelepon());
        txtEmail.setText(model.getEmail());
            
        } catch (IndexOutOfBoundsException exception) {
        }
  
        
    }

    /**
     *
     * @throws SQLException
     * @throws PelangganException
     */
    public void loadDatabase() throws SQLException, PelangganException{
        PelangganDao dao = (PelangganDao) KingBarbershopDatabase.getPelangganDao();
        tabelModel.setList(dao.selectAllPelanggan());
    }
}