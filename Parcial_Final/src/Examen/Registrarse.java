/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class Registrarse extends javax.swing.JFrame {

    public static ArrayList<Datos> ArrayDatos = new ArrayList<Datos>();

    public Registrarse() {
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
        Labelltitulo1 = new javax.swing.JLabel();
        labelnombre1 = new javax.swing.JLabel();
        Txtnombre = new javax.swing.JTextField();
        labelapellido1 = new javax.swing.JLabel();
        Txtapellidos1 = new javax.swing.JTextField();
        labelusuario1 = new javax.swing.JLabel();
        Txtusuario1 = new javax.swing.JTextField();
        Labelcontraseña1 = new javax.swing.JLabel();
        Labelcorreo1 = new javax.swing.JLabel();
        Txtcorreo1 = new javax.swing.JTextField();
        Btniraingreso1 = new javax.swing.JButton();
        Checkvercontraseña1 = new javax.swing.JCheckBox();
        Passwordcontraseña = new javax.swing.JPasswordField();
        Btnregistrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labelltitulo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Labelltitulo1.setText("REGISTRARSE");

        labelnombre1.setText("Nombre:");

        Txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtnombreActionPerformed(evt);
            }
        });

        labelapellido1.setText("Apellidos:");

        Txtapellidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtapellidos1ActionPerformed(evt);
            }
        });

        labelusuario1.setText("Usuario:");

        Txtusuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txtusuario1ActionPerformed(evt);
            }
        });

        Labelcontraseña1.setText("Contraseña:");

        Labelcorreo1.setText("Correo:");

        Btniraingreso1.setText("IR A INGRESO");
        Btniraingreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btniraingreso1ActionPerformed(evt);
            }
        });

        Checkvercontraseña1.setText("VER CONTRASEÑA");
        Checkvercontraseña1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkvercontraseña1ActionPerformed(evt);
            }
        });

        Passwordcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordcontraseñaActionPerformed(evt);
            }
        });

        Btnregistrarse.setText("REGISTRARSE");
        Btnregistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnregistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btniraingreso1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Labelltitulo1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelnombre1)
                                .addGap(137, 137, 137)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Txtapellidos1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                        .addComponent(Txtnombre)
                                        .addComponent(Txtusuario1))
                                    .addComponent(Txtcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Passwordcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Checkvercontraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(Btnregistrarse)))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelapellido1)
                        .addComponent(labelusuario1)
                        .addComponent(Labelcontraseña1)
                        .addComponent(Labelcorreo1))
                    .addContainerGap(536, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Labelltitulo1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelnombre1)
                    .addComponent(Txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Txtapellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Txtusuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Passwordcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Checkvercontraseña1))
                .addGap(18, 18, 18)
                .addComponent(Txtcorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Btnregistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Btniraingreso1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(labelapellido1)
                    .addGap(30, 30, 30)
                    .addComponent(labelusuario1)
                    .addGap(29, 29, 29)
                    .addComponent(Labelcontraseña1)
                    .addGap(30, 30, 30)
                    .addComponent(Labelcorreo1)
                    .addContainerGap(83, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtnombreActionPerformed

        Txtnombre.setText("");
        Txtnombre.setForeground(Color.black);

    }//GEN-LAST:event_TxtnombreActionPerformed

    private void Txtapellidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtapellidos1ActionPerformed

        Txtapellidos1.setText("");
        Txtapellidos1.setForeground(Color.black);

    }//GEN-LAST:event_Txtapellidos1ActionPerformed

    private void Txtusuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txtusuario1ActionPerformed

        Txtusuario1.setText("");
        Txtusuario1.setForeground(Color.black);

    }//GEN-LAST:event_Txtusuario1ActionPerformed

    private void PasswordcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordcontraseñaActionPerformed

        Passwordcontraseña.setText("");
        Passwordcontraseña.setForeground(Color.black);

    }//GEN-LAST:event_PasswordcontraseñaActionPerformed

    private void Checkvercontraseña1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkvercontraseña1ActionPerformed

        if (Checkvercontraseña1.isSelected()) {
            Passwordcontraseña.setEchoChar((char) 0);
        } else {
            Passwordcontraseña.setEchoChar('*');
        }


    }//GEN-LAST:event_Checkvercontraseña1ActionPerformed

    private void BtnregistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnregistrarseActionPerformed

        try {
            Datos D = new Datos(Txtnombre.getText(), Txtapellidos1.getText(), Txtusuario1.getText(), Passwordcontraseña.getText(), Txtcorreo1.getText());

            ArrayDatos.add(D);

            EnviarCorreo E = new EnviarCorreo(Txtcorreo1.getText(), Txtnombre.getText(), Txtusuario1.getText(), Passwordcontraseña.getText());
            E.EnviarCorreo();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnregistrarseActionPerformed

    private void Btniraingreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btniraingreso1ActionPerformed
       
        Ingreso I = new Ingreso();
        I.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_Btniraingreso1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btniraingreso1;
    private javax.swing.JButton Btnregistrarse;
    private javax.swing.JCheckBox Checkvercontraseña1;
    private javax.swing.JLabel Labelcontraseña1;
    private javax.swing.JLabel Labelcorreo1;
    private javax.swing.JLabel Labelltitulo1;
    private javax.swing.JPasswordField Passwordcontraseña;
    private javax.swing.JTextField Txtapellidos1;
    private javax.swing.JTextField Txtcorreo1;
    private javax.swing.JTextField Txtnombre;
    private javax.swing.JTextField Txtusuario1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelapellido1;
    private javax.swing.JLabel labelnombre1;
    private javax.swing.JLabel labelusuario1;
    // End of variables declaration//GEN-END:variables
}
