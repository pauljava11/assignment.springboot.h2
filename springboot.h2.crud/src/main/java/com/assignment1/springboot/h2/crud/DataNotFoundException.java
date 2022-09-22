package com.assignment1.springboot.h2.crud;

import org.springframework.stereotype.Component;

@Component
public class DataNotFoundException extends Exception{
	
	public DataNotFoundException(){
		
	}
	public DataNotFoundException(String info) {
		super(info);
		
	}
}
