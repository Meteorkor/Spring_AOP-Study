package com.meteor.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meteor.aop.jdk.IBusinessObject;
import com.meteor.aop.spring.SpringAdviser;
import com.meteor.aop.spring.SpringMethodBeforeAdvice;
/**
 * Spring ADVISER
 * Spring PointCut
 * test3-context.xml 설정 없음
 * @author unseok.kim
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="test3-context.xml")
public class SpringJdkProxyTest3 {

	@Autowired
	IBusinessObject bizO;
	
	@Test
	public void plainImpleResult(){
	
		AspectJExpressionPointcut ac = new AspectJExpressionPointcut();
		ac.setExpression( "execution(* com.meteor.aop.jdk.*.*(..))" );
		
		Advisor advisor = new DefaultPointcutAdvisor(ac, new SpringMethodBeforeAdvice() );
		
		ProxyFactory pf = new ProxyFactory();
		pf.setTarget( bizO );
		pf.addAdvisor(advisor );
		IBusinessObject im =  (IBusinessObject) pf.getProxy();
		im.logic1("ss");
		
	}
	
	
	
	
}
