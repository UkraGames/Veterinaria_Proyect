/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.veterinaria.GUI;


import com.mycompany.veterinaria.DAO.DAOHistoriaClinicaImpl;
import com.mycompany.veterinaria.DB.DAOHistoriaClinica;
import com.mycompany.veterinaria.clases.HistoriaClinica;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aleji
 */
public class HistorialClinicoPanel extends javax.swing.JPanel {

    /**
     * Creates new form HistorialClinicoPanel
     */
    public HistorialClinicoPanel() {
        initComponents();
        loadHistorial();
    }
    
    /**
     *
     */
    private void loadHistorial(){
        tablaHistorial.removeAll();
        try{
            DAOHistoriaClinica dao = new DAOHistoriaClinicaImpl();
            ArrayList<HistoriaClinica> lista = dao.Listado();
            DefaultTableModel model = (DefaultTableModel) tablaHistorial.getModel();
            for(int i = 0; i < lista.size(); i++){
                model.addRow(new Object[]{
                lista.get(i).getIdHistoriaClinica(),
                lista.get(i).getFechaCita(),
                lista.get(i).getSeguimiento(),
                lista.get(i).getRecetado(),
                lista.get(i).getIdMascota()
                });
                

            }
        }catch(Exception e){
            e.getMessage();
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

        queryBottom = new javax.swing.JButton();
        toQuery = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();
        UpdateBttm = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        queryBottom.setText("Buscar");
        queryBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryBottomActionPerformed(evt);
            }
        });

        toQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toQueryActionPerformed(evt);
            }
        });

        Insert.setText("Insertar");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idHistoria", "Fecha", "Seguimiento", "Recetado", "Mascota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaHistorial);
        if (tablaHistorial.getColumnModel().getColumnCount() > 0) {
            tablaHistorial.getColumnModel().getColumn(2).setResizable(false);
            tablaHistorial.getColumnModel().getColumn(3).setResizable(false);
        }

        UpdateBttm.setText("Actualizar");
        UpdateBttm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBttmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Insert, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addGap(72, 72, 72)
                .addComponent(UpdateBttm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(331, 331, 331)
                .addComponent(toQuery, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(queryBottom)
                .addGap(23, 23, 23))
            .addComponent(jScrollPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UpdateBttm))
                    .addComponent(toQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queryBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void queryBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryBottomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_queryBottomActionPerformed

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        Historia NewPanelH = new Historia();
        NewPanelH.setSize(1400, 560);
        setLayout(new BorderLayout());
        removeAll();
        add(NewPanelH, java.awt.BorderLayout.CENTER);
        revalidate();
        repaint();
        
    }//GEN-LAST:event_InsertActionPerformed

    private void toQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toQueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toQueryActionPerformed

    private void UpdateBttmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBttmActionPerformed

        initComponents();
        loadHistorial();       // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBttmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Insert;
    private javax.swing.JButton UpdateBttm;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton queryBottom;
    private javax.swing.JTable tablaHistorial;
    private javax.swing.JTextField toQuery;
    // End of variables declaration//GEN-END:variables
}
