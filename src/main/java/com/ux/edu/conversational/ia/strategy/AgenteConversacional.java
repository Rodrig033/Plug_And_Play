package com.ux.edu.conversational.ia.strategy;

import com.ux.edu.conversational.ia.prompt.PromptBuilder;
import com.ux.edu.conversational.ia.strategy.ollama.intent_router.IntentRouter;

public class AgenteConversacional {

    private InteligenciaArtificialStrategy modelo;
    // El corazón del patrón: inyección de la estrategia

    public AgenteConversacional(

            InteligenciaArtificialStrategy modelo

    ) {

        this.modelo = modelo;

    }

    public void interactuar(String inputUsuario) {

        IntentRouter router =

                new IntentRouter();

        String rol =

                router.determinarRol(inputUsuario);

        String instrucciones =

                router.optimizarInstrucciones(inputUsuario);

        String prompt = new PromptBuilder()

                .setSystemPrompt(

                        "Actúa como: " + rol

                )

                .setExamples("""

                        Usuario: Hola

                        Asistente: Hola, ¿en qué puedo ayudarte?

                        """)

                .setUserPrompt(instrucciones)

                .build();

        String respuesta =

                modelo.generarRespuesta(prompt);

        System.out.println("\nModelo: "

                + modelo.getNombreModelo());

        System.out.println("\nRespuesta:\n");

        System.out.println(respuesta);

    }
}
