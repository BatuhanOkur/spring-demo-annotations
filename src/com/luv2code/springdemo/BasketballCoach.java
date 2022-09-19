package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Work for free throws";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
