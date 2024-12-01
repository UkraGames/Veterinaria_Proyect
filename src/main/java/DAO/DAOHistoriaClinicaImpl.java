
package DAO;
import com.mycompany.veterinaria.clases.HistoriaClinica;
import com.mycompany.veterinaria.clases.Mascota;
import com.mycompany.veterinaria.conexion.DAOHistoriaClinica;
import com.mycompany.veterinaria.conexion.conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class DAOHistoriaClinicaImpl extends conexion implements DAOHistoriaClinica {

    @Override
    public void Registar(HistoriaClinica e) throws Exception {
        try{
            var st = DAOHistoriaClinicaImpl.conn.prepareStatement("INSERT INTO historiaclinica (FechaCita, Seguimiento, Recetado, idMascota) VALUES (?, ?, ?, ?)");
            st.setDate(1, (Date) e.getFechaCita());
            st.setString(2, e.getSeguimiento()); 
            st.setString(3, e.getRecetado());
            st.setInt(4, e.getIdMascota());
            st.close();
        }catch(Exception ex){
        
        }
    }

    @Override
    public void Modificar(HistoriaClinica e) throws Exception {
        try{
            PreparedStatement st = conn.prepareStatement("UPDATE `historiaclinica` SET `FechaCita` = ?, `Seguimineto` = ?, `Recetado` = ? WHERE `idMascota` = ?;");
            st.setDate(1, (Date) e.getFechaCita());
            st.setString(2, e.getSeguimiento()); 
            st.setString(3, e.getRecetado());
            st.setInt(4, e.getIdMascota());

        }catch(Exception ex){
            
        }
    }

    @Override
    public ArrayList<HistoriaClinica> Listado() throws Exception {
                ArrayList<HistoriaClinica> Lista = null;
        try {
            PreparedStatement st = DAOTipoImpl.conn.prepareStatement("SELECT * FROM tipomascota;");
        
            Lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()){
                HistoriaClinica histo = new HistoriaClinica();
                histo.setIdHistoriaClinica(rs.getInt("IdTipoMascota"));
                histo.setFechaCita(rs.getDate("FechaCita"));
                histo.setSeguimiento(rs.getString("Seguimiento"));
                histo.setRecetado(rs.getString("Recetado"));
                histo.setIdMascota(rs.getInt("IdMascota"));
                Lista.add(histo);
            }
            rs.close();
            st.close();
            
        }catch(SQLException ex){
        }
        return Lista;
    }
    
}
