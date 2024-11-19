/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.clases; 
public class HistoriaClinica {
    private int IdHistoriaClinica;
    private String FechaCita;
    private String Seguimiento;
    private String Recetado;
    private int IdMascota;

    public HistoriaClinica(int IdHistoriaClinica, String FechaCita, String Seguimiento, String Recetado, int IdMascota) {
        this.IdHistoriaClinica = IdHistoriaClinica;
        this.FechaCita = FechaCita;
        this.Seguimiento = Seguimiento;
        this.Recetado = Recetado;
        this.IdMascota = IdMascota;
    }

    public int getIdHistoriaClinica() {
        return IdHistoriaClinica;
    }

    public void setIdHistoriaClinica(int IdHistoriaClinica) {
        this.IdHistoriaClinica = IdHistoriaClinica;
    }

    public String getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(String FechaCita) {
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
    
    
}