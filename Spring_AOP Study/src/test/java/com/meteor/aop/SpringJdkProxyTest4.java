package com.meteor.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meteor.aop.jdk.IBusinessObject;
/**
 * ASPECT ±¸Çö Áß
 * 
 * @author unseok.kim
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="test4-context.xml")
public class SpringJdkProxyTest4 {
	
	@Autowired
	IBusinessObject bizO;
	
	
	@Test
	public void plainImpleResult(){
	
		//bizO = new BusinessImple();
		bizO.logic1("aa");
		
	}
	
	
	
	
}
