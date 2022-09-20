package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
	private String[] data = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
