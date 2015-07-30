package com.meteor.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meteor.aop.jdk.BusinessDecorator;
import com.meteor.aop.jdk.BusinessImple;
import com.meteor.aop.jdk.IBusinessObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="aopTest-context.xml")
public class SpringAOPTest {
/**/
	/*
	@Autowired
	IBusinessObject bizO;
	*/
	/*
	@Autowired
	BusinessImple bizDeco;
	*/
	
//	@Test
	public void decoratorResult(){
		
		IBusinessObject bizO = new BusinessImple();
		
		BusinessDecorator bizDeco = new BusinessDecorator(bizO);
		
		bizDeco.logic1("user");
		
	}
	
	/**
	 * 
	 */
//	@Test
	public void autoProxy(){
		
//		IBusinessObject bizO = new BusinessImple();
		/*
		BusinessDecorator bizDeco = new BusinessDecorator(bizO);
		
		bizDeco.logic1("user");
		*/
//		bizO.logic1("user");
		
	}
	
	/**
	 * ���� ���Ͻø� ����, �ڵ� ���Ͻø� ���� �Ѵ� ��� ����
	 */
	public void client1(){
		IBusinessObject bizO = new BusinessImple();
		
		BusinessDecorator bizDeco = new BusinessDecorator(bizO);
		
		bizDeco.logic1("user");
		
		
	}
	/**
	 * ���� ���Ͻô� ��� ����, �ڵ� ���Ͻô� �Ұ� 
	 */
	@Test
	public void client2(){
		
		BusinessImple bizO = new BusinessImple();
		
		BusinessDecorator bizDeco = new BusinessDecorator(bizO);
		
		bizDeco.logic1("user");
		
		
	}
	

}
