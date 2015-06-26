package com.meteor.aop;

import org.junit.Test;

import com.meteor.aop.jdk.BusinessDecorator;
import com.meteor.aop.jdk.BusinessImple;
import com.meteor.aop.jdk.IBusinessObject;

public class JdkProxyTest {

//	@Test
	public void plainImpleResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		bizO.logic("aa");
		
	}
	
//	@Test
	public void decoratorResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		BusinessDecorator bizDeco = new BusinessDecorator(bizO);
		
		bizDeco.logic("user");
		
	}
	
	//////////////////////
	// 다이나믹 프록시
	//////////////////////
	
	
	
	
	
	
	
	
}
