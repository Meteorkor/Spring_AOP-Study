package com.meteor.aop.jdk;
/**
 * ����ü
 * @author unseok.kim
 *
 */
public class BusinessImple implements IBusinessObject{

	@Override
	public String logic1(String userId) {
		
		System.out.println( "BusinessImple" );
		
		return "result";
	}

	@Override
	public String logic2(String userId) {
		System.out.println( "BusinessImple22" );
		
		return "result";
	}

}
