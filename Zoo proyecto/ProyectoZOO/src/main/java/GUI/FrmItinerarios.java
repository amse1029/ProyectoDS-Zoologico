/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Dominio.Animal;
import Dominio.Dias;
import Dominio.Guia;
import Dominio.Horario;
import Dominio.Itinerario;
import Dominio.Recorrido;
import Dominio.Zona;
import itson.Control.FabricaLogica;
import itson.Control.ILogica;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author
 */
public class FrmItinerarios extends javax.swing.JFrame {

    ILogica ctrlItinerario;
    ILogica ctrlAnimales;
    ArrayList<Zona> zonas;
    ArrayList<Guia> guias;
    LinkedList<Object> datos;
    Recorrido recorrido;
    Itinerario itinerario;
    List<Zona> zonaitinerario;
    List<Animal> animalesSeleccionados = new ArrayList<>();

    /**
     * Crea un nuevo formulario FrmItinerarios.
     *
     * @param datos Lista de datos disponibles.
     */
    public FrmItinerarios(LinkedList<Object> datos) {
        this.datos = datos;
        initComponents();
        ctrlItinerario = FabricaLogica.crearInstancia();
        ctrlAnimales = FabricaLogica.crearInstancia();
        this.despliegaDatos(datos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        pnlFondo = new javax.swing.JPanel();
        pnlRegistro = new javax.swing.JPanel();
        lblRegistro = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblDatosItinerario = new javax.swing.JLabel();
        lblNombreCientifico = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        Horarios = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        Horarios1 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        txtVisitantes = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblZonas = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        txtNombreRecorrido = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblGuias = new javax.swing.JTable();
        Horarios3 = new javax.swing.JLabel();
        animales = new javax.swing.JLabel();
        lblDescripcion3 = new javax.swing.JLabel();

        jScrollPane4.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar itinerario");
        setResizable(false);
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
        lblRegistro.setText("Registrar itinerario");
        pnlRegistro.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        pnlFondo.add(pnlRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 70));

        btnBuscar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(106, 69, 4));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        lblDatosItinerario.setBackground(new java.awt.Color(106, 69, 4));
        lblDatosItinerario.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDatosItinerario.setForeground(new java.awt.Color(106, 69, 4));
        lblDatosItinerario.setText("Datos del itinerario:");
        pnlFondo.add(lblDatosItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        lblNombreCientifico.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombreCientifico.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreCientifico.setText("Duración (minutos):");
        pnlFondo.add(lblNombreCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre del recorrido:");
        pnlFondo.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 250, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("Longitud (metros):");
        pnlFondo.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txtDuracion.setEditable(false);
        txtDuracion.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });
        pnlFondo.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 170, 30));

        Horarios.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Horarios.setForeground(new java.awt.Color(255, 255, 255));
        Horarios.setText("Zonas:");
        pnlFondo.add(Horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, -1, -1));

        btnGuardar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(106, 69, 4));
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        Horarios1.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Horarios1.setForeground(new java.awt.Color(255, 255, 255));
        Horarios1.setText("Horarios:");
        pnlFondo.add(Horarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtLongitud.setEditable(false);
        txtLongitud.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        pnlFondo.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 170, 30));

        txtVisitantes.setEditable(false);
        txtVisitantes.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtVisitantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVisitantesKeyTyped(evt);
            }
        });
        pnlFondo.add(txtVisitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 170, 30));

        txtNombre.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 170, 30));

        tblHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia", "Selecciona", "Horas de inicio:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHorarios.getTableHeader().setReorderingAllowed(false);
        tblHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHorariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHorarios);
        if (tblHorarios.getColumnModel().getColumnCount() > 0) {
            tblHorarios.getColumnModel().getColumn(0).setResizable(false);
            tblHorarios.getColumnModel().getColumn(1).setResizable(false);
            tblHorarios.getColumnModel().getColumn(2).setResizable(false);
        }

        pnlFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 350, 140));

        jScrollPane2.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jScrollPane2ComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jScrollPane2ComponentRemoved(evt);
            }
        });

        tblZonas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblZonas.getTableHeader().setReorderingAllowed(false);
        tblZonas.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tblZonasComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                tblZonasComponentRemoved(evt);
            }
        });
        jScrollPane2.setViewportView(tblZonas);
        if (tblZonas.getColumnModel().getColumnCount() > 0) {
            tblZonas.getColumnModel().getColumn(0).setResizable(false);
            tblZonas.getColumnModel().getColumn(1).setResizable(false);
        }

        pnlFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 180, 140));

        btnRegresar.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 20)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(106, 69, 4));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 630, -1, -1));

        txtNombreRecorrido.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        txtNombreRecorrido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreRecorridoKeyTyped(evt);
            }
        });
        pnlFondo.add(txtNombreRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 170, 30));

        lblNombre1.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Nombre:");
        pnlFondo.add(lblNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        tblGuias.setModel(new javax.swing.table.DefaultTableModel(
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
        tblGuias.getTableHeader().setReorderingAllowed(false);
        tblGuias.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                tblGuiasComponentAdded(evt);
            }
        });
        jScrollPane3.setViewportView(tblGuias);
        if (tblGuias.getColumnModel().getColumnCount() > 0) {
            tblGuias.getColumnModel().getColumn(0).setResizable(false);
            tblGuias.getColumnModel().getColumn(1).setResizable(false);
        }

        pnlFondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 180, 140));

        Horarios3.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        Horarios3.setForeground(new java.awt.Color(255, 255, 255));
        Horarios3.setText("Guías:");
        pnlFondo.add(Horarios3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, -1, -1));

        animales.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        animales.setForeground(new java.awt.Color(106, 69, 4));
        animales.setText("Cantidad de animales visitados:");
        pnlFondo.add(animales, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, -1, -1));

        lblDescripcion3.setFont(new java.awt.Font("Segoe Print", 1, 22)); // NOI18N
        lblDescripcion3.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion3.setText("Máximo de visitantes:");
        pnlFondo.add(lblDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        getContentPane().add(pnlFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (this.txtNombre.getText().isBlank() || this.txtNombreRecorrido.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Ecribre el nombre del recorrido e itinerario", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.seleccionaBuscar();
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        this.seleccionaGuardar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHorariosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblHorariosMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmInicial principal = new FrmInicial();
        this.setVisible(false);
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        new FrmInicial().setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (this.txtNombre.getText().length() < 25) {
            validacionCamposAlfabeto(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreRecorridoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreRecorridoKeyTyped
        if (this.txtNombreRecorrido.getText().length() < 25) {
            validacionCamposAlfabeto(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreRecorridoKeyTyped

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        if (this.txtDuracion.getText().length() < 4) {
            validacionNumero(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        if (this.txtLongitud.getText().length() < 5) {
            validacionNumero(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void txtVisitantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVisitantesKeyTyped
        if (this.txtVisitantes.getText().length() < 2) {
            validacionNumero(evt);
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtVisitantesKeyTyped

    private void jScrollPane2ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jScrollPane2ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2ComponentAdded

    private void tblZonasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tblZonasComponentAdded

    }//GEN-LAST:event_tblZonasComponentAdded

    private void jScrollPane2ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jScrollPane2ComponentRemoved
    }//GEN-LAST:event_jScrollPane2ComponentRemoved

    private void tblZonasComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tblZonasComponentRemoved
        acualizarAnimales();
    }//GEN-LAST:event_tblZonasComponentRemoved

    private void tblGuiasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_tblGuiasComponentAdded
        actualizarCampos();
    }//GEN-LAST:event_tblGuiasComponentAdded

    /**
     * Método que actualiza los campos.
     */
    private void actualizarCampos() {
        for (int row = 0; row < this.tblGuias.getRowCount(); row++) {
            boolean selected = (boolean) tblGuias.getValueAt(row, 1);
            if (selected) {
                this.tblGuias.setValueAt(false, row, 1);
            }
        }
    }

    /**
     * Método que actualiza los animales.
     */
    private void acualizarAnimales() {
        animalesSeleccionados.clear();
        for (int row = 0; row < this.tblZonas.getRowCount(); row++) {
            boolean selected = (boolean) tblZonas.getValueAt(row, 1);
            if (selected) {
                String name = (String) tblZonas.getValueAt(row, 0);
                if (zonas.get(row).getNombre() == name) {
                    for (int i = 0; i < zonas.get(row).getEspecieId().size(); i++) {
                        for (int j = 0; j < ctrlItinerario.recupearaAnimales(zonas.get(row).getEspecieId().get(i)).size(); j++) {
                            animalesSeleccionados.add(ctrlItinerario.recupearaAnimales(zonas.get(row).getEspecieId().get(i)).get(j));
                        }
                    }
                }

            }
        }
        this.animales.setText("Cantidad de animales visitados: " + animalesSeleccionados.size());
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
     *
     * Metodo para validar el campo alfabetico.
     *
     * @param evt evento
     */
    public void validacionCamposAlfabeto(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isAlphabetic(txt) || txt == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    /**
     * Método que despliega los datos de un itinerario.
     *
     * @param datos Datos de los itinerarios.
     */
    private void despliegaDatos(LinkedList<Object> datos) {
        this.txtDuracion.setText("");
        this.txtLongitud.setText("");
        this.txtVisitantes.setText("");
        guias = new ArrayList<Guia>((List<Guia>) datos.get(1));
        zonas = new ArrayList<Zona>((List<Zona>) datos.get(0));
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblHorarios.getModel();
        modeloTabla.setRowCount(0);
        Object[] lunes = {"Lunes", false};
        modeloTabla.addRow(lunes);
        Object[] martes = {"Martes", false};
        modeloTabla.addRow(martes);
        Object[] miercoles = {"Miercoles", false};
        modeloTabla.addRow(miercoles);
        Object[] jueves = {"Jueves", false};
        modeloTabla.addRow(jueves);
        Object[] viernes = {"Viernes", false};
        modeloTabla.addRow(viernes);
        Object[] sabado = {"Sabado", false};
        modeloTabla.addRow(sabado);
        Object[] domingo = {"Domingo", false};
        modeloTabla.addRow(domingo);

        DefaultTableModel tablaZonas = (DefaultTableModel) this.tblZonas.getModel();
        DefaultTableModel tablaGuias = (DefaultTableModel) this.tblGuias.getModel();
        tablaZonas.setRowCount(0);
        tablaGuias.setRowCount(0);
        tblGuias.repaint();
        tblZonas.repaint();
        for (int i = 0; i < guias.size(); i++) {
            Object[] guia = {guias.get(i).getNombre(), false};
            tablaGuias.addRow(guia);
        }
        for (int i = 0; i < zonas.size(); i++) {
            Object[] zona = {zonas.get(i).getNombre(), false};
            tablaZonas.addRow(zona);
        }
    }

    /**
     * Método que indica las acciones a seguir cuando el actor selecciona
     * buscar.
     */
    private void seleccionaBuscar() {
        String nombre = this.txtNombre.getText().trim();
        String nombreRecorrido = this.txtNombreRecorrido.getText().trim();
        itinerario = ctrlItinerario.buscarItinerario(nombre);
        recorrido = ctrlItinerario.buscarRecorrido(nombreRecorrido);
        if (itinerario == null) {
            this.animales.setText("Cantidad de animales visitados: ");
            this.despliegaDatos(datos);
            itinerario = new Itinerario();
            if (recorrido == null) {
                this.muestraMsjNoRecorrido();
                recorrido = new Recorrido();
            } else {
                this.muestraMsjNoItinerario();
                this.despliegaDatosRecorrido(recorrido);
            }
        } else {
            this.despliegaDatosItinerario(itinerario);
            if (recorrido == null) {
                recorrido = new Recorrido();
                this.muestraMsjNoRecorrido();
            } else {
                this.despliegaDatosRecorrido(recorrido);
            }
        }
        this.activaCamposRegistro();
    }

    /**
     * Método que activa los campos de registro.
     */
    public void activaCamposRegistro() {
        this.txtDuracion.setEditable(true);
        this.txtLongitud.setEditable(true);
        this.txtVisitantes.setEditable(true);
        this.btnGuardar.setEnabled(true);
    }

    /**
     * Método que despliega los datos de un recorrido.
     *
     * @param recorrido Datos del recorrido.
     */
    private void despliegaDatosRecorrido(Recorrido recorrido) {
        Float duracion = recorrido.getDuracion();
        Float longitud = recorrido.getLongitud();
        zonaitinerario = recorrido.getZonas();
        this.actualizarCampos();
        this.animales.setText("Cantidad de animales visitados: " + this.animalesSeleccionados.size());
        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.tblZonas.getModel();
        modeloTabla2.setRowCount(0);
        tblZonas.repaint();
        for (int i = 0; i < zonas.size(); i++) {
            if (zonaitinerario.contains(zonas.get(i))) {
                Object[] infor = {zonas.get(i).getNombre(), true};
                modeloTabla2.addRow(infor);
            } else {
                Object[] infor = {zonas.get(i).getNombre(), false};
                modeloTabla2.addRow(infor);
            }
        }
        this.txtDuracion.setText(duracion.toString());
        this.txtLongitud.setText(longitud.toString());
    }

    /**
     * Método que despliega los datos de un itinerario.
     *
     * @param itinerario Itinerario del que se desplegaran los datos.
     */
    private void despliegaDatosItinerario(Itinerario itinerario) {
        Integer visitantes = itinerario.getMaxVisitantes();
        Recorrido recorrido = itinerario.getRecorrido();
        List<Horario> horarios = itinerario.getHorarios();

        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblHorarios.getModel();
        for (int i = 0; i < horarios.size(); i++) {
            if (horarios.get(i).getDia().equals(Dias.Lunes)) {
                this.tblHorarios.setValueAt(true, 0, 1);
                this.tblHorarios.setValueAt(horarios.get(i).getHora(), 0, 2);
            }
            if (horarios.get(i).getDia().equals(Dias.Martes)) {
                this.tblHorarios.setValueAt(true, 1, 1);
                this.tblHorarios.setValueAt(horarios.get(i).getHora(), 1, 2);
            }
            if (horarios.get(i).getDia().equals(Dias.Miercoles)) {
                this.tblHorarios.setValueAt(true, 2, 1);
                this.tblHorarios.setValueAt(horarios.get(i).getHora(), 2, 2);
            }
            if (horarios.get(i).getDia().equals(Dias.Jueves)) {
                this.tblHorarios.setValueAt(true, 3, 1);
                this.tblHorarios.setValueAt(horarios.get(i).getHora(), 3, 2);
            }
            if (horarios.get(i).getDia().equals(Dias.Viernes)) {
                this.tblHorarios.setValueAt(true, 4, 1);
                this.tblHorarios.setValueAt(horarios.get(i).getHora(), 4, 2);
            }
            if (horarios.get(i).getDia().equals(Dias.Sabado)) {
                this.tblHorarios.setValueAt(true, 5, 1);
                this.tblHorarios.setValueAt(horarios.get(i).getHora(), 5, 2);
            }
            if (horarios.get(i).getDia().equals(Dias.Domingo)) {
                this.tblHorarios.setValueAt(true, 6, 1);
                this.tblHorarios.setValueAt(horarios.get(i).getHora(), 6, 2);
            }
        }
        DefaultTableModel modeloTabla2 = (DefaultTableModel) this.tblGuias.getModel();
        modeloTabla2.setRowCount(0);
        tblGuias.repaint();
        for (int i = 0; i < guias.size(); i++) {
            if (itinerario.getGuia().equals(guias.get(i))) {
                Object[] infor = {guias.get(i).getNombre(), true};
                modeloTabla2.addRow(infor);
            } else {
                Object[] infor = {guias.get(i).getNombre(), false};
                modeloTabla2.addRow(infor);
            }
        }

        this.txtVisitantes.setText(visitantes.toString());

    }

    /**
     * Método que muestra un mensaje cuando el itinerario no existe.
     */
    private void muestraMsjNoItinerario() {
        JOptionPane.showMessageDialog(this, "No existe itinerario", "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Método que valida el formato de un número.
     *
     * @param numero Número que se quiere validar.
     * @return true si el formato es correcto, false en caso contrario.
     */
    private boolean validaNumero(String numero) {
        String FLOAT_PATTERN = "^[-+]?\\d*\\.?\\d+$";
        Pattern pattern = Pattern.compile(FLOAT_PATTERN);
        Matcher matcher = pattern.matcher(numero);
        return matcher.matches();
    }

    /**
     * Método que indica las acciones a seguir cuando el actor selecciona
     * guardar.
     */
    private void seleccionaGuardar() {
        DefaultTableModel modeloTabla = (DefaultTableModel) this.tblHorarios.getModel();
        float duracion = Float.parseFloat(this.txtDuracion.getText().trim());
        float longitud = Float.parseFloat(this.txtLongitud.getText().trim());
        int visitantes = Integer.parseInt(this.txtVisitantes.getText().trim());
        String nombre = this.txtNombre.getText().trim();
        for (int i = 0; i < modeloTabla.getColumnCount(); i++) {
            if ((boolean) this.tblHorarios.getValueAt(i, 1) && modeloTabla.getValueAt(i, 2) == null) {
                JOptionPane.showMessageDialog(this, "Seleccione correctamente el horario");
                return;
            } else {

            }
        }
        if (this.validaNumero(this.txtDuracion.getText().trim())) {
            if (this.validaNumero(this.txtLongitud.getText().trim())) {
                if (this.validaNumero(this.txtVisitantes.getText().trim())) {
                    if (this.txtNombre.getText().isBlank() || this.txtNombreRecorrido.getText().isBlank()) {
                        JOptionPane.showMessageDialog(this, "Verifique que los nombres no esten vacios");
                        return;
                    } else {

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Los visitantes no son correctos");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "La longitud no es correcta");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(this, "La duracion no es correcta");
            return;
        }
        List<Horario> horarios = new ArrayList<>();
        if ((boolean) this.tblHorarios.getValueAt(0, 1)) {
            Horario horario = new Horario();
            horario.setDia(Dias.Lunes);
            horario.setHora(this.tblHorarios.getValueAt(0, 2).toString());
            horarios.add(horario);
        }
        if ((boolean) this.tblHorarios.getValueAt(1, 1)) {
            Horario horario = new Horario();
            horario.setDia(Dias.Martes);
            horario.setHora(this.tblHorarios.getValueAt(1, 2).toString());
            horarios.add(horario);
        }
        if ((boolean) this.tblHorarios.getValueAt(2, 1)) {
            Horario horario = new Horario();
            horario.setDia(Dias.Miercoles);
            horario.setHora(this.tblHorarios.getValueAt(2, 2).toString());
            horarios.add(horario);
        }
        if ((boolean) this.tblHorarios.getValueAt(3, 1)) {
            Horario horario = new Horario();
            horario.setDia(Dias.Jueves);
            horario.setHora(this.tblHorarios.getValueAt(3, 2).toString());
            horarios.add(horario);
        }
        if ((boolean) this.tblHorarios.getValueAt(4, 1)) {
            Horario horario = new Horario();
            horario.setDia(Dias.Viernes);
            horario.setHora(this.tblHorarios.getValueAt(4, 2).toString());
            horarios.add(horario);
        }
        if ((boolean) this.tblHorarios.getValueAt(5, 1)) {
            Horario horario = new Horario();
            horario.setDia(Dias.Sabado);
            horario.setHora(this.tblHorarios.getValueAt(5, 2).toString());
            horarios.add(horario);
        }
        if ((boolean) this.tblHorarios.getValueAt(6, 1)) {
            Horario horario = new Horario();
            horario.setDia(Dias.Domingo);
            horario.setHora(this.tblHorarios.getValueAt(6, 2).toString());
            horarios.add(horario);
        }
        if (horarios.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecciona un horario");
            return;
        } else {
            for (int i = 0; i < horarios.size(); i++) {

                if (this.validaHoras(horarios.get(i).getHora())) {

                } else {
                    JOptionPane.showMessageDialog(this, "Las horas deben de cumplir con el siguiente formato: hh:mm, \n y en caso de que sean varias deben estar separadas por comas sin ningun espacio");
                    return;
                }
            }
        }
        List<Zona> zona = new ArrayList<>();
        for (int i = 0; i < this.tblZonas.getRowCount(); i++) {
            if ((boolean) this.tblZonas.getValueAt(i, 1)) {
                zona.add(zonas.get(i));
            }
        }
        if (zona.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecciona un zona");
            return;
        } else {

        }
        Guia guia = new Guia();
        for (int i = 0; i < this.tblGuias.getRowCount(); i++) {
            if ((boolean) this.tblGuias.getValueAt(i, 1)) {
                guia = guias.get(i);
            }
        }
        if (guia.getId() == null) {
            JOptionPane.showMessageDialog(this, "Selecciona un guia");
            return;
        } else {

        }
        //Itinerario itinerario=new Itinerario();
        //Recorrido recorrido=new Recorrido();
        itinerario.setTotalEspecies(animalesSeleccionados.size());
        itinerario.setNombreItinerario(nombre);
        recorrido.setDuracion(duracion);
        itinerario.setMaxVisitantes(visitantes);
        itinerario.setHorarios(horarios);
        itinerario.setGuia(guia);
        recorrido.setLongitud(longitud);
        recorrido.setNombre(this.txtNombreRecorrido.getText().trim());
        recorrido.setZonas(zona);
        boolean exito = itinerario.verificacion(nombre, visitantes, horarios);
        Itinerario itinerarioAux = ctrlItinerario.buscarItinerario(nombre);
        if (itinerarioAux == null) {
            ctrlItinerario.guardarItinerario(itinerario, recorrido);
            this.muestraMsjExito();
            this.dispose();
            new FrmInicial().setVisible(true);
        } else {
            this.muestraMsjError();
        }
    }

    /**
     * Método que valida el formato de una hora.
     *
     * @param horas Hora que se quiere validar.
     * @return true si el formato es correcto, false en caso contrario.
     */
    public boolean validaHoras(String horas) {
        String HORA_PATTERN = "^([0-1]?[0-9]|2[0-3]):([0-5][0-9])(,([0-1]?[0-9]|2[0-3]):([0-5][0-9]))*$";
        Pattern pattern = Pattern.compile(HORA_PATTERN);
        Matcher matcher = pattern.matcher(horas);
        return matcher.matches();
    }

    /**
     * Método que muestra un mensaje de error.
     */
    private void muestraMsjError() {
        JOptionPane.showMessageDialog(this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Método que muestra un mensaje de éxito.
     */
    private void muestraMsjExito() {
        JOptionPane.showMessageDialog(this, "Itinerario registrado con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Horarios;
    private javax.swing.JLabel Horarios1;
    private javax.swing.JLabel Horarios3;
    private javax.swing.JLabel animales;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblDatosItinerario;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion3;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombreCientifico;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTable tblGuias;
    private javax.swing.JTable tblHorarios;
    private javax.swing.JTable tblZonas;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreRecorrido;
    private javax.swing.JTextField txtVisitantes;
    // End of variables declaration//GEN-END:variables

    private void muestraMsjNoRecorrido() {
        JOptionPane.showMessageDialog(this, "No existe Recorrido", "Información", JOptionPane.INFORMATION_MESSAGE);

    }

}
