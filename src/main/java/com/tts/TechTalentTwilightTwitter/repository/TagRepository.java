package com.tts.TechTalentTwilightTwitter.repository;

import org.springframework.data.repository.CrudRepository;

import com.tts.TechTalentTwilightTwitter.model.Tag;

public interface TagRepository extends CrudRepository<Tag, Long> {
    public Tag findByPhrase(String phrase);
}
