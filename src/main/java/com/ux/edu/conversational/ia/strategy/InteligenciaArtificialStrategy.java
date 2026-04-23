package com.ux.edu.conversational.ia.strategy;

public interface InteligenciaArtificialStrategy {

    // Definimos el contrato: recibir un prompt y devolver una respuesta

    String generarRespuesta(String prompt);

    String getNombreModelo();

}
