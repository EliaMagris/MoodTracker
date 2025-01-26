package service;

import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.example.dto.ChatGptRequest;
import org.example.dto.ChatGptResult;
import org.springframework.stereotype.Service;

@Service
public class ChatGptService {

    public String processSearch(String query){

        ChatGptRequest chatGptRequest = new ChatGptRequest();
        chatGptRequest.setPrompt(query);

        String url =
        HttpPost post = new HttpPost()
        ChatGptResult chatGptResult;

        return chatGptResult.getChoices().get(0).getText();
    }
}
