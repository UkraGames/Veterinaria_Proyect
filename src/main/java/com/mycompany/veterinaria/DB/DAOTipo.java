/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.DB;
import java.util.ArrayList;
import com.mycompany.veterinaria.clases.TipoMascota;

/**
 *
 * @author aleji
 */
public interface DAOTipo {
    public void Registar(TipoMascota e) throws Exception;
    public void Modificar(TipoMascota e) throws Exception;
    public ArrayList<TipoMascota> Listado() throws Exception;
    
}
