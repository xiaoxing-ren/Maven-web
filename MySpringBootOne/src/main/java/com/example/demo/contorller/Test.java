package com.example.demo.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("test.go")
	public String go(){
		
		return "hello";
	}
	
	@RequestMapping(value="test.go2",method=RequestMethod.POST)
	public String go2(){
		
		return "word";
	}
}
