package org.example;

public class Persona implements Pesoable {
    private double peso;
    private String nombre;

    public Persona(String nombre, double peso) {
        this.peso = peso;
        this.nombre= nombre;
    }

    @Override
    public double getPeso() {
        return peso;
    }

}
