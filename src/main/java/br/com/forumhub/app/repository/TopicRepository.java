package br.com.forumhub.app.repository;

import br.com.forumhub.app.model.TopicModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicRepository extends JpaRepository<TopicModel, Long> {
    Optional<TopicModel> findByTitleAndMessage(String title, String message);
}
