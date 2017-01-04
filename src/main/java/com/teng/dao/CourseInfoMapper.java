package com.teng.dao;

import com.teng.model.CourseInfo;

/**
 * 课程信息mapper
 * @author TENG
 *
 */
public interface CourseInfoMapper {
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
    int insert(CourseInfo record);

    /**
     * 增加
     * @param record
     * @return
     */
    int insertSelective(CourseInfo record);

    /**
     * 查询
     * @param id
     * @return
     */
    CourseInfo selectByPrimaryKey(Integer id);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(CourseInfo record);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(CourseInfo record);
}