/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria.clases;

/**
 *
 * @author aleji
 */
public class TipoMascota {
    private int IdTipoMascota;
    private String Descripcion;

    public TipoMascota(String Descripcion) {
     this.Descripcion = Descripcion;
    }
    public TipoMascota() {
     
    }

    public int getIdTipoMascota() {
        return IdTipoMascota;
    }

    public void setIdTipoMascota(int IdTipoMascota) {
        this.IdTipoMascota = IdTipoMascota;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    @Override
    public String toString(){
        return (IdTipoMascota + "-" + Descripcion);
    }
}
