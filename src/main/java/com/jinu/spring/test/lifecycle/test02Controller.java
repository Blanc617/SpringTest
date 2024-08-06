package com.jinu.spring.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @Controller + @ResponseBody
@RequestMapping("/lifecycle/test02")
public class test02Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public List<Map<String, Object>> movieList()  {
		
			List<Map<String, Object>> movieList = new ArrayList<>();
		
            Map<String, Object> movieMap = new HashMap<>();
            
            movieMap.put("rate", 15);
            movieMap.put("director", "봉준호");
            movieMap.put("time", 131);
            movieMap.put("title", "기생충");
            movieList.add(movieMap);
            
            movieMap = new HashMap<>();
            movieMap.put("rate", 12);
            movieMap.put("director", "로베르토 베니니");
            movieMap.put("time", 131);
            movieMap.put("title", "인생은 아름다워");
            movieList.add(movieMap);  
            
            movieMap = new HashMap<>();
            movieMap.put("rate", 12);
            movieMap.put("director", "크리스토퍼 놀란");
            movieMap.put("time", 131);
            movieMap.put("title", "인셉션");
            movieList.add(movieMap);
            
            return movieList;
            
	}
	
	
	@RequestMapping("/2")
	@ResponseBody
	public List<Post> postList() {
        List<Post> postList = new ArrayList<>();
        postList.add(new Post("안녕하세요 가입인사 드립니다.", "hagulu", "안녕하세요. 가입했어요. 앞으로 잘 부탁 드립니다. 활동 열심히 하겠습니다."));
        postList.add(new Post("헐 대박", "bada", "오늘 목요일이 었어...금요일인줄"));
        postList.add(new Post("오늘 데이트 한 이야기 해드릴게요", "dulumary", "...."));
        return postList;
    }
	
	@RequestMapping("/3")
	@ResponseBody
	public ResponseEntity<Post> entityResponse() {
		Post write = new Post("안녕히가세요 가입인사 드립니다.", "hagulu", "안녕하세요.가입했어요. 앞으로 잘 부탁드립니다.");
				
		return new ResponseEntity<>(write, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}




