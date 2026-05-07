package com.ux.edu.conversational.ia.strategy.gemmastrategy;

import com.ux.edu.conversational.ia.strategy.InteligenciaArtificialStrategy;
import com.ux.edu.conversational.ia.strategy.ollama.OllamaCliente;
import com.ux.edu.conversational.ia.strategy.ollama.OllamaRespuesta;

public class GemmaStrategy implements InteligenciaArtificialStrategy {

    @Override
    public String generarRespuesta(String prompt) {
        OllamaRespuesta respuesta =
                OllamaCliente.generar("gemma2:2b", prompt);
        return respuesta.getResponse();
    }

    @Override
    public String getNombreModelo() {
        return "Gemma2";
    }
}
