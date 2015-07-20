package com.meteor.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import org.junit.Test;

import com.meteor.aop.cglib.CglibInvocationHandler;
import com.meteor.aop.cglib.Computer;

/**
 * http://javacan.tistory.com/104 ����
 * http://jnb.ociweb.com/jnb/jnbNov2005.html ����
 * @author unseok.kim
 *
 */
public class CGlibProxyTest {
	/**
	 * Ŭ���� ���� �� �޼ҵ� ��
	 */
//	@Test
	public void computerTest(){
		
		Computer com = new Computer();
		
		com.printSpec();
		
	}
	/**
	 * �ݹ� ���� ����
	 */
//	@Test
	public void noCallcglibProxyTest(){
		Enhancer enhance = new Enhancer();
		
		enhance.setSuperclass( Computer.class );
		enhance.setCallback( NoOp.INSTANCE );
		
		Computer com = (Computer) enhance.create();
		
		com.printSpec();
		
		/*
		��� ���� Ŭ�����ϱ�..
		System.out.println( "com.getClass().getName() : " + com.getClass().getName() );
		*/
	}
	/**
	 * �ݹ� �����Ͽ� Ȯ��
	 */
//	@Test
	public void cglibProxyTest(){
		Enhancer enhance = new Enhancer();
		
		enhance.setSuperclass( Computer.class );
		//�ݹ� ����
		enhance.setCallback( new CglibInvocationHandler() );
		
		Computer com = (Computer) enhance.create();
		
		com.printSpec();
		
	}
	
	
	

}
