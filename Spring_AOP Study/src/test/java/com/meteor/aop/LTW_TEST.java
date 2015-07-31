package com.meteor.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meteor.aop.ltw.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="LTW-context.xml")
public class LTW_TEST {
/**/
//	@Autowired
//	User user;

//	@Test
	public void nomalDI(){
//		user.upgrade();
		
	}
	
	@Test
	public void butTest(){
		
		User user = new User();
		user.upgrade();
		
	}
	
	
}
