package com.meteor.aop.jdk;

/**
 * AOP 를 위한 데코레이터
 * @author unseok.kim
 *
 */
public class BusinessDecorator implements IBusinessObject{

	public BusinessDecorator( IBusinessObject bo ){
		bizO = bo;
	}
	
	private IBusinessObject bizO;

	public IBusinessObject getBizO() {
		return bizO;
	}

	public void setBizO(IBusinessObject bizO) {
		this.bizO = bizO;
	}

	@Override
	public String logic1(String userId) {
		
		System.out.println( "Decorator Prev" );
		String result = bizO.logic1(userId); 
		System.out.println( "Decorator After" );
		
		return result;
	}

	@Override
	public String logic2(String userId) {
		System.out.println( "Decorator Prev22" );
		String result = bizO.logic2(userId); 
		System.out.println( "Decorator After22" );
		
		return result;
	}
	
	
	
}
