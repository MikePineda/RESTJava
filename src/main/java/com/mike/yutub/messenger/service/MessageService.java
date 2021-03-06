/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mike.yutub.messenger.service;

import com.mike.yutub.messenger.database.DatabaseClass;
import com.mike.yutub.messenger.model.Message;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author GERALVARADO
 */
public class MessageService {

    private static Map<Long, Message> messages = DatabaseClass.getMessages();

    public MessageService() {

        messages.put(1L, new Message(1L, "Hello Alfonso!", new Date(), "Mike"));
        messages.put(2L, new Message(2L, "Hello Huguin", new Date(), "Mike"));
        messages.put(3L, new Message(3L, "Hello Ivan", new Date(), "Mike"));
    }

    	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values()); 
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
	
}
