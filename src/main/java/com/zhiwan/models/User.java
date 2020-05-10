package com.zhiwan.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nickName;
    private Integer age;
    private Integer gender;
    private String avatarUrl;
    private String province;
    private String personIntroduse;
    private String likeIntroduse;
    private String phoneNumber;
    private String language;
    private String country;
    private Date createTime;

    @Transient
    private List<Game> games=new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPersonIntroduse() {
        return personIntroduse;
    }

    public void setPersonIntroduse(String personIntroduse) {
        this.personIntroduse = personIntroduse;
    }

    public String getLikeIntroduse() {
        return likeIntroduse;
    }

    public void setLikeIntroduse(String likeIntroduse) {
        this.likeIntroduse = likeIntroduse;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    @Override
    public String toString() {
       return String.format("{id:%s,nickName:%s,age:%d,gender:%d,avatarUrl:%s,province:%s,personIntroduse:%s,likeIntroduse:%s,phoneNumber:%s,language:%s,country:%s,createTime:%s}",id,nickName,age,gender,avatarUrl,province,personIntroduse,likeIntroduse,phoneNumber,language,country,createTime);
    }
}


