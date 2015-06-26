package com.meteor.aop.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 * InvocationHandler를 구현한
 * JDK 다이나믹 프록시를 위한 핸들러
 * @author unseok.kim
 *
 */
public class JdkInvocationHandler implements InvocationHandler {

	 private Object target = null;

     public void setTarget(Object target_) {
         this.target = target_;
     }
     
     public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
         
    	 
    	 try {
             System.out.println("Going to execute method : " + method.getName() );
             Object retObject = method.invoke(target, args);
             System.out.println("After execute method : " + method.getName());
             return retObject;
         } catch(InvocationTargetException e) {
             throw e.getTargetException();
         } catch(Exception e) {
             throw e;
         }
     }
     
	
}
