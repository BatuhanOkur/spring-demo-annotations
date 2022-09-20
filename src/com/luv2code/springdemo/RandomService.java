package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
	private String[] data = {
			"O ciyanno fatto bene",
			"Resultante importante",
			"What can I do, sometimes?"
	};
	
	Random rnd = new Random();
	
	@Override
	public String getFortune() {
		String theFortune = data[rnd.nextInt(data.length)];
		return theFortune;
	}

}
