package com.meteor.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meteor.aop.jdk.IBusinessObject;
/**
 * Advisor ����
 * XML ����
 * 
 * @author unseok.kim
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="test1-context.xml")
public class SpringJdkProxyTest1 {

	@Autowired
	IBusinessObject bizO;
	
	@Test
	public void plainImpleResult(){
		
//		IBusinessObject bizO = new BusinessImple();
		
		bizO.logic1("aa");
		
	}
	
	
	
	
}
