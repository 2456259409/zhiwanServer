package com.zhiwan.service;

import com.zhiwan.models.Chat;

import java.util.List;

public interface ChatService {
    List<Chat> getAllMyChatById(Long id);
}
