package com.ux.edu.conversational.ia.prompt;

import com.ux.edu.conversational.ia.strategy.ollama.intent_router.IntentRouter;

public class PromptService {
    private final IntentRouter router = new IntentRouter();
    public String generarPrompt(String inputUsuario){
        String rol = router.determinarRol(inputUsuario);
        String instrucciones = router.optimizarInstrucciones(inputUsuario);

        return new PromptBuilder()
                .setSystemPrompt("Actúa como: " + rol)
                .setExamples("Ejemplo:\nUsuario: Hola\nAsistente: Hola, ¿en qué puedo ayudarte?")
                .setUserPrompt(instrucciones)
                .build();
    }
}
