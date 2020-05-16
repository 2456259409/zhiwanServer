package com.zhiwan.service;

import com.zhiwan.models.Game;

import java.util.List;

public interface GameService {
    Game saveGame(Game game);
    List<Game> getAllByUserId(Long id);
    void deleteGame(Game game);
    Game findByUserIdAndAndGameNameAndAndLevel(Long userId,String gameName,String level);
    void updateLevelById(Long id,String level);
    void deleteById(Long id);
}
