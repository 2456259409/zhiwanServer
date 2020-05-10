package com.zhiwan.service;

import com.zhiwan.models.Friend;

import java.util.List;

public interface FriendService {
    List<Friend> getAllMyFriendById(Long id);
}
