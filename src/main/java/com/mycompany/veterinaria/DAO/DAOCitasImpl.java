/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.DAO;
import com.mycompany.veterinaria.clases.Citas;
import com.mycompany.veterinaria.DB.DAOCitas;
import com.mycompany.veterinaria.DB.conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author aleji
 */
public class DAOCitasImpl extends conexion implements DAOCitas {

    @Override
    public void Registar(Citas e) throws Exception {
        java.sql.Date SQLDate = (java.sql.Date) e.getFecha();
        try {
            getConnection();
            try (java.sql.PreparedStatement st = conn.prepareStatement("INSERT INTO citas(Fecha, Descripcion, IdMascota) VALUES (?, ?, ?)")) {
                st.setDate(0, SQLDate);
                st.setString(1, e.getDescripcion());
                st.setInt(2, e.getIdMascota());
                st.executeUpdate();
            }
        } catch (SQLException ex){
        }finally{
            Close();
        }
    }

    @Override
    public void Modificar(Citas e) throws Exception {
        try {
            getConnection();
            var st = conn.prepareStatement("UPDATE `citas` SET `Fecha` = ?, `Descripcion` = ? WHERE `IdMascota` = ?;");
            st.setDate(1, (Date) e.getFecha()); // Asegúrate de que `getFecha()` devuelve un objeto compatible (ej. java.sql.Date).
            st.setString(2, e.getDescripcion());
            st.setInt(3, e.getIdMascota());
        }catch(SQLException ex){
        }finally{
            Close();
        }
    }

    @Override
    public ArrayList<Citas> Listado() throws Exception {
        ArrayList<Citas> Lista= null;
        try{
            this.getConnection();
            Lista = new ArrayList();
            try (PreparedStatement st = conn.prepareStatement("SELECT * FROM citas")){
                try (ResultSet rs = st.executeQuery()){
                    while (rs.next()){
                        Citas cita = new Citas();
                        cita.setIdCitas(rs.getInt("idCitas"));
                        cita.setFechaCita(rs.getDate("Fecha"));
                        cita.setDescripcion(rs.getString("Descripcion"));
                        cita.setIdMascota(rs.getInt("IdMascota"));
                        cita.setNombreMascota(rs.getString("IdMascota"));
                    }
                }
            }
        } catch (SQLException ex){
        }finally {
            this.Close();
        }
        return Lista;
    }
    
}
