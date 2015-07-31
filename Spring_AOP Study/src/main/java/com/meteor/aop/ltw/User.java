package com.meteor.aop.ltw;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

//@Configurable(autowire=Autowire.BY_NAME)
//@Configurable(autowire=Autowire.BY_TYPE)
//@Configurable(preConstruction=true,dependencyCheck=true,autowire=Autowire.BY_TYPE)
//
@Configurable
public class User {

//	@Autowired
	UserPolicyDao userPolicyDao;
//	@Autowired
	EmailService emailService;
	
	public void upgrade(){
		
		if(userPolicyDao.isUpdateScore()){
			emailService.send();	
		}
		
		
		
	}

	public UserPolicyDao getUserPolicyDao() {
		return userPolicyDao;
	}

	public void setUserPolicyDao(UserPolicyDao userPolicyDao) {
		this.userPolicyDao = userPolicyDao;
	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	
	
	
	
	
	
}
