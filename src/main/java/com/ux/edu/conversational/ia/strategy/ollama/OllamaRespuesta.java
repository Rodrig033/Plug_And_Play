package com.ux.edu.conversational.ia.strategy.ollama;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ux.edu.conversational.ia.strategy.Llama3Strategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class OllamaRespuesta {
    private String model;
    private String response;
    private Boolean done;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

}
