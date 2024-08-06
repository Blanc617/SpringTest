package com.jinu.spring.test.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lifecycle/test01")
public class test01Controller {

	@RequestMapping("/1")
	@ResponseBody
	public String welcome() {
		return "<h2>테스트 프로젝트</h2><h4>해당 프로젝트를 통해서 문제를 풀어 봅시다</h4>";
	}
	
	@RequestMapping("/2")
	@ResponseBody
	public Map<String, Integer> scoreData(){
		Map<String, Integer> scoreMap = new HashMap<>();
		
		scoreMap.put("국어", 80);
		scoreMap.put("수학", 90);
		scoreMap.put("영어", 85);
		
		return scoreMap;
	}
}
