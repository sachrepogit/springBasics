package com.pluralsight;

import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.pluralsight.service.SpeakerService;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan({"com.pluralsight"}) //The bean annotation is only applicable at method level. Bean annotation is not defined at Class level.
public class AppConfig
{

    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
   // @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService(){
       SpeakerService spkSerImpl = new SpeakerServiceImpl(getSpeakerRepository());
        //SpeakerService spkSerImpl = new SpeakerServiceImpl();
        //spkSerImpl.setRepository(getSpeakerRepository());
        return spkSerImpl;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

   }
