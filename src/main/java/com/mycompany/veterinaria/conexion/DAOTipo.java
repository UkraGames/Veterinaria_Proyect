/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.conexion;
import java.util.ArrayList;
import com.mycompany.veterinaria.clases.Tipo_Mascota;

/**
 *
 * @author aleji
 */
public interface DAOTipo {
    public void Registar(Tipo_Mascota e) throws Exception;
    public void Modificar(Tipo_Mascota e) throws Exception;
    public ArrayList<Tipo_Mascota> Listado() throws Exception;
    
}
