package com.zhiwan.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhiwan.models.Game;
import com.zhiwan.service.GameServiceImp;
import com.zhiwan.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    GameServiceImp gameServiceImp;
    @RequestMapping(value = "/addGame",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String addGame(@RequestBody JSONObject json){
        Game game=JSONObject.toJavaObject(json,Game.class);
        gameServiceImp.saveGame(game);
        return Result.Out("保存成功",200);
    }

    @RequestMapping(value = "/deleteGame",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String deldteGame(@RequestBody JSONObject json){
        Long id=json.getLong("gameId");
        gameServiceImp.deleteById(id);
        return Result.Out("删除成功",200);
    }

    @RequestMapping(value = "/reviseLevel",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String reviseLevel(@RequestBody JSONObject json){
        Long id = json.getLong("id");
        String level = json.getString("level");
        try{
            gameServiceImp.updateLevelById(id,level);
        }catch (Exception e){
            return Result.Out(e.getMessage(),600);
        }
        return Result.Out("修改成功",200);
    }
}
