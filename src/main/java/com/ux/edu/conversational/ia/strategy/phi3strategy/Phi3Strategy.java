package com.ux.edu.conversational.ia.strategy.phi3strategy;

import com.ux.edu.conversational.ia.strategy.AgenteConversacional;
import com.ux.edu.conversational.ia.strategy.InteligenciaArtificialStrategy;
import com.ux.edu.conversational.ia.strategy.ollama.OllamaCliente;
import com.ux.edu.conversational.ia.strategy.ollama.OllamaRespuesta;

public class Phi3Strategy implements InteligenciaArtificialStrategy {

    @Override
    public String generarRespuesta(String prompt) {
        OllamaRespuesta respuesta =
                OllamaCliente.generar("phi3:mini", prompt);
        return respuesta.getResponse();
    }

    @Override
    public String getNombreModelo() {
        return "Phi3 Mini";
    }
}
