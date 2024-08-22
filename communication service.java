package com.healthcare.services;

import com.healthcare.models.Message;
import com.healthcare.models.User;
import com.healthcare.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunicationService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getMessagesForUser(User user) {
        return messageRepository.findByReceiver(user);
    }

    public Message sendMessage(Message message) {
        return messageRepository.save(message);
    }

    // Additional methods for secure communication
}