/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import proyecto.Funciones;
import proyecto.Listas;

/**
 *
 * @author Jennifer Pérez
 */
public class VentanaMostrarGrafo extends javax.swing.JFrame {

    Listas listas;
    /**
     * Creates new form VentanaMostrarGrafo
     */
    public VentanaMostrarGrafo(Listas listas) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.listas = listas;
                
        ImageIcon imgIcon = new ImageIcon("test\\grafoImagen.jpg");
        imgIcon.getImage().flush();
        Icon icono = new ImageIcon(imgIcon.getImage()); 
        imagen.setIcon(icono);
       
       
        
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
        imagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 480));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new VentanaGeneral(listas).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
