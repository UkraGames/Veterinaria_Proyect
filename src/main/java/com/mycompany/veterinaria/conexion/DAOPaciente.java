package com.mycompany.veterinaria.conexion;

import com.mycompany.veterinaria.clases.Paciente;
import java.util.ArrayList;

public interface DAOPaciente{
    public void Registrar(Paciente e) throws Exception;
    public void Modificar(Paciente e) throws Exception;
    public void Eliminar(Paciente e) throws Exception;
    public ArrayList<Paciente> Listado() throws Exception;
}