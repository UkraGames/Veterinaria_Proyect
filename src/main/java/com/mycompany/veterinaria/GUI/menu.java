package com.mycompany.veterinaria.GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aleji
 */
public class menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public menu() {
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

        Background = new javax.swing.JPanel();
        PanelTitle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PanelSelección = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        BtnMascotas = new javax.swing.JButton();
        BtnHistorial = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        BtnPacientes1 = new javax.swing.JButton();
        BtnPacientes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veterinaria");
        setPreferredSize(new java.awt.Dimension(1500, 650));

        PanelTitle.setBackground(new java.awt.Color(255, 204, 255));

        jLabel2.setFont(new java.awt.Font("Gigi", 1, 90)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Patitas Doradas ");

        jLabel4.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel4.setText("Bienvenidos a");

        javax.swing.GroupLayout PanelTitleLayout = new javax.swing.GroupLayout(PanelTitle);
        PanelTitle.setLayout(PanelTitleLayout);
        PanelTitleLayout.setHorizontalGroup(
            PanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(734, 734, 734))
        );
        PanelTitleLayout.setVerticalGroup(
            PanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTitleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
            .addGroup(PanelTitleLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("\" Nos encargamos del cuidado de sus mascotas dandoles toda");

        jLabel1.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 153));
        jLabel1.setText("la atención y cuidados que necesitan\"");

        jLabel7.setFont(new java.awt.Font("Cooper Black", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("AliVaBa");

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(contenidoLayout.createSequentialGroup()
                        .addGroup(contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabel1))
                            .addGroup(contenidoLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1055, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 509, Short.MAX_VALUE)))
                .addContainerGap())
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenidoLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );

        jScrollPane2.setViewportView(contenido);

        PanelSelección.setBackground(new java.awt.Color(204, 153, 255));

        BtnMascotas.setBackground(new java.awt.Color(255, 204, 204));
        BtnMascotas.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        BtnMascotas.setForeground(new java.awt.Color(0, 0, 102));
        BtnMascotas.setText("Máscotas");
        BtnMascotas.setBorderPainted(false);
        BtnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMascotasActionPerformed(evt);
            }
        });

        BtnHistorial.setBackground(new java.awt.Color(255, 255, 204));
        BtnHistorial.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        BtnHistorial.setForeground(new java.awt.Color(0, 0, 102));
        BtnHistorial.setText("Historial clinico");
        BtnHistorial.setToolTipText("");
        BtnHistorial.setBorderPainted(false);
        BtnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHistorialActionPerformed(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        BtnSalir.setForeground(new java.awt.Color(0, 0, 102));
        BtnSalir.setText("Salir");
        BtnSalir.setBorderPainted(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnPacientes1.setBackground(new java.awt.Color(204, 204, 255));
        BtnPacientes1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        BtnPacientes1.setForeground(new java.awt.Color(0, 0, 102));
        BtnPacientes1.setText("Citas");
        BtnPacientes1.setBorderPainted(false);
        BtnPacientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPacientes1ActionPerformed(evt);
            }
        });

        BtnPacientes.setBackground(new java.awt.Color(204, 255, 204));
        BtnPacientes.setFont(new java.awt.Font("Harlow Solid Italic", 0, 36)); // NOI18N
        BtnPacientes.setForeground(new java.awt.Color(0, 0, 102));
        BtnPacientes.setText("Nuevo paciente");
        BtnPacientes.setBorderPainted(false);
        BtnPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPacientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSelecciónLayout = new javax.swing.GroupLayout(PanelSelección);
        PanelSelección.setLayout(PanelSelecciónLayout);
        PanelSelecciónLayout.setHorizontalGroup(
            PanelSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSelecciónLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(PanelSelecciónLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(BtnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(28, 28, 28))
            .addGroup(PanelSelecciónLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(BtnPacientes1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(BtnMascotas, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(BtnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 240, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        PanelSelecciónLayout.setVerticalGroup(
            PanelSelecciónLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSelecciónLayout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(BtnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(BtnPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(BtnPacientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(BtnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setViewportView(PanelSelección);

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(jScrollPane2))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMascotasActionPerformed
        MostrarMascotas pl = new MostrarMascotas();
        pl.setSize(1400, 560 );
        contenido.removeAll(); 
        contenido.add(pl, java.awt.BorderLayout.CENTER);
       
        contenido.repaint();
        jLabel2.setText("Mascotas");
    }//GEN-LAST:event_BtnMascotasActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPacientesActionPerformed
        InsertMascota pl = new InsertMascota();
        pl.setSize(1400, 560);
        contenido.removeAll(); 
        contenido.add(pl, java.awt.BorderLayout.EAST);
        contenido.revalidate();
        contenido.repaint();
        jLabel2.setText("Nuevo Paciente");
    }//GEN-LAST:event_BtnPacientesActionPerformed

    private void BtnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHistorialActionPerformed
        HistorialClinicoPanel pl = new HistorialClinicoPanel();
        pl.setSize(1400, 560);
        contenido.removeAll(); 
        contenido.add(pl, java.awt.BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        jLabel2.setText("Historial Clínico");
    }//GEN-LAST:event_BtnHistorialActionPerformed

    private void BtnPacientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPacientes1ActionPerformed
        CitaMascota pl = new CitaMascota();
        pl.setSize(1400, 560);
        contenido.removeAll(); 
        contenido.add(pl, java.awt.BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        jLabel2.setText("Citas");
    }//GEN-LAST:event_BtnPacientes1ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnHistorial;
    private javax.swing.JButton BtnMascotas;
    private javax.swing.JButton BtnPacientes;
    private javax.swing.JButton BtnPacientes1;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JPanel PanelSelección;
    private javax.swing.JPanel PanelTitle;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
