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
    private String NombreMascota;

    public Citas(int IdCitas, Date FechaCita, String Descripcion, int IdMascota) {
        this.IdCitas = IdCitas;
        this.FechaCita = FechaCita;
        this.Descripcion = Descripcion;
        this.IdMascota = IdMascota;
    }

    public Citas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public Date getFecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombreMascota() {
        return NombreMascota;
    }

    public void setNombreMascota(String NombreMascota) {
        this.NombreMascota = NombreMascota;
    }
    
    
}
