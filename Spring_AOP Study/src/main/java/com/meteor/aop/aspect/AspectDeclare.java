package com.meteor.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectDeclare {
	/**
	 * 여러개 사용가능하며, 정의하는 용도로만 활용한다.
	 */
	@Pointcut("execution(* com.meteor.aop.jdk.*.*(..))")
	public void pointCut(){
	}
	
	/*이렇게 하면 어떻게 될까?
	@Pointcut("execution(* com.meteor.aop.jdk.*.*(..))")
	public void before(){
		System.out.println( "AspectDeclare before()~!" );
	}
	*/
	
	/**
	 * 어드바이스 Before 활용
	
	@Before("pointCut()")
	public void beforeTest(){
		System.out.println("Before Run~!" );
	}
	 */
	
	/*
	 * 어드바이스 After 활용
	 * 
	 *	*/ 
//	@After("pointCut(), pointCut()")
	@After("execution(* com.meteor.aop.jdk.*.*(..))")
	public void afterTest(){
		System.out.println("After Run~!" );
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
	/* 아래처럼 하면 어떻게 될까?
	@Around("execution(* com.meteor.aop.jdk.*.*(..))")
	public void AroundBefore(){
		System.out.println( "AspectDeclare before()~!" );
	}
	*/
	
	
}
