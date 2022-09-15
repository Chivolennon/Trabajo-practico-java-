package com.example.ezbro;

public class ListElement
{
    public String color;
    public String nombre;
    public String ciudad;
    public String estado;


    public ListElement(String color, String nombre, String ciudad, String estado) {
        this.color = color;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
