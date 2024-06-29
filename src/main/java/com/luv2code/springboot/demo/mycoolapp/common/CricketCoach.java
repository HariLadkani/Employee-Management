package com.luv2code.springboot.demo.mycoolapp.common;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 15 minutes!";
    }
}
