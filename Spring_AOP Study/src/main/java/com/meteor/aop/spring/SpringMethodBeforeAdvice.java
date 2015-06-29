package com.meteor.aop.spring;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class SpringMethodBeforeAdvice implements  MethodBeforeAdvice{

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println( "SpringMethodBeforeAdvice Call~!" );
		
	}

}
