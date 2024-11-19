/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.veterinaria.conexion;
import com.mycompany.veterinaria.clases.Citas;
import java.util.ArrayList;

public interface DAOCitas {


    public void Registar(Citas e) throws Exception;
    public void Modificar(Citas e) throws Exception;
    public ArrayList<Citas> Listado() throws Exception;

}
