package com.project.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception{
        return "HDLine";
    }
	
	@RequestMapping("/member/board")
	public String modelboard() {
//		return "ii";
		return "modelAppealBoardList";
	}
}
