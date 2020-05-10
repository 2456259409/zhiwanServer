package com.zhiwan.repository;

import com.zhiwan.models.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepository extends JpaRepository<Chat,Long> {
    List<Chat> findAllBySendId(Long sendId);
}
