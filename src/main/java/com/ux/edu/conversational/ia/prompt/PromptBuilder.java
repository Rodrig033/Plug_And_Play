package com.ux.edu.conversational.ia.prompt;

public class PromptBuilder {
    private String systemPrompt;
    private String userPrompt;
    private String examples;

    // System prompt
    public PromptBuilder setSystemPrompt(String systemPrompt){
        this.systemPrompt = systemPrompt;
        return this;
    }

    // Ejemplos (few-shot)
    public PromptBuilder setExamples(String examples){
        this.examples = examples;
        return this;
    }

    // Entrada del usuario
    public PromptBuilder setUserPrompt(String userPrompt){
        this.userPrompt = userPrompt;
        return this;
    }

    // Construcción con delimitadores
    public String build(){
        return """
                <system>
                %s
                </system>
                <examples>
                %s
                </examples>
                <user>
                %s
                </user>
                """.formatted(systemPrompt, examples, userPrompt);
    }

}