package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
    void setRepository(SpeakerRepository spkrRepo);
}
