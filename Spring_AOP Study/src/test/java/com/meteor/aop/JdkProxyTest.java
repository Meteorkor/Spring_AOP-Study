package com.meteor.aop;

import java.lang.reflect.Proxy;

import com.meteor.aop.jdk.BusinessDecorator;
import com.meteor.aop.jdk.BusinessImple;
import com.meteor.aop.jdk.IBusinessObject;
import com.meteor.aop.jdk.JdkInvocationHandler;
/**
 * http://javacan.tistory.com/105 �����Ͽ� ����
 * @author unseok.kim
 *
 */
public class JdkProxyTest {

	/**
	 * �������̽��� ����ü �׳� ȣ��..
	 */
//	@Test
	public void plainImpleResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		bizO.logic1("aa");
		
	}
	/**
	 * ���ڷ����� ������ ���� ��� Ȯ��(������Ʈ)
	 */
//	@Test
	public void decoratorResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		BusinessDecorator bizDeco = new BusinessDecorator(bizO);
		
		bizDeco.logic1("user");
		
	}
	
	/**
	 * Jdk DynamicProxy Ȱ��
	 */
//	@Test
	public void HandlerInvoke(){
		
		//���
		IBusinessObject bizO = new BusinessImple();
		//���
		JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler();
		//��� ����
		jdkInvocationHandler.setTarget( bizO );
		//���̳��� ���Ͻ÷� ��ü ����
		
		IBusinessObject proxyObject = (IBusinessObject) Proxy.newProxyInstance(
				IBusinessObject.class.getClassLoader(),
				new Class[] { IBusinessObject.class }, jdkInvocationHandler);
		
		/**/
		proxyObject.logic1("user");
		
		proxyObject.logic2("user");
		
		
		
		/*���� �Ʒ� �ҽ��� �ɱ�?
		BusinessImple imple = (BusinessImple) Proxy.newProxyInstance(
				IBusinessObject.class.getClassLoader(),
				new Class[] { IBusinessObject.class }, jdkInvocationHandler);
		 */
		/*
		� Ŭ������ ������?
		System.out.println( "proxyObject.getClass().getName() : " + proxyObject.getClass().getName() );
		*/
	}
	
	
	
	
	
	
}
