package com.mycompany.veterinaria.clases;

public class Paciente {
    private String Documento;
    private String Nombre_Amo;
    private int Tipo;
    private String Raza;
    private String Nombre_Mascota;
    private int Historial;

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombre_Amo() {
        return Nombre_Amo;
    }

    public void setNombre_Amo(String Nombre_Amo) {
        this.Nombre_Amo = Nombre_Amo;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public String getRaza() {
        return Raza;
    }

    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    public String getNombre_Mascota() {
        return Nombre_Mascota;
    }

    public void setNombre_Mascota(String Nombre_Mascota) {
        this.Nombre_Mascota = Nombre_Mascota;
    }

    public int getHistorial() {
        return Historial;
    }

    public void setHistorial(int Historial) {
        this.Historial = Historial;
    }
    
    
}