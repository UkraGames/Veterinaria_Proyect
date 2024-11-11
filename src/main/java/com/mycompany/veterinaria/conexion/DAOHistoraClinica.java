/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.conexion;

import com.mycompany.veterinaria.clases.Historia_Clinica;
import java.util.ArrayList;

/**
 *
 * @author aleji
 */
public interface DAOHistoraClinica {
    public void Registar(Historia_Clinica e) throws Exception;
    public void Modificar(Historia_Clinica e) throws Exception;
    public ArrayList<Historia_Clinica> Listado() throws Exception;
}
