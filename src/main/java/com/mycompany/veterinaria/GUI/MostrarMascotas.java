/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.veterinaria.GUI;

import com.mycompany.veterinaria.DB.DAOMascota;
import com.mycompany.veterinaria.DB.DAOTipo;
import com.mycompany.veterinaria.DAO.*;
import com.mycompany.veterinaria.clases.*;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleji
 */
public class MostrarMascotas extends javax.swing.JPanel {

    /**
     * Creates new form MostrarMascotas
     */
    public MostrarMascotas() {
        initComponents();
        LoadMascotas();
    }
    
private void LoadMascotas() {
    

    try {
        DAOMascota dao = new DAOMascotaImpl();
        DAOTipo dao2 = new DAOTipoImpl();
        ArrayList<Mascota> listaModel = dao.Listado();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<TipoMascota> listaTipo = dao2.Listado();
        String TipoEscrito = null;
        for (int i = 0; i < listaModel.size(); i++){
            for (int j = 0; j < listaTipo.size(); j++){
                
                if (listaModel.get(i).getTipo() == listaTipo.get(j).getIdTipoMascota())
                    TipoEscrito = listaTipo.get(j).getDescripcion();
            }   
            model.addRow(new Object[] {
            listaModel.get(i).getDocumentoDueño(),
            listaModel.get(i).getNombre(),
            TipoEscrito,
            listaModel.get(i).getRaza(),
            listaModel.get(i).getNombreDueño(),
            listaModel.get(i).getEdad(),
            listaModel.get(i).getFechaNacimiento()

            });
        }
        
    } catch (Exception ex) {
        System.out.println("Error en LoadMascotas: " + ex.getMessage());
        ex.printStackTrace();
    }
}

private void LoadMascotas(String name) {
    

    try {
        DAOMascota dao = new DAOMascotaImpl();
        DAOTipo dao2 = new DAOTipoImpl();
        ArrayList<Mascota> listaModel = dao.Busqueda(name);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        ArrayList<TipoMascota> listaTipo = dao2.Listado();
        String TipoEscrito = null;
        
        for (int i = 0; i < listaModel.size(); i++){
            for (int j = 0; j < listaTipo.size(); j++){
                
                if (listaModel.get(i).getTipo() == listaTipo.get(j).getIdTipoMascota())
                    TipoEscrito = listaTipo.get(j).getDescripcion();
            }   
            model.addRow(new Object[] {
            listaModel.get(i).getDocumentoDueño(),
            listaModel.get(i).getNombre(),
            TipoEscrito,
            listaModel.get(i).getRaza(),
            listaModel.get(i).getNombreDueño(),
            listaModel.get(i).getEdad(),
            listaModel.get(i).getFechaNacimiento()

            });
            
        }
        
        
    } catch (Exception ex) {
        System.out.println("Error en LoadMascotas: " + ex.getMessage());
        ex.printStackTrace();
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

        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddPet = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Busqueda = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(470, 390));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento del dueño", "Nombre de la mascota", "Tipo de Animal", "Raza", "Nombre del dueño", "Edad de la mascotal", "Fecha de Nacimiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        AddPet.setText("Añadir");
        AddPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPetActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");

        jButton4.setText("Borrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(65, 170, 247));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(AddPet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Busqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(AddPet)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addComponent(Busqueda)))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AddPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPetActionPerformed
    InsertMascota pl = new InsertMascota();
    pl.setSize(1648, 798);
    setLayout(new BorderLayout());
    removeAll();
    add(pl, java.awt.BorderLayout.CENTER);
    revalidate();
    repaint();

    }//GEN-LAST:event_AddPetActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        var searchBy = Buscar.getText();
        LoadMascotas(searchBy);
        
    }//GEN-LAST:event_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPet;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Busqueda;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
