package org.example;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Persona1", 90);
        Persona persona2 = new Persona("Persona2", 80);

        ComparadorDePeso comparador = new ComparadorDePeso();
        Pesoable personaMasPesada = comparador.getPersonaMasPesada(persona1, persona2);

        if (personaMasPesada != null) {
            System.out.println("La persona más pesada es: " + personaMasPesada.getPeso());
        } else {
            System.out.println("Ambas personas tienen el mismo peso.");
        }
    }
}