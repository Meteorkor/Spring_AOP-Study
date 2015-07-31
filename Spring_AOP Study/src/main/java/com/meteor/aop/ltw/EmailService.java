package com.meteor.aop.ltw;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

	public void send(){
		
		System.out.println( "누구누구에게 ".concat( Calendar.getInstance().getTime().toString().concat(" 메일을 보냈습니다.") ) );
		
	}
	
}
