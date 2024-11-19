/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.clases;

import java.sql.Date;

/**
 *
 * @author aleji
 */
public class Citas {
    private int IdCitas;
    private Date FechaCita;
    private String Descripcion;
    private int IdMascota;

    public Citas(int IdCitas, Date FechaCita, String Descripcion, int IdMascota) {
        this.IdCitas = IdCitas;
        this.FechaCita = FechaCita;
        this.Descripcion = Descripcion;
        this.IdMascota = IdMascota;
    }

    public int getIdCitas() {
        return IdCitas;
    }

    public void setIdCitas(int IdCitas) {
        this.IdCitas = IdCitas;
    }

    public Date getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(Date FechaCita) {
        this.FechaCita = FechaCita;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getIdMascota() {
        return IdMascota;
    }

    public void setIdMascota(int IdMascota) {
        this.IdMascota = IdMascota;
    }
    
    
}
