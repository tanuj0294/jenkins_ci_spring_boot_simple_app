package com.ci.simple.app.com.ci.simple.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureController {
	
	@Autowired
	TemperatureService svc;
	
	@GetMapping("/getOne")
	public String getOneTemp() {
		return svc.getSingleTemperature();
	}
	
	@GetMapping("getAll")
	public List<String> getAll(){
		return svc.getTemperatures();
	}

}
