package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repo;

    public SpeakerServiceImpl(){
        System.out.println("speakerServiceImpl no arg constructor");
    }
    public SpeakerServiceImpl(SpeakerRepository spkrRepo){
        repo = spkrRepo;
    }
    @Override
    public List<Speaker> findAll(){
        // HibernateSpeakerRepositoryImpl hiberSpeakerRepoImpl = new HibernateSpeakerRepositoryImpl();
        System.out.println("speakerServiceImpl repository Constructor");
        return repo.findAll();
    }

    @Autowired
    @Override
    public void setRepository(SpeakerRepository spkrRepo) {
        System.out.println("speakerServiceImpl setter");
        this.repo = spkrRepo;

    }
}
