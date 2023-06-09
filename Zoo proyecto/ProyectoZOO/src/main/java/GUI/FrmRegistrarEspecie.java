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
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 *
 * @author
 */
public class FrmRegistrarEspecie extends javax.swing.JFrame {

    FrmEditarAnimales editar;
    List<Animal> animales;
    boolean ya = false;
    List<Cuidador> cuidadores;
    List<Habitat> habitats;
    ILogica ctrlEspecie;
    List<Cuidador> cuida;
    List<Habitat> habit;
    Especie especie;

    /**
     * Crea un nuevo formulario FrmRegistrarEspecie.
     *
     * @param habitats Lista de hábitats disponibles.
     * @param cuidadores Lista de cuidadores disponibles.
     */
    public FrmRegistrarEspecie(List<Habitat> habitats, List<Cuidador> cuidadores) {
        this.setVisible(true);
        this.animales = new ArrayList<>();
        this.cuidadores = cuidadores;
        this.habitats = habitats;
        this.ctrlEspecie = FabricaLogica.crearInstancia();
        especie = new Especie();
        initComponents();
        this.despliegaDatos(habitats, cuidadores);
        cuida = ctrlEspecie.recuperarCuidadores();
        habit = ctrlEspecie.recuperarHabitats();
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
        lblDatosEspecie = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtNombreCientifico = new javax.swing.JTextField();
        lblDescripcion1 = new javax.swing.JLabel();
        lblAnimales = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        lblDescripcion3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuidadores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHabitats = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();

        setTitle("Registrar Especie");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlFondo.setBackground(new java.awt.Color(238, 189, 102));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistro.setBackground(new java.awt.Color(106, 69, 4));
        pnlRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro.setFont(new java.awt.Font("Segoe Print", 1, 30)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("Registro especie");
        pnlRegistro.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlFondo.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 70));

        btnVerificar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(106, 69, 4));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        btnEditar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(106, 69, 4));
        btnEditar.setText("Editar animales");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, -1, -1));

        lblNombreCientifico.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombreCientifico.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCientifico.setText("Nombre científico:");
        pnlFondo.add(lblNombreCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        pnlFondo.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 170, 40));

        lblDatosEspecie.setBackground(new java.awt.Color(106, 69, 4));
        lblDatosEspecie.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDatosEspecie.setForeground(new java.awt.Color(106, 69, 4));
        lblDatosEspecie.setText("Datos de la especie:");
        pnlFondo.add(lblDatosEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Descripción:");
        pnlFondo.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtCantidadMouseReleased(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        pnlFondo.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 140, 40));

        txtNombreCientifico.setEditable(false);
        txtNombreCientifico.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtNombreCientifico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCientificoKeyTyped(evt);
            }
        });
        pnlFondo.add(txtNombreCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 170, 40));

        lblDescripcion1.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDescripcion1.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion1.setText("Cuidador:");
        pnlFondo.add(lblDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

        lblAnimales.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblAnimales.setForeground(new java.awt.Color(255, 255, 255));
        lblAnimales.setText("Cantidad de animales:");
        pnlFondo.add(lblAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btnGuardar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(106, 69, 4));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        lblDescripcion3.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDescripcion3.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion3.setText("Hábitat:");
        pnlFondo.add(lblDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 170, 40));

        tblCuidadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Selecciona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCuidadores.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCuidadores);
        if (tblCuidadores.getColumnModel().getColumnCount() > 0) {
            tblCuidadores.getColumnModel().getColumn(0).setResizable(false);
            tblCuidadores.getColumnModel().getColumn(1).setResizable(false);
        }

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 190, 120));

        tblHabitats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Selecciona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHabitats.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblHabitats);
        if (tblHabitats.getColumnModel().getColumnCount() > 0) {
            tblHabitats.getColumnModel().getColumn(0).setResizable(false);
            tblHabitats.getColumnModel().getColumn(1).setResizable(false);
        }

        pnlFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 190, 110));

        btnRegresar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(106, 69, 4));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        pnlFondo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        if (this.txtNombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ecribre el nombre de la especie",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            this.seleccionaVerificar();
        }

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
        FrmInicial inicial = new FrmInicial();
        inicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (this.txtNombre.getText().length() < 25) {
            validacionAlfabeto(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreCientificoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCientificoKeyTyped
        if (this.txtNombreCientifico.getText().length() < 25) {
            validacionAlfabeto(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCientificoKeyTyped

    private void txtCantidadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCantidadMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadMouseReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new FrmInicial().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        if (this.txtCantidad.getText().length() < 5) {
            validacionNumero(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped

        if (this.txtDescripcion.getText().length() < 50) {
            validacionAlfabeto(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    /**
     * Método que valida que solamente se acepten letras y espacios.
     *
     * @param evt
     */
    public void validacionAlfabeto(java.awt.event.KeyEvent evt) {
        char key = evt.getKeyChar();
        if ((!Character.isLetter(key)) && key != KeyEvent.VK_SPACE) {
            evt.consume();
        }
    }

    /**
     * Metodo para validar el campo por numero.
     *
     * @param evt evento
     */
    public void validacionNumero(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isDigit(txt))) {
            evt.consume();
        }
    }

    /**
     * Método que despliega los datos de los hábitats y cuidadores.
     *
     * @param habitats Lista de hábitats disponibles.
     * @param cuidadores Lista de cuidadores disponibles.
     */
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

    /**
     * Método que setea la lista de animales.
     *
     * @param animales Lista de animales.
     */
    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
        ya = true;
    }

    /**
     * Método que regresa una lista de animales.
     *
     * @return Lista de animales.
     */
    public List<Animal> getAnimales() {
        return this.animales;
    }

    /**
     * Método que determina lo que pasa cuando el actor selecciona verificar.
     */
    private void seleccionaVerificar() {
        String nombre = this.txtNombre.getText().trim();
        especie = ctrlEspecie.recuperarEspecie(nombre);
        if (especie == null) {
            especie = new Especie();
            this.activaCamposRegistro();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "La especie ya se encuentra registrada");
            this.cuidadores = especie.getCuidadores();
            this.habitats = especie.getHabitats();
            this.muestraDatos(especie);
        }
    }

    /**
     * Método que muestra los datos de una especie.
     *
     * @param especie Especie de la que se mostrarán los datos.
     */
    private void muestraDatos(Especie especie) {
        DefaultTableModel model = (DefaultTableModel) tblCuidadores.getModel();
        model.setRowCount(0);
        DefaultTableModel model2 = (DefaultTableModel) tblHabitats.getModel();
        model2.setRowCount(0);
        this.txtNombreCientifico.setText(especie.getNombreCientifico());
        this.txtDescripcion.setText(especie.getDescripcion());

        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblCuidadores.getModel();
        for (int i = 0; i < cuida.size(); i++) {
            if (cuidadores.contains(cuida.get(i))) {
                Object[] datos = {cuida.get(i).getNombre(), true};
                modeloTabla.addRow(datos);
            } else {
                Object[] datos = {cuida.get(i).getNombre(), false};
                modeloTabla.addRow(datos);
            }

        }
        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.tblHabitats.getModel();

        for (int i = 0; i < habit.size(); i++) {
            if (habitats.contains(habit.get(i))) {
                Object[] datos = {habit.get(i).getNombre(), true};
                modeloTabla2.addRow(datos);
            } else {
                Object[] datos = {habit.get(i).getNombre(), false};
                modeloTabla2.addRow(datos);
            }
        }
        this.animales = especie.getAnimales();
        this.txtNombreCientifico.setEditable(true);
        this.txtDescripcion.setEditable(true);
        this.btnGuardar.setEnabled(true);
        this.btnEditar.setEnabled(true);
        this.txtNombre.setEditable(false);
        this.btnVerificar.setEnabled(false);
    }

    /**
     * Método que activa los campos de registro.
     */
    private void activaCamposRegistro() {
        this.txtNombreCientifico.setEditable(true);
        this.txtDescripcion.setEditable(true);
        this.btnGuardar.setEnabled(true);
        this.btnEditar.setEnabled(true);
        this.txtNombre.setEditable(false);
        this.btnVerificar.setEnabled(false);
    }

    /**
     * Método que determina lo que pasa cuando el actor selecciona editar
     * animales.
     */
    private void seleccionaEditar() {
        editar = new FrmEditarAnimales(animales, this);
        this.setVisible(false);
    }

    /**
     * Método que actualiza la cantidad de animales.
     */
    public void actualizar() {
        Integer cantidad = animales.size();
        this.setVisible(true);
        this.txtCantidad.setText(cantidad.toString());
    }

    /**
     * Método que determina lo que pasa cuando el actor selecciona guardar.
     */
    private void seleccionaGuardar() {
        ArrayList<Cuidador> cuidados = new ArrayList<>();
        for (int i = 0; i < tblCuidadores.getRowCount(); i++) {
            boolean escogido = (boolean) tblCuidadores.getValueAt(i, 1);
            if (escogido) {
                cuidados.add(this.cuida.get(i));
            }
        }
        ArrayList<Habitat> hab = new ArrayList<>();
        for (int i = 0; i < tblHabitats.getRowCount(); i++) {
            boolean escogido = (boolean) tblHabitats.getValueAt(i, 1);
            if (escogido) {
                hab.add(habit.get(i));
            }
        }

        String nombre = this.txtNombre.getText().trim();
        String nombreCientifico = this.txtNombreCientifico.getText().trim();
        String descripcion = this.txtDescripcion.getText().trim();
        //Especie especie = new Especie();
        boolean correcto = especie.verificacion(nombre, nombreCientifico,
                descripcion, cuidados, hab);
        if (correcto) {
            ObjectId id = ctrlEspecie.guardarEspecie(this.especie);
            if (id == null) {
                this.muestraMsjError(
                        "Ya existe un animal registrado con ese nombre científico");
            } else {
                this.mostrarMsjExito();
                JOptionPane.showMessageDialog(this,
                        "El id de la especie registrada es el siguiente: "
                        + id.toString());
                FrmInicial inicial = new FrmInicial();
                inicial.setVisible(true);
                this.dispose();
            }
        } else {
            this.muestraMsjError(
                    "Verifica el formato, que no existan campos vacíos y has agregado animales");
        }
    }

    /**
     * Método que muestra un mensaje de error.
     *
     * @param mensaje Mensaje que se quiere mostrar.
     */
    private void muestraMsjError(String mensaje) {
        JOptionPane.showMessageDialog(
                this,
                mensaje,
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Método que muestra un mensaje de éxito.
     */
    private void mostrarMsjExito() {
        JOptionPane.showMessageDialog(
                this,
                "Especie registrada con éxito",
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAnimales;
    private javax.swing.JLabel lblDatosEspecie;
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
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCientifico;
    // End of variables declaration//GEN-END:variables
}
