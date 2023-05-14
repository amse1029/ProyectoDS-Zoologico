/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Dominio.Animal;
import Dominio.Cuidador;
import Dominio.Especie;
import Dominio.Habitat;
import itson.Control.FabricaLogica;
import itson.Control.ILogica;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author alexa
 */
public class FrmRegistrarEspecie_1 extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrarEspecie
     */
    FrmEditarAnimales editar;
    List<Animal> animales;
    boolean ya = false;
    List<Cuidador> cuidadores;
    List<Habitat> habitats;
    ILogica ctrlEspecie;

    public FrmRegistrarEspecie_1(List<Habitat> habitats, List<Cuidador> cuidadores) {
        this.setVisible(true);
        this.cuidadores = cuidadores;
        this.habitats = habitats;
        this.ctrlEspecie = FabricaLogica.crearInstancia();
        initComponents();
        this.despliegaDatos(habitats, cuidadores);
        editar = new FrmEditarAnimales(this);
        this.txtCantidad.setEditable(false);
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
        btnVerificar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        lblNombreCientifico = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtNombreCientifico = new javax.swing.JTextField();
        lblDescripcion1 = new javax.swing.JLabel();
        lblAnimales = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblDescripcion3 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuidadores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHabitats = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(238, 189, 102));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setBackground(new java.awt.Color(106, 69, 4));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registro especie");
        pnlRegistro.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlFondo.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 70));

        btnVerificar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(106, 69, 4));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, -1, -1));

        btnEditar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(106, 69, 4));
        btnEditar.setText("Editar animales");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        lblNombreCientifico.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombreCientifico.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCientifico.setText("Nombre científico:");
        pnlFondo.add(lblNombreCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 170, 40));

        lblNombre.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        pnlFondo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción:");
        pnlFondo.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 170, 40));

        txtNombreCientifico.setEditable(false);
        txtNombreCientifico.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(txtNombreCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 170, 40));

        lblDescripcion1.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDescripcion1.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion1.setText("Cuidador:");
        pnlFondo.add(lblDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        lblAnimales.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblAnimales.setForeground(new java.awt.Color(255, 255, 255));
        lblAnimales.setText("Cantidad Animales:");
        pnlFondo.add(lblAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        btnGuardar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(106, 69, 4));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        lblDescripcion3.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDescripcion3.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion3.setText("Hábitat:");
        pnlFondo.add(lblDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        txtNombre1.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 170, 40));

        tblCuidadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Elegido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCuidadores);

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, 110));

        tblHabitats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Elegida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblHabitats);

        pnlFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 110, 110));

        btnRegresar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(106, 69, 4));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        this.seleccionaVerificar();
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        this.seleccionaEditar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.seleccionaGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmInicial inicial=new FrmInicial();
        inicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void despliegaDatos(List<Habitat> habitats, List<Cuidador> cuidadores) {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblCuidadores.getModel();
        for (int i = 0; i < cuidadores.size(); i++) {
            Object[] datos = {cuidadores.get(i).getNombre(), false};
            modeloTabla.addRow(datos);
        }
        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.tblHabitats.getModel();

        for (int i = 0; i < habitats.size(); i++) {
            Object[] datos = {habitats.get(i).getNombre(), false};
            modeloTabla2.addRow(datos);
        }
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
        ya = true;
    }

    public List<Animal> getAnimales(){
        return this.animales;
    }
    
    private void seleccionaVerificar() {
        String nombre = this.txtNombre1.getText();
        Especie especie = ctrlEspecie.recuperarEspecie(nombre);
        if (especie == null) {
            
            this.activaCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(this, "La especie ya se encuentra registrada");
            this.muestraDatos(especie);
        }
    }

    private void muestraDatos(Especie especie) {
        DefaultTableModel model = (DefaultTableModel) tblCuidadores.getModel();
        model.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) tblHabitats.getModel();
        model2.setRowCount(0);
        this.txtNombreCientifico.setText(especie.getNombreCientifico());
        this.txtDescripcion.setText(especie.getDescripcion());
        List<Cuidador> cuida = especie.getCuiadadores();
        List<Habitat> habit = especie.getHabitats();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblCuidadores.getModel();
        for (int i = 0; i < cuidadores.size(); i++) {
            if(cuidadores.get(i)==cuida.get(i)){
                Object[] datos = {cuidadores.get(i).getNombre(), true};
                modeloTabla.addRow(datos);
            }else{
                Object[] datos = {cuidadores.get(i).getNombre(), false};
                modeloTabla.addRow(datos);
            }
            
        }
        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.tblHabitats.getModel();

        for (int i = 0; i < habitats.size(); i++) {
            if(habitats.get(i)==habit.get(i)){
                Object[] datos = {habitats.get(i).getNombre(), true};
                modeloTabla2.addRow(datos);
            }else{
                Object[] datos = {habitats.get(i).getNombre(), false};
                modeloTabla2.addRow(datos);
            }
        }
        this.animales=especie.getAnimales();
        this.btnGuardar.setEnabled(true);
        this.btnEditar.setEnabled(true);
        this.txtNombre1.setEditable(false);
        this.btnVerificar.setEnabled(false);
    }

    private void activaCamposRegistro() {
        System.out.println("Hola");
        this.txtNombreCientifico.setEditable(true);
        this.txtDescripcion.setEditable(true);
        this.btnGuardar.setEnabled(true);
        this.btnEditar.setEnabled(true);
        this.txtNombre1.setEditable(false);
        this.btnVerificar.setEnabled(false);
    }

    private void seleccionaEditar() {
        editar.muestralos();
        editar.setVisible(true);
        while (!ya) {

        }
        Integer cantidad = animales.size();
        this.txtCantidad.setText(cantidad.toString());
        ya = false;
    }

    private void actualizaCamposRegistrados() {

    }

    private void seleccionaGuardar() {
        ArrayList<Cuidador> cuidados = new ArrayList<>();
        for (int i = 0; i < tblCuidadores.getRowCount(); i++) {
            boolean escogido = (boolean) tblCuidadores.getValueAt(i, 1);
            if (escogido) {
                cuidados.add(cuidadores.get(i));
            }
        }
        ArrayList<Habitat> hab = new ArrayList<>();
        for (int i = 0; i < tblHabitats.getRowCount(); i++) {
            boolean escogido = (boolean) tblHabitats.getValueAt(i, 1);
            if (escogido) {
                hab.add(habitats.get(i));
            }
        }

        String nombre = this.txtNombre1.getText();
        String nombreCientifico = this.txtNombreCientifico.getText();
        String descripcion = this.txtDescripcion.getText();
        Especie especie = new Especie();
        boolean correcto = especie.verificacion(nombre, nombreCientifico, descripcion, cuidados, hab, animales);
        if (correcto) {
            ObjectId id = ctrlEspecie.guardarEspecie(especie);
            this.mostrarMsjExito();
            JOptionPane.showMessageDialog(this, "El id de la especie registrada es el siguiente: " + id.toString());
        } else {
            this.muestraMsjError();
        }
    }

    private void muestraMsjError() {
        JOptionPane.showMessageDialog(this, "", "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void mostrarMsjExito() {
        JOptionPane.showMessageDialog(this, "Especie registrada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnimales;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreCientifico;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTable tblCuidadores;
    private javax.swing.JTable tblHabitats;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombreCientifico;
    // End of variables declaration//GEN-END:variables
}
