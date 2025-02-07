package com.mycompany.veterinaria.clases;

import java.util.Date;

public class Mascota {
    
    private String DocumentoDueño;
    private String Nombre;
    private int Tipo;
    private String Raza;
    private String NombreDueño;
    private int Edad;
    private Date FechaNacimiento;

    public Mascota(String DocumentoDueño, String Nombre, int Tipo, String Raza, String NombreDueño, int Edad, Date FechaNacimiento) {
  
        this.DocumentoDueño = DocumentoDueño;
        this.Nombre = Nombre;
        this.Tipo = Tipo;
        this.Raza = Raza;
        this.NombreDueño = NombreDueño;
        this.Edad = Edad;
        this.FechaNacimiento = FechaNacimiento;
    }

    public Mascota() {
        
    }
    public String getDocumentoDueño() {
        return DocumentoDueño;
    }

    public void setDocumentoDueño(String DocumentoDueño) {
        this.DocumentoDueño = DocumentoDueño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String NombreDueño) {
        this.NombreDueño = NombreDueño;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    
    
}