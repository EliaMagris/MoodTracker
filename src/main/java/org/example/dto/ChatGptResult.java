package org.example.dto;

import lombok.Data;

import java.util.List;

@Data
public class ChatGptResult {

    private List<ChatGptChoice> choices;
}
