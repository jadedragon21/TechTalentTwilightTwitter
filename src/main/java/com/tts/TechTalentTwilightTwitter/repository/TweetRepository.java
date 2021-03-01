package com.tts.TechTalentTwilightTwitter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tts.TechTalentTwilightTwitter.model.Tweet;
import com.tts.TechTalentTwilightTwitter.model.User;

public interface TweetRepository extends CrudRepository<Tweet, Long> {
    List<Tweet> findAllByOrderByCreatedAtDesc();

    List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);

    List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);

    public List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);
}