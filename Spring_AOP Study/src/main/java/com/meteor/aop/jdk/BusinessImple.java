package com.meteor.aop.jdk;
/**
 * ����ü
 * @author unseok.kim
 *
 */
public class BusinessImple implements IBusinessObject{

	@Override
	public String logic(String userId) {
		
		System.out.println( "BusinessImple" );
		
		return "result";
	}

}
