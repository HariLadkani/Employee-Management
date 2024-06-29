package com.luv2code.springboot.demo.mycoolapp.common;

import com.luv2code.springboot.demo.mycoolapp.common.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("in constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice fast bowling for 15 minutes!";
    }
}
