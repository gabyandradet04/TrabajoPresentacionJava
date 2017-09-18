/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Español
 */
public class CajeroAutomatico extends javax.swing.JFrame {

    /**
     * Creates new form CajeroAutomatico
     */
     int acumulador=0;
     int saldo;
     int retiro;
     int deb;
     int cuenta;
     int i=0;
    
    
    public CajeroAutomatico() {
        
        initComponents();
        setLocationRelativeTo(null);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        btndebito = new javax.swing.JButton();
        debito = new javax.swing.JLabel();
        txt3 = new javax.swing.JTextField();
        btntotal = new javax.swing.JButton();
        txt4 = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        monto = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setText("NOMBRE:");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 149, -1));

        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setText("TOTAL:");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));
        getContentPane().add(txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 149, -1));

        btndebito.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btndebito.setText("DEBITO");
        btndebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndebitoActionPerformed(evt);
            }
        });
        getContentPane().add(btndebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        debito.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        debito.setText("DEBITO");
        getContentPane().add(debito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 149, -1));

        btntotal.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btntotal.setText("TOTAL");
        btntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntotalActionPerformed(evt);
            }
        });
        getContentPane().add(btntotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 80, -1));
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 149, -1));

        btnagregar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        monto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monto.setText("MONTO:");
        getContentPane().add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jButton1.setText("Inicio");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cajero Automatico");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 340, -1));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajero1.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
      
            saldo=Integer.parseInt(this.txt2.getText());
            acumulador=acumulador+saldo;
            
         
       
       
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btndebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndebitoActionPerformed
        // TODO add your handling code here:
        retiro=Integer.parseInt(this.txt3.getText());
        deb=deb+retiro;
        
    }//GEN-LAST:event_btndebitoActionPerformed

    private void btntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntotalActionPerformed
        // TODO add your handling code here:
        cuenta=acumulador-deb;
        txt4.setText(String.valueOf(cuenta));
        txt2.setText("");
        txt3.setText("");
        
    }//GEN-LAST:event_btntotalActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Ventana1 v1 =new Ventana1();
        v1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(CajeroAutomatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CajeroAutomatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CajeroAutomatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CajeroAutomatico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CajeroAutomatico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btndebito;
    private javax.swing.JButton btntotal;
    private javax.swing.JLabel debito;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel monto;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
