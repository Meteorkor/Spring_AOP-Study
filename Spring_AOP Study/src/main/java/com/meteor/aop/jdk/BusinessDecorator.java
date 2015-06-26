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
	public String logic(String userId) {
		
		System.out.println( "Decorator Prev" );
		String result = bizO.logic(userId); 
		System.out.println( "Decorator After" );
		
		return result;
	}
	
	
	
}
