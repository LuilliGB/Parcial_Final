/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class Pantalla_Principal extends javax.swing.JFrame {

    // public static DefaultTableModel table;
    private DefaultTableModel modelo;
    int contador = 0;
    
public static ArrayList <Tareas> almacenar;
    /**
     * Creates new form Pantalla_Principal
     */
    //  private final String ruta=System.getProperties().getProperty("user.dir");
    public Pantalla_Principal() {
        initComponents();

        llamar();
        Cargar();
        
        almacenar = new ArrayList<Tareas>();
        modelo = (DefaultTableModel) Tablaprin.getModel();
        //     File archivo=null;
        //     FileReader FilerR=null;
        //     BufferedReader BufferedR=null;
        // table = (DefaultTableModel)Tablaprin.getModel();

        /*  try {
            archivo=new File(ruta+"//BLOC.txt");
            FilerR=new FileReader(archivo);
            BufferedR=new BufferedReader(FilerR);
            String informacion;
            DefaultTableModel Tablatareas=new DefaultTableModel();
            
            Tablatareas.addColumn("Fecha");
           // Tablatareas.addColumn("Nombre");
          //  Tablatareas.addColumn("encargado");
            while ((informacion=BufferedR.readLine())!=null){
                System.err.println(informacion);
                Tablatareas.addRow(new String[]{informacion});
            
        }
            Tablaprin.setModel(table);
        } catch (Exception e) {}finally{ try{if(null!=FilerR) {FilerR.close();}}catch(IOException e2){}
        }*/
    }

    public void llamar() {
        String datos[][] = {};
        String columna[] = {"FECHA", "NOMBRE", "ENCARGADO"};
        modelo = new DefaultTableModel(datos, columna);
        Tablaprin.setModel(modelo);
    }

    public void Cargar() {
        Tareas T;
        for (int i = 0; i < AgregarTarea.almacenar.size(); i++) {
            T = (Tareas) AgregarTarea.almacenar.get(i);
            modelo.insertRow(contador, new Object[]{});
            modelo.setValueAt(T.getFecha(), contador, 0);
            modelo.setValueAt(T.getNombretarea(), contador, 1);
            modelo.setValueAt(T.getEncargado(), contador, 2);
        }
        
        
        

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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablaprin = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Btniraprincipal = new javax.swing.JButton();
        BTNcrearreporte = new javax.swing.JButton();
        Txtnombredocumento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BTNterminartarea = new javax.swing.JButton();
        BTNvertareas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tablaprin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(Tablaprin);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tareas pendientes");

        Btniraprincipal.setText("IR A AGREGAR TAREA");
        Btniraprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtniraprincipalActionPerformed(evt);
            }
        });

        BTNcrearreporte.setText("CREAR REPORTE");
        BTNcrearreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcrearreporteActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE EL NOMBRE DEL REPORTE");

        BTNterminartarea.setText("TERMINAR TAREA");

        BTNvertareas.setText("VER TAREAS TERMINADAS");
        BTNvertareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNvertareasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Txtnombredocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 123, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BTNcrearreporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btniraprincipal)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(BTNterminartarea)
                .addGap(103, 103, 103)
                .addComponent(BTNvertareas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNvertareas)
                    .addComponent(BTNterminartarea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Txtnombredocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNcrearreporte)
                    .addComponent(Btniraprincipal))
                .addContainerGap())
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

    private void BtniraprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtniraprincipalActionPerformed

        AgregarTarea AT;
        try {
            AT = new AgregarTarea();

            AT.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Pantalla_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_BtniraprincipalActionPerformed

    
    
    private void BTNcrearreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcrearreporteActionPerformed
      
        Reportes crear_reporte = new Reportes(Txtnombredocumento.getText(), new Date().toString(), "C:\\Users\\dell\\Downloads\\im.png", AgregarTarea.almacenar);
        crear_reporte.CrearReporte();
        
        
    }//GEN-LAST:event_BTNcrearreporteActionPerformed

    private void BTNvertareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNvertareasActionPerformed
        
        Tareas_Terminadas TT = new Tareas_Terminadas();
        TT.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_BTNvertareasActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNcrearreporte;
    private javax.swing.JButton BTNterminartarea;
    private javax.swing.JButton BTNvertareas;
    private javax.swing.JButton Btniraprincipal;
    public static javax.swing.JTable Tablaprin;
    private javax.swing.JTextField Txtnombredocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
