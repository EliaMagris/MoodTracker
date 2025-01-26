package org.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatGptRequest {

    private String model = "test-functionality-001";
    private String prompt;
    private int temperature = 1;

    @JsonProperty(value="max_tokens")
    private int maxTokens = 100;
}
