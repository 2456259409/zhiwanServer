package com.zhiwan.models;

import javax.persistence.*;

@Entity
@Table(name = "t_friend")
public class Friend {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long u1Id;
    private Long u2Id;

    public Long getU1Id() {
        return u1Id;
    }

    public void setU1Id(Long u1Id) {
        this.u1Id = u1Id;
    }

    public Long getU2Id() {
        return u2Id;
    }

    public void setU2Id(Long u2Id) {
        this.u2Id = u2Id;
    }

    @Override
    public String toString() {
        return String.format("{u1Id:%d,u2Id:%d}",u1Id,u2Id);
    }
}
