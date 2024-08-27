package com.jinu.spring.test.thymeleaf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jinu.spring.test.thymeleaf.domain.Weather;
import com.jinu.spring.test.thymeleaf.repository.WeatherRepository;

@Service
public class WeatherService {
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	public List<Weather> getWeatherHistory() {
		List<Weather> weatherhistory = weatherRepository.selectWeatherHistory();
		return weatherhistory;
	}

}
