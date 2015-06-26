package com.meteor.aop.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibInvocationHandler implements MethodInterceptor{

	@Override
	public Object intercept(Object object, Method method, Object[] objAr,
			MethodProxy methodProxy) throws Throwable {
		Object result = null;
		
		System.out.println( "methodProxy.invokeSuper(object, objAr); 11" );
		result = methodProxy.invokeSuper(object, objAr);
		
		System.out.println( "methodProxy.invokeSuper(object, objAr); 222" );
		
		return result;
	}

}
