package com.ux.edu.conversational.ia.strategy.ollama;

public class MainTest {
    public static void main(String[] args) {
        // Prompt (input)
        OllamaRespuesta respuesta = OllamaCliente.generar("Explica qué es POO");

        if (respuesta != null) {
            // Agente
            System.out.println("Modelo: " + respuesta.getModel());
            // Respuesta (output)
            System.out.println("Respuesta: " + respuesta.getResponse());
        }

    }
}