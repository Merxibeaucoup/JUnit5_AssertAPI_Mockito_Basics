package com.edgar.Junit5App.service;

import org.springframework.stereotype.Service;

@Service
public class Message {
	
	public String showMsg(String name) {
		return "Welcome to: " + name;
	}

}
