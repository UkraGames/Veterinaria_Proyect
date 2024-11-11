/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.clases; 
public class Historia_Clinica {
    private int ID_Historia_Clinica;
    private String Fecha_Apertura;
    private String Fecha_Cita;
    private String Descripcion;
    private int ID_Mascota;

    public int getID_Historia_Clinica() {
        return ID_Historia_Clinica;
    }

    public void setID_Historia_Clinica(int ID_Historia_Clinica) {
        this.ID_Historia_Clinica = ID_Historia_Clinica;
    }

    public String getFecha_Apertura() {
        return Fecha_Apertura;
    }

    public void setFecha_Apertura(String Fecha_Apertura) {
        this.Fecha_Apertura = Fecha_Apertura;
    }

    public String getFecha_Cita() {
        return Fecha_Cita;
    }

    public void setFecha_Cita(String Fecha_Cita) {
        this.Fecha_Cita = Fecha_Cita;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getID_Mascota() {
        return ID_Mascota;
    }

    public void setID_Mascota(int ID_Mascota) {
        this.ID_Mascota = ID_Mascota;
    }
    
}
