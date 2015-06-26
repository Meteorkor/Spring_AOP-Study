package com.meteor.aop.jdk;
/**
 * ±¸ÇöÃ¼
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
