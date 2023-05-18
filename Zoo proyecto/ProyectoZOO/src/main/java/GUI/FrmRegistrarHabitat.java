/**
 * FrmRegistrarHabitat.java
 * May 9, 2023 12:21:18 AM
 *
 */
package GUI;

import Dominio.Clima;
import Dominio.Continente;
import Dominio.Habitat;
import Dominio.Vegetacion;
import itson.Control.FabricaLogica;
import itson.Control.ILogica;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.types.ObjectId;

/**
 * Descripción de la clase:
 *
 * @author
 */
public class FrmRegistrarHabitat extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegistrarHabitat
     */
    ArrayList<Continente> seleccionados = new ArrayList<>();
    ArrayList<Continente> disponibles = new ArrayList<>();
    List<Object> arreglo;
    int tamSel = 0;
    int tamDis = 0;
    ILogica ctrlHabitat = FabricaLogica.crearInstancia();
    /**
     * Metodo constructor que incializa el frame
     * @param arreglo esun arreglo con los datos de cliima y vegetacion
     */
    public FrmRegistrarHabitat(List<Object> arreglo) {
        this.arreglo = arreglo;
        disponibles = new ArrayList<Continente>((List<Continente>) arreglo.get(0));
        tamDis = disponibles.size();
        initComponents();
        this.despliegaDatos(arreglo);
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
        btnGuardar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        lblContinente = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblClima = new javax.swing.JLabel();
        cbxClimas = new javax.swing.JComboBox<>();
        lblVegetacion = new javax.swing.JLabel();
        cbxVegetacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSeleccionados = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDisponibles = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        lblDatosHabitat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar hábitat");
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
        lblRegistro.setText("Registro hábitat");
        pnlRegistro.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlFondo.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 70));

        btnGuardar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(106, 69, 4));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        btnVerificar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnVerificar.setForeground(new java.awt.Color(106, 69, 4));
        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, 30));

        lblContinente.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblContinente.setForeground(new java.awt.Color(255, 255, 255));
        lblContinente.setText("Continente:");
        pnlFondo.add(lblContinente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        txtNombre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 170, 40));

        lblNombre1.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Nombre hábitat:");
        pnlFondo.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblClima.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblClima.setForeground(new java.awt.Color(255, 255, 255));
        lblClima.setText("Clima:");
        pnlFondo.add(lblClima, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        cbxClimas.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(cbxClimas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 260, 40));

        lblVegetacion.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblVegetacion.setForeground(new java.awt.Color(255, 255, 255));
        lblVegetacion.setText("Vegetación:");
        pnlFondo.add(lblVegetacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        cbxVegetacion.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pnlFondo.add(cbxVegetacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 240, 40));

        tblSeleccionados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Continente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSeleccionados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblSeleccionados);
        if (tblSeleccionados.getColumnModel().getColumnCount() > 0) {
            tblSeleccionados.getColumnModel().getColumn(0).setResizable(false);
        }

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 180, 110));

        tblDisponibles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Continente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDisponibles.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblDisponibles);
        if (tblDisponibles.getColumnModel().getColumnCount() > 0) {
            tblDisponibles.getColumnModel().getColumn(0).setResizable(false);
        }

        pnlFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 180, 110));

        btnEliminar.setText(">");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        btnAgregar.setText("<");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        btnRegresar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(106, 69, 4));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        lblDatosHabitat.setBackground(new java.awt.Color(106, 69, 4));
        lblDatosHabitat.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDatosHabitat.setForeground(new java.awt.Color(106, 69, 4));
        lblDatosHabitat.setText("Datos del hábitat:");
        pnlFondo.add(lblDatosHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.seleccionaGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        this.seleccionaVerificar();
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.seleccionaEliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        int indice = this.tblDisponibles.getSelectedRow();
        if (indice != -1 && tamDis > 0) {
            seleccionados.add(disponibles.get(indice));
            disponibles.remove(indice);
            DefaultTableModel model = (DefaultTableModel) tblSeleccionados.getModel();
            Object[] row = {(Object) tblDisponibles.getValueAt(indice, 0)};
            model.addRow(row);
            DefaultTableModel model2 = (DefaultTableModel) tblDisponibles.getModel();
            if (model2.getRowCount() > 0) {
                model2.removeRow(indice);
            }
            tamDis--;
            tamSel++;
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new FrmInicial().setVisible(true);

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char key = evt.getKeyChar();
        if (this.txtNombre.getText().length() < 30) {
            if ((!Character.isLetter(key)) && key != KeyEvent.VK_SPACE) {
                evt.consume();
            }
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new FrmInicial().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    /**
     * Método que indica las acciones a seguir cuando el actor selecciona
     * "Eliminar".
     */
    public void seleccionaEliminar() {
        // TODO add your handling code here:
        int indice = this.tblSeleccionados.getSelectedRow();
        if (indice != -1 && tamSel > 0) {
            disponibles.add(seleccionados.get(indice));
            seleccionados.remove(indice);
            DefaultTableModel model = (DefaultTableModel) tblDisponibles.getModel();
            Object[] row = {(Object) tblSeleccionados.getValueAt(indice, 0)};
            model.addRow(row);
            DefaultTableModel model2 = (DefaultTableModel) tblSeleccionados.getModel();
            if (model2.getRowCount() > 0) {
                model2.removeRow(indice);
            }
            tamSel--;
            tamDis++;
        }
    }

    /**
     * Método que despliega los datos de los hábitats.
     *
     * @param arreglo Arreglo con los datos de los hábitats.
     */
    public void despliegaDatos(List<Object> arreglo) {
        ArrayList<Clima> climas = new ArrayList<Clima>((List<Clima>) arreglo.get(2));
        for (int i = 0; i < climas.size(); i++) {
            this.cbxClimas.addItem(climas.get(i).getNombre());
        }
        ArrayList<Vegetacion> vegetaciones
                = new ArrayList<Vegetacion>((List<Vegetacion>) arreglo.get(1));;
        for (int i = 0; i < vegetaciones.size(); i++) {
            this.cbxVegetacion.addItem(vegetaciones.get(i).getNombre());
        }
        ArrayList<Continente> continentes
                = new ArrayList<Continente>((List<Continente>) arreglo.get(0));
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblDisponibles.getModel();
        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.tblSeleccionados.getModel();
        modeloTabla2.setRowCount(0);
        modeloTabla.setRowCount(0);
        for (int i = 0; i < continentes.size(); i++) {
            Object[] fila = {continentes.get(i).getNombre()};
            modeloTabla.addRow(fila);
        }
    }

    /**
     * Método que indica las acciones a seguir cuando el actor selecciona
     * "Verificar".
     */
    public void seleccionaVerificar() {
        if (this.txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(
                    this,
                    "No se ha ingresado ningún nombre de hábitat");
        } else {
            Habitat habitat = ctrlHabitat.buscarHabitat(this.txtNombre.getText().trim());
            if (habitat == null) {
                this.activaCamposRegistro();
                this.despliegaDatos(arreglo);
            } else {
                this.desactivarCamposRegistro();
                this.despliegaHabitatExistente(habitat);
            }
        }
    }

    /**
     * Método que despliega la información de un hábitat existente.
     *
     * @param habitat Hábitat existente.
     */
    public void despliegaHabitatExistente(Habitat habitat) {
        JOptionPane.showMessageDialog(
                this,
                "El hábitat ya existe, por lo que no se puede dar de alta");
        this.seleccionados = new ArrayList<>(habitat.getContinentes());
        this.cbxClimas.removeAllItems();
        this.cbxClimas.addItem(habitat.getClima().getNombre());
        this.cbxVegetacion.removeAllItems();
        this.cbxVegetacion.addItem(habitat.getVegetacion().getNombre());
        DefaultTableModel modelDisponibles = (DefaultTableModel) tblDisponibles.getModel();
        modelDisponibles.setRowCount(0);
        DefaultTableModel modelSeleccionados = (DefaultTableModel) tblSeleccionados.getModel();
        modelSeleccionados.setRowCount(0);
        this.llenarContinenteSelect();
    }

    /**
     * Método que activa los campos de registro.
     */
    public void activaCamposRegistro() {
        this.btnEliminar.setEnabled(true);
        this.btnAgregar.setEnabled(true);
        this.btnGuardar.setEnabled(true);
    }

    /**
     * Método que desactiva los campos de registro.
     */
    public void desactivarCamposRegistro() {
        this.btnEliminar.setEnabled(false);
        this.btnAgregar.setEnabled(false);
        this.btnGuardar.setEnabled(false);
        this.cbxClimas.removeAllItems();
        this.cbxVegetacion.removeAllItems();
    }

    /**
     * Método que llena la tabla con los continentes seleccionadas.
     */
    public void llenarContinenteSelect() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblSeleccionados.getModel();
        for (int i = 0; i < seleccionados.size(); i++) {
            Object[] fila = {seleccionados.get(i).getNombre()};
            modeloTabla.addRow(fila);
        }
    }

    /**
     * Método que determina lo que pasa cuando el actor selecciona guardar.
     */
    public void seleccionaGuardar() {
        Clima clima = null;
        Vegetacion vegetacion = null;
        if (this.cbxClimas.getSelectedIndex() != -1) {
            clima = new Clima(new ObjectId(),
                    cbxClimas.getSelectedItem().toString());
        }
        if (this.cbxVegetacion.getSelectedIndex() != -1) {
            vegetacion = new Vegetacion(
                    this.cbxVegetacion.getSelectedItem().toString(), new ObjectId());
        }
        String nombre = "" + this.txtNombre.getText().trim();
        Habitat habitat = new Habitat();
        boolean valida = habitat.verificacion(nombre, clima, vegetacion, seleccionados);
        if (valida) {
            boolean bandera = ctrlHabitat.guardarHabitat(habitat);
            if (!bandera) {
                this.muestraMsjError();
            } else {
                this.muestraMsjExito();
                this.dispose();
                new FrmInicial().setVisible(true);
            }
        } else {
            this.muestraMsjCamposVacios();
        }
    }

    /**
     * Método que muestra un mensaje de error cuando el hábitat ya existe.
     */
    public void muestraMsjError() {
        JOptionPane.showMessageDialog(
                this,
                "Ya existe un hábitat con ese nombre",
                "Error",
                JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Método que muestra un mensaje de error cuando el hábitat ya existe.
     */
    public void muestraMsjCamposVacios() {
        JOptionPane.showMessageDialog(
                this,
                "Campos vacíos",
                "Error",
                JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Método que muestra un mensaje de éxito cuando se registra el hábitat.
     */
    public void muestraMsjExito() {
        JOptionPane.showMessageDialog(
                this,
                "Hábitat registrada con éxito",
                "Éxito",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox<String> cbxClimas;
    private javax.swing.JComboBox<String> cbxVegetacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClima;
    private javax.swing.JLabel lblContinente;
    private javax.swing.JLabel lblDatosHabitat;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblVegetacion;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTable tblDisponibles;
    private javax.swing.JTable tblSeleccionados;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
