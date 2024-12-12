/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.clases; 

import java.util.Date;


public class HistoriaClinica {
    private int IdHistoriaClinica;
    private Date FechaCita;
    private String Seguimiento;
    private String Recetado;
    private int IdMascota;
    Mascota mas;

    public HistoriaClinica(Date FechaCita, String Seguimiento, String Recetado, int IdMascota) {
        this.FechaCita = FechaCita;
        this.Seguimiento = Seguimiento;
        this.Recetado = Recetado;
        this.IdMascota = IdMascota;
    }

    public HistoriaClinica() {
        
    }

    public int getIdHistoriaClinica() {
        return IdHistoriaClinica;
    }

    public void setIdHistoriaClinica(int IdHistoriaClinica) {
        this.IdHistoriaClinica = IdHistoriaClinica;
    }

    public Date getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(Date FechaCita) {
        this.FechaCita = FechaCita;
    }

    public String getSeguimiento() {
        return Seguimiento;
    }

    public void setSeguimiento(String Seguimiento) {
        this.Seguimiento = Seguimiento;
    }

    public String getRecetado() {
        return Recetado;
    }

    public void setRecetado(String Recetado) {
        this.Recetado = Recetado;
    }

    public int getIdMascota() {
        return IdMascota;
    }

    public void setIdMascota(int IdMascota) {
        this.IdMascota = IdMascota;
    }
    
    @Override
    public String toString(){
        return ( IdHistoriaClinica + ". " + mas.getNombre() );
    }
}