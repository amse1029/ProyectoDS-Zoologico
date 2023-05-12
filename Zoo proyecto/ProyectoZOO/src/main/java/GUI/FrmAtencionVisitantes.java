/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author alexa
 */
public class FrmAtencionVisitantes extends javax.swing.JFrame {

    /**
     * Creates new form FrmAtencionVisitantes
     */
    public FrmAtencionVisitantes() {
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

        pnlFondo = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        btnQueja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(238, 189, 102));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setBackground(new java.awt.Color(106, 69, 4));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Atención visitantes");
        pnlRegistro.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlFondo.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 70));

        btnQueja.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnQueja.setForeground(new java.awt.Color(106, 69, 4));
        btnQueja.setText("Registrar queja");
        btnQueja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuejaActionPerformed(evt);
            }
        });
        pnlFondo.add(btnQueja, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuejaActionPerformed
        // TODO add your handling code here:
        this.seleccionaRegistrarQueja();
    }//GEN-LAST:event_btnQuejaActionPerformed

    private void seleccionaRegistrarQueja() {
        FrmQuejas frm = new FrmQuejas();
        frm.setVisible(true);
        this.dispose();
    }
    
    private void muestraMsjError() {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQueja;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlRegistro;
    // End of variables declaration//GEN-END:variables
}
