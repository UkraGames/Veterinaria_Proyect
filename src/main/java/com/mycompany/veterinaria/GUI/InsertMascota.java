/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.veterinaria.GUI;


import com.mycompany.veterinaria.DAO.DAOMascotaImpl;
import com.mycompany.veterinaria.DAO.DAOTipoImpl;
import com.mycompany.veterinaria.clases.Mascota;
import com.mycompany.veterinaria.clases.TipoMascota;
import com.mycompany.veterinaria.DB.conexion;
import java.util.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author aleji
 */
public class InsertMascota extends javax.swing.JPanel {
    private String documentoDueño;
    private String NombreMascota;
    private int Tipo;
    private String raza;
    private String Dueño;
    private int Edad;
    private Date FechaNacimiento;
    private ArrayList<TipoMascota> lista;
    
    
    /**
     * Creates new form InsertUser
     */
    public InsertMascota() {
        initComponents();
        Cargar();
    }
    
    private void Cargar(){
        DAOTipoImpl dao = new DAOTipoImpl(); 
        try {
            lista = dao.Listado();
            if (lista == null) {
            lista = new ArrayList<>();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
   
        DefaultComboBoxModel<TipoMascota> model = new DefaultComboBoxModel<>(lista.toArray(TipoMascota[]::new));
        ListaTipo.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DocumentoDueño = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NombrePet = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ListaTipo = new javax.swing.JComboBox<TipoMascota>();
        jLabel4 = new javax.swing.JLabel();
        Raza = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NombreAmo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EdadPet = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        crearMascota = new javax.swing.JButton();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));

        DocumentoDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentoDueñoActionPerformed(evt);
            }
        });

        jLabel1.setText("Documento del Dueño");

        jLabel2.setText("Nombre de la mascota");

        NombrePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombrePetActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de Mascota");

        ListaTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaTipoActionPerformed(evt);
            }
        });

        jLabel4.setText("Raza de la Mascota");

        Raza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RazaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre del Dueño");

        NombreAmo.setForeground(new java.awt.Color(204, 204, 204));
        NombreAmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreAmoActionPerformed(evt);
            }
        });

        jLabel6.setText("Edad de la mascota");

        EdadPet.setForeground(new java.awt.Color(204, 204, 204));
        EdadPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadPetActionPerformed(evt);
            }
        });

        crearMascota.setText("Subir");
        crearMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearMascotaActionPerformed(evt);
            }
        });

        Fecha.setDateFormatString("yyyy-MM-dd");

        jLabel7.setText("Inserte la Fecha");

        jButton2.setText("Añadir Tipo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DocumentoDueño)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombrePet)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListaTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addComponent(Raza)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addComponent(NombreAmo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addComponent(EdadPet))
                .addGap(139, 139, 139)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crearMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(21, 21, 21)))))
                .addGap(188, 188, 188)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(DocumentoDueño)
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(NombrePet)
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(ListaTipo)
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(Raza)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4)
                .addComponent(NombreAmo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(EdadPet)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(98, 98, 98)
                .addComponent(crearMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(142, 142, 142)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addComponent(jScrollBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DocumentoDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentoDueñoActionPerformed
        
    }//GEN-LAST:event_DocumentoDueñoActionPerformed

    private void ListaTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaTipoActionPerformed
        
    }//GEN-LAST:event_ListaTipoActionPerformed

    private void NombrePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombrePetActionPerformed
        
    }//GEN-LAST:event_NombrePetActionPerformed

    private void NombreAmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreAmoActionPerformed
        
    }//GEN-LAST:event_NombreAmoActionPerformed

    private void EdadPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadPetActionPerformed
        
    }//GEN-LAST:event_EdadPetActionPerformed

    private void crearMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMascotaActionPerformed
        Upload();
    }//GEN-LAST:event_crearMascotaActionPerformed

    private void RazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RazaActionPerformed
        
    }//GEN-LAST:event_RazaActionPerformed
    private void Upload(){
        documentoDueño = DocumentoDueño.getText();
        Tipo = ListaTipo.getSelectedIndex()+1;
        
        raza = Raza.getText();
        NombreMascota = NombrePet.getText();
        FechaNacimiento =  Fecha.getDate();
        Dueño = NombreAmo.getText();
        try {
            Edad = Integer.parseInt(EdadPet.getText());
        } catch(NumberFormatException ex){
            System.out.println(ex);
        }
        Mascota user = new Mascota(documentoDueño, NombreMascota, Tipo, raza, Dueño, Edad, FechaNacimiento);
        DAOMascotaImpl up = new DAOMascotaImpl();
        try {
            up.Registrar(user);
        } catch (Exception ex) {
            Logger.getLogger(InsertMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try { 
            String dsc = JOptionPane.showInputDialog("Inserte El Tipo de Mascota");
            TipoMascota tm = new TipoMascota(dsc);
            DAOTipoImpl user = new DAOTipoImpl();
            user.getConnection();
            user.Registar(tm);
            user.Close();
        } catch (Exception ex) {
            Logger.getLogger(InsertMascota.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DocumentoDueño;
    private javax.swing.JTextField EdadPet;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JComboBox<TipoMascota> ListaTipo;
    private javax.swing.JTextField NombreAmo;
    private javax.swing.JTextField NombrePet;
    private javax.swing.JTextField Raza;
    private javax.swing.JButton crearMascota;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollBar jScrollBar1;
    // End of variables declaration//GEN-END:variables
}
