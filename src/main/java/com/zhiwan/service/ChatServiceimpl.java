package com.zhiwan.service;

import com.zhiwan.models.Chat;
import com.zhiwan.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChatServiceimpl implements ChatService {

    @Autowired
    ChatRepository chatRepository;
    @Override
    public List<Chat> getAllMyChatById(Long id) {
        return chatRepository.findAllBySendId(id);
    }
}
