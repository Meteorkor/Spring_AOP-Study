package com.meteor.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class fAspectDeclareOrder {
	/**
	 * ������ ��밡���ϸ�, �����ϴ� �뵵�θ� Ȱ���Ѵ�.
	 */
	@Pointcut("execution(* com.meteor.aop.jdk.*.*(..))")
	public void pointCut(){
	}
	
	/*�̷��� �ϸ� ��� �ɱ�?
	@Pointcut("execution(* com.meteor.aop.jdk.*.*(..))")
	public void before(){
		System.out.println( "AspectDeclare before()~!" );
	}
	*/
	
	/**
	 * �����̽� Before Ȱ��
	*/
	@Before("pointCut()")
	public void beforeTest(){
		System.out.println("Before Run~!Order" );
	}
	 
	
	/*
	 * �����̽� After Ȱ��
	 * 
	 *	*/ 
//	@After("pointCut(), pointCut()")
	@After("execution(* com.meteor.aop.jdk.*.*(..))")
	public void afterTest111(){
		System.out.println("After Run~!111Order" );
	}
	
	

	/*
//	@Around("execution(* com.meteor.aop.jdk.*.*(..))")
	@Around("pointCut(), pointCut()")
	public Object around( ProceedingJoinPoint pjp ) throws Throwable{
		System.out.println( "AspectDeclare before()~!" );
		Object ret = pjp.proceed();
		
		return ret;
	}
	*/
	/* �Ʒ�ó�� �ϸ� ��� �ɱ�?
	@Around("execution(* com.meteor.aop.jdk.*.*(..))")
	public void AroundBefore(){
		System.out.println( "AspectDeclare before()~!" );
	}
	*/
	
	
}