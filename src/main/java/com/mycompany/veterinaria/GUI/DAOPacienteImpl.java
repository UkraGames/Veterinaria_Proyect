/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.GUI;

import com.mycompany.veterinaria.clases.Paciente;
import com.mycompany.veterinaria.conexion.DAOPaciente;
import com.mycompany.veterinaria.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aleji
 */
public class DAOPacienteImpl extends conexion implements DAOPaciente{

    @Override
    public void Registrar(Paciente e) throws Exception {
        try{
            var st = this.conn.prepareStatement("INSERT INTO Paciente(Documento, Nombre_Amo, Tipo, Raza, Nombre_Mascota, Historial) VALUES(?, ?, ?, ?, ?, NULL )");
            st.setString(1, Paciente.getDocumento());
        }catch(SQLException ex){
            throw ex;
        }
    }

    @Override
    public void Modificar(Paciente e) throws Exception {
        try{
        
        } catch(Exception ex) {
        
        }
    }

    @Override
    public void Eliminar(Paciente e) throws Exception {
        try{
        
        } catch(Exception ex) {
        
        }
    }

    @Override
    public ArrayList<Paciente> Listado() throws Exception {
        try{
        
        } catch(Exception ex) {
        
        }
        return null;
    }
    
}
