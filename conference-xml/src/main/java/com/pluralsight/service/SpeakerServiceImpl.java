package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

//@Bean -- Not applicable to type
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
    }

   /* public SpeakerServiceImpl(SpeakerRepository speakRepo){
        repository = speakRepo;
    }
*/
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
