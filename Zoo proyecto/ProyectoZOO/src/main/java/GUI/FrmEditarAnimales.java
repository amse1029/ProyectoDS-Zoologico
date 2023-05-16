/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Dominio.Animal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexa
 */
public class FrmEditarAnimales extends javax.swing.JFrame {

    FrmRegistrarEspecie especie;
    List<Animal> animales;

    /**
     * Creates new form FrmEditarAnimales
     *
     * @param especie
     */
    public FrmEditarAnimales(List<Animal> animales, FrmRegistrarEspecie especie) {
        this.especie = especie;
        initComponents();
        this.animales = animales;

        this.muestralos();
        this.setVisible(true);
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
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnimales = new javax.swing.JTable();
        lblAnimales = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        cbSexo = new javax.swing.JCheckBox();
        lblNombre1 = new javax.swing.JLabel();
        txtNombreCientifico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar animales");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(238, 189, 102));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setBackground(new java.awt.Color(106, 69, 4));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Editar animales");
        pnlRegistro.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        pnlFondo.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 70));

        btnEliminar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(106, 69, 4));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        btnRegresar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(106, 69, 4));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        btnAgregar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(106, 69, 4));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        jScrollPane1.setFont(new java.awt.Font("Segoe Print", 0, 20)); // NOI18N

        tblAnimales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Sexo", "Nombre Cientifico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnimales.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblAnimales);
        if (tblAnimales.getColumnModel().getColumnCount() > 0) {
            tblAnimales.getColumnModel().getColumn(0).setResizable(false);
            tblAnimales.getColumnModel().getColumn(1).setResizable(false);
            tblAnimales.getColumnModel().getColumn(2).setResizable(false);
            tblAnimales.getColumnModel().getColumn(3).setResizable(false);
        }

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 430, 100));

        lblAnimales.setFont(new java.awt.Font("Segoe Print", 1, 25)); // NOI18N
        lblAnimales.setForeground(new java.awt.Color(106, 69, 4));
        lblAnimales.setText("Animales");
        pnlFondo.add(lblAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre Cientifico:");
        pnlFondo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        lblEdad.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setText("Edad:");
        pnlFondo.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        lblNombre2.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Sexo:");
        pnlFondo.add(lblNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 170, 40));

        txtEdad.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });
        pnlFondo.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 170, 40));

        cbSexo.setBackground(new java.awt.Color(238, 189, 102));
        cbSexo.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        cbSexo.setText("Macho");
        pnlFondo.add(cbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 170, 40));

        lblNombre1.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Nombre:");
        pnlFondo.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        txtNombreCientifico.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        txtNombreCientifico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCientificoKeyTyped(evt);
            }
        });
        pnlFondo.add(txtNombreCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 170, 40));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        this.seleccionaRegresar();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.muestraMsjConfirmacion();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.seleccionaAgregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            // Si no es un número, consumir el evento
            evt.consume();
        }
    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtNombreCientificoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCientificoKeyTyped
        char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key);

        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCientificoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char key = evt.getKeyChar();
        boolean letra = Character.isLetter(key);

        if (!letra) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    public void muestralos() {
        if (animales != null) {
            this.mostrarAnimales(animales);
        }
    }

    private void mostrarAnimales(List<Animal> animales) {
        DefaultTableModel model2 = (DefaultTableModel) tblAnimales.getModel();
        model2.setRowCount(0);
        for (int i = 0; i < animales.size(); i++) {
            Animal animal = animales.get(i);
            DefaultTableModel model = (DefaultTableModel) tblAnimales.getModel();
            Object[] row = new Object[]{animal.getNombre(), animal.getEdad(), animal.getSexo(),animal.getNombreCientifico()};
            model.addRow(row);
        }
    }

    private void seleccionaAgregar() {
        Animal animal = new Animal();
        String nombre = this.txtNombre.getText();
        String nombreCientifico = this.txtNombreCientifico.getText();
        int edad = Integer.parseInt(this.txtEdad.getText());
        boolean sexo = this.cbSexo.isSelected();

// Verificar si ya existe un animal con el mismo nombre y nombre científico
        boolean existeAnimal = false;
        for (Animal a : animales) {
            if (a.getNombre().equals(nombre) || a.getNombreCientifico().equals(nombreCientifico)) {
                existeAnimal = true;
                break;
            }
        }

        if (existeAnimal) {
            this.muestraMsjExistente();
        } else {
            boolean exito = animal.verificacion(nombre, edad, sexo, nombreCientifico);
            if (exito) {
                this.animales.add(animal);
                DefaultTableModel model = (DefaultTableModel) tblAnimales.getModel();
                Object[] row = new Object[]{animal.getNombre(), animal.getEdad(), animal.getSexo()};
                model.addRow(row);
               this.limpiarCampos();
            } else {
                this.muestraMsjError();
            }
        }

    }
    public void limpiarCampos(){
        this.txtEdad.setText("");
        this.txtNombreCientifico.setText("");
        this.txtNombre.setText("");
        this.cbSexo.setSelected(false);
    }

    private void muestraMsjError() {
        JOptionPane.showMessageDialog(this, "La edad no puede ser mayor a 150 ni menor a 0 y no debe haber campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void muestraMsjExistente() {
        JOptionPane.showMessageDialog(null, "Vericia el nombre y el nombre cientifico, no esten repetidos en la tabla", "Error", JOptionPane.ERROR_MESSAGE);

    }

    private void seleccionaEliminar() {
        int indice = tblAnimales.getSelectedRow();
        if (indice != -1) {
            DefaultTableModel model = (DefaultTableModel) tblAnimales.getModel();
            if (model.getRowCount() > 1) {
                model.removeRow(indice);
            }
            tblAnimales.revalidate();
            tblAnimales.repaint();
            animales.remove(indice);
            this.mostrarAnimales(animales);
        }
    }

    private void cierraPantalla() {
        especie.actualizar();
        this.dispose();
    }

    private void muestraMsjConfirmacion() {
        int dialogResult = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminarlo?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            this.seleccionaEliminar();
        } else {

        }
    }

    private void seleccionaRegresar() {
        this.cierraPantalla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox cbSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnimales;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTable tblAnimales;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCientifico;
    // End of variables declaration//GEN-END:variables
}
