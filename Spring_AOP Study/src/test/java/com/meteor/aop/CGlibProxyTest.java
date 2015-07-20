package com.meteor.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

import org.junit.Test;

import com.meteor.aop.cglib.CglibInvocationHandler;
import com.meteor.aop.cglib.Computer;

/**
 * http://javacan.tistory.com/104 참고
 * http://jnb.ociweb.com/jnb/jnbNov2005.html 참고
 * @author unseok.kim
 *
 */
public class CGlibProxyTest {
	/**
	 * 클래스 생성 후 메소드 콜
	 */
//	@Test
	public void computerTest(){
		
		Computer com = new Computer();
		
		com.printSpec();
		
	}
	/**
	 * 콜백 없이 지정
	 */
//	@Test
	public void noCallcglibProxyTest(){
		Enhancer enhance = new Enhancer();
		
		enhance.setSuperclass( Computer.class );
		enhance.setCallback( NoOp.INSTANCE );
		
		Computer com = (Computer) enhance.create();
		
		com.printSpec();
		
		/*
		얘는 무슨 클래스일까..
		System.out.println( "com.getClass().getName() : " + com.getClass().getName() );
		*/
	}
	/**
	 * 콜백 지정하여 확장
	 */
//	@Test
	public void cglibProxyTest(){
		Enhancer enhance = new Enhancer();
		
		enhance.setSuperclass( Computer.class );
		//콜백 지정
		enhance.setCallback( new CglibInvocationHandler() );
		
		Computer com = (Computer) enhance.create();
		
		com.printSpec();
		
	}
	
	
	

}
