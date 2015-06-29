package com.meteor.aop.jdk;

import org.springframework.stereotype.Component;

/**
 * ±¸ÇöÃ¼
 * @author unseok.kim
 *
 */
@Component
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
