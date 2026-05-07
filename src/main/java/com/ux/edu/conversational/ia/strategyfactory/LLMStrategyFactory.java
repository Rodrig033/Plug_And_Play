package com.ux.edu.conversational.ia.strategyfactory;

import com.ux.edu.conversational.ia.strategy.InteligenciaArtificialStrategy;
import com.ux.edu.conversational.ia.strategy.Llama3Strategy;
import com.ux.edu.conversational.ia.strategy.gemmastrategy.GemmaStrategy;
import com.ux.edu.conversational.ia.strategy.phi3strategy.Phi3Strategy;

public class LLMStrategyFactory {
    public static InteligenciaArtificialStrategy crearModelo(int opcion) {

        switch (opcion) {

            case 1:

                return new Llama3Strategy();

            case 2:

                return new GemmaStrategy();

            case 3:

                return new Phi3Strategy();

            default:

                throw new IllegalArgumentException(

                        "Modelo inválido"

                );

        }

    }
}
