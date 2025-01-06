/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.DAO;

import com.mycompany.veterinaria.clases.Mascota;
import com.mycompany.veterinaria.DB.DAOMascota;
import com.mycompany.veterinaria.DB.conexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aleji
 */
public class DAOMascotaImpl extends conexion implements DAOMascota{

    @Override
    public void Registrar(Mascota e) throws Exception {
        try{
            java.util.Date Jdate = e.getFechaNacimiento();
            Date sqldate = new Date(Jdate.getTime());
            this.getConnection();
            try (java.sql.PreparedStatement st = this.conn.prepareStatement("INSERT INTO `mascota` (IdMascota, `DocumentoDueño`, `Nombre`, `Tipo`, `Raza`, `NombreDueño`, `Edad`, `FechaNacimiento`) VALUES (?,?,?,?,?,?,?,?);")) {
                st.setInt(1, e.getIdMascota());
                st.setString(2, e.getDocumentoDueño());
                st.setString(3, e.getNombre());
                st.setInt(4, e.getTipo());
                st.setString(5, e.getRaza());
                st.setString(6, e.getNombreDueño());
                st.setInt(7, e.getEdad());
                st.setDate(8, sqldate);
                st.executeUpdate();
            }
        }catch(SQLException ex){
            throw ex;
        } finally {
            this.Close();
        }
    }

    @Override
    public void Modificar(Mascota e) throws Exception {
        try{
            this.getConnection();
            try (PreparedStatement st = conn.prepareStatement("UPDATE `mascota` SET `NombreDueño` = ?, `Nombre` = ?, `Tipo` = ?, `Raza` = ?, `NombreDueño` = ?, `Edad` = ?, `FechaNacimiento` = ?, WHERE `DocumentoDueño` = ?;")) {
                st.setString(1, e.getDocumentoDueño());
                st.setString(2, e.getNombre());
                st.setInt(3, e.getTipo());
                st.setString(4, e.getRaza());
                st.setString(5, e.getNombreDueño());
                st.setInt(6, e.getEdad());
                st.setDate(7, (Date) e.getFechaNacimiento());
                st.setString(8, e.getDocumentoDueño());
                st.executeUpdate();
            }
        } catch(SQLException ex) {
        
        } finally {
            this.Close();
        }
    }

    @Override
    public void Eliminar(Mascota e) throws Exception {
        try{
            this.getConnection();
            try (var st = this.conn.prepareStatement("DELETE FROM mascota WHERE DocumentoDueño = '?' AND Nombre = '?';")){
                st.setString(1, e.getDocumentoDueño());
                st.setString(2, e.getNombreDueño());
                st.executeUpdate();
            }
                
            
        } catch(SQLException ex) {
        
        } finally {
            this.Close();
        }
    }

    @Override
    public ArrayList<Mascota> Listado() throws Exception {
        ArrayList<Mascota> Lista = new ArrayList();
        try{
            this.getConnection();
            try (PreparedStatement st = conn.prepareStatement("SELECT * FROM mascota")){
                
                try(ResultSet rs = st.executeQuery()){
                    System.out.println("Ejecutando consuta...");
                    while (rs.next()){
                        System.out.println("Procesando fila...");
                        Mascota mascota = new Mascota();
                        mascota.setIdMascota(rs.getInt("IdMascota"));
                        mascota.setDocumentoDueño(rs.getString("DocumentoDueño"));
                        mascota.setNombre(rs.getString("Nombre"));
                        mascota.setTipo(rs.getInt("Tipo"));
                        mascota.setRaza(rs.getString("Raza"));
                        mascota.setNombreDueño(rs.getString("NombreDueño"));
                        mascota.setEdad(rs.getInt("Edad"));
                        mascota.setFechaNacimiento(rs.getDate("FechaNacimiento"));
                        Lista.add(mascota);
                    }
                }
                if (Lista.isEmpty()) {
                    System.out.println("Advertencia: No se encontraron registros en la tabla 'mascota'.");
                }
            }
        } catch(SQLException ex) {
            ex.getErrorCode();
        } finally {
            this.Close();
            System.out.println("Cerrando...");
        }
          if (Lista.isEmpty()) {
        System.out.println("Advertencia: No se encontraron registros en la tabla 'mascota'.");
        }
        return Lista;
    }
    
    @Override
    public ArrayList<Mascota> Busqueda(String e) throws Exception{
        ArrayList<Mascota> Query = new ArrayList();
        try {
            this.getConnection();
            
            PreparedStatement st = conn.prepareStatement("SELECT * FROM macota WHERE Nombre = ?");
            st.setString(1, e);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Mascota mascota = new Mascota();
                mascota.setDocumentoDueño(rs.getString("DocumentoDueño"));
                mascota.setNombre(rs.getString("Nombre"));
                mascota.setTipo(rs.getInt("Tipo"));
                mascota.setRaza(rs.getString("Raza"));
                mascota.setNombreDueño(rs.getString("NombreDueño"));
                mascota.setEdad(rs.getInt("Edad"));
                mascota.setFechaNacimiento(rs.getDate("FechaNacimiento"));
                Query.add(mascota);
            }
            
            
        }catch(SQLException ex){
        }
    return Query;    
    }
}
