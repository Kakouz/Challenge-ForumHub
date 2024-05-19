package br.com.forumhub.app.controller;

import br.com.forumhub.app.dto.TopicRequestDTO;
import br.com.forumhub.app.dto.TopicResponseDTO;
import br.com.forumhub.app.service.TopicService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topicos")
public class TopicController {

    @Autowired
    TopicService topicService;

    @PostMapping
    public ResponseEntity<?> createTopic(@RequestBody @Valid TopicRequestDTO topicRequestDTO) {
        TopicResponseDTO topicResponseDTO = topicService.saveTopic(topicRequestDTO);
        if (topicResponseDTO == null) {
            return ResponseEntity.badRequest().body("{\"error_message\": \"Topic already exists\", \"status\": 400}");
        }
        return ResponseEntity.ok().body(topicResponseDTO);
    }

    @GetMapping
    public String getTopics() {
        return "Topics retrieved";
    }
}
