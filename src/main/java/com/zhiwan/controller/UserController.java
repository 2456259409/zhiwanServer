package com.zhiwan.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiwan.models.User;
import com.zhiwan.service.GameServiceImp;
import com.zhiwan.service.UserServiceImp;
import com.zhiwan.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class UserController {

    @Autowired
    UserServiceImp userServiceImp;

    @Autowired
    GameServiceImp gameServiceImp;

    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String login(@RequestBody JSONObject json){
        //获取传过来的json中的user元素json
        JSONObject userjson=json.getJSONObject("user");
        User user=userjson.toJavaObject(User.class);
        User u=userServiceImp.getByNickNameAndAvatar(user.getNickName(),user.getAvatarUrl());
        if(u==null){
            setNULL(user);
            user.setCreateTime(new Date());
            userServiceImp.saveUser(user);
            return JSON.toJSONString(user);
        }
        u.setGames(gameServiceImp.getAllByUserId(u.getId()));
        return JSON.toJSONString(u);
    }

    public User setNULL(User u){
        if(u.getPersonIntroduse()==null||"".equals(u.getPersonIntroduse())){
            u.setPersonIntroduse("无个人介绍");
        }
        if(u.getLikeIntroduse()==null||"".equals(u.getLikeIntroduse())){
            u.setLikeIntroduse("无爱好介绍");
        }
        return u;
    }

    @RequestMapping(value = "setAge",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String setAge(@RequestBody JSONObject json){
        Long id=json.getLong("id");
        int age=json.getInteger("age");
        try{
            userServiceImp.updateAge(id,age);
        }catch (Exception e){
            return Result.Out("修改失败",600);
        }
        return Result.Out("修改成功",200);
    }

    @RequestMapping(value = "setPhone",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String setPhone(@RequestBody JSONObject json){
        Long id=json.getLong("id");
        String phone=json.getString("phoneNumber");
        try{
            userServiceImp.updatePhone(id,phone);
        }catch (Exception e){
            return Result.Out("修改失败",600);
        }
        return Result.Out("修改成功",200);
    }

    @RequestMapping(value = "setPsersonIntro",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String setPsersonIntro(@RequestBody JSONObject json){
        Long id=json.getLong("id");
        String personIntro=json.getString("personIntro");
        try{
            userServiceImp.updatePersonIntro(id,personIntro);
        }catch (Exception e){
            return Result.Out("修改失败",600);
        }
        return Result.Out("修改成功",200);
    }

    @RequestMapping(value = "setLikeIntro",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String setLikeIntro(@RequestBody JSONObject json){
        Long id=json.getLong("id");
        String likeIntro=json.getString("likeIntro");
        try{
            userServiceImp.updateLikeIntro(id,likeIntro);
        }catch (Exception e){
            return Result.Out("修改失败",600);
        }
        return Result.Out("修改成功",200);
    }

}
