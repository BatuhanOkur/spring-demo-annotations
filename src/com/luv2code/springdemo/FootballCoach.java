package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	
	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Work for freekicks one hour per day!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getTeam() {
		// TODO Auto-generated method stub
		return team;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

}
