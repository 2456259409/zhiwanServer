package com.zhiwan.service;

import com.zhiwan.models.User;

public interface UserService {
    User getById(Long id);
    User getByNickNameAndAvatar(String nickName,String avatarUrl);
    void saveUser(User user);
    void updateAge(Long id,int age);
    void updatePhone(Long id,String phone);
    void updatePersonIntro(Long id,String personIntro);
    void updateLikeIntro(Long id,String likeIntro);
}
