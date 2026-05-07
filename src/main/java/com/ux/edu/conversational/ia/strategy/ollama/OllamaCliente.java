package com.ux.edu.conversational.ia.strategy.ollama;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ux.edu.conversational.ia.prompt.PromptBuilder;

public class OllamaCliente {
    private static final String URL = "http://localhost:11434/api/generate";
    private static String generarRespuesta(

            String modelo,
            String prompt

    ) {

        try {

            HttpClient client =
                    HttpClient.newHttpClient();

            String promptSeguro = prompt
                    .replace("\n", "\\n")
                    .replace("\"", "\\\"");

            String json = """

            {
            
              "model": "%s",
              "prompt": "%s",
              "stream": false

            }

            """.formatted(modelo, promptSeguro);
            System.out.println(json);

            HttpRequest request =
                    HttpRequest.newBuilder()
                            .uri(URI.create(URL))
                            .header(
                                    "Content-Type",
                                    "application/json"
                            )

                            .POST(
                                    HttpRequest.BodyPublishers
                                            .ofString(json)

                            )
                            .build();

            HttpResponse<String> response =
                    client.send(
                            request,
                            HttpResponse.BodyHandlers
                                    .ofString()

                    );

            System.out.println("BODY:");
            System.out.println(response.body());

            return response.body();

        } catch (Exception e) {

            e.printStackTrace();

            return null;

        }
    }

    public static OllamaRespuesta generar(
            String modelo,
            String prompt
    ) {

        try {
            String json =
                    generarRespuesta(
                            modelo,
                            prompt
                    );

            if (json == null) {
                return null;
            }

            ObjectMapper mapper =
                    new ObjectMapper();
            return mapper.readValue(
                    json,
                    OllamaRespuesta.class

            );

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
