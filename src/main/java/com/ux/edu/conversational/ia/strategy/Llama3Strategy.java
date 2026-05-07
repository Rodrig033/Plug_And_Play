package com.ux.edu.conversational.ia.strategy;

import com.ux.edu.conversational.ia.prompt.PromptBuilder;
import com.ux.edu.conversational.ia.strategy.ollama.OllamaCliente;
import com.ux.edu.conversational.ia.strategy.ollama.OllamaRespuesta;

public class Llama3Strategy implements InteligenciaArtificialStrategy {

    @Override

    public String generarRespuesta(String prompt) {

        OllamaRespuesta respuesta =

                OllamaCliente.generar(
                        "llama3.2:3b",
                        prompt
                );

        if (respuesta == null) {

            return "Error al obtener respuesta.";

        }

        return respuesta.getResponse();

    }

    @Override

    public String getNombreModelo() {

        return "Llama3";

    }
}



