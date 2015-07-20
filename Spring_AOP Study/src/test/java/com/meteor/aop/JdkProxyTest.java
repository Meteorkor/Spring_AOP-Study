package com.meteor.aop;

import java.lang.reflect.Proxy;

import com.meteor.aop.jdk.BusinessDecorator;
import com.meteor.aop.jdk.BusinessImple;
import com.meteor.aop.jdk.IBusinessObject;
import com.meteor.aop.jdk.JdkInvocationHandler;
/**
 * http://javacan.tistory.com/105 참고하여 만듬
 * @author unseok.kim
 *
 */
public class JdkProxyTest {

	/**
	 * 인터페이스에 구현체 그냥 호출..
	 */
//	@Test
	public void plainImpleResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		bizO.logic1("aa");
		
	}
	/**
	 * 데코레이터 패턴을 통한 기능 확장(오브젝트)
	 */
//	@Test
	public void decoratorResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		BusinessDecorator bizDeco = new BusinessDecorator(bizO);
		
		bizDeco.logic1("user");
		
	}
	
	/**
	 * Jdk DynamicProxy 활용
	 */
//	@Test
	public void HandlerInvoke(){
		
		//대상
		IBusinessObject bizO = new BusinessImple();
		//기능
		JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler();
		//대상 지정
		jdkInvocationHandler.setTarget( bizO );
		//다이나믹 프록시로 객체 생성
		
		IBusinessObject proxyObject = (IBusinessObject) Proxy.newProxyInstance(
				IBusinessObject.class.getClassLoader(),
				new Class[] { IBusinessObject.class }, jdkInvocationHandler);
		
		/**/
		proxyObject.logic1("user");
		
		proxyObject.logic2("user");
		
		
		
		/*과연 아래 소스가 될까?
		BusinessImple imple = (BusinessImple) Proxy.newProxyInstance(
				IBusinessObject.class.getClassLoader(),
				new Class[] { IBusinessObject.class }, jdkInvocationHandler);
		 */
		/*
		어떤 클래스가 찍힐까?
		System.out.println( "proxyObject.getClass().getName() : " + proxyObject.getClass().getName() );
		*/
	}
	
	
	
	
	
	
}
