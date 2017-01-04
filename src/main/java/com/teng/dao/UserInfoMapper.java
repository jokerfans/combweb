package com.teng.dao;

import java.util.List;

import com.teng.model.UserInfo;

/**
 * 用户信息mapper
 * @author TENG
 *
 */
public interface UserInfoMapper {
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
    int insert(UserInfo record);

    /**
     * 增加
     * @param record
     * @return
     */
    int insertSelective(UserInfo record);

    /**
     * 查询
     * @param id
     * @return
     */
    UserInfo selectByPrimaryKey(Integer id);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(UserInfo record);
    
    /**
     * 查询
     * @return
     */
    List<UserInfo> selectAll();  
}