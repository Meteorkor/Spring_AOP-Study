package com.meteor.aop;

import java.lang.reflect.Proxy;

import org.junit.Test;

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

//	@Test
	public void plainImpleResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		bizO.logic1("aa");
		
	}
	
//	@Test
	public void decoratorResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		BusinessDecorator bizDeco = new BusinessDecorator(bizO);
		
		bizDeco.logic1("user");
		
	}
	
	//////////////////////
	// 다이나믹 프록시
	//////////////////////
	@Test
	public void HandlerInvoke(){
		
		
		IBusinessObject bizO = new BusinessImple();
		
		JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler();
		
		jdkInvocationHandler.setTarget( bizO );
		
//		IBusinessObject proxyObject = (IBusinessObject) Proxy.newProxyInstance(
		IBusinessObject proxyObject = (IBusinessObject) Proxy.newProxyInstance(
				IBusinessObject.class.getClassLoader(),
				new Class[] { IBusinessObject.class }, jdkInvocationHandler);		
		
		proxyObject.logic1("user");
		
		proxyObject.logic2("user");
		
	}
	
	
	
	
	
	
}
