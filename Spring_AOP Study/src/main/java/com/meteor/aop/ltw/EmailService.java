package com.meteor.aop.ltw;

import java.util.Calendar;

import org.springframework.stereotype.Component;

@Component
public class EmailService {

	public void send(){
		
		System.out.println( "������������ ".concat( Calendar.getInstance().getTime().toString().concat(" ������ ���½��ϴ�.") ) );
		
	}
	
}
