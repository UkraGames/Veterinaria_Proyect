/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import com.mycompany.veterinaria.clases.Citas;
import com.mycompany.veterinaria.conexion.DAOCitas;
import com.mycompany.veterinaria.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author aleji
 */
public class DAOCitasImpl extends conexion implements DAOCitas {

    @Override
    public void Registar(Citas e) throws Exception {
        try {
            var st = DAOCitasImpl.conn.prepareStatement("INSERT INTO citas(Fecha, Descripcion, IdMascota) VALUES (?, ?, ?)");
            st.setDate(0, e.getFechaCita());
            st.setString(1, e.getDescripcion());
            st.setInt(2, e.getIdMascota());
            st.executeUpdate();{
            st.close();
        }
        } catch (SQLException ex){
        }
    }

    @Override
    public void Modificar(Citas e) throws Exception {
        try {
            var st = DAOCitasImpl.conn.prepareStatement("");
        }catch(SQLException ex){
        }
    }

    @Override
    public ArrayList<Citas> Listado() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
