/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JOptionPane;
import modelo.Libros;
import modelo.libre;

/**
 *
 * @author asus
 */
public class Libreria extends javax.swing.JFrame {

    /**
     * Creates new form Libreria
     */
    public Libreria() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnumlibros = new javax.swing.JTextField();
        btnCrearLibreria = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtcodigolibro = new javax.swing.JTextField();
        txtnombrelibro = new javax.swing.JTextField();
        txtautor = new javax.swing.JTextField();
        txteditorial = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtmateria = new javax.swing.JTextField();
        txtanio = new javax.swing.JTextField();
        txtcopias = new javax.swing.JTextField();
        btninsertar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        lstbusqueda = new java.awt.List();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btnmodi = new javax.swing.JButton();
        btnborrar = new javax.swing.JButton();
        btnordenar = new javax.swing.JButton();
        lstlibros = new java.awt.List();
        cmbdisponibilidad = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnordenar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("INGRESE EL NÚMERO DE LIBROS QUE DESEA INGRESAR:");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\asus\\Documents\\NetBeansProjects\\LIBRERIA\\src\\vista\\images.jpg")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("BIENVENIDO A LIBRERIA VIRTUAL PEGASUS");

        txtnumlibros.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        btnCrearLibreria.setBackground(new java.awt.Color(255, 255, 153));
        btnCrearLibreria.setFont(new java.awt.Font("Kristen ITC", 1, 11)); // NOI18N
        btnCrearLibreria.setForeground(new java.awt.Color(0, 0, 102));
        btnCrearLibreria.setText("Crear Libreria");
        btnCrearLibreria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearLibreriaActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Libro:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 11), new java.awt.Color(51, 0, 51))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Ingresa el Codigo:");

        jLabel9.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setText("Ingresa el Nombre:");

        jLabel10.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 51));
        jLabel10.setText("Ingresa el Autor:");

        jLabel11.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 51));
        jLabel11.setText("Ingresa la Editorial:");

        txtcodigolibro.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        txtnombrelibro.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        txtautor.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        txteditorial.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 0, 51));
        jLabel12.setText("Ingresa la Materia:");

        jLabel13.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 51));
        jLabel13.setText("Ingresa el Año de Edicion:");

        jLabel14.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 0, 51));
        jLabel14.setText("Ingresa el Número de copias:");

        txtmateria.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        txtanio.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        txtcopias.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        btninsertar.setText("INSERTAR");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });

        jButton4.setText("BORRAR");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda y Modificacion de Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kristen ITC", 1, 11), new java.awt.Color(51, 0, 51))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel15.setText("Ingresa el codigo del Libro");

        lstbusqueda.setBackground(new java.awt.Color(255, 255, 255));

        txtbuscar.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N

        btnbuscar.setBackground(new java.awt.Color(255, 255, 153));
        btnbuscar.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        btnbuscar.setForeground(new java.awt.Color(0, 0, 102));
        btnbuscar.setText("Busqueda");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btnmodi.setText("MODIFICAR");

        btnborrar.setText("BORRAR");
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lstbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbuscar)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnborrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnmodi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnmodi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnborrar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lstbusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnordenar.setText("ORDENAR");
        btnordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenarActionPerformed(evt);
            }
        });

        cmbdisponibilidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Prestado" }));

        jLabel16.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 0, 51));
        jLabel16.setText("Selecciona Disponibilidad: ");

        btnordenar1.setText("Dta prueba");
        btnordenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnordenar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigolibro, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(txtautor))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtnombrelibro, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txteditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(23, 23, 23))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbdisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtanio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel14))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(btninsertar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnordenar))
                                            .addComponent(btnordenar1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcopias, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(lstlibros, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(640, 640, 640)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcodigolibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtnombrelibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtautor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txteditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(txtcopias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnordenar)
                                .addComponent(btninsertar))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbdisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnordenar1)
                        .addGap(1, 1, 1)
                        .addComponent(lstlibros, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnumlibros, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrearLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(232, 232, 232))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnumlibros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearLibreria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
libre objLibreria;
    private void btnCrearLibreriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearLibreriaActionPerformed
        // TODO add your handling code here:
        int nClientes = Integer.parseInt(txtnumlibros.getText());
        objLibreria = new libre(nClientes);
        btnCrearLibreria.setEnabled(false);
        btninsertar.setEnabled(true);
    }//GEN-LAST:event_btnCrearLibreriaActionPerformed
    //posicion=psc
    int psc = 0;
    
    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        // TODO add your handling code here:
        lstbusqueda.removeAll();
        int conta = 0;
        btnmodi.setEnabled(false);
        int id = Integer.parseInt(txtbuscar.getText());
        for (int i = 0; i < objLibreria.getTam(); i++) {
            if (objLibreria.vecCta[i].getCódigo() == id) {
                psc = i;
                conta++;
                mostrarDatos2();
                btnmodi.setEnabled(true);
            }
        }
        if (conta == 0) {
            JOptionPane.showMessageDialog(null, "Libro no encontrado no");
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    public void limpiar() {
        txtcodigolibro.setText(null);
        txtnombrelibro.setText("");
        txtautor.setText(null);
        txteditorial.setText(null);
        txtmateria.setText(null);
        txtanio.setText(null);
        txtcopias.setText(null);
        lstbusqueda.removeAll();
        lstlibros.removeAll();
        txtbuscar.setText(null);
    }

    public void mostrarDatos1() {
        lstlibros.removeAll();
        for (int i = 0; i < objLibreria.getTam(); i++) {

            lstlibros.add("Codigo:" + objLibreria.vecCta[i].getCódigo());
            lstlibros.add("Nombre:" + objLibreria.vecCta[i].getNombre());
            lstlibros.add("Autor:" + objLibreria.vecCta[i].getAutor());
            lstlibros.add("Editorial:" + objLibreria.vecCta[i].getEditorial());
            lstlibros.add("Materia:" + objLibreria.vecCta[i].getMateria());
            lstlibros.add("Año de edicion:" + objLibreria.vecCta[i].getAnioedi());
            lstlibros.add("Numero de copias:" + objLibreria.vecCta[i].getNúmcopias());
            lstlibros.add("************************************");
        }
    }

    public void mostrarDatos2() {
        lstbusqueda.add("Codigo: " + objLibreria.vecCta[psc].getCódigo());
        lstbusqueda.add("Nombre del Libro: " + objLibreria.vecCta[psc].getNombre());
        lstbusqueda.add("Autor : " + objLibreria.vecCta[psc].getAutor());
        lstbusqueda.add("Disponibilidad: " + objLibreria.vecCta[psc].getDisponibilidad());
        lstlibros.add("************************************");

    }

    Libros objlib;
    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        // TODO add your handling code here:
        int cod = Integer.parseInt(txtcodigolibro.getText());
        String nom = txtnombrelibro.getText();
        String autor = txtautor.getText();
        String edi = txteditorial.getText();
        String mat = txtmateria.getText();
        String anio = txtanio.getText();
        int numcopi = Integer.parseInt(txtcopias.getText());
        String tipo = cmbdisponibilidad.getSelectedItem().toString();
        objlib = new Libros(cod, nom, autor, edi, mat, anio, numcopi, tipo);
        objLibreria.agregaCuenta(objlib);
        limpiar();
        mostrarDatos1();
        JOptionPane.showMessageDialog(this, "Libro ingresado con Exito..!!");

    }//GEN-LAST:event_btninsertarActionPerformed
    public void Pruebadatos() {
        objLibreria = new libre(4);
        int cod = 4321;
        String nom = "la rosa roja";
        String autor = "paolo";
        String edi = "pos";
        String mat = "romance";
        String anio = "2008";
        int numcopi = 4;
        String tipo = "disponible";
        objlib = new Libros(cod, nom, autor, edi, mat, anio, numcopi, tipo);
        objLibreria.agregaCuenta(objlib);
        int cod2 = 36987;
        String nom2 = "los versos mastristes";
        String autor2 = "pablo neruda";
        String edi2 = "manhatan";
        String mat2 = "romance";
        String anio2 = "1997";
        int numcopi2 = 6;
        String tipo2 = "Prestado";
        Libros objlib2 = new Libros(cod2, nom2, autor2, edi2, mat2, anio2, numcopi2, tipo2);
        objLibreria.agregaCuenta(objlib2);
        int cod3 = 2142;
        String nom3 = "los versos mastristes";
        String autor3 = "pablo neruda";
        String edi3 = "manhatan";
        String mat3 = "romance";
        String anio3 = "1997";
        int numcopi3 = 1;
        String tipo3 = "Prestado";
        Libros objlib3 = new Libros(cod3, nom3, autor3, edi3, mat3, anio3, numcopi3, tipo3);
        objLibreria.agregaCuenta(objlib3);
        int cod4 = 2142;
        String nom4 = "el corazon en la copa de oror";
        String autor4 = "pablo neruda";
        String edi4 = "manhatan";
        String mat4 = "romance";
        String anio4 = "2008";
        int numcopi4 = 3;
        String tipo4 = "Prestado";
        objlib = new Libros(cod4, nom4, autor4, edi4, mat4, anio4, numcopi4, tipo);
    }
    private void btnordenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordenar1ActionPerformed
        // TODO add your handling code here:
        Pruebadatos();
        mostrarDatos1();
    }//GEN-LAST:event_btnordenar1ActionPerformed

    private void btnordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnordenarActionPerformed
        // TODO add your handling code here:
         objLibreria.ordSelDesc(objLibreria.vecCta);
            mostrarDatos1();
      
    }//GEN-LAST:event_btnordenarActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnborrarActionPerformed

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
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libreria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libreria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearLibreria;
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JButton btnmodi;
    private javax.swing.JButton btnordenar;
    private javax.swing.JButton btnordenar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbdisponibilidad;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.List lstbusqueda;
    private java.awt.List lstlibros;
    private javax.swing.JTextField txtanio;
    private javax.swing.JTextField txtautor;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcodigolibro;
    private javax.swing.JTextField txtcopias;
    private javax.swing.JTextField txteditorial;
    private javax.swing.JTextField txtmateria;
    private javax.swing.JTextField txtnombrelibro;
    private javax.swing.JTextField txtnumlibros;
    // End of variables declaration//GEN-END:variables
}
