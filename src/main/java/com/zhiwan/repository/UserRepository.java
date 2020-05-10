package com.zhiwan.repository;

import com.zhiwan.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    User getById(Long id);
    User getByNickNameAndAvatarUrl(String nickName,String avatarUrl);
    @Query(value = "update t_user set age=?2 where id=?1 ", nativeQuery = true)
    @Modifying
    public void updateAge(Long id,int age);
    @Query(value = "update t_user set phone_number=?2 where id=?1 ", nativeQuery = true)
    @Modifying
    public void updatePhone(Long id,String phone);

    @Query(value = "update t_user set person_introduse=?2 where id=?1 ", nativeQuery = true)
    @Modifying
    public void updatePsersonIntro(Long id,String psersonIntro);

    @Query(value = "update t_user set like_introduse=?2 where id=?1 ", nativeQuery = true)
    @Modifying
    public void updateLikeIntro(Long id,String likeIntro);
}
