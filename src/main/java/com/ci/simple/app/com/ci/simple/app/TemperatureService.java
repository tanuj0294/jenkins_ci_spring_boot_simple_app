package com.ci.simple.app.com.ci.simple.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

	
	public String getSingleTemperature() {
		return "40";
	}
	
	public List<String> getTemperatures() {
		
		List<String> temps = new ArrayList<>();
		temps.add("11");
		temps.add("12");
		
		return temps;
		
	}
	
}
