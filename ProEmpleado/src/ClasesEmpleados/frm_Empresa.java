/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesEmpleados;

import javax.swing.JOptionPane;

/**
 *
 * @author alumno
 */
public class frm_Empresa extends javax.swing.JFrame {

    /**
     * Creates new form frm_Empresa
     */
    public frm_Empresa() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttamanio = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txthoras = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();
        btnsalario = new javax.swing.JButton();
        lstDatos = new java.awt.List();
        jLabel4 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Ingresar cedula:");

        jLabel2.setText("Ingresar nombres:");

        jLabel3.setText("Ingresa numero de  horas:");

        btningresar.setText("Ingresar");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btnsalario.setText("Calculo salario");
        btnsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalarioActionPerformed(evt);
            }
        });

        lstDatos.setFont(new java.awt.Font("Kristen ITC", 1, 12)); // NOI18N
        lstDatos.setForeground(new java.awt.Color(0, 0, 51));
        lstDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstDatosActionPerformed(evt);
            }
        });

        jLabel4.setText("Ingresa la cantidad de empleados:");

        btncrear.setText("Crear");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });

        jButton1.setText("prueba");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txttamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncrear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txthoras, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btningresar)
                        .addGap(18, 18, 18)
                        .addComponent(btnsalario)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lstDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncrear))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txthoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btningresar)
                    .addComponent(btnsalario)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(lstDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstDatosActionPerformed
    public void limpiar() {
        txtcedula.setText(null);
        txtnombre.setText("");
        txthoras.setText(null);
    }

    public void mostrarDatos1() {
        lstDatos.removeAll();
        for (int i = 0; i < objempresa.getTam(); i++) {

            lstDatos.add("CEDULA:" + objempresa.vecCta[i].getCedula());
            lstDatos.add("NOMBRE:" + objempresa.vecCta[i].getNombres());
            lstDatos.add("HORAS DE TRABAJO:" + objempresa.vecCta[i].getHorastrabajadas());
            lstDatos.add("************************************");

        }
    }
//inicializamos el objeto empleado o donde estan los atrivutos de la persona
    Empleado objempleado;

    public void salario() {
        double salario1 = 0;
        salario1 = 7 * horas;
        lstDatos.add("salario" + salario1);
        if (salario1 == 500) {
            lstDatos.add("************************************");
            lstDatos.add("El salario es pesimo");
        } else if (salario1 == 800) {
            lstDatos.add("************************************");
            lstDatos.add("El salario es Regular");
        } else if (salario1 == 1000) {
            lstDatos.add("************************************");
            lstDatos.add("El salario es bueno");
        } else if (salario1 > 1000) {
            lstDatos.add("************************************");
            lstDatos.add("El salario es excelente");
        }
    }
    int horas;
    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        // TODO add your handling code here:
        if (objempresa.getTam() >= nClientes) {
            JOptionPane.showMessageDialog(this, "LIMITE DE EMPLEADOS EXEDIDO!");
        } else {
            String ced = txtcedula.getText();
            String nom = txtnombre.getText();
            horas = Integer.parseInt(txthoras.getText());
            objempleado = new Empleado(ced, nom, horas);

            objempresa.agregaCuenta(objempleado);
            limpiar();
            mostrarDatos1();
            JOptionPane.showMessageDialog(this, "Empleado Ingresado con Exito..!!");
        }
    }//GEN-LAST:event_btningresarActionPerformed
    //Inicializamos la variable nclientes que es la cantidad de clientes a ingresar
    // y el objeto empresa o la entidad dond va el vector
    int nClientes;
    Empresa objempresa;
    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        // TODO add your handling code here:
        nClientes = Integer.parseInt(txttamanio.getText());
        objempresa = new Empresa(nClientes);
        btncrear.setEnabled(false);
        btningresar.setEnabled(true);
    }//GEN-LAST:event_btncrearActionPerformed

    private void btnsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalarioActionPerformed
        // TODO add your handling code here:
        salario();
    }//GEN-LAST:event_btnsalarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Empresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncrear;
    private javax.swing.JButton btningresar;
    private javax.swing.JButton btnsalario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private java.awt.List lstDatos;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txthoras;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttamanio;
    // End of variables declaration//GEN-END:variables
}
