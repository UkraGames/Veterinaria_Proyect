/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.conexion;

import com.mycompany.veterinaria.clases.HistoriaClinica;
import java.util.ArrayList;

/**
 *
 * @author aleji
 */
public interface DAOHistoraClinica {
    public void Registar(HistoriaClinica e) throws Exception;
    public void Modificar(HistoriaClinica e) throws Exception;
    public ArrayList<HistoriaClinica> Listado() throws Exception;
}
