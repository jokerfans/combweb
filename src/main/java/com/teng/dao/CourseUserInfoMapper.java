package com.teng.dao;

import com.teng.model.CourseUserInfo;

/**
 * 课程与用户关系mapper
 * @author TENG
 *
 */
public interface CourseUserInfoMapper {
    /**
     * 删除
     * @param id
     * @return
     */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 增加
	 * @param record
	 * @return
	 */
    int insert(CourseUserInfo record);

    /**
     * 增加
     * @param record
     * @return
     */
    int insertSelective(CourseUserInfo record);

    /**
     * 查询
     * @param id
     * @return
     */
    CourseUserInfo selectByPrimaryKey(Integer id);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(CourseUserInfo record);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(CourseUserInfo record);
}