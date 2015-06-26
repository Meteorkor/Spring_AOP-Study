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
	
//	@Test
	public void computerTest(){
		
		Computer com = new Computer();
		
		com.printSpec();
		
	}
	
//	@Test
	public void noCallcglibProxyTest(){
		System.out.println( "cglib" );
		Enhancer enhance = new Enhancer();
		
		enhance.setSuperclass( Computer.class );
		enhance.setCallback( NoOp.INSTANCE );
		
		Computer com = (Computer) enhance.create();
		
		com.printSpec();
		
	}
	@Test
	public void cglibProxyTest(){
		System.out.println( "cglib" );
		Enhancer enhance = new Enhancer();
		
		enhance.setSuperclass( Computer.class );
//		enhance.setCallback( NoOp.INSTANCE );
		enhance.setCallback( new CglibInvocationHandler() );
		
		
		Computer com = (Computer) enhance.create();
		
		com.printSpec();
		
	}
	
	
	

}
