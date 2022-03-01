/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;
import proyecto.Funciones;
import proyecto.ListaRelaciones;
import proyecto.Listas;


/**
 *
 * @author Jennifer Pérez
 */
public class VentanaGeneral extends javax.swing.JFrame {

    Funciones f;
    Listas listas;
    boolean archivo;
    ListaRelaciones lr;


    /**
     * Creates new form VentanaGeneral
     *
     * @param listas
     */
    public VentanaGeneral() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        f = new Funciones();
        archivo = false;
    }

    public VentanaGeneral(Listas listas) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.listas = listas;
        f = new Funciones();
        archivo = true;
        this.lr = listas.getListaRelaciones();
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
        CargarArchivo = new javax.swing.JButton();
        ActualizarRepositorio = new javax.swing.JButton();
        MostrarGrafo = new javax.swing.JButton();
        CantidadIslas = new javax.swing.JButton();
        ModificarGrafos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ArchivoPredeterminado = new javax.swing.JButton();
        SalirDelPrograma = new javax.swing.JButton();
        Puentes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CargarArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CargarArchivo.setText("Cargar archivo");
        CargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(CargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 280, -1));

        ActualizarRepositorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ActualizarRepositorio.setText("Actualizar repositorio");
        ActualizarRepositorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarRepositorioActionPerformed(evt);
            }
        });
        jPanel1.add(ActualizarRepositorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 280, -1));

        MostrarGrafo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MostrarGrafo.setText("Mostrar grafo");
        MostrarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarGrafoActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 280, -1));

        CantidadIslas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CantidadIslas.setText("Mostrar cantidad de islas");
        CantidadIslas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadIslasActionPerformed(evt);
            }
        });
        jPanel1.add(CantidadIslas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 280, -1));

        ModificarGrafos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ModificarGrafos.setText("Modificar grafo");
        ModificarGrafos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarGrafosActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarGrafos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 280, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Redes Sociales");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 250, 60));

        ArchivoPredeterminado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ArchivoPredeterminado.setText("Continuar con archivo predeterminado");
        ArchivoPredeterminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoPredeterminadoActionPerformed(evt);
            }
        });
        jPanel1.add(ArchivoPredeterminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 280, -1));

        SalirDelPrograma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SalirDelPrograma.setText("Salir del programa");
        SalirDelPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirDelProgramaActionPerformed(evt);
            }
        });
        jPanel1.add(SalirDelPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 170, -1));

        Puentes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Puentes.setText("Identificación de puentes");
        Puentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuentesActionPerformed(evt);
            }
        });
        jPanel1.add(Puentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarRepositorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarRepositorioActionPerformed
        if (archivo) {
            f.escribirTxt(listas);
        } else {
            JOptionPane.showMessageDialog(null, "Debe cargar un archivo primero para actualizar el repositorio.");
        }
    }//GEN-LAST:event_ActualizarRepositorioActionPerformed

    private void CargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivoActionPerformed
        listas = f.leerTxtCargado();
        if (!listas.getListaUsuario().estaVacia() && !listas.getListaRelaciones().estaVacia()) {
            archivo = true;
        } else {
            archivo = false;
        }
    }//GEN-LAST:event_CargarArchivoActionPerformed

    private void SalirDelProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirDelProgramaActionPerformed
        dispose();
    }//GEN-LAST:event_SalirDelProgramaActionPerformed

    private void ArchivoPredeterminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoPredeterminadoActionPerformed
        listas = f.leerTxt();

        if (!listas.getListaUsuario().estaVacia() && !listas.getListaRelaciones().estaVacia()) {

            archivo = true;
        } else {
            archivo = false;
        }
    }//GEN-LAST:event_ArchivoPredeterminadoActionPerformed

    private void CantidadIslasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadIslasActionPerformed
        if (archivo) {
            new VentanaCantidadISlas(listas).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo primero.");
        }

    }//GEN-LAST:event_CantidadIslasActionPerformed

    private void ModificarGrafosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarGrafosActionPerformed
        if (archivo) {
            new VentanaModificarGrafo(listas).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo primero.");
        }
    }//GEN-LAST:event_ModificarGrafosActionPerformed

    private void MostrarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarGrafoActionPerformed
        if (archivo) {
            f.generarGrafoJpg(listas);
            new VentanaMostrarGrafo(listas).setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo primero.");
        }
    }//GEN-LAST:event_MostrarGrafoActionPerformed

    private void PuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuentesActionPerformed
        if (archivo) {
            JOptionPane.showMessageDialog(null, "Ingeniero trabajando en la función.");
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo primero.");
        }
    }//GEN-LAST:event_PuentesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarRepositorio;
    private javax.swing.JButton ArchivoPredeterminado;
    private javax.swing.JButton CantidadIslas;
    private javax.swing.JButton CargarArchivo;
    private javax.swing.JButton ModificarGrafos;
    private javax.swing.JButton MostrarGrafo;
    private javax.swing.JButton Puentes;
    private javax.swing.JButton SalirDelPrograma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}