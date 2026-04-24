package com.ux.edu.conversational.ia.strategy;

import com.ux.edu.conversational.ia.prompt.PromptBuilder;

public class Llama3Strategy implements InteligenciaArtificialStrategy {

    @Override

    public String generarRespuesta(String prompt) {

        PromptBuilder builder = new PromptBuilder()
                // Sistema
                .setSystemPrompt("Eres un experto en programación. Responde de forma clara y técnica.")
                // Ejemplos
                .setExamples("""
                        Usuario: ¿Qué es una variable?
                        IA: Una variable es un espacio en memoria que almacena un valor.
                        Usuario: ¿Qué es un bucle?
                        IA: Un bucle es una estructura que repite instrucciones.
                        """)
                // Input del usuerio
                .setUserPrompt(prompt);
        String promptFinal = builder.build();

        // Simulación del modelo
        return "[Llama3-Ollama]: Procesando...\n" + promptFinal;

    }

    @Override

    public String getNombreModelo() {
        return "Llama3";
    }

}



