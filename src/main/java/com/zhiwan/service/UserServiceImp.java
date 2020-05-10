package com.zhiwan.service;

import com.zhiwan.models.User;
import com.zhiwan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImp implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User getById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public User getByNickNameAndAvatar(String nickName, String avatarUrl) {
        return userRepository.getByNickNameAndAvatarUrl(nickName,avatarUrl);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateAge(Long id, int age) {
        userRepository.updateAge(id,age);
    }

    @Override
    public void updatePhone(Long id, String phone) {
        userRepository.updatePhone(id,phone);
    }

    @Override
    public void updatePersonIntro(Long id, String personIntro) {
        userRepository.updatePsersonIntro(id,personIntro);
    }

    @Override
    public void updateLikeIntro(Long id, String likeIntro) {
        userRepository.updateLikeIntro(id,likeIntro);
    }
}
