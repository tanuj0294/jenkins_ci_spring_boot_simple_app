package com.ci.simple.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ci.simple.app.com.ci.simple.app.TemperatureService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
public class TempServiceTest {

	@InjectMocks
	TemperatureService svc = new TemperatureService();
	
	@Test
	public void getOneTest() {
		String t1 = svc.getSingleTemperature();
		Assert.assertEquals("40", t1);
	}
	
	
}
