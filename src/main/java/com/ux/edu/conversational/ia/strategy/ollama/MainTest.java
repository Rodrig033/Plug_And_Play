package com.ux.edu.conversational.ia.strategy.ollama;

import com.ux.edu.conversational.ia.prompt.PromptBuilder;
import com.ux.edu.conversational.ia.strategy.AgenteConversacional;
import com.ux.edu.conversational.ia.strategy.InteligenciaArtificialStrategy;
import com.ux.edu.conversational.ia.strategy.ollama.intent_router.IntentRouter;
import com.ux.edu.conversational.ia.strategyfactory.LLMStrategyFactory;

import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("""

                === Nexus Brain ===

                Selecciona un modelo:
                
                1. Llama3.2 3B

                2. Gemma2 2B

                3. Phi3 Mini

                """);

        int opcion = scanner.nextInt();

        scanner.nextLine();

        InteligenciaArtificialStrategy modelo =

                LLMStrategyFactory.crearModelo(opcion);

        AgenteConversacional agente =

                new AgenteConversacional(modelo);

        System.out.print("\nPrompt: ");

        String inputUsuario =

                scanner.nextLine();

        agente.interactuar(inputUsuario);

        scanner.close();

    }
}