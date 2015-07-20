package com.meteor.aop.spring;


/**
 * 어드바이스
 * @author Tmax
 *
 */
public class SpringAdviser {

	public void before(){
		System.out.println( this.getClass().getName() + "before()" );
		
	}
	
	public void after(){
		System.out.println( this.getClass().getName() + "after()" );
		
	}
	
}
