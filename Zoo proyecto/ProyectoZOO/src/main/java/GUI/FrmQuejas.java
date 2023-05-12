/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class FrmQuejas extends javax.swing.JFrame {

    /**
     * Creates new form FrmQuejas
     */
    public FrmQuejas() {
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
        lblFechas = new javax.swing.JLabel();
        lblItinerarios = new javax.swing.JLabel();
        lblHoras = new javax.swing.JLabel();
        cbxItinerarios = new javax.swing.JComboBox<>();
        cbxHoras = new javax.swing.JComboBox<>();
        btnEnviarQueja = new javax.swing.JButton();
        cbxFechas1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(238, 189, 102));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setBackground(new java.awt.Color(106, 69, 4));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registro queja");
        pnlRegistro.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlFondo.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 70));

        lblFechas.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblFechas.setForeground(new java.awt.Color(255, 255, 255));
        lblFechas.setText("Fechas:");
        pnlFondo.add(lblFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        lblItinerarios.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblItinerarios.setForeground(new java.awt.Color(255, 255, 255));
        lblItinerarios.setText("Itinerarios:");
        pnlFondo.add(lblItinerarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lblHoras.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblHoras.setForeground(new java.awt.Color(255, 255, 255));
        lblHoras.setText("Horas:");
        pnlFondo.add(lblHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        cbxItinerarios.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(cbxItinerarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 170, 40));

        cbxHoras.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(cbxHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, 40));

        btnEnviarQueja.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnEnviarQueja.setForeground(new java.awt.Color(106, 69, 4));
        btnEnviarQueja.setText("Enviar queja");
        btnEnviarQueja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarQuejaActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEnviarQueja, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        cbxFechas1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(cbxFechas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 170, 40));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarQuejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarQuejaActionPerformed
        // TODO add your handling code here:
        this.seleccionaEnviarQueja();
    }//GEN-LAST:event_btnEnviarQuejaActionPerformed

    private void muestraListaItinerariosNombres() {
    }
    
    private void seleccionaNombreItinerario() {
    }
    
    private void llenaListaFechas() {
    }
    
    private void seleccionaFechaQueja() {
    }
    
    private void llenaListaHoras() {
    }
    
    private void seleccionaEnviarQueja() {
    }
    
    private void muestraMsjError() {
        JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE); 
    }
    
    private void muestraMsjQuejaEnviada() {
        JOptionPane.showMessageDialog(this, "Queja enviada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviarQueja;
    private javax.swing.JComboBox<String> cbxFechas1;
    private javax.swing.JComboBox<String> cbxHoras;
    private javax.swing.JComboBox<String> cbxItinerarios;
    private javax.swing.JLabel lblFechas;
    private javax.swing.JLabel lblHoras;
    private javax.swing.JLabel lblItinerarios;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlRegistro;
    // End of variables declaration//GEN-END:variables
}
