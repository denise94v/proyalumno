/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class frmEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form frmEstudiantes
     */
    public frmEstudiantes() {
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

        btnDatosPrueba = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAgregarE = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNMaterias = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCodMate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreMate = new javax.swing.JTextField();
        btnAgregarMateria = new javax.swing.JButton();
        txtNota1 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscarEstudiante = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscarM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lstDatos = new java.awt.List();
        jPanel3 = new javax.swing.JPanel();
        lstDatos1 = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDatosPrueba.setText("Datos de prueba");
        btnDatosPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosPruebaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos estudiante"));

        btnAgregarE.setText("Grabar estudiante");
        btnAgregarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEActionPerformed(evt);
            }
        });

        jLabel1.setText("Cédula:");

        jLabel2.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Nro. Materias:");

        jLabel5.setText("Cóedigo Materia:");

        jLabel6.setText("Nombre Materia:");

        btnAgregarMateria.setText("Grabar Materia");
        btnAgregarMateria.setEnabled(false);
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nota 1:");

        jLabel8.setText("Nota 2:");

        jLabel9.setText("Nota 3:");

        btnBuscarEstudiante.setText("Buscar");
        btnBuscarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEstudianteActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscarM.setText("BuscarM");
        btnBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgregarE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNombre)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarEstudiante)
                                .addGap(0, 60, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreMate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodMate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarM))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtNota3)
                                            .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addComponent(btnModificar))
                                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregarMateria))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarEstudiante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarM))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreMate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarMateria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Numero de estudiantes:");

        jButton1.setText("Crear");

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiante Ingresados"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Estudiante a modificar"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnDatosPrueba)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnImprimir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDatosPrueba)
                    .addComponent(btnImprimir))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Curso objCur1;

    public void imprimirTodos() {
        lstDatos.removeAll();
        for (int i = 0; i < objCur1.tamE; i++) {

            lstDatos.add("ESTUDIANTE=" + objCur1.vecEstu[i].getNombre());
            lstDatos.add("Cedula=" + objCur1.vecEstu[i].getCedula());
            for (int j = 0; j < objCur1.vecEstu[i].tamM; j++) {
                lstDatos.add(objCur1.vecEstu[i].vecMate[j].imprimir());
                
            }
            lstDatos.add("*****************************");
                lstDatos.add("");
        }
    }

    public void imprimirIndividual(int pos) {
        lstDatos1.removeAll();
        lstDatos1.add("ESTUDIANTE=" + objCur1.vecEstu[pos].getNombre());
        for (int j = 0; j < objCur1.vecEstu[pos].tamM; j++) {
            lstDatos1.add(objCur1.vecEstu[pos].vecMate[j].imprimir());
        }

    }
    public void imprimirIndividual1(int pos) {
        lstDatos1.removeAll();
        lstDatos1.add("ESTUDIANTE=" + objCur1.vecEstu[pos].getNombre());
        for (int j = 0; j < objCur1.vecEstu[pos].tamM; j++) {
            lstDatos1.add(objCur1.vecEstu[pos].vecMate[j].imprimir());
        }

    }

    private void btnDatosPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosPruebaActionPerformed
        // TODO add your handling code here:
        int nEstu = 10;
        objCur1 = new Curso("SD1A", nEstu);
        Materia objMate1 = new Materia("M1", "FISICA", 6, 5, 8);
        Materia objMate2 = new Materia("M6", "INGLES", 9, 9, 8);
        Materia objMate3 = new Materia("P666", "PROGRA", 2, 5.6, 4);
        Materia objMate4 = new Materia("BDD", "BASES DE DATO", 2, 7, 4);

        Estudiante objEstu1 = new Estudiante("1002003001",
                "PEPITO", 4);
        objCur1.agregaEstudiante(objEstu1);
        objEstu1.agregarMateria(objMate1);
        objEstu1.agregarMateria(objMate2);
        objEstu1.agregarMateria(objMate3);
        objEstu1.agregarMateria(objMate4);

        Estudiante objEstu2 = new Estudiante("666", "RENE", 2);
        objCur1.agregaEstudiante(objEstu2);
        Materia objMate11 = new Materia("M1", "FISICA", 8, 5, 8);
        Materia objMate12 = new Materia("M7", "CONTA", 7, 10, 2);

        objEstu2.agregarMateria(objMate11);
        objEstu2.agregarMateria(objMate12);

        //imprimir libreta
        imprimirTodos();

    }//GEN-LAST:event_btnDatosPruebaActionPerformed

    private void btnAgregarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEActionPerformed
        // TODO add your handling code here:
        int nmates = Integer.parseInt(txtNMaterias.getText());
        String ced = txtCedula.getText();
        String nom = txtNombre.getText();
        Estudiante estu = new Estudiante(ced, nom, nmates);
        objCur1.agregaEstudiante(estu);
        btnAgregarMateria.setEnabled(true);
    }//GEN-LAST:event_btnAgregarEActionPerformed

    public void limpiarMateria() {
        txtCodMate.setText(null);
        txtNombreMate.setText(null);
        txtNota1.setText(null);
        txtNota2.setText(null);
        txtNota3.setText(null);
        txtCodMate.requestFocus();
    }

    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        // TODO add your handling code here:
        int posE = objCur1.tamE - 1;
        int nMates = objCur1.vecEstu[posE].nMaterias;
        String codMate = txtCodMate.getText();
        String nomMate = txtNombreMate.getText();
        double n1 = Double.parseDouble(txtNota1.getText());
        double n2 = Double.parseDouble(txtNota2.getText());
        double n3 = Double.parseDouble(txtNota3.getText());
        Materia mate = new Materia(codMate, nomMate, n1, n2, n3);
        objCur1.vecEstu[posE].agregarMateria(mate);
        limpiarMateria();
        if (objCur1.vecEstu[posE].tamM >= nMates) {
            btnAgregarMateria.setEnabled(false);
        }

    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        imprimirTodos();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnBuscarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEstudianteActionPerformed
        // TODO add your handling code here:
        String cedBuscar = txtCedula.getText();
        int posEncotrada = objCur1.buscarEstudiante(cedBuscar);
        if (posEncotrada >= 0) {
            imprimirIndividual(posEncotrada);
            txtNombre.setEnabled(false);
            btnBuscarEstudiante.setEnabled(false);
        } else {
            btnBuscarEstudiante.setEnabled(true);
        }

    }//GEN-LAST:event_btnBuscarEstudianteActionPerformed

    
//         public int buscarMateria(String CodigoM){
//        int posM=-1;
//        for(int i=0;i<objCur1.vecEstu[posE].tamM;i++){
//            if(vecEstu[i].getCedula().equals(CodigoM)){
//                posM=i;
//            }
//        }
//        return posM;
//    }
         
         
        int posM=-1; 
    private void btnBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarMActionPerformed
        // TODO add your handling code here:
         String cedBuscar = txtCedula.getText();
        int posEncotrada = objCur1.buscarEstudiante(cedBuscar);
        
        String CodigoM = txtCodMate.getText();
        
        for(int i=0;i<objCur1.vecEstu[posEncotrada].tamM;i++){
            if(objCur1.vecEstu[posEncotrada].vecMate[i].getCodMate().equals(CodigoM)){
                posM=i;
            }
      
        }
        
        lstDatos1.add("ESTUDIANTE=" + objCur1.vecEstu[posEncotrada].getNombre());
            lstDatos1.add("Cedula=" + objCur1.vecEstu[posEncotrada].getCedula());
            for (int j = 0; j < objCur1.vecEstu[posEncotrada].tamM; j++) {
                lstDatos1.add(objCur1.vecEstu[posEncotrada].vecMate[j].imprimir());
                
            }
            lstDatos1.add("*****************************");
                lstDatos1.add("");
        
        
//        if (posEncotrada >= 0) {
//            imprimirIndividual(posEncotrada);
//            txtNombre.setEnabled(false);
//            btnBuscarEstudiante.setEnabled(false);
//        } else {
//            btnBuscarEstudiante.setEnabled(true);
//        }
    }//GEN-LAST:event_btnBuscarMActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
//         int posE = objCur1.tamE - 1;
//        int nMates = objCur1.vecEstu[posM].nMaterias;
//        String codMate = txtCodMate.getText();
//        String nomMate = txtNombreMate.getText();
        double n1 = Double.parseDouble(txtNota1.getText());
        double n2 = Double.parseDouble(txtNota2.getText());
        double n3 = Double.parseDouble(txtNota3.getText());
       // Materia mate = new Materia(codMate, nomMate, n1, n2, n3);
        
        String cedBuscar = txtCedula.getText();
        int posEncotrada = objCur1.buscarEstudiante(cedBuscar);
        
        
        
        objCur1.vecEstu[posEncotrada].vecMate[posM].setNota1(n1);
        objCur1.vecEstu[posEncotrada].vecMate[posM].setNota2(n2);
        objCur1.vecEstu[posEncotrada].vecMate[posM].setNota3(n3);
       
        //limpiarMateria();
        imprimirIndividual(posEncotrada);
       // imprimirTodos();
//        if (objCur1.vecEstu[posM].tamM >= nMates) {
//            btnAgregarMateria.setEnabled(false);
//        }
        
        
        
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

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
            java.util.logging.Logger.getLogger(frmEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarE;
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JButton btnBuscarEstudiante;
    private javax.swing.JButton btnBuscarM;
    private javax.swing.JButton btnDatosPrueba;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private java.awt.List lstDatos;
    private java.awt.List lstDatos1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodMate;
    private javax.swing.JTextField txtNMaterias;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMate;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    // End of variables declaration//GEN-END:variables
}
