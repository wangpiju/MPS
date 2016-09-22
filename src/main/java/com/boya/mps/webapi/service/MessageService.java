package com.boya.mps.webapi.service;

import java.util.ArrayList;
import java.util.List;

import com.boya.mps.webapi.model.Message;

public class MessageService {
	

	public List<Message> getAllMessage(){
		Message m1 = new Message(1L, "Hello", "Jason");
		Message m2 = new Message(2L, "Love", "Tasha");
		List<Message> messageList = new ArrayList<>();
		
		messageList.add(m1);
		messageList.add(m2);
		
		return messageList;
		
	}
}
