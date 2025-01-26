package org.example.controllerRest;

import org.example.dto.GptResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.ChatGptService;

@RestController
@Slf4j
@RequestMapping("/api")
public class MoodAiRestController {

    @Autowired
    private ChatGptService chatGptService;

    @PostMapping("/searchChatGpt")
    public String searchChaGpt(@RequestBody GptResponseDto searchResult) {

       return chatGptService.processSearch(searchResult.getQ)
    }
}
