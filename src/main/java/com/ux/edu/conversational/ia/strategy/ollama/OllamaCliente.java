package com.ux.edu.conversational.ia.strategy.ollama;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class OllamaCliente {
    private static final String URL = "http://localhost:11434/api/generate";

    private static String generarRespuesta(String prompt){
        try {
            HttpClient client = HttpClient.newHttpClient();
            String json = """
                {
                  "model": "llama3.2:3b",
                  "prompt": "%s",
                  "stream": false
                }
                """.formatted(prompt);

            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(json)).build();

            HttpResponse <String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public static OllamaRespuesta generar(String prompt){
        try {
            String json = generarRespuesta(prompt);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, OllamaRespuesta.class);

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
