package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")//keywork introduced by developer and not by Spring
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {



    @Autowired
    private Calendar cal;


    @Value("#{ T(java.lang.Math).random()*100}")
    private double seedNum;


    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Sachin");
        speaker.setLastName("Srivastava");
        speaker.setSeedNum(seedNum);
        speakers.add(speaker);
        System.out.println("cal Time :: "+cal.getTime() );
        return speakers;

    }


    public void setSeedNum(double seedNum) {
        this.seedNum = seedNum;
    }
}

