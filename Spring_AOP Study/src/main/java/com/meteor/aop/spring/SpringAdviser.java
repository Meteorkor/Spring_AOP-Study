package com.meteor.aop.spring;


/**
 * �����̽�
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
