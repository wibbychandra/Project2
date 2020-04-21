/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package companystockexchange.Layer;

/**
 *
 * @author Wibby Chandra
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf_idprofile = new javax.swing.JTextField();
        tf_nameprofile = new javax.swing.JTextField();
        tf_persheetprofile = new javax.swing.JTextField();
        tf_percentageprofile = new javax.swing.JTextField();
        dp_dateprofile = new org.jdesktop.swingx.JXDatePicker();
        btn_sallshares = new javax.swing.JButton();
        btn_tosaleshares = new javax.swing.JButton();
        btn_toshareholderslist = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tf_priceprofile = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Member Number");

        jLabel2.setText("Shareholder Name");

        jLabel3.setText("Date Noted");

        jLabel4.setText("Shareholding per Sheet");

        jLabel5.setText("Shares Selling Price");

        tf_idprofile.setEditable(false);

        tf_nameprofile.setEditable(false);
        tf_nameprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nameprofileActionPerformed(evt);
            }
        });

        tf_persheetprofile.setEditable(false);

        tf_percentageprofile.setEditable(false);

        dp_dateprofile.setEditable(false);

        btn_sallshares.setText("Sell Your Shares");

        btn_tosaleshares.setText("List of Sale Shares");
        btn_tosaleshares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tosalesharesActionPerformed(evt);
            }
        });

        btn_toshareholderslist.setText("List of Shareholders");
        btn_toshareholderslist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toshareholderslistActionPerformed(evt);
            }
        });

        jLabel6.setText("Shareholding Percentage");

        tf_priceprofile.setEditable(false);

        jLabel7.setText("Price per Sheet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_tosaleshares)
                        .addGap(18, 18, 18)
                        .addComponent(btn_toshareholderslist)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_percentageprofile)
                            .addComponent(dp_dateprofile, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(tf_idprofile)
                            .addComponent(tf_nameprofile)
                            .addComponent(tf_persheetprofile)
                            .addComponent(tf_priceprofile))
                        .addGap(63, 63, 63)
                        .addComponent(btn_sallshares)
                        .addGap(48, 48, 48))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(124, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tf_idprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_nameprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dp_dateprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_persheetprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_percentageprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_priceprofile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btn_sallshares)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tosaleshares)
                    .addComponent(btn_toshareholderslist))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nameprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nameprofileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nameprofileActionPerformed

    private void btn_tosalesharesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tosalesharesActionPerformed
        // TODO add your handling code here:
        SalePurchase sale = new SalePurchase();
        sale.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_tosalesharesActionPerformed

    private void btn_toshareholderslistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toshareholderslistActionPerformed
        // TODO add your handling code here:
        Shareholders sale = new Shareholders();
        sale.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_toshareholderslistActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sallshares;
    private javax.swing.JButton btn_tosaleshares;
    private javax.swing.JButton btn_toshareholderslist;
    private org.jdesktop.swingx.JXDatePicker dp_dateprofile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField tf_idprofile;
    private javax.swing.JTextField tf_nameprofile;
    private javax.swing.JTextField tf_percentageprofile;
    private javax.swing.JTextField tf_persheetprofile;
    private javax.swing.JTextField tf_priceprofile;
    // End of variables declaration//GEN-END:variables

    private Shareholders Shareholders() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
