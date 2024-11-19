/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mycompany.veterinaria.clases.TipoMascota;
import com.mycompany.veterinaria.conexion.DAOTipo;
import com.mycompany.veterinaria.conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;
public class DAOTipoImpl extends conexion implements DAOTipo {

    @Override
    public void Registar(TipoMascota e) throws Exception {
        try {
            var st = DAOMascotaImpl.conn.prepareStatement("INSERT INTO tipomascota(IdTipoMascota, Descripcion) VALUES (NULL, ?);");
            st.setString(0, e.getDescripcion());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex){
        }
    }

    @Override
    public void Modificar(TipoMascota e) throws Exception {
        try {
            var st = DAOTipoImpl.conn.prepareStatement("");
            
        } catch (Exception ex){
        }
    }

    @Override
    public ArrayList<TipoMascota> Listado() throws Exception {
        ArrayList<TipoMascota> Lista = null;
        try {
            PreparedStatement st = DAOTipoImpl.conn.prepareStatement("SELECT * TipoMascota;");
        
            Lista = new ArrayList();
            ResultSet rs = st.executeQuery("");
            while (rs.next()){
                TipoMascota tipo = new TipoMascota();
                tipo.setDescripcion(rs.getString("Descripcion"));
                Lista.add(tipo);
            }
            rs.close();
            st.close();
            
        }catch(SQLException ex){
        }
        return Lista;
    }
    
}
