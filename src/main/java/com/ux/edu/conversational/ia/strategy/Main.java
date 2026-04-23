package com.ux.edu.conversational.ia.strategy;

import com.ux.edu.conversational.ia.phi3strategy.Phi3Strategy;

public class Main {

    public static void main(String[] args) {

        AgenteConversacional miAgente = new AgenteConversacional();

        // 1. Usamos Llama3 para una tarea compleja

        miAgente.setModelo(new Llama3Strategy());

        miAgente.interactuar("Explica la física cuántica.");

        System.out.println("---");

        // 2. Cambiamos a Mistral en tiempo de ejecución por su rapidez

        miAgente.setModelo(new MistralStrategy());

        miAgente.interactuar("Dime un chiste corto.");

        // 3. Implementamos Phi3Strategy

        miAgente.setModelo(new Phi3Strategy());

        miAgente.interactuar("Explícale la computación cuántica a un niño de 8 años.");

    }

}
