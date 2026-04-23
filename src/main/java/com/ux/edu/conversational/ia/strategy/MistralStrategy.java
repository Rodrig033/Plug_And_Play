package com.ux.edu.conversational.ia.strategy;

// Estrategia 2: Mistral (Pensado para velocidad)

public class MistralStrategy implements InteligenciaArtificialStrategy {

    @Override

    public String generarRespuesta(String prompt) {

        return "[Mistral-Ollama]: Respuesta rápida generada para: " + prompt;

    }

    @Override

    public String getNombreModelo() { return "Mistral"; }

}