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

    private SpeakerRepository repo;

    public SpeakerServiceImpl(){
        System.out.println("No Argument Constructor");
    }

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository spkrRepo){
        System.out.println("SpeakerServiceImpl repository constructor");
        repo = spkrRepo;
    }
    @Override
    public List<Speaker> findAll(){
        // HibernateSpeakerRepositoryImpl hiberSpeakerRepoImpl = new HibernateSpeakerRepositoryImpl();
        System.out.println("speakerServiceImpl repository Constructor");
        return repo.findAll();
    }



    @Override
    public void setRepository(SpeakerRepository spkrRepo) {
        System.out.println("speakerServiceImpl setter");
        this.repo = spkrRepo;

    }
}
