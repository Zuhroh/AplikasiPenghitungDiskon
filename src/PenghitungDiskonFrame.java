
import java.awt.event.KeyEvent;
import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PenghitungDiskonFrame extends javax.swing.JFrame {
    PenghitungDiskonHelper helper = new PenghitungDiskonHelper();

    public PenghitungDiskonFrame() {
        initComponents();
        setSize(800, 700);
        setLocationRelativeTo(null);
        inisialisasiCustom(); // Metode khusus untuk konfigurasi tambahan
        inisialisasiSlider();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtKodeKupon = new javax.swing.JTextField();
        txtTotalDiskon = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnHitung = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        comboxDiskon = new javax.swing.JComboBox<>();
        sliderDiskon = new javax.swing.JSlider();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaRiwayat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perhitungan Diskon");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "APLIKASI PERHITUNGAN DISKON", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 350));
        java.awt.GridBagLayout jPanel1Layout = new java.awt.GridBagLayout();
        jPanel1Layout.columnWeights = new double[] {0.0, 1.0};
        jPanel1Layout.rowWeights = new double[] {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        jPanel1.setLayout(jPanel1Layout);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel1.setText("Harga");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setText("Diskon (%)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setText("Kode Kupon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setText("Total Diskon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setText("Total Harga");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        jPanel1.add(jLabel5, gridBagConstraints);

        txtHarga.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtHarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHargaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        jPanel1.add(txtHarga, gridBagConstraints);

        txtKodeKupon.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        jPanel1.add(txtKodeKupon, gridBagConstraints);

        txtTotalDiskon.setEditable(false);
        txtTotalDiskon.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        jPanel1.add(txtTotalDiskon, gridBagConstraints);

        txtTotalHarga.setEditable(false);
        txtTotalHarga.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        jPanel1.add(txtTotalHarga, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        btnHitung.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        jPanel2.add(btnHitung);

        btnHapus.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel2.add(btnHapus);

        btnKeluar.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel2.add(btnKeluar);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 20;
        jPanel1.add(jPanel2, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        comboxDiskon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "25%", "50%", "75%", "99%" }));
        comboxDiskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboxDiskonActionPerformed(evt);
            }
        });
        jPanel3.add(comboxDiskon);

        sliderDiskon.setMajorTickSpacing(25);
        sliderDiskon.setMaximum(99);
        sliderDiskon.setMinorTickSpacing(5);
        sliderDiskon.setPaintLabels(true);
        sliderDiskon.setPaintTicks(true);
        sliderDiskon.setSnapToTicks(true);
        sliderDiskon.setToolTipText("");
        sliderDiskon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sliderDiskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderDiskonStateChanged(evt);
            }
        });
        jPanel3.add(sliderDiskon);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        jPanel1.add(jPanel3, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(800, 350));

        txtAreaRiwayat.setColumns(20);
        txtAreaRiwayat.setRows(5);
        jScrollPane1.setViewportView(txtAreaRiwayat);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        try {
            // Ambil data dari input pengguna
            double hargaAsli = Double.parseDouble(txtHarga.getText());
            int persenDiskon = sliderDiskon.getValue(); // Mengambil nilai diskon dari slider
            String kodeKupon = txtKodeKupon.getText();
            // Validasi kode kupon untuk diskon tambahan
            int diskonKupon = helper.validasiKodeKupon(kodeKupon); // Validasi kupon
            // Menghitung total diskon
            double totalDiskon = helper.hitungTotalDiskon(hargaAsli, persenDiskon, diskonKupon);
            // Menghitung harga setelah diskon
            double hargaSetelahDiskon = helper.hitungHargaSetelahDiskon(hargaAsli, totalDiskon);
            // Menampilkan hasil pada GUI
            txtTotalDiskon.setText(String.format("%.2f", totalDiskon)); // Format dengan dua desimal
            txtTotalHarga.setText(String.format("%.2f", hargaSetelahDiskon));
            // Menambahkan riwayat perhitungan
            String riwayat = String.format("Harga Asli: %.2f, Diskon: %d%%, Kupon: %s, Total Diskon: %.2f, Harga Akhir: %.2f\n", 
                                            hargaAsli, persenDiskon, kodeKupon, totalDiskon, hargaSetelahDiskon);
            txtAreaRiwayat.append(riwayat);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid untuk harga!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // Menghapus input dan pilihan, tetapi tidak menghapus riwayat
        txtHarga.setText("");
        txtKodeKupon.setText("");
        txtTotalDiskon.setText("");
        txtTotalHarga.setText("");
        comboxDiskon.setSelectedIndex(0);
        sliderDiskon.setValue(0);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void comboxDiskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboxDiskonActionPerformed
        String selectedDiskon = comboxDiskon.getSelectedItem().toString(); // Ambil pilihan combobox
        int nilaiDiskon = Integer.parseInt(selectedDiskon.replace("%", "")); // Hilangkan simbol "%" dan ubah ke integer
        sliderDiskon.setValue(nilaiDiskon); // Set nilai slider
    }//GEN-LAST:event_comboxDiskonActionPerformed

    private void sliderDiskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderDiskonStateChanged
        int nilaiDiskon = sliderDiskon.getValue(); // Ambil nilai slider
        comboxDiskon.setSelectedItem(nilaiDiskon + "%"); // Set pilihan combobox sesuai nilai slider
    }//GEN-LAST:event_sliderDiskonStateChanged

    private void txtHargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHargaKeyTyped
        char karakter = evt.getKeyChar(); // mendapatkan karakter yang diketik
        // Memeriksa apakah karakter yang dimasukkan adalah angka atau titik desimal
        if (!(Character.isDigit(karakter) || karakter == '.' || karakter == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // Jika bukan angka atau titik desimal, karakter tidak diterima
            JOptionPane.showMessageDialog(null, "Hanya angka dan titik desimal yang diperbolehkan!", "Input Tidak Valid", JOptionPane.WARNING_MESSAGE);
        }
        // Membatasi hanya satu titik desimal yang bisa dimasukkan
        String text = txtHarga.getText();
        if (karakter == '.' && text.contains(".")) {
            evt.consume();  // Menolak karakter titik desimal jika sudah ada sebelumnya
            JOptionPane.showMessageDialog(null, "Hanya satu titik desimal yang diperbolehkan!", "Input Tidak Valid", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_txtHargaKeyTyped

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
            java.util.logging.Logger.getLogger(PenghitungDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungDiskonFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PenghitungDiskonFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JComboBox<String> comboxDiskon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sliderDiskon;
    private javax.swing.JTextArea txtAreaRiwayat;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKodeKupon;
    private javax.swing.JTextField txtTotalDiskon;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
    private void inisialisasiCustom() {
        comboxDiskon.setSelectedIndex(0); // Default pilihan combobox
        sliderDiskon.setValue(0);         // Default nilai slider
    }
    private void inisialisasiSlider() {
        sliderDiskon.setMinimum(0);
        sliderDiskon.setMaximum(99);
        sliderDiskon.setPaintTicks(true);
        sliderDiskon.setPaintLabels(true);
        sliderDiskon.setSnapToTicks(true); // Membatasi pergerakan ke nilai tick

        // Mengatur label tick
        Hashtable<Integer, JLabel> labelTable = new Hashtable<>();
        labelTable.put(0, new JLabel("0"));
        labelTable.put(10, new JLabel("10"));
        labelTable.put(25, new JLabel("25"));
        labelTable.put(50, new JLabel("50"));
        labelTable.put(75, new JLabel("75"));
        labelTable.put(99, new JLabel("99"));
        sliderDiskon.setLabelTable(labelTable);
    }
}
