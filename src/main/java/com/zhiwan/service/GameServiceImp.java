package com.zhiwan.service;

import com.zhiwan.models.Game;
import com.zhiwan.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class GameServiceImp implements GameService {
    @Autowired
    GameRepository gameRepository;
    @Override
    public Game saveGame(Game game) {
        Game g1 = findByUserIdAndAndGameNameAndAndLevel(game.getUserId(), game.getGameName(), game.getLevel());
        if(g1==null){
            return gameRepository.save(game);
        }else {
            return null;
        }
    }

    @Override
    public List<Game> getAllByUserId(Long id) {
        return gameRepository.findAllByUserId(id);
    }

    @Override
    public void deleteGame(Game game) {
         gameRepository.delete(game);
    }

    @Override
    public Game findByUserIdAndAndGameNameAndAndLevel(Long userId, String gameName, String level) {
        return gameRepository.findByUserIdAndAndGameNameAndAndLevel(userId,gameName,level);
    }

    @Override
    public void updateLevelById(Long id, String level) {
        gameRepository.updateLevelById(id,level);
    }


}
