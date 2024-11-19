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
public class DAOTipoImpl extends conexion implements DAOTipo {

    @Override
    public void Registar(TipoMascota e) throws Exception {
        try {
            var st = DAOTipoImpl.conn.prepareStatement("INSERT INTO tipomascota(Descripcion) VALUES (?);");
            st.setString(1, e.getDescripcion());
            st.executeUpdate();
            st.close();
        } catch (SQLException ex){
        }
    }

    @Override
    public void Modificar(TipoMascota e) throws Exception {
        try {
            var st = DAOTipoImpl.conn.prepareStatement("UPTADE tipomascota SET Descripcion = ? WHERE IdTipoMascota = ?");
            st.setString(1, e.getDescripcion());
            st.setInt(2, e.getIdTipoMascota());
            st.executeUpdate();
            st.close();
            
        } catch (SQLException ex){
        }
    }

    @Override
    public ArrayList<TipoMascota> Listado() throws Exception {
        ArrayList<TipoMascota> Lista = null;
        try {
            PreparedStatement st = DAOTipoImpl.conn.prepareStatement("SELECT * FROM tipomascota;");
        
            Lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                TipoMascota tipo = new TipoMascota();
                tipo.setIdTipoMascota(rs.getInt("IdTipoMascota"));
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
