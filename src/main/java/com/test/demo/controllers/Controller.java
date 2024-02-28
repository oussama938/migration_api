package com.test.demo.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.services.TestService;

@RestController
@RequestMapping("/sp/api")

public class Controller {
	@Autowired
	private TestService testService;
	
    @GetMapping("/call-sp")
    public List<Map<String, Object>> callSp(@RequestParam String aidprt, @RequestParam String sft) {
    	
        return testService.callSp(aidprt, sft);
    }
	

}
