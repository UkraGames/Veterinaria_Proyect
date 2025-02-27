package com.mycompany.veterinaria.DB;

import com.mycompany.veterinaria.clases.Mascota;
import java.util.ArrayList;

public interface DAOMascota{
    public void Registrar(Mascota e) throws Exception;
    public void Modificar(Mascota e) throws Exception;
    public void Eliminar(Mascota e) throws Exception;
    public ArrayList<Mascota> Listado() throws Exception;
    public ArrayList<Mascota> Busqueda(String e) throws Exception;
}