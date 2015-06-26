package com.meteor.aop.cglib;

public class Computer2014 extends Computer{

	String soundCard = "Sony";
	
	@Override
	public void printSpec() {
		super.printSpec();
		System.out.println( "soundCard : " + getSoundCard()  );
	}

	public String getSoundCard() {
		return soundCard;
	}

	public void setSoundCard(String soundCard) {
		this.soundCard = soundCard;
	}
	
	
	
}
