/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.veterinaria.clases.Mascota;
import com.mycompany.veterinaria.conexion.DAOMascota;
import com.mycompany.veterinaria.conexion.conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
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
            var st = DAOMascotaImpl.conn.prepareStatement("INSERT INTO `mascota` (`DocumentoDueño`, `Nombre`, `Tipo`, `Raza`, `NombreDueño`, `Edad`, `FechaNacimiento`) VALUES ('?', '?', '?', '?', '?', '?', '?');");
            st.setString(1, e.getDocumentoDueño());
            st.setString(2, e.getNombre());
            st.setInt(3, e.getTipo());
            st.setString(4, e.getRaza());
            st.setString(5, e.getNombreDueño());
            st.setInt(6, e.getEdad());
            st.setDate(7, (Date) e.getFechaNacimiento());
            st.executeUpdate();
            st.close();
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void Modificar(Mascota e) throws Exception {
        try{
            var st = DAOMascotaImpl.conn.prepareStatement("UPDATE `mascota` SET `Nombre` = ?, `Tipo` = ?, `Raza` = ?, `NombreDueño` = ?, `Edad` = ?, `FechaNacimiento` = ?, WHERE `DocumentoDueño` = ?;");
            st.setString(1, e.getNombre());
            st.setInt(2, e.getTipo());
            st.setString(3, e.getRaza());
            st.setString(4, e.getNombreDueño());
            st.setInt(5, e.getEdad());
            st.setDate(6, (Date) e.getFechaNacimiento());
            st.setString(7, e.getDocumentoDueño());
            st.executeUpdate();
            st.close();
        } catch(Exception ex) {
        
        }
    }

    @Override
    public void Eliminar(Mascota e) throws Exception {
        try{
        
        } catch(Exception ex) {
        
        }
    }

    @Override
    public ArrayList<Mascota> Listado() throws Exception {
        try{
        
        } catch(Exception ex) {
        
        }
        return null;
    }
    
}
