package org.example;

public class ComparadorDePeso {
    public Pesoable getPersonaMasPesada(Pesoable persona1, Pesoable persona2) {
        if (persona1.getPeso() > persona2.getPeso()) {
            return persona1;
        } else if (persona1.getPeso() < persona2.getPeso()) {
            return persona2;
        } else {
            return null;
        }
    }
}