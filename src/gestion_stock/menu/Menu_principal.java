/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_stock.menu;

/**
 *
 * @author Abdouramane
 */
public class Menu_principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_principal
     */
    public Menu_principal() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonArtMP = new javax.swing.JButton();
        jButtonArtMP1 = new javax.swing.JButton();
        jButtonArtMP2 = new javax.swing.JButton();
        jButtonMag = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonArtMP4 = new javax.swing.JButton();
        jButtonArtMP5 = new javax.swing.JButton();
        jButtonComFou = new javax.swing.JButton();
        jButtonMag2 = new javax.swing.JButton();
        jButtonArtMP3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 36)); // NOI18N
        jLabel1.setText("Menu Principal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonArtMP.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonArtMP.setText("Articles");
        jButtonArtMP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonArtMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArtMPActionPerformed(evt);
            }
        });

        jButtonArtMP1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonArtMP1.setText("Client");
        jButtonArtMP1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonArtMP1.setMargin(new java.awt.Insets(5, 19, 5, 19));
        jButtonArtMP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArtMP1ActionPerformed(evt);
            }
        });

        jButtonArtMP2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonArtMP2.setText("changer d'utilisateur");
        jButtonArtMP2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonArtMP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArtMP2ActionPerformed(evt);
            }
        });

        jButtonMag.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonMag.setText("Magasin");
        jButtonMag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonMag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMagActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BIENVENU DANS LE MENU PRINCIPALE");

        jButtonArtMP4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonArtMP4.setText("Fournisseurs");
        jButtonArtMP4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonArtMP4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArtMP4ActionPerformed(evt);
            }
        });

        jButtonArtMP5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonArtMP5.setText("Quitter");
        jButtonArtMP5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonArtMP5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArtMP5ActionPerformed(evt);
            }
        });

        jButtonComFou.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonComFou.setText("Commande Fournisseur");
        jButtonComFou.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonComFou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComFouActionPerformed(evt);
            }
        });

        jButtonMag2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonMag2.setText("Commande Client");
        jButtonMag2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonMag2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMag2ActionPerformed(evt);
            }
        });

        jButtonArtMP3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jButtonArtMP3.setText("Etat du Stock");
        jButtonArtMP3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, new java.awt.Color(0, 0, 0)));
        jButtonArtMP3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonArtMP3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonArtMP, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonArtMP4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonArtMP2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonArtMP1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonMag, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonMag2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonArtMP3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonComFou, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButtonArtMP5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonArtMP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMag, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonArtMP1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonArtMP4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonComFou, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMag2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonArtMP2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonArtMP3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jButtonArtMP5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonArtMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArtMPActionPerformed
FormulaireArticles fa = new FormulaireArticles();
fa.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonArtMPActionPerformed

    private void jButtonArtMP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArtMP1ActionPerformed
FormulaireClient fc = new FormulaireClient() ;
fc.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonArtMP1ActionPerformed

    private void jButtonArtMP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArtMP2ActionPerformed
FormulaireConnection fn = new  FormulaireConnection();
fn.setVisible(true);

    }//GEN-LAST:event_jButtonArtMP2ActionPerformed

    private void jButtonMagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMagActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMagActionPerformed

    private void jButtonArtMP4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArtMP4ActionPerformed
       FormulaireFourniss ff =new FormulaireFourniss ();
       ff.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonArtMP4ActionPerformed

    private void jButtonArtMP5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArtMP5ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonArtMP5ActionPerformed

    private void jButtonComFouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComFouActionPerformed
CommandeFourn cf = new CommandeFourn();
cf.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButtonComFouActionPerformed

    private void jButtonMag2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMag2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMag2ActionPerformed

    private void jButtonArtMP3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonArtMP3ActionPerformed
FormulaireStock fs = new FormulaireStock();
fs.setVisible(true);
    }//GEN-LAST:event_jButtonArtMP3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu_principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonArtMP;
    private javax.swing.JButton jButtonArtMP1;
    private javax.swing.JButton jButtonArtMP2;
    private javax.swing.JButton jButtonArtMP3;
    private javax.swing.JButton jButtonArtMP4;
    private javax.swing.JButton jButtonArtMP5;
    private javax.swing.JButton jButtonComFou;
    private javax.swing.JButton jButtonMag;
    private javax.swing.JButton jButtonMag2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
