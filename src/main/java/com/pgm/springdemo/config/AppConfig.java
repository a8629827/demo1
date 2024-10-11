package com.pgm.springdemo.config;

import com.pgm.springdemo.sample.SampleDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SampleDTO myDTO1(){
    String[] hobbys={"잠자기", "여행"};
    return new SampleDTO("윤요섭", 25,hobbys);
}
    @Bean
    public SampleDTO myDTO2() {
    String[] hobbys = {"수영", "책읽기"};
    return new SampleDTO("박경미", 35, hobbys);
    }
    }
