package com.meteor.aop.spring;



public class SpringAdviser {

	public void before(){
		System.out.println( this.getClass().getName() + "before()" );
		
	}
	
	public void after(){
		System.out.println( this.getClass().getName() + "after()" );
		
	}
	
}
