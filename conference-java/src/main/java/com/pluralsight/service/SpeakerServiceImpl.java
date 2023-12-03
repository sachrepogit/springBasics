package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Calendar;
import java.util.List;

//@Bean -- Not applicable to type
@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository repository;


    public SpeakerServiceImpl(){
        System.out.println("No Argument Constructor");
    }


    public SpeakerServiceImpl(SpeakerRepository spkrRepo){
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = spkrRepo;
    }
    @Override
    public List<Speaker> findAll(){
        // HibernateSpeakerRepositoryImpl hiberSpeakerRepoImpl = new HibernateSpeakerRepositoryImpl();
        return repository.findAll();
    }

    @PostConstruct
    private void initialize(){
        System.out.println("we are called after constructor");
    }

    @Override
    public void setRepository(SpeakerRepository spkrRepo) {
        System.out.println("speakerServiceImpl setter");
        this.repository = spkrRepo;

    }
}
