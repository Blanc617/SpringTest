package com.jinu.spring.test.thymeleaf;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jinu.spring.test.thymeleaf.domain.Weather;
import com.jinu.spring.test.thymeleaf.service.WeatherService;

@Controller
@RequestMapping("/thymeleaf/weather")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherService;
	
	@GetMapping("/list")
	public String weatherhistory(Model model) {
		
		// 날씨 기록 리스트 얻어 오기 
		List<Weather> weatherhistory = weatherService.getWeatherHistory();
		
		model.addAttribute("weatherhistory", weatherhistory);
		
		return "thymeleaf/weather/list";
	}
	
	@GetMapping("/input")
	public String weatherInput() {
		
		return "thymeleaf/weather/input";
		
	}
	
	
	@GetMapping("/create")
	public String createWeather(
	        @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
	        @RequestParam("weather") String weather,
	        @RequestParam("temperatures") double temperatures,
	        @RequestParam("precipitation") double precipitation,
	        @RequestParam("microDust") String microDust,
	        @RequestParam("windSpeed") double windSpeed) {

	    int count = weatherService.addWeather(date, weather, temperatures, precipitation, microDust, windSpeed);

	    return "redirect:/thymeleaf/weather/list";
	}

}