package com.zhiwan.repository;

import com.zhiwan.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game,Long> {
    List<Game> findAllByUserId(Long userId);
    Game deleteByUserId(Long id);
    Game findByUserIdAndAndGameNameAndAndLevel(Long userId,String gameName,String level);
    @Query(value = "update t_game set level=?2 where id=?1",nativeQuery = true)
    @Modifying
    void updateLevelById(Long id,String level);


    //void deleteById(Long id);
}
