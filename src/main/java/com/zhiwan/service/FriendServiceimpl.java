package com.zhiwan.service;

import com.zhiwan.models.Friend;
import com.zhiwan.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FriendServiceimpl implements FriendService {
    @Autowired
    FriendRepository friendRepository;
    @Override
    public List<Friend> getAllMyFriendById(Long id) {
        return friendRepository.findAllByU1Id(id);
    }
}
