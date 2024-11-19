/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.veterinaria.clases.Mascota;
import com.mycompany.veterinaria.conexion.DAOMascota;
import com.mycompany.veterinaria.conexion.conexion;
import java.sql.Connection;
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
            var st = DAOMascotaImpl.conn.prepareStatement("INSERT INTO Paciente(Documento, Nombre_Amo, Tipo, Raza, Nombre_Mascota, Historial) VALUES(?, ?, ?, ?, ?, NULL )");
            st.setString(1, e.getDocumentoDueño());
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public void Modificar(Mascota e) throws Exception {
        try{
        
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
