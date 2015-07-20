package com.meteor.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meteor.aop.jdk.IBusinessObject;
/**
 * SPRING ADVISER
 * XML PointCut
 * 
 * @author unseok.kim
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="test2-context.xml")
public class SpringJdkProxyTest2 {

	@Autowired
	IBusinessObject bizO;
	
	@Test
	public void plainImpleResult(){
		
		bizO.logic1("aa");
		
	}
	
	
	
	
}
