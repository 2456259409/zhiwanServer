package com.zhiwan.repository;

import com.zhiwan.models.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FriendRepository extends JpaRepository<Friend,Long> {
    List<Friend> findAllByU1Id(Long u1Id);
}
