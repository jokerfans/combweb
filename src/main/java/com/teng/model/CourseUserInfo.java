package com.teng.model;

/**
 * 课程与用户关系实体
 * @author TENG
 *
 */
public class CourseUserInfo {
    private Integer id;

    private Integer uid;

    private Integer cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
}