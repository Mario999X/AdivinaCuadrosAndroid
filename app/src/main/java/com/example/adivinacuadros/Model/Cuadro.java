package com.example.adivinacuadros.Model;

public class Cuadro {

    private String nombre;
    private int imagen;

    public Cuadro() {
    }

    public Cuadro(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
