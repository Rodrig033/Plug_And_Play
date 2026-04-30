package com.ux.edu.conversational.ia.strategy.ollama;

public class MainTest {
    public static void main(String[] args) {
        OllamaRespuesta respuesta = OllamaCliente.generar("Explica qué es POO");

        if (respuesta != null) {
            System.out.println("Modelo: " + respuesta.getModel());
            System.out.println("Respuesta: " + respuesta.getResponse());
        }

    }
}
