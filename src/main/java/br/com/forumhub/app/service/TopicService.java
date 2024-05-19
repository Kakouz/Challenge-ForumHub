package br.com.forumhub.app.service;

import br.com.forumhub.app.dto.TopicRequestDTO;
import br.com.forumhub.app.dto.TopicResponseDTO;
import br.com.forumhub.app.model.TopicModel;
import br.com.forumhub.app.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public TopicResponseDTO saveTopic(TopicRequestDTO dto) {
        TopicModel topicModel = new TopicModel().fromDTO(dto);
        Optional<TopicModel> topic = topicRepository.findByTitleAndMessage(topicModel.getTitle(), topicModel.getMessage());
        if (topic.isPresent()) {
            return null;
        }
        topicModel = topicRepository.save(topicModel);
        return new TopicResponseDTO(topicModel);
    }
}
