
package klmpk5_buah;


public class ApelFrame extends javax.swing.JFrame {

    
    public ApelFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        TNama_buah = new javax.swing.JLabel();
        TnamaBuah = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Nama_Buah1 = new javax.swing.JLabel();
        Warna1 = new javax.swing.JLabel();
        Rasa1 = new javax.swing.JLabel();
        Berat1 = new javax.swing.JLabel();
        Harga1 = new javax.swing.JLabel();
        Kulit1 = new javax.swing.JLabel();
        Onamabuah = new javax.swing.JTextField();
        Owarna = new javax.swing.JTextField();
        Oberat = new javax.swing.JTextField();
        Oharga = new javax.swing.JTextField();
        Orasa = new javax.swing.JTextField();
        Okulit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TWarna = new javax.swing.JLabel();
        Twarna = new javax.swing.JTextField();
        TRasa = new javax.swing.JLabel();
        Trasa = new javax.swing.JTextField();
        TBerat = new javax.swing.JLabel();
        THarga = new javax.swing.JLabel();
        Tberat = new javax.swing.JTextField();
        Tharga = new javax.swing.JTextField();
        TKulit = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Tampill = new javax.swing.JButton();
        RadioYa = new javax.swing.JRadioButton();
        RadioTidak = new javax.swing.JRadioButton();
        GRAM = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TNama_buah.setFont(new java.awt.Font("Poppins", 3, 17)); // NOI18N
        TNama_buah.setForeground(java.awt.Color.white);
        TNama_buah.setText("NAMA BUAH");
        getContentPane().add(TNama_buah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 40));

        TnamaBuah.setBackground(new java.awt.Color(242, 242, 242));
        TnamaBuah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        TnamaBuah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnamaBuahActionPerformed(evt);
            }
        });
        getContentPane().add(TnamaBuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Poppins", 0, 12))); // NOI18N
        jPanel1.setOpaque(false);

        Nama_Buah1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Nama_Buah1.setForeground(new java.awt.Color(255, 255, 255));
        Nama_Buah1.setText("NAMA BUAH");

        Warna1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Warna1.setForeground(new java.awt.Color(255, 255, 255));
        Warna1.setText("WARNA");

        Rasa1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Rasa1.setForeground(new java.awt.Color(255, 255, 255));
        Rasa1.setText("RASA BUAH");

        Berat1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Berat1.setForeground(new java.awt.Color(255, 255, 255));
        Berat1.setText("BERAT");

        Harga1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Harga1.setForeground(new java.awt.Color(255, 255, 255));
        Harga1.setText("HARGA PER/KG");

        Kulit1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        Kulit1.setForeground(new java.awt.Color(255, 255, 255));
        Kulit1.setText("KULIT  BISA DIMAKAN");

        Onamabuah.setBackground(new java.awt.Color(242, 242, 242));
        Onamabuah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OnamabuahActionPerformed(evt);
            }
        });

        Owarna.setBackground(new java.awt.Color(242, 242, 242));
        Owarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OwarnaActionPerformed(evt);
            }
        });

        Oberat.setBackground(new java.awt.Color(242, 242, 242));
        Oberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OberatActionPerformed(evt);
            }
        });

        Oharga.setBackground(new java.awt.Color(242, 242, 242));

        Orasa.setBackground(new java.awt.Color(242, 242, 242));

        Okulit.setBackground(new java.awt.Color(242, 242, 242));
        Okulit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkulitActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Pixel Operator 8", 1, 14)); // NOI18N
        jButton1.setText("TUTUP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GRAM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Warna1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nama_Buah1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Rasa1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Owarna, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(Orasa)
                    .addComponent(Onamabuah))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Harga1)
                    .addComponent(Kulit1)
                    .addComponent(Berat1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Okulit)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Oharga, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Oberat, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Nama_Buah1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Berat1)
                            .addComponent(Oberat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(Onamabuah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Warna1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Harga1)
                        .addComponent(Oharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Owarna, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Orasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Kulit1))
                    .addComponent(Rasa1)
                    .addComponent(Okulit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 620, 170));

        TWarna.setBackground(new java.awt.Color(204, 204, 204));
        TWarna.setFont(new java.awt.Font("Poppins", 3, 17)); // NOI18N
        TWarna.setForeground(new java.awt.Color(255, 255, 255));
        TWarna.setText("WARNA BUAH   ");
        getContentPane().add(TWarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, -1, -1));

        Twarna.setBackground(new java.awt.Color(242, 242, 242));
        Twarna.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Twarna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwarnaActionPerformed(evt);
            }
        });
        getContentPane().add(Twarna, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 150, 30));

        TRasa.setFont(new java.awt.Font("Poppins", 3, 17)); // NOI18N
        TRasa.setForeground(new java.awt.Color(255, 255, 255));
        TRasa.setText("RASA BUAH");
        getContentPane().add(TRasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        Trasa.setBackground(new java.awt.Color(242, 242, 242));
        Trasa.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Trasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrasaActionPerformed(evt);
            }
        });
        getContentPane().add(Trasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 150, 30));

        TBerat.setFont(new java.awt.Font("Poppins", 3, 17)); // NOI18N
        TBerat.setForeground(new java.awt.Color(255, 255, 255));
        TBerat.setText("BERAT ");
        getContentPane().add(TBerat, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 90, -1));

        THarga.setFont(new java.awt.Font("Poppins", 3, 15)); // NOI18N
        THarga.setForeground(new java.awt.Color(255, 255, 255));
        THarga.setText("HARGA PER/KG ");
        getContentPane().add(THarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 140, 30));

        Tberat.setBackground(new java.awt.Color(242, 242, 242));
        Tberat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Tberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TberatActionPerformed(evt);
            }
        });
        getContentPane().add(Tberat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 100, 30));

        Tharga.setBackground(new java.awt.Color(242, 242, 242));
        Tharga.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Tharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThargaActionPerformed(evt);
            }
        });
        getContentPane().add(Tharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 160, 30));

        TKulit.setFont(new java.awt.Font("Poppins", 3, 15)); // NOI18N
        TKulit.setForeground(new java.awt.Color(255, 255, 255));
        TKulit.setText("KULIT BISA DIMAKAN");
        getContentPane().add(TKulit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 180, 30));

        Reset.setFont(new java.awt.Font("Pixel Operator 8", 1, 12)); // NOI18N
        Reset.setText("RESET");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 90, 20));

        Tampill.setFont(new java.awt.Font("Pixel Operator 8", 1, 12)); // NOI18N
        Tampill.setText("TAMPIL");
        Tampill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TampillActionPerformed(evt);
            }
        });
        getContentPane().add(Tampill, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 110, 20));

        buttonGroup1.add(RadioYa);
        RadioYa.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        RadioYa.setForeground(new java.awt.Color(255, 255, 255));
        RadioYa.setText("YA");
        RadioYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioYaActionPerformed(evt);
            }
        });
        getContentPane().add(RadioYa, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        buttonGroup1.add(RadioTidak);
        RadioTidak.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        RadioTidak.setForeground(new java.awt.Color(255, 255, 255));
        RadioTidak.setText("TIDAK");
        RadioTidak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioTidakActionPerformed(evt);
            }
        });
        getContentPane().add(RadioTidak, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        GRAM.setFont(new java.awt.Font("Poppins ExtraBold", 1, 14)); // NOI18N
        GRAM.setForeground(new java.awt.Color(255, 255, 255));
        GRAM.setText("GRAM");
        getContentPane().add(GRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 22, 50, 20));

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/AAPPLLEE (1).png"))); // NOI18N
        getContentPane().add(BACKGROUND, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TnamaBuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnamaBuahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnamaBuahActionPerformed

    private void TwarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TwarnaActionPerformed

    private void TberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TberatActionPerformed

    private void TrasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrasaActionPerformed

    private void ThargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThargaActionPerformed

    private void TampillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TampillActionPerformed
        AZKA_APEL apf = new AZKA_APEL();
        

 
            if (TnamaBuah.getText().isEmpty()) {
                apf.setnama_buah("Tidak Diketahui");
            } else {
                apf.setnama_buah(TnamaBuah.getText());
            }
            if (Twarna.getText().isEmpty()) {
                apf.setWarna("Tidak Diketahui");
            } else {
                apf.setWarna(Twarna.getText());
            }
            if (Trasa.getText().isEmpty()) {
                apf.setRasa("Tidak Diketahui");
            } else {
                apf.setRasa(Trasa.getText());
            }
            if (Tberat.getText().isEmpty()) {
                apf.setBerat(0);
            } else {
                apf.setBerat(Double.parseDouble(Tberat.getText()));
            }
            if (Tharga.getText().isEmpty()) {
                apf.setHarga(0);
            } else {
                apf.setHarga(Double.parseDouble(Tharga.getText()));
            }
            
            
            
            Onamabuah.setText(apf.getnama_buah());
            Owarna.setText(apf.getWarna());
            Orasa.setText(apf.getRasa());
            Oharga.setText(String.valueOf(apf.getHarga()));
            Oberat.setText(String.valueOf(apf.getBerat()));
  
            if (RadioYa.isSelected()) {
                Okulit.setText("YA, Bisa Dimakan");
            } else if (RadioTidak.isSelected()) {
                Okulit.setText("Tidak, Kulit tidak bisa dimakan");
            } else {
                Okulit.setText("Tidak Diketahui");
            }
            
        
        
    }//GEN-LAST:event_TampillActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        TnamaBuah.setText(null) ;
        Twarna.setText(null) ;
        Trasa.setText(null) ;
        Tberat.setText(null) ;
        Tharga.setText(null) ;
        Onamabuah.setText(null) ;
        Owarna.setText(null) ;
        Orasa.setText(null) ;
        Oberat.setText(null) ;
        Oharga.setText(null) ;
        Okulit.setText(null);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_ResetActionPerformed

    private void RadioYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioYaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioYaActionPerformed

    private void RadioTidakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioTidakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioTidakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       new MainFrame().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void OkulitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkulitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkulitActionPerformed

    private void OberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OberatActionPerformed

    private void OwarnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OwarnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OwarnaActionPerformed

    private void OnamabuahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OnamabuahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OnamabuahActionPerformed

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
            java.util.logging.Logger.getLogger(ApelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApelFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.JLabel Berat1;
    private javax.swing.JLabel GRAM;
    private javax.swing.JLabel Harga1;
    private javax.swing.JLabel Kulit1;
    private javax.swing.JLabel Nama_Buah1;
    private javax.swing.JTextField Oberat;
    private javax.swing.JTextField Oharga;
    private javax.swing.JTextField Okulit;
    private javax.swing.JTextField Onamabuah;
    private javax.swing.JTextField Orasa;
    private javax.swing.JTextField Owarna;
    private javax.swing.JRadioButton RadioTidak;
    private javax.swing.JRadioButton RadioYa;
    private javax.swing.JLabel Rasa1;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel TBerat;
    private javax.swing.JLabel THarga;
    private javax.swing.JLabel TKulit;
    private javax.swing.JLabel TNama_buah;
    private javax.swing.JLabel TRasa;
    private javax.swing.JLabel TWarna;
    private javax.swing.JButton Tampill;
    private javax.swing.JTextField Tberat;
    private javax.swing.JTextField Tharga;
    private javax.swing.JTextField TnamaBuah;
    private javax.swing.JTextField Trasa;
    private javax.swing.JTextField Twarna;
    private javax.swing.JLabel Warna1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
