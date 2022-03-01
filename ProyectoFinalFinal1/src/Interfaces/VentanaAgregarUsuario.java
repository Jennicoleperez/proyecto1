/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;
import proyecto.Funciones;
import proyecto.Listas;
/**
 *
 * @author Jennifer Pérez
 */
public class VentanaAgregarUsuario extends javax.swing.JFrame {
    
    Listas listas;
    Funciones f;
    
    /**
     * Creates new form VentanaAgregarUsuario
     * @param listas
     */
    
    public VentanaAgregarUsuario(Listas listas) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listas = listas;
        f = new Funciones();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tiempoAmistad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cancelar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        relacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 280, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Introduzca los datos para crear un nuevo usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, -1, -1));

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre de usuario");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));
        jPanel1.add(tiempoAmistad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 140, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Me relaciono con");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tiempo de amistad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        Cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        jPanel1.add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        Guardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, -1));
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 140, -1));
        jPanel1.add(relacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 140, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 584, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        new VentanaModificarGrafo(listas).setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        try {
            if (!id.getText().isBlank() && !nombre.getText().isBlank() && !relacion.getText().isBlank() && !tiempoAmistad.getText().isBlank()) {
                if (!listas.getListaRelaciones().existeRelacion(Integer.parseInt(id.getText()), Integer.parseInt(relacion.getText()))) {
                        listas.getListaUsuario().agregarFinal(Integer.parseInt(id.getText()), " @"+nombre.getText());
                        listas.getListaRelaciones().agregarFinalRelaciones(Integer.parseInt(id.getText()), Integer.parseInt(relacion.getText()), Integer.parseInt(tiempoAmistad.getText()) );
                        
                        JOptionPane.showMessageDialog(null, "El cliente fue agregado correctamente");
                        new VentanaGeneral(listas).setVisible(true);
                        dispose();
                                       
                }else{ 
                    JOptionPane.showMessageDialog(null, "La relación ya existe. Por favor, ingrese otra.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, complete los campos correctamente.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el cliente, complete los campos correctamente.");
        }
                                               
    }//GEN-LAST:event_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField relacion;
    private javax.swing.JTextField tiempoAmistad;
    // End of variables declaration//GEN-END:variables
}