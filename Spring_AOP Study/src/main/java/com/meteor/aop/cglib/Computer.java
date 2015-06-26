package com.meteor.aop.cglib;

public class Computer {

	private String cpu = "1.2Ghz";
	private String memory = "2G";
	private String hdd = "250G";
	
	
	
	public void printSpec(){
	/*
		System.out.println( "cpu : " + getCpu() );
		System.out.println( "memory : " + getMemory() );
		System.out.println( "hdd : " + getHdd() );
		*/
		System.out.println( "cpu : " + cpu );
		System.out.println( "memory : " + memory );
		System.out.println( "hdd : " + hdd );
		
	}



	public String getCpu() {
		return cpu;
	}



	public void setCpu(String cpu) {
		this.cpu = cpu;
	}



	public String getMemory() {
		return memory;
	}



	public void setMemory(String memory) {
		this.memory = memory;
	}



	public String getHdd() {
		return hdd;
	}



	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	
	
	
}
